package com.example.demo.entity;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "area")
public class Area implements Serializable{
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer areaId;
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "universidadId")
	@JsonIgnoreProperties("area")
	private Universidad universidad;
	
	
}
