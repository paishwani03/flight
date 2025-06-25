package com.flightapp.userservice.feign;

import com.flightapp.userservice.dto.BookingDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import java.util.List;

@FeignClient(name = "booking-service")
public interface BookingClient {
    @GetMapping("/booking/user/{email}")
    List<BookingDTO> getBookingsByEmail(@PathVariable String email);
}
