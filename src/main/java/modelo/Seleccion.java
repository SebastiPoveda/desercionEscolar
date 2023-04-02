package modelo;

import java.util.ArrayList;
import java.util.HashMap;

import iAreas.Composite;
import iAreas.Creacion;

public class Seleccion {

	// Todo lo que se necesita en el get
	Creacion creacion = new Creacion();
	Composite c = new Composite();
	Registro r = new Registro();
	HashMap<String, Composite> h = new HashMap<>();
	public ArrayList<Sugerencia> s = new ArrayList<>();

	public String areasJson() {
		return Json.toJson(creacion.getAreas().toString());
	}

	public String extraerCarreras(String area) {
		System.out.println("El area: " + area);
		h.put("Ciencias Exactas e Ingenieria", creacion.cienciasIng());
		h.put("Escuela de Ciencias de la Comunicacion", creacion.comunicacion());
		h.put("Escuela de Moda", creacion.moda());
		h.put("Escuela Mayor de Derecho", creacion.derecho());
		c = h.get(area);
		return Json.toJson(c.hijos);
	}

	public String sugerencias(String area, String carrera) {
		if (yaEstaRegistrado(carrera)) {
			return ("La sugerencia ya ha sido regitrada anteriormente");
		} else {
			r.fichero(new Sugerencia(area, carrera));
			s.add(new Sugerencia(area, carrera));
			return ("Sugerencia realizada, ¡Gracias!");
		}
	}

	public Boolean yaEstaRegistrado(String carrera) {
		return s.stream().anyMatch(p -> p.getCarrera().equals(carrera));

	}

}
