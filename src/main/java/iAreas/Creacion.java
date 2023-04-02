package iAreas;

import java.util.ArrayList;

public class Creacion {
	
	Pensum p = new Pensum();
	public ArrayList<String> areas = new ArrayList<String>();
	
	public Composite cienciasIng() {
		Composite cienciasExactasIng = new Composite();
		Leaf computacion = new Leaf("Ciencias Exactas e Ingenieria", "Ciencias de la Computacion e Inteligencia Artificial",p.leerPensum("Ciencias de la Computación e Inteligencia Artificial"));
		Leaf ambiental = new Leaf("Ciencias Exactas e Ingenieria", "Ingenieria Ambiental", p.leerPensum("Ingenieria Ambiental"));
//		Leaf industrial = new Leaf("Ingenieria", "Ingenieria Industrial", p.leerPensum("Ingenieria Industrial"));
		Leaf electronica = new Leaf("Ciencias Exactas e Ingenieria", "Ingenieria Electronica", p.leerPensum("Ingenieria Electronica"));
		Leaf matematicas = new Leaf("Ciencias Exactas e Ingenieria", "Matematicas", p.leerPensum("Matematicas"));
//		cienciasExactasIng.hijos.add(industrial);
		cienciasExactasIng.hijos.add(computacion);
		cienciasExactasIng.hijos.add(ambiental);
		cienciasExactasIng.hijos.add(electronica);
		cienciasExactasIng.hijos.add(matematicas);

		cienciasExactasIng.execute("Ciencias Exactas e Ingenieria");
		
		return cienciasExactasIng;
	}

	public Composite derecho() {
		Composite escuelaDerecho = new Composite();
		Leaf derecho = new Leaf("Escuela Mayor de Derecho", "Derecho", p.leerPensum("Derecho"));
		Leaf invertigacionCriminal = new Leaf("Escuela Mayor de Derecho", "Investigacion Criminal", p.leerPensum("Investigacion Criminal"));
		Leaf criminalistica = new Leaf("Escuela Mayor de Derecho", "Tecnologia en Criminalistica", p.leerPensum("Tecnologia en Criminalistica"));

		escuelaDerecho.hijos.add(derecho);
		escuelaDerecho.hijos.add(invertigacionCriminal);
		escuelaDerecho.hijos.add(criminalistica);

		escuelaDerecho.execute("Escuela Mayor de Derecho");
		
		return escuelaDerecho;
	}

	public Composite moda() {
		Composite escuelaModa = new Composite();
		Leaf negociosModa = new Leaf("Escuela de Moda", "Negocios Estrategicos de Moda", p.leerPensum("Negocios Estrategicos de Moda"));

		escuelaModa.hijos.add(negociosModa);

		escuelaModa.execute("Escuela de Moda");
		
		return escuelaModa;
	}
	public Composite comunicacion() {
		Composite cienciasComunicacion = new Composite();
		Leaf periodismo = new Leaf("Escuela de Ciencias de la Comunicacion", "Comunicacion Social y Periodismo Digital", p.leerPensum("Comunicacion Social y Periodismo Digital"));
		Leaf diseño = new Leaf("Escuela de Ciencias de la Comunicacion", "Diseño Digital", p.leerPensum("Diseño Digital"));

		cienciasComunicacion.hijos.add(periodismo);
		cienciasComunicacion.hijos.add(diseño);

		cienciasComunicacion.execute("Escuela de Ciencias de la Comunicacion");
		
		return cienciasComunicacion;
	}
	public ArrayList<String> getAreas(){
		areas.add("Ciencias Exactas e Ingenieria");
		areas.add("Escuela de Ciencias de la Comunicacion");
		areas.add("Escuela de Moda");
		areas.add("Escuela Mayor de Derecho");
		return areas;
	}


	
}
