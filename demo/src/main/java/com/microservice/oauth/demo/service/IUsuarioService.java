package com.microservice.oauth.demo.service;

import com.example.common.users.springbootservicecommonsusers.Entity.Usuario;

public interface IUsuarioService {
    public Usuario findByUsername(String username);
}
