package com.flightapp.userservice.controller;

import com.flightapp.userservice.dto.UserActivityDTO;
import com.flightapp.userservice.entity.UserActivity;
import com.flightapp.userservice.service.UserActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user/activity")
public class UserActivityController {

    @Autowired
    private UserActivityService userActivityService;

    @PostMapping("/log")
    public ResponseEntity<String> logActivity(@RequestBody UserActivityDTO dto) {
        userActivityService.logActivity(dto);
        return ResponseEntity.ok("Activity logged successfully");
    }

    @GetMapping("/history/{email}")
    public ResponseEntity<List<UserActivity>> getActivityHistory(@PathVariable String email) {
        return ResponseEntity.ok(userActivityService.getActivityHistory(email));
    }
}
