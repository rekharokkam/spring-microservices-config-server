package com.learning.spring.microservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class SpringMicroservicesConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringMicroservicesConfigServerApplication.class, args);
	}
}
