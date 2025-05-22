package com.flightapp.userservice.repository;

import com.flightapp.userservice.entity.UserActivity;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface UserActivityRepository extends JpaRepository<UserActivity, Long> {
    List<UserActivity> findByEmail(String email);
}
