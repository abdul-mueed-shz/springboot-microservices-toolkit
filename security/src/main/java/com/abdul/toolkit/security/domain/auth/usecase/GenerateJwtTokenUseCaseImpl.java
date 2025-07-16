package com.abdul.toolkit.security.domain.auth.usecase;

import com.abdul.toolkit.security.domain.auth.port.in.GenerateJwtTokenUseCase;
import com.abdul.toolkit.security.domain.auth.port.in.GetSignInKeyUseCase;
import com.abdul.toolkit.utils.user.model.UserInfo;
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


    public String generateAccessToken(UserInfo userInfo) {
        Map<String, Object> headers = Map.of(
                "alg", "HS256",
                "typ", "JWT",
                "appVersion", "1.0.0",
                "tokenType", "access"
        );
        return generateToken(userInfo, new HashMap<>(), headers, tokenValidity);
    }

    public String generateRefreshToken(UserInfo userInfo) {
        Map<String, Object> headers = Map.of(
                "alg", "HS256",
                "typ", "JWT",
                "appVersion", "1.0.0",
                "tokenType", "refresh"
        );
        return generateToken(
                userInfo,
                new HashMap<>(),
                headers,
                tokenValidity * 30 // Make this configurable for refresh token
        );
    }

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
}
