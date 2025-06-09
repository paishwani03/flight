package com.flightapp.checkin_service.entity;


import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class CheckIn {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String userEmail;
    private String flightNumber;
    private String checkinDate;
    private String seatNumber;
}

