package com.flightapp.authenticator_service.dto;


import lombok.Data;

@Data
public class RegisterRequest {
    private String email;
    private String password;
    private String role; // "USER" or "ADMIN"
}
