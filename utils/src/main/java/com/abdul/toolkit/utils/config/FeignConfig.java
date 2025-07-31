package com.abdul.toolkit.utils.config;

import com.abdul.toolkit.utils.jwt.port.in.GenerateJwtTokenUseCase;
import feign.RequestInterceptor;
import lombok.RequiredArgsConstructor;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@RequiredArgsConstructor
public class FeignConfig {

    private final GenerateJwtTokenUseCase generateJwtTokenUseCase;

    @Bean
    public RequestInterceptor adminTokenInterceptor() {
        return template -> {
            String url = template.path();
            if (url.contains("/internal")) {
                String adminToken = generateJwtTokenUseCase.generateInternalAdminToken();
                template.header("Authorization", "Bearer " + adminToken);
            }
        };
    }
}
