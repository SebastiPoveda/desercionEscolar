package modelo;

import java.util.ArrayList;

public class Libro {
	String nombre;
	String autor;
	String editorial;
	

	
	public Libro() {
	}
	
	public Libro(String nombre, String autor, String editorial) {
		super();
		this.nombre = nombre;
		this.autor = autor;
		this.editorial = editorial;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getAutor() {
		return autor;
	}
	public void setAutor(String autor) {
		this.autor = autor;
	}
	public String getEditorial() {
		return editorial;
	}
	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}
	@Override
	public String toString() {
		return "Libro [nombre=" + nombre + ", autor=" + autor + ", editorial=" + editorial + "]";
	}
}
