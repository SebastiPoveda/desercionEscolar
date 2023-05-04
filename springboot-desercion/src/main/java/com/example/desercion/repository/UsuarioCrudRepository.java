package com.example.desercion.repository;

import com.example.desercion.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.List;
import java.util.Optional;

public interface UsuarioCrudRepository extends CrudRepository<Usuario,Integer> {

    public Optional<Usuario> findByEmail (String email);

}
