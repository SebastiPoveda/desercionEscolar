package com.example.desercion.service;

import com.example.desercion.entity.Pregunta;
import com.example.desercion.entity.Usuario;
import com.example.desercion.repository.PreguntaRepository;
import com.example.desercion.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PreguntaService {

    @Autowired
    private PreguntaRepository preguntaRepository;

    @Autowired
    private UsuarioRepository userRepository;
    public List<Pregunta> getAll(){
        return (List<Pregunta>) preguntaRepository.findAll();
    }
    public Pregunta save(Pregunta p, String correo){
        Optional<Usuario> u = userRepository.findByEmail(correo);
        if(u.isPresent()){
            p.setUsuario(u.get());
        }
        return preguntaRepository.save(p);
    }

    public Optional<Pregunta> getByTitle(String titulo){
        return preguntaRepository.findByTitle(titulo);
    }

}
