package com.microservice.cellphone.springbootservicecellphone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SpringbootServiceCellphoneApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootServiceCellphoneApplication.class, args);
    }

}
