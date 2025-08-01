package com.abdul.toolkit.utils.feigns;

import com.abdul.dto.LinkedinUserResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "linkedinApi",
        url = "${spring.security.oauth2.client.provider.linkedin.user-info-uri:http://localhost:8080}")
public interface LinkedinUserInfoFeignClient {

    @GetMapping
    LinkedinUserResponse getUserInfo(@RequestParam("oauth2_access_token") String token);
}
