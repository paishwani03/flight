package com.flightapp.adminservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AdminServiceApplication {
	public static void main(String[] args) {
		SpringApplication.run(AdminServiceApplication.class, args);
		System.out.println("Admin Service started successfully. Exiting main with code 0.");
	}
}
