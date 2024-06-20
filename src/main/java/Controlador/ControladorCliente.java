package Controlador;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EntidadClienteImp;
import Modelo.TblCliente;

/**
 * Servlet implementation class ControladorCliente
 */
public class ControladorCliente extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ControladorCliente() {
        super();
        // TODO Auto-generated constructor stub
    } //FIN DEL CONSTRUCTOR----------------------------------------------

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		request.getRequestDispatcher("/RegistrarCliente.jsp").forward(request, response);
	} //FIN DEL METODO DOGET-----------------------------------------------

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		
		String nombre=request.getParameter("nombre");
		String apellido=request.getParameter("apellido");
		String dni=request.getParameter("dni");
		String email=request.getParameter("email");
		String telf=request.getParameter("telefono");
		String sexo=request.getParameter("sexo");
		String nacionalidad=request.getParameter("nacionalidad");
	
		
		TblCliente cliente = new TblCliente();
		EntidadClienteImp crud = new EntidadClienteImp();
		
		cliente.setNombre(nombre);
		cliente.setApellido(apellido);
		cliente.setDni(dni);
		cliente.setEmail(email);
		cliente.setTelf(telf);
		cliente.setSexo(sexo);
		cliente.setNacionalidad(nacionalidad);
						
		crud.RegistrarCliente(cliente);
		
		List<TblCliente> listarclientes=crud.ListarCliente();
		request.setAttribute("listado", listarclientes);
		
		//redireccionaremos hacia el listado de clientes ...
		request.getRequestDispatcher("/RegistrarCliente.jsp").forward(request, response);
	} //FIN DEL METODO DOPOST-----------------------------------------------

}
