package com.abdul.toolkit.utils.jwt.usecase;

import com.abdul.toolkit.utils.jwt.port.in.GenerateJwtTokenUseCase;
import com.abdul.toolkit.utils.jwt.port.in.GetSignInKeyUseCase;
import com.abdul.toolkit.utils.user.model.UserInfo;
import com.abdul.toolkit.utils.user.port.in.GetAdminUserUseCase;
import com.abdul.toolkit.utils.user.port.in.GetUserDetailServiceUseCase;
import io.jsonwebtoken.Jwts;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GenerateJwtTokenUseCaseImpl implements GenerateJwtTokenUseCase {

    @Value("${app.jwt.token-validity:1}")
    private Integer tokenValidity;

    private final GetSignInKeyUseCase getSignInKeyUseCase;
    private final GetAdminUserUseCase getAdminUserUseCase;

    @Override
    public String generateAccessToken(UserInfo userInfo) {
        Map<String, Object> claims = new HashMap<>(getCommonClaims(userInfo));
        claims.put("exp", new Date().getTime() + tokenValidity);
        return generateToken(userInfo, claims, getTokenHeaders("access"), tokenValidity);
    }

    @Override
    public String generateRefreshToken(UserInfo userInfo) {
        int validity = tokenValidity * 30;  // Todo -> Make this configurable for refresh token
        Map<String, Object> claims = new HashMap<>(getCommonClaims(userInfo));
        claims.put("exp", new Date().getTime() + validity );
        return generateToken(
                userInfo,
                claims,
                getTokenHeaders("refresh"),
                validity
        );
    }

    @Override
    public String generateToken(
            UserInfo userInfo,
            Map<String, Object> claims,
            Map<String, Object> headers,
            Integer tokenValidity) {
        return Jwts.builder()
                .header().add(headers)
                .and()
                .subject(userInfo.getUsername())
                .claims(claims)
                .issuedAt(new Date(System.currentTimeMillis()))
                .expiration(new Date(System.currentTimeMillis() + tokenValidity))
                .signWith(getSignInKeyUseCase.get())
                .compact();
    }

    @Override
    public String generateInternalAdminToken() {
        UserInfo userInfo = getAdminUserUseCase.getAdminUser();
        Map<String, Object> claims = new HashMap<>(getCommonClaims(userInfo));
        claims.put("exp", new Date().getTime() + tokenValidity);
        return generateToken(userInfo, claims, getTokenHeaders("internal"), tokenValidity);
    }

    private Map<String, Object> getTokenHeaders(String type) {
        return Map.of(
                "alg", "HS256",
                "typ", "JWT",
                "appVersion", "1.0.0",
                "tokenType", type
        );
    }

    private Map<String, Object> getCommonClaims(UserInfo userInfo) {
        return Map.of(
                "sub", userInfo.getUsername(),
                "iat", new Date().getTime(),
                "authorities", userInfo.getAuthorities()
        );
    }

}
