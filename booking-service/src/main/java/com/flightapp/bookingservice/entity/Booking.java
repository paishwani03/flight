package com.flightapp.bookingservice.entity;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class Booking {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String flightNumber;
    private String email;
    private int numberOfSeats;
    private double totalPrice;
    private String status; // CONFIRMED, CANCELLED, etc.
}
