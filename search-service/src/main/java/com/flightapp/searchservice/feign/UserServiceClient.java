package com.flightapp.searchservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "user-service")
public interface UserServiceClient {

    @PostMapping("/api/user/log-search")
    void logUserSearch(@RequestParam String userId, @RequestParam String source,
                       @RequestParam String destination, @RequestParam String date);
}
