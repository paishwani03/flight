package com.flightapp.userservice.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class UserActivityDTO {
    private String email;
    private String action;
    private String details;
    private LocalDateTime timestamp;
}
