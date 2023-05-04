package com.example.desercion.entity;
import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "universidad")
public class Universidad implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer universidadId;
    private String name;
    private String tipo;
    private String ubicacion;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Area> areas;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Carreras> carreras;

}