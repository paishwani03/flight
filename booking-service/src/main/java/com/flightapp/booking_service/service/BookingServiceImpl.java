package com.flightapp.booking_service.service;

import com.flightapp.booking_service.dto.BookingRequestDTO;
import com.flightapp.booking_service.entity.Booking;
import com.flightapp.booking_service.feign.UserServiceClient;
import com.flightapp.booking_service.repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository bookingRepository;

    @Autowired
    private UserServiceClient userClient;

    @Override
    public Booking bookFlight(BookingRequestDTO dto) {
        Booking booking = new Booking();
        booking.setUserEmail(dto.getUserEmail());
        booking.setFlightNumber(dto.getFlightNumber());
        booking.setBookingDate(dto.getBookingDate());
        booking.setNumberOfSeats(dto.getNumberOfSeats());
        booking.setStatus("CONFIRMED");

        Booking saved = bookingRepository.save(booking);

        userClient.logBooking(dto.getUserEmail(), "Booked flight " + dto.getFlightNumber());

        return saved;
    }

    @Override
    public List<Booking> getBookingsByUser(String email) {
        return bookingRepository.findByUserEmail(email);
    }


    // BookingServiceImpl.java
    @Override
    public boolean updateStatus(Long bookingId, String status) {
        Optional<Booking> optionalBooking = bookingRepository.findById(bookingId);
        if (optionalBooking.isPresent()) {
            Booking booking = optionalBooking.get();
            booking.setStatus(status);
            bookingRepository.save(booking);
            return true;
        } else {
            return false;
        }
    }



}
