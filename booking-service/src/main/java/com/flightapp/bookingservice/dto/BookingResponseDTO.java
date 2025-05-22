package com.flightapp.bookingservice.dto;

import lombok.Data;

@Data
public class BookingResponseDTO {
    private Long bookingId;
    private String flightNumber;
    private String email;
    private int numberOfSeats;
    private double totalPrice;
    private String status;
}
