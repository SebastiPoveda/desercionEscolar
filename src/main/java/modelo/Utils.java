package modelo;

import java.io.BufferedReader;

import jakarta.servlet.http.HttpServletRequest;

public class Utils {
	public final static String url = "C:\\Users\\Miguel Barón\\OneDrive\\Escritorio\\Cosas varias\\Biblioteca\\";
	public final static String urlAreas = "C:\\Users\\Miguel Barón\\OneDrive\\Escritorio\\Cosas varias\\Biblioteca\\Areas\\";
	public final static String pensumUrl ="C:\\Users\\Miguel Barón\\OneDrive\\Escritorio\\Cosas varias\\Biblioteca\\Pensum\\";
	
	public static String readParams(HttpServletRequest request) {
        StringBuffer jb = new StringBuffer();
        String line = null;
        try {
            request.setCharacterEncoding("UTF-8");
            BufferedReader reader = request.getReader();
            while ((line = reader.readLine()) != null) {
                jb.append(line);
            }
        } catch (Exception e) {
            /* report an error */ }

 

        line = jb.toString();
        return line;
    }
}

