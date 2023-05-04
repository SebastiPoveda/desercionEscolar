package com.example.desercion.repository;

import com.example.desercion.entity.Pregunta;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface PreguntaCrudRepository extends CrudRepository<Pregunta, Integer> {

    Optional<Pregunta> findByTitulo(String titulo);
}
