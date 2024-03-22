package com.microservice.prueba.repository;

import org.springframework.data.repository.CrudRepository;

import com.microservice.prueba.entity.Celular;

public interface CelularDao extends CrudRepository<Celular, Long>{

}
