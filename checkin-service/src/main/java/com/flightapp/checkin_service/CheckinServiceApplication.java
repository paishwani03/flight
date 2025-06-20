package com.flightapp.checkin_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class CheckinServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(CheckinServiceApplication.class, args);
		System.out.println("Check-in service running successfully");
	}
}
