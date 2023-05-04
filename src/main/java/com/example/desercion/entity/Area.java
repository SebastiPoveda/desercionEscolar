package com.example.desercion.entity;

import jakarta.persistence.*;
import lombok.Data;

import java.io.Serializable;
import java.util.List;

@Data
@Entity
@Table(name = "area")
public class Area implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer areaId;
    private String name;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Universidad> universidad;

    @ManyToMany(cascade = CascadeType.ALL)
    private List<Carreras> carreras;

}
