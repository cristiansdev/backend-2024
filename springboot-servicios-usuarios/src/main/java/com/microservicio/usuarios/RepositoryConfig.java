package com.microservicio.usuarios;

import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

import com.example.common.users.springbootservicecommonsusers.Entity.Usuario;
import com.example.common.users.springbootservicecommonsusers.Entity.Role;
@Configuration
public class RepositoryConfig implements RepositoryRestConfigurer {

    @Override
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
        config.exposeIdsFor(Usuario.class, Role.class);
    }
}
