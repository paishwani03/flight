package com.flightapp.checkin_service.repository;


import com.flightapp.checkin_service.entity.CheckIn;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CheckInRepository extends JpaRepository<CheckIn, Long> {
    List<CheckIn> findByUserEmail(String userEmail);
}
