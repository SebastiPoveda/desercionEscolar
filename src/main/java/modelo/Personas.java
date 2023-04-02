package modelo;

public class Personas {
	String nombre;
	String email;
	String contra;
	
	public Personas() {
	}
	
	public Personas(String nombre, String email, String contra) {
		super();
		this.nombre = nombre;
		this.email = email;
		this.contra = contra;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public String getContra() {
		return contra;
	}
	public void setContra(String contra) {
		this.contra = contra;
	}
	
	@Override
	public String toString() {
		return "Personas [nombre=" + nombre + ", email=" + email + ", contra=" + contra + "]";
	}
	
}
