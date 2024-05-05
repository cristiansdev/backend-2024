package com.microservicio.usuarios.repository;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.rest.core.annotation.RestResource;

import com.example.common.users.springbootservicecommonsusers.Entity.Usuario;

@RepositoryRestResource(path = "usuarios") 
public interface UsuarioRepository extends PagingAndSortingRepository<Usuario, Long>{
    //select u from usuarios where username = ?1
    @RestResource(path = "buscar-username")
    public Usuario findByUsername(String username);
    //select u from usuarios where username = ?1 and email = ?2
    public Usuario findByUsernameAndEmail(String usernamer, String email);

    //este es sin usar las palabras reservadas
    @Query(value = "select u from Usuario u where u.username = ?1")
    public Usuario obtenerPorUsername(String username);

    //este es sin usar las palabras reservadas
    @Query(value = "select u from Usuario u where u.username = ?1 and u.email = ?2")
    public Usuario obtenerPorUsernameyEmail(String username, String email);
}
