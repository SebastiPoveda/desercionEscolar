package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Usuarios;

public interface UsuariosCRUDRepository extends CrudRepository<Usuarios,Integer>{
}
