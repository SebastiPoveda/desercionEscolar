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
	private int semestres;
	private int creditos;

	@ManyToOne
	@JoinColumn(name = "areasId")
	@JsonIgnoreProperties("carreras")
	private Area area;

	@ManyToMany
	@JoinColumn(name = "lista de usuarios")
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

	public int getSemestres() {
		return semestres;
	}

	public void setSemestres(int semestres) {
		this.semestres = semestres;
	}

	public int getCreditos() {
		return creditos;
	}

	public void setCreditos(int creditos) {
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
