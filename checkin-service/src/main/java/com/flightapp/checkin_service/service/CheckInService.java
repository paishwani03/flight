package com.flightapp.checkin_service.service;


import com.flightapp.checkin_service.entity.CheckIn;
import com.flightapp.checkin_service.repository.CheckInRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CheckInService {

    @Autowired
    private CheckInRepository repository;

    public CheckIn checkIn(CheckIn checkIn) {
        return repository.save(checkIn);
    }

    public List<CheckIn> getCheckInsByUser(String userEmail) {
        return repository.findByUserEmail(userEmail);
    }
}
