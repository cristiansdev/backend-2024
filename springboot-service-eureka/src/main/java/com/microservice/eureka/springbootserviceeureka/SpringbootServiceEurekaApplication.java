package com.microservice.eureka.springbootserviceeureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringbootServiceEurekaApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServiceEurekaApplication.class, args);
    }

}
