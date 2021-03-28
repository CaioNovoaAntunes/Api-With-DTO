package br.com.estudos.api.dto;

import java.time.LocalDate;

import br.com.estudos.api.modelo.StudyModelo;

public class Response {	

private Long id;

private String nome;
private LocalDate datainicio;
private LocalDate datafinal;

	public Response(StudyModelo studyModelo) {
		this.id = studyModelo.getId();
		this.nome = studyModelo.getNome();
		this.datainicio = studyModelo.getDatainicio();
		this.datafinal = studyModelo.getDatafinal();
		
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public LocalDate getDatainicio() {
		return datainicio;
	}
	public void setDatainicio(LocalDate datainicio) {
		this.datainicio = datainicio;
	}
	public LocalDate getDatafinal() {
		return datafinal;
	}
	public void setDatafinal(LocalDate datafinal) {
		this.datafinal = datafinal;
	}

	
	
}
