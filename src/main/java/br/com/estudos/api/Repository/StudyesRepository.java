package br.com.estudos.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.estudos.api.modelo.StudyModelo;

@Repository
public interface StudyesRepository extends JpaRepository<StudyModelo, Long> {





}
