package com.example.desercion.repository;

import com.example.desercion.entity.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsuarioRepository {

    @Autowired
    UsuarioCrudRepository usuarioCrudRepository;

    public List<Usuario> getAll(){
        return (List<Usuario>) usuarioCrudRepository.findAll();
    }

}
