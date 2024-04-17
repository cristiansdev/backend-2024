package com.microservice.prueba;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringBootPruebaApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootPruebaApplication.class, args);
	}

}
