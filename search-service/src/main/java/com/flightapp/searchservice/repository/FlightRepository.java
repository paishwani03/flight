package com.flightapp.searchservice.repository;

import com.flightapp.searchservice.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface FlightRepository extends JpaRepository<Flight, Long> {
    List<Flight> findBySourceAndDestinationAndDate(String source, String destination, String date);
}
