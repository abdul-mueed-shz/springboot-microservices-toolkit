package com.abdul.toolkit.security.domain.auth.usecase;

import com.abdul.toolkit.security.domain.auth.port.in.GetSignInKeyUseCase;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;
import javax.crypto.SecretKey;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GetSignInKeyUseCaseImpl implements GetSignInKeyUseCase {

    @Value("${app.jwt.secret-key:defaultSecretValue}")
    private String secretKey;

    public SecretKey get() {
        byte[] keyBytes = Decoders.BASE64.decode(secretKey);
        return Keys.hmacShaKeyFor(keyBytes);
    }
}
