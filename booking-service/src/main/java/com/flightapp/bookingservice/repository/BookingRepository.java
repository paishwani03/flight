package com.flightapp.bookingservice.repository;

import com.flightapp.bookingservice.entity.Booking;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByEmail(String email);
}
