package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "carreras")
public class Carreras implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer carrerasID;
	private String modalidad;
	private Integer semestres;
	private Integer creditos;

	@ManyToOne
	@JoinColumn(name = "areaId")
	@JsonIgnoreProperties("carreras")
	private Area area;

	@ManyToMany
	@JoinColumn(name = "lista de usuarios por carrera")
	@JsonIgnoreProperties("carreras")
	private List<Usuarios> usuarios;

	public Integer getCarrerasID() {
		return carrerasID;
	}

	public void setCarrerasID(Integer carrerasID) {
		this.carrerasID = carrerasID;
	}

	public String getModalidad() {
		return modalidad;
	}

	public void setModalidad(String modalidad) {
		this.modalidad = modalidad;
	}

	public Integer getSemestres() {
		return semestres;
	}

	public void setSemestres(Integer semestres) {
		this.semestres = semestres;
	}

	public Integer getCreditos() {
		return creditos;
	}

	public void setCreditos(Integer creditos) {
		this.creditos = creditos;
	}

	public Area getArea() {
		return area;
	}

	public void setArea(Area area) {
		this.area = area;
	}

	public List<Usuarios> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuarios> usuarios) {
		this.usuarios = usuarios;
	}


}
