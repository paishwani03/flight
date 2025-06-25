package com.flightapp.booking_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "USER-SERVICE")
public interface UserServiceClient {

    @PostMapping("/user/activity/log-booking")
    void logBooking(@RequestParam String email, @RequestParam String details);
}
