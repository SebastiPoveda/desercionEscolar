package com.example.desercion.service;

import com.example.desercion.entity.Pregunta;
import com.example.desercion.repository.PreguntaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;
    public List<Pregunta> getAll(){
        return (List<Pregunta>) preguntaRepository.findAll();
    }
    public Pregunta save(Pregunta p){
        return preguntaRepository.save(p);
    }

    public Optional<Pregunta> getByTitle(String titulo){
        return preguntaRepository.findByTitle(titulo);
    }

}
