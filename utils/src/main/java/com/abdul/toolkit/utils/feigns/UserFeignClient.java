package com.abdul.toolkit.utils.feigns;

import com.abdul.dto.UserDetailResponse;
import com.abdul.toolkit.utils.config.FeignConfig;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(
        name = "userService",
        url = "${microservices.user-admin.url:http://localhost:8080}",
        configuration = FeignConfig.class
)
public interface UserFeignClient {

    @GetMapping("/internal/users/{searchTerm}")
    UserDetailResponse getUser(@PathVariable("searchTerm") String searchTerm);
}
