package com.example.demo.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "carreras")
public class Carreras implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carrerasID;
	private String modalidad;
	private int semestres;
	private int creditos;
	
	
	@ManyToOne
	@JoinColumn(name = "areasId")
	@JsonIgnoreProperties("carreras")
	private Area area;
	
}
