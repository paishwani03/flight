package com.flightapp.bookingservice.dto;

import lombok.Data;

@Data
public class BookingRequestDTO {
    private String flightNumber;
    private String email;
    private int numberOfSeats;
    private double pricePerSeat;
}
