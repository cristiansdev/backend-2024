package com.microservice.prueba.controllers;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.microservice.prueba.entity.Celular;
import com.microservice.prueba.service.CelularService;

@RestController
public class CelularController {
	@Autowired
	private CelularService service;

	@Value("${server.port}")
	private Integer port;

	@GetMapping("/list")
	public List<Celular> list(){
		return service.findAll().stream().map(cel -> {
			cel.setPort(port);
			return cel;
		}).collect(Collectors.toList());
	}
	
	 @GetMapping("/celular/{id}")
	 public Celular detail(@PathVariable Long id) {
		// boolean bl = false;
		// if(!bl)
		// 	throw new RuntimeException("No se pudo obtener el detalle del celular");
		 return service.findById(id);
	 }
	
	//Response Entity me permite retornar respuestas HTPP
	@DeleteMapping("/celular/{id}")
	public ResponseEntity<Void> drop(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.noContent().build();
	}
	
	//Queremos retornar el estatus HTTP junto con el objeto
	//RequestBody es un JSON, me ayuda a recibir el objeto Celular
	@PostMapping("/celular")
	public ResponseEntity<Celular> add(@RequestBody Celular instance){
		Celular cel = service.save(instance);
		return new ResponseEntity<>(cel, HttpStatus.CREATED);
	}
	@PutMapping("/celular/{id}")
	public ResponseEntity<Celular> update(@PathVariable Long id, @RequestBody Celular instace){
		if(service.existsById(id)) {
			instace.setId(id);
			Celular cel = service.save(instace);
			return new ResponseEntity<>(cel, HttpStatus.OK);
		}else {
			return new ResponseEntity<>(HttpStatus.NOT_FOUND);
		}
	}

}
