package com.flightapp.searchservice.service;

import com.flightapp.searchservice.entity.Flight;

import java.util.List;

public interface FlightService {
    List<Flight> searchFlights(String source, String destination, String date);
    Flight addFlight(Flight flight);
}
