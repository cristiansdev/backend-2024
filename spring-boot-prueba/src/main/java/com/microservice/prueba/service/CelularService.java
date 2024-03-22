package com.microservice.prueba.service;

import java.util.List;

import com.microservice.prueba.entity.Celular;

public interface CelularService {
	
	public List<Celular> findAll();
	
	public Celular findById(Long id);
	
	public void deleteById(Long id);
	
	public Celular save(Celular instance);
	
	public boolean existsById(Long id);
}
