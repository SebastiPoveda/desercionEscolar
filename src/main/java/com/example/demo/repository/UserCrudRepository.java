package com.example.demo.repository;

import com.example.demo.entity.Usuario;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface UserCrudRepository extends CrudRepository<Usuario,Integer> {

    public Optional<Usuario> findByEmail (String email);
}
