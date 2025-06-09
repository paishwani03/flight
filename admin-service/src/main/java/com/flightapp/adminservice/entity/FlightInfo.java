package com.flightapp.adminservice.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class FlightInfo {

    @Id
    private String flightNumber;

    private String source;
    private String destination;
    private String airline;
    private String departureTime;
}
