package com.flightapp.bookingservice.service;

import com.flightapp.bookingservice.dto.BookingRequestDTO;
import com.flightapp.bookingservice.dto.BookingResponseDTO;
import com.flightapp.bookingservice.entity.Booking;
import com.flightapp.bookingservice.repository.BookingRepository;
import com.flightapp.bookingservice.service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookingServiceImpl implements BookingService {

    @Autowired
    private BookingRepository repository;

    @Override
    public BookingResponseDTO bookFlight(BookingRequestDTO dto) {
        Booking booking = new Booking();
        booking.setFlightNumber(dto.getFlightNumber());
        booking.setEmail(dto.getEmail());
        booking.setNumberOfSeats(dto.getNumberOfSeats());
        booking.setTotalPrice(dto.getNumberOfSeats() * dto.getPricePerSeat());
        booking.setStatus("CONFIRMED");

        Booking saved = repository.save(booking);

        BookingResponseDTO response = new BookingResponseDTO();
        response.setBookingId(saved.getId());
        response.setFlightNumber(saved.getFlightNumber());
        response.setEmail(saved.getEmail());
        response.setNumberOfSeats(saved.getNumberOfSeats());
        response.setTotalPrice(saved.getTotalPrice());
        response.setStatus(saved.getStatus());

        return response;
    }

    @Override
    public List<Booking> getBookingsByEmail(String email) {
        return repository.findByEmail(email);
    }
}
