package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;


@Entity
@Table(name = "universidad")

public class Universidad implements Serializable{
	@Id
	@GeneratedValue( strategy = GenerationType.IDENTITY)
	private Integer universidadId;
	private String name;
	private String tipo;
	private String ubicacion;
	
	@OneToMany(cascade = {CascadeType.PERSIST},mappedBy = "universidad")
	@JsonIgnoreProperties("universidad")
	private List<Area> areas;
	
}
