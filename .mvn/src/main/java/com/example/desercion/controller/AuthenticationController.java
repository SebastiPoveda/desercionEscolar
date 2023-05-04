package com.example.desercion.controller;

import com.example.desercion.auth.AuthenticationRequest;
import com.example.desercion.auth.AuthenticationResponse;
import com.example.desercion.entity.Usuario;
import com.example.desercion.service.AuthenticationService;
import com.example.desercion.auth.RegisterRequest;
import com.example.desercion.service.UsuarioService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1/auth")
@RequiredArgsConstructor
public class AuthenticationController {
    private final AuthenticationService service;
    private final UsuarioService usuarioService;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
            @RequestBody RegisterRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> authentication(
            @RequestBody AuthenticationRequest request
    ) {
        return ResponseEntity.ok(service.authenticate(request));
    }

    @GetMapping("/all")
    public List<Usuario> all() {
        return usuarioService.getAll();
    }


}
