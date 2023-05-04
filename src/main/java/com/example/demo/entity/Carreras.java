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

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Area> area;

	@ManyToMany(cascade = CascadeType.ALL)
	private List<Usuario> usuarios;
	
	@ManyToMany(cascade = CascadeType.ALL)
	private List<Universidad> universidades;

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

	public List<Area> getArea() {
		return area;
	}

	public void setArea(List<Area> area) {
		this.area = area;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(List<Usuario> usuarios) {
		this.usuarios = usuarios;
	}

	public List<Universidad> getUniversidades() {
		return universidades;
	}

	public void setUniversidades(List<Universidad> universidades) {
		this.universidades = universidades;
	}
	


}
