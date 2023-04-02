package iAreas;

import java.util.ArrayList;

public abstract class Component {

	public String area;
	public String carrera;
	public ArrayList<String> pensum;

	public Component(String area, String carrera, ArrayList<String> pensum) {
		super();
		this.area = area;
		this.carrera = carrera;
		this.pensum = pensum;
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

	public ArrayList<String> getPensum() {
		return pensum;
	}

	public void setPensum(ArrayList<String> pensum) {
		this.pensum = pensum;
	}
	
	abstract void execute(String nombre);
	
	@Override
	public String toString() {
		return "Component [area=" + area + ", carrera=" + carrera + ", pensum=" + pensum.toString() + "]";
	}


}
