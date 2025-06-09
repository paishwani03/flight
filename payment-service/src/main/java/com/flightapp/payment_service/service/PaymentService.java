package com.flightapp.payment_service.service;

import com.flightapp.payment_service.dto.PaymentRequestDTO;
import com.flightapp.payment_service.entity.Payment;
import com.flightapp.payment_service.feign.BookingServiceClient;
import com.flightapp.payment_service.repository.PaymentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class PaymentService {

    @Autowired
    private PaymentRepository repository;

    @Autowired
    private BookingServiceClient bookingClient;

    public Payment processPayment(PaymentRequestDTO request) {
        Payment payment = new Payment();
        payment.setBookingId(request.getBookingId());
        payment.setUserEmail(request.getUserEmail());
        payment.setAmount(request.getAmount());
        payment.setPaymentDate(LocalDateTime.now().toString());

        // dummy payment logic
        payment.setStatus("SUCCESS");

        Payment saved = repository.save(payment);

        // Notify booking service
        bookingClient.updateBookingStatus(request.getBookingId(), "PAID");

        return saved;
    }
}

