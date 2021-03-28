package br.com.estudos.api.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import br.com.estudos.api.modelo.StudyModelo;

public class Request {
	private String nome;
	
	private LocalDate datainicio;
	private LocalDate datafinal;
	

	public Request(@NotBlank @Size(max = 50) String nome, @NotNull LocalDate datainicio,
			@NotNull LocalDate datafinal) {
		this.nome = nome;
		this.datainicio = datainicio;
		this.datafinal = datafinal;

	}
	public StudyModelo converter() {
		return new StudyModelo(nome, datainicio, datafinal);
	}
}
