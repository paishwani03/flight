package com.flightapp.searchservice.controller;

import com.flightapp.searchservice.entity.Flight;
import com.flightapp.searchservice.service.FlightService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/flights")
public class FlightController {

    @Autowired
    private FlightService flightService;

    @GetMapping("/search")
    public List<Flight> searchFlights(
            @RequestParam String source,
            @RequestParam String destination,
            @RequestParam String date
    ) {
        return flightService.searchFlights(source, destination, date);
    }

    @PostMapping("/add")
    public Flight addFlight(@RequestBody Flight flight) {
        return flightService.addFlight(flight);
    }
}
