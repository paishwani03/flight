package com.flightapp.userservice;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class UserServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(UserServiceApplication.class, args);
		System.out.println("User Service started successfully. Exiting main with code 0.");
	}

	@Bean
	public CommandLineRunner init() {
		return args -> {
			System.out.println("Hello from User Service - CommandLineRunner running...");
		};
	}
}
