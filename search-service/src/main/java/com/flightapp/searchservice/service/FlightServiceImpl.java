package com.flightapp.searchservice.service;

import com.flightapp.searchservice.entity.Flight;
import com.flightapp.searchservice.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FlightServiceImpl implements FlightService {

    @Autowired
    private FlightRepository flightRepository;

    @Override
    public List<Flight> searchFlights(String source, String destination, String date) {
        return flightRepository.findBySourceAndDestinationAndDate(source, destination, date);
    }

    @Override
    public Flight addFlight(Flight flight) {
        return flightRepository.save(flight);
    }
}
