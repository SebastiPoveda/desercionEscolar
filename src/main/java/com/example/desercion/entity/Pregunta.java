package com.example.desercion.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "pregunta")
public class Pregunta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String titulo;
    private String contenido;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Usuario> usuarios;

}
