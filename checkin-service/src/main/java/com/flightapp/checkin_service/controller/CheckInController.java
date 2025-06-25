package com.flightapp.checkin_service.controller;

import com.flightapp.checkin_service.entity.CheckIn;
import com.flightapp.checkin_service.service.CheckInService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/checkin")
public class CheckInController {

    @Autowired
    private CheckInService service;

    @PostMapping("/do")
    public ResponseEntity<CheckIn> checkIn(@RequestBody CheckIn checkIn) {
        return ResponseEntity.ok(service.checkIn(checkIn));
    }

    @GetMapping("/user/{email}")
    public ResponseEntity<List<CheckIn>> getByUser(@PathVariable String email) {
        return ResponseEntity.ok(service.getCheckInsByUser(email));
    }
}
