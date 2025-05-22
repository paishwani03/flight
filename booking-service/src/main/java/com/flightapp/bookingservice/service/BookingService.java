package com.flightapp.bookingservice.service;

import com.flightapp.bookingservice.dto.BookingRequestDTO;
import com.flightapp.bookingservice.dto.BookingResponseDTO;
import com.flightapp.bookingservice.entity.Booking;

import java.util.List;

public interface BookingService {
    BookingResponseDTO bookFlight(BookingRequestDTO dto);
    List<Booking> getBookingsByEmail(String email);
}
