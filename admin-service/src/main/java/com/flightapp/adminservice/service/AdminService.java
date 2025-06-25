package com.flightapp.adminservice.service;

import com.flightapp.adminservice.dto.UpdateFlightDTO;
import com.flightapp.adminservice.entity.FlightInfo;
import com.flightapp.adminservice.repository.FlightRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AdminService {

    @Autowired
    private FlightRepository repository;

    public FlightInfo updateFlight(UpdateFlightDTO dto) {
        FlightInfo flight = repository.findById(dto.getFlightNumber()).orElseThrow();
        flight.setDestination(dto.getNewDestination());
        return repository.save(flight);
    }
}
