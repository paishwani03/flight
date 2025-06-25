package com.flightapp.userservice.dto;

import lombok.Data;
import java.time.LocalDateTime;

@Data
public class BookingDTO {
    private String flightNumber;
    private LocalDateTime departureTime;
    private String destination;
}
