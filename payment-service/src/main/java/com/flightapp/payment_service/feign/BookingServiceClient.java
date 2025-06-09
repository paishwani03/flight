package com.flightapp.payment_service.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name = "BOOKING-SERVICE")
public interface BookingServiceClient {

    @PostMapping("/booking/update-status")
    void updateBookingStatus(@RequestParam Long bookingId, @RequestParam String status);
}
