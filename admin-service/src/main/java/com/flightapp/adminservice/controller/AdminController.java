package com.flightapp.adminservice.controller;

import com.flightapp.adminservice.dto.UpdateFlightDTO;
import com.flightapp.adminservice.entity.FlightInfo;
import com.flightapp.adminservice.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private AdminService service;

    @PutMapping("/update-flight")
    public FlightInfo updateFlight(@RequestBody UpdateFlightDTO dto) {
        return service.updateFlight(dto);
    }
}
