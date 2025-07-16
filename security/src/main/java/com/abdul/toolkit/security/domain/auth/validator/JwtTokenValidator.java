package com.abdul.toolkit.security.domain.auth.validator;

import com.abdul.toolkit.security.domain.auth.port.in.ExtractJwtClaimsUseCase;
import java.util.Date;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class JwtTokenValidator {

    private final ExtractJwtClaimsUseCase extractJwtClaimsUseCase;

    public Boolean isTokenValid(String token) {
        return extractJwtClaimsUseCase.extractExpiration(token).after(new Date());
    }

}
