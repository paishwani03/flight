package com.flightapp.adminservice.dto;

public class UpdateFlightDTO {

    private String flightNumber;
    private String newDestination;

    // Getters and Setters
    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getNewDestination() {
        return newDestination;
    }

    public void setNewDestination(String newDestination) {
        this.newDestination = newDestination;
    }
}
