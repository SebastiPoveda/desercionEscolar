package controlador;

import java.io.IOException;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import modelo.Seleccion;


/**
 * Servlet implementation class Servlet
 */
@WebServlet("/api/Servlet")
public class Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	Seleccion s = new Seleccion();

	/**
	 * Default constructor.
	 */
	public Servlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String area = request.getParameter("area");
		String carrera = request.getParameter("carrera");
		String rta = s.sugerencias(area, carrera);
		response.getWriter().append(rta);
	}
	/*
	String nombre = request.getParameter("nombre");
	String email = request.getParameter("email");
	String contra = request.getParameter("contra");
	String rta = c.nuevoRegistro(nombre, email, contra);
	response.getWriter().append(""+ rta);*/
}
