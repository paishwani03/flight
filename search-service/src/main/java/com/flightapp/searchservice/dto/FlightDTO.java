package com.flightapp.searchservice.dto;

import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class FlightDTO {
    private String source;
    private String destination;
    private String date;
}
