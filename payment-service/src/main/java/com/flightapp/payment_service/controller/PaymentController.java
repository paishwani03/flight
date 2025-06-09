package com.flightapp.payment_service.controller;

import com.flightapp.payment_service.dto.PaymentRequestDTO;
import com.flightapp.payment_service.entity.Payment;
import com.flightapp.payment_service.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/payment")
public class PaymentController {

    @Autowired
    private PaymentService service;

    @PostMapping("/process")
    public ResponseEntity<Payment> makePayment(@RequestBody PaymentRequestDTO request) {
        return ResponseEntity.ok(service.processPayment(request));
    }
}

