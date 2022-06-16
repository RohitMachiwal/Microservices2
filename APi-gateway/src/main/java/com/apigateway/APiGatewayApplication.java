package com.apigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class APiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(APiGatewayApplication.class, args);
	}

}