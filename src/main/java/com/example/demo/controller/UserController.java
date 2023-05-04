package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Usuario;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("all")
	public List<Usuario> getUsuarios() {
		return userService.getAll();
	}

	@PostMapping("save")
	public Usuario saveUsuarios(@RequestBody Usuario u) {
		
		return userService.save(u);
	}
}
