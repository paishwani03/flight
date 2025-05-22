package com.flightapp.bookingservice.controller;

import com.flightapp.bookingservice.dto.BookingRequestDTO;
import com.flightapp.bookingservice.dto.BookingResponseDTO;
import com.flightapp.bookingservice.entity.Booking;
import com.flightapp.bookingservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public BookingResponseDTO bookFlight(@RequestBody BookingRequestDTO dto) {
        return bookingService.bookFlight(dto);
    }

    @GetMapping("/my-bookings/{email}")
    public List<Booking> getBookings(@PathVariable String email) {
        return bookingService.getBookingsByEmail(email);
    }
}
