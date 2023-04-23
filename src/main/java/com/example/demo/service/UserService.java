package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Usuarios;
import com.example.demo.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	private UserRepository usuarios;
	
	public List<Usuarios> getAll(){
		return usuarios.getAll();
	}
	public Usuarios save(Usuarios u) {
		return usuarios.save(u);
	}
}
