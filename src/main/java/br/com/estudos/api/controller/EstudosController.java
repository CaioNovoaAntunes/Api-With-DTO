package br.com.estudos.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import javax.validation.Valid;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.estudos.api.Repository.StudyesRepository;
import br.com.estudos.api.dto.Request;
import br.com.estudos.api.dto.Response;
import br.com.estudos.api.modelo.StudyModelo;

@RestController
@RequestMapping("/estudo")
public class EstudosController {
	
	private StudyesRepository repository;
	
	@Autowired
	public EstudosController(StudyesRepository repository) {
		this.repository = repository;
	}
	
	@ResponseStatus(HttpStatus.CREATED)
	@PostMapping
	public Response cadastrar(@RequestBody @Valid Request r ) {
		return new Response(repository.save(r.converter()));
		
	}

}
