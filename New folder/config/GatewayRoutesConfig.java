package com.flightapp.api_gateway.config;


import com.flightapp.api_gateway.security.JwtAuthenticationFilter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;

@Configuration
public class GatewayRoutesConfig {

    private final JwtAuthenticationFilter jwtFilter;

    public GatewayRoutesConfig(JwtAuthenticationFilter jwtFilter) {
        this.jwtFilter = jwtFilter;
    }

    @Bean
    public RouteLocator routes(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("user-service", r -> r.path("/user/**").filters(f -> f.filter(jwtFilter)).uri("http://localhost:8081"))
                .route("search-service", r -> r.path("/api/flights/**").filters(f -> f.filter(jwtFilter)).uri("http://localhost:8082"))
                .route("admin-service", r -> r.path("/admin/**").filters(f -> f.filter(jwtFilter)).uri("http://localhost:8083"))
                .route("booking-service", r -> r.path("/booking/**").filters(f -> f.filter(jwtFilter)).uri("http://localhost:8084"))
                .route("payment-service", r -> r.path("/payment/**").filters(f -> f.filter(jwtFilter)).uri("http://localhost:8085"))
                .route("auth-service", r -> r.path("/auth/**").uri("http://localhost:8088"))
                .build();
    }
}

//<dependency>
//  <groupId>org.springdoc</groupId>
//  <artifactId>springdoc-openapi-starter-webflux-ui</artifactId>
//  <version>2.5.0</version>
//</dependency>
