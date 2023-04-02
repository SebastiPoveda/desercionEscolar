package modelo;

import java.util.ArrayList;

public class A {

	Registro b = new Registro();
	public ArrayList<Personas> listapersonas = new ArrayList<Personas>();

	public String nuevoRegistro(String nombre, String email, String contra) {
		if (yaEstaRegistrado(email)) {
			return "Ya existe un usuario con ese email";
		} else {
			Personas registro = new Personas(nombre, email, contra);
			listapersonas.add(registro);
			System.out.println(listapersonas);
			b.fichero(null);

			return "Se realizo el registro con exito";
		}
	}

	public Boolean login(String email, String contra) {
		if (listapersonas.stream().anyMatch(p -> p.getEmail().equals(email) && p.getContra().equals(contra))) {
			return true;
		} else {
			return false;
		}
	}

	public Boolean yaEstaRegistrado(String email) {
		if (listapersonas.stream().anyMatch(p -> p.getEmail().equals(email))) {
			return true;
		} else {
			return false;
		}
	}
	
}
