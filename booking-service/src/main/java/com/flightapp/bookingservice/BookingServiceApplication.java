package com.flightapp.bookingservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
@EnableDiscoveryClient
public class BookingServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(BookingServiceApplication.class, args);
		System.out.println(" Booking Service started successfully.");
	}

	@Bean
	CommandLineRunner init() {
		return args -> System.out.println("Booking Service is live and ready.");
	}
}
