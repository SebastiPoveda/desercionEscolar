package modelo;

import java.io.FileWriter;
import java.io.PrintWriter;
import java.util.ArrayList;

public class Biblioteca {
	

	
	
    public void fichero(ArrayList<Libro> l) {
        FileWriter Fichero = null;
        PrintWriter pw = null;
        try {
            Fichero = new FileWriter("C:\\Users\\golden\\Desktop\\Biblioteca\\productos.txt");
            pw = new PrintWriter(Fichero);
            for(int i = 0; i < l.size();i++) {
            	pw.println(l.get(i));
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
}
