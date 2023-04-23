package com.example.demo.entity;

import java.io.Serializable;
import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.*;

@Entity
@Table(name = "area")
public class Area implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer areaId;
	private String name;

	@ManyToOne
	@JoinColumn(name = "universidadId")
	@JsonIgnoreProperties("area")
	private Universidad universidad;

	@OneToMany(cascade = { CascadeType.PERSIST }, mappedBy = "area")
	@JsonIgnoreProperties("area")
	private List<Carreras> carreras;

	public Integer getAreaId() {
		return areaId;
	}

	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Universidad getUniversidad() {
		return universidad;
	}

	public void setUniversidad(Universidad universidad) {
		this.universidad = universidad;
	}

	public List<Carreras> getCarreras() {
		return carreras;
	}

	public void setCarreras(List<Carreras> carreras) {
		this.carreras = carreras;
	}

}
