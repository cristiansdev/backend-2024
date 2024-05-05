package com.microservice.oauth.demo.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.example.common.users.springbootservicecommonsusers.Entity.Usuario;

@FeignClient("SPRINGBOOT-SERVICE-COMMONS-USERS")
public interface UsuarioFeignClient {

    @GetMapping("/usuarios/search/buscar-username")
    public Usuario findByUsername(@RequestParam String username);
}
