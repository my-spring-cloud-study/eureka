package com.test.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class EurekaTestApplication {
	public static void main(String[] args) {
		SpringApplication.run(EurekaTestApplication.class, args);
	}
}
