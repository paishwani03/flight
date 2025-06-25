package com.flightapp.userservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class UserActivity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String email;
    private String action;
    private String details;
    private String timestamp;
}
