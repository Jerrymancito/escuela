package mx.com.jerry.controllers;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.com.jerry.service.ServiceImpl;

@RestController
@RequestMapping("estudiantes")
public class EstudentsController {

	@Autowired
	private ServiceImpl service;
	@Value("${spring.application.name}")
	String nombre;

	@PostConstruct
	public void init() {
		service.inicializarTabla();
		System.out.println(nombre);
	}

	@GetMapping
	public ResponseEntity<Object> getStudents() {

		return new ResponseEntity<>(service.getStudents(), HttpStatus.OK);
	}
}
