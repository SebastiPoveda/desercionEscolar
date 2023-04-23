package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.demo.entity.Usuarios;
import com.example.demo.service.UserService;

@RestController
@RequestMapping("/api/user")
public class UserController {
	@Autowired
	private UserService userService;
	
	@GetMapping("all")
	public List<Usuarios> getPizzas() {
		return userService.getAll();
	}

	@PostMapping("save")
	public Usuarios savePizza(@RequestBody Usuarios u) {
		
		return userService.save(u);
	}
}
