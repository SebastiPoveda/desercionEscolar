package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usuarios;

@Repository
public class UserRepository {
	@Autowired
	private UsuariosCRUDRepository users;
	
	public List<Usuarios> getAll(){
		return (List<Usuarios>)users.findAll();
	}
	
	public Usuarios save(Usuarios u) {
		return users.save(u);
	}
}
