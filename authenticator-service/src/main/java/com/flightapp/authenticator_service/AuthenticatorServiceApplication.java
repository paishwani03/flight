package com.flightapp.authenticator_service;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AuthenticatorServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthenticatorServiceApplication.class, args);
		System.out.println("Running successfully");
	}

}
