package modelo;

public class Sugerencia {
	String area;
	String carrera;
	
	public Sugerencia(String area, String carrera) {
		super();
		this.area = area;
		this.carrera = carrera;
	}
	
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getCarrera() {
		return carrera;
	}
	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	@Override
	public String toString() {
		return "Sugerencia [area=" + area + ", carrera=" + carrera + "]";
	}
	
}
