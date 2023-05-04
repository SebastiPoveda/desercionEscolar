package com.example.desercion.repository;

import com.example.desercion.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<Usuario,Integer> {

    public Optional<Usuario> findByEmail (String email);
}
