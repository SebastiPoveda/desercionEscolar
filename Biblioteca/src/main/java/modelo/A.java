package modelo;

import java.util.ArrayList;

public class A {
	ArrayList<Libro> listaLibros = new ArrayList<>();
	Libro l = new Libro();
	Biblioteca b = new Biblioteca();
	
	public void agregarLibro(String nombre, String autor, String editorial){
		Libro libro = new Libro(nombre,autor, editorial);
		listaLibros.add(libro);
		System.out.println(listaLibros);
		b.fichero(listaLibros);
	}
	
}
