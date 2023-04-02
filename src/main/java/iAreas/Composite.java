package iAreas;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

import modelo.Utils;

public class Composite extends Component {

	public Composite(String area, String carrera, ArrayList<String> pensum) {
		super(area, carrera, pensum);
		// TODO Auto-generated constructor stub
	}

	public Composite() {
		super("", "", null);
	}

	public ArrayList<Component> hijos = new ArrayList<Component>();

	@Override
	public void execute(String nombre) {
		FileWriter Fichero = null;
		PrintWriter pw = null;
		try {
			Fichero = new FileWriter(Utils.urlAreas + nombre + ".txt",false);
			pw = new PrintWriter(Fichero);
			for (int i = 0; i < hijos.size(); i++) {
				pw.println(hijos.get(i));
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				if (null != Fichero) {
					Fichero.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

	public void mostrarCarreras() {
		hijos.stream().forEach(System.out::println);
	}

}
