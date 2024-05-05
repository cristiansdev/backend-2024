package com.microservicio.usuarios;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@EntityScan({"com.example.common.users.springbootservicecommonsusers.Entity"})
@SpringBootApplication
public class SpringbootServiciosUsuariosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootServiciosUsuariosApplication.class, args);
	}

}
