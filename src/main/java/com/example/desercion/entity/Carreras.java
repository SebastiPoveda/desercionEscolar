package com.example.desercion.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "carreras")
public class Carreras implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer carrerasID;
    private String modalidad;
    private Integer semestres;
    private Integer creditos;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Area> area;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Usuario> usuarios;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Universidad> universidades;
}