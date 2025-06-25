package com.flightapp.adminservice.repository;

import com.flightapp.adminservice.entity.FlightInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<FlightInfo, String> {
}
