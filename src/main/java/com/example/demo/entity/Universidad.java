package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "universidad")

public class Universidad implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer universidadId;
	private String name;
	private String tipo;
	private String ubicacion;

	@OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "universidad")
	@JsonIgnoreProperties("universidad")
	private List<Area> areas;

	public Integer getUniversidadId() {
		return universidadId;
	}

	public void setUniversidadId(Integer universidadId) {
		this.universidadId = universidadId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getUbicacion() {
		return ubicacion;
	}

	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}

	public List<Area> getAreas() {
		return areas;
	}

	public void setAreas(List<Area> areas) {
		this.areas = areas;
	}
}
