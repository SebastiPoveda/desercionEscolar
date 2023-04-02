package modelo;

import com.google.gson.GsonBuilder;

public class Json {

	public static GsonBuilder builder = null;

	public static String toJson(Object obj) {
		builder = new GsonBuilder();
		return builder.create().toJson(obj);
	}

}