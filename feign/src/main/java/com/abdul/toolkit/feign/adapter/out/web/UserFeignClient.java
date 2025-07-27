package com.abdul.toolkit.feign.adapter.out.web;

import com.abdul.admin.dto.UserDetailResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "userService", url = "${microservices.user-admin.url:http://localhost:8080}")
public interface UserFeignClient {

    @GetMapping("/internal/users/{searchTerm}")
    UserDetailResponse getUser(@PathVariable("searchTerm") String searchTerm);
}
