package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.io.Serializable;
import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios")
public class Usuarios implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idUsuarios;
	private String name;
	private String email;

	@ManyToMany
	@JoinColumn(name = "carreras favoritas")
	@JsonIgnoreProperties("usuarios")
	private List<Carreras> listaFavoritos;

	public Integer getIdUsuarios() {
		return idUsuarios;
	}

	public void setIdUsuarios(Integer idUsuarios) {
		this.idUsuarios = idUsuarios;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Carreras> getListaFavoritos() {
		return listaFavoritos;
	}

	public void setListaFavoritos(List<Carreras> listaFavoritos) {
		this.listaFavoritos = listaFavoritos;
	}
}
