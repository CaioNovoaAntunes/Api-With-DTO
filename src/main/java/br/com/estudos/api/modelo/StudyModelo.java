package br.com.estudos.api.modelo;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class StudyModelo {
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  Long id;
  public StudyModelo(String nome, LocalDate datainicio, LocalDate datafinal) {
	  
	this.nome=nome;
	this.datainicio = datainicio;
	this.datafinal = datafinal;
}

public Long getId() {
	return id;
}

public String getNome() {
	return nome;
}
public LocalDate getDatainicio() {
	return datainicio;
}
public LocalDate getDatafinal() {
	return datafinal;
}
@Column(nullable=false, length=50)
  String nome;
@Column(nullable=false, unique=true)
  LocalDate datainicio;
@Column(nullable=false)
  LocalDate datafinal;
}
