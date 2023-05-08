package com.example.desercion.controller;

import com.example.desercion.entity.Pregunta;
import com.example.desercion.service.PreguntaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/v1/forum")
public class PreguntaController {

    @Autowired
    private PreguntaService preguntaService;

    @GetMapping("/all")
    public List<Pregunta> getPreguntas(){
        return (List<Pregunta>) preguntaService.getAll();
    }

    @PostMapping("/create")
    public Pregunta makePregunta(@RequestBody Pregunta p){
        A a = new A();
        return preguntaService.save(p,a.getCorreo());
    }

    @GetMapping("/title")
    public Optional<Pregunta> getByTitle(String title){
        return preguntaService.getByTitle(title);
    }
}
