package com.cloudnativecoffee.market;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;

@SpringBootApplication
@EnableCircuitBreaker
public class MarketplaceServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarketplaceServiceApplication.class, args);
		
	}
}
