package com.flightapp.authenticator_service.controller;


import com.flightapp.authenticator_service.dto.AuthRequest;
import com.flightapp.authenticator_service.dto.AuthResponse;
import com.flightapp.authenticator_service.dto.RegisterRequest;
import com.flightapp.authenticator_service.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {

    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<String> register(@RequestBody RegisterRequest request) {
        return ResponseEntity.ok(authService.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> login(@RequestBody AuthRequest request) {
        return ResponseEntity.ok(authService.login(request));
    }
}
