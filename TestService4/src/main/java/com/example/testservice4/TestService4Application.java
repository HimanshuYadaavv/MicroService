package com.example.testservice4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class TestService4Application {

	public static void main(String[] args) {
		SpringApplication.run(TestService4Application.class, args);
	}

}
