package com.flightapp.userservice.dto;

import lombok.Data;

@Data
public class UserActivityDTO {
    private String email;
    private String action;
    private String details;
    private String timestamp;
}
