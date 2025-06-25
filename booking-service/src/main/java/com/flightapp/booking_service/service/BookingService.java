package com.flightapp.booking_service.service;


import com.flightapp.booking_service.dto.BookingRequestDTO;
import com.flightapp.booking_service.entity.Booking;

import java.util.List;

public interface BookingService {
    Booking bookFlight(BookingRequestDTO dto);
    List<Booking> getBookingsByUser(String email);
    boolean updateStatus(Long bookingId, String status);
}

