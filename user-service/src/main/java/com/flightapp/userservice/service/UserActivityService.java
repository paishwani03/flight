package com.flightapp.userservice.service;

import com.flightapp.userservice.dto.UserActivityDTO;
import com.flightapp.userservice.entity.UserActivity;
import com.flightapp.userservice.repository.UserActivityRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserActivityService {

    @Autowired
    private UserActivityRepository repository;

    public void logActivity(UserActivityDTO dto) {
        UserActivity activity = new UserActivity();
        activity.setEmail(dto.getEmail());
        activity.setAction(dto.getAction());
        activity.setDetails(dto.getDetails());
        activity.setTimestamp(dto.getTimestamp());
        repository.save(activity);
    }

    public List<UserActivity> getActivityHistory(String email) {
        return repository.findByEmail(email);
    }
}
