package com.example.testservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestServicesApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestServicesApplication.class, args);
	}

}
