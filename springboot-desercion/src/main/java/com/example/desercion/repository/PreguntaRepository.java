package com.example.desercion.repository;

import com.example.desercion.entity.Pregunta;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public class PreguntaRepository {

    @Autowired
    PreguntaCrudRepository preguntaCrudRepository;

    public List<Pregunta> findAll(){
        return (List<Pregunta>) preguntaCrudRepository.findAll();
    }
    public Pregunta save(Pregunta p){
        return preguntaCrudRepository.save(p);
    }

    public Optional<Pregunta> findByTitle(String titulo){
        return preguntaCrudRepository.findByTitulo(titulo);
    }
}
