package com.flightapp.booking_service.controller;

import com.flightapp.booking_service.dto.BookingRequestDTO;
import com.flightapp.booking_service.entity.Booking;
import com.flightapp.booking_service.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @PostMapping("/book")
    public Booking bookFlight(@RequestBody BookingRequestDTO dto) {
        return bookingService.bookFlight(dto);
    }

    @GetMapping("/user/{email}")
    public List<Booking> getUserBookings(@PathVariable String email) {
        return bookingService.getBookingsByUser(email);
    }

    // This is the endpoint Feign client in payment-service is trying to call
    // BookingController.java
    @PostMapping("/update-status")
    public ResponseEntity<String> updateBookingStatus(@RequestParam Long bookingId,
                                                      @RequestParam String status) {
        boolean updated = bookingService.updateStatus(bookingId, status);
        if (updated) {
            return ResponseEntity.ok("Booking status updated");
        } else {
            return ResponseEntity.status(404).body("Booking not found");
        }
    }


}
