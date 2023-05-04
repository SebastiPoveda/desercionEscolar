package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Usuario;

@Repository
public class UserRepository {
	@Autowired
	private UserCrudRepository users;
	
	public List<Usuario> getAll(){
		return (List<Usuario>)users.findAll();
	}
	
	public Usuario save(Usuario u) {
		return users.save(u);
	}
}
