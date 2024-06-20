package Test;

import java.util.List;

import Dao.EntidadClienteImp;
import Modelo.TblCliente;

public class TestEntidadCliente {

	public static void main(String[] args) {
		//INSTANCIAMOS LA ENTIDAD(CLASE) tblcliente
		TblCliente cliente=new TblCliente();
		EntidadClienteImp crud=new EntidadClienteImp();
		
		//-----------------------------------------------------
		
		/*
		//*******TESTEAMOS EL AGREGAR
		//ASIGNAMOS DATOS
		cliente.setNombre("Jooooo");
		cliente.setApellido("Villagaray Rivasoooooooooo");
		cliente.setDni("47383634");
		cliente.setEmail("josuegery@gmail.com");
		cliente.setTelf("941442898");
		cliente.setSexo("M");
		cliente.setNacionalidad("Español");
		
		//INVOCAMOS EL METODO REGISTRAR
		crud.RegistrarCliente(cliente);
		*/
		
		//-------------------------------------------------------
		
		/*
		//********TESTEAMOS EL ACTUALIZAR
		cliente.setIdcliente(1);
		cliente.setNombre("Roberto alexander");
		cliente.setApellido("Rivera Gomez");
		cliente.setDni("98765432");
		cliente.setEmail("roberalex@gmail.com");
		cliente.setTelf("654987321");
		cliente.setSexo("M");
		cliente.setNacionalidad("Pomponi");
		
		//INVOCAMOS EL METODO ACTUALIZAR
		crud.ActualizarCliente(cliente);
		*/
		
		//--------------------------------------------------------
		
		/*
		//********TESTEAMOS EL ELIMINAR
		cliente.setIdcliente(5);
		
		//INVOCAMOS EL METODO ELIMINAR DATOS
		crud.EliminarCliente(cliente);
		*/
		
		//--------------------------------------------------------
		
		/*
		//********TESTEAMOS EL METODO BUSCAR
		cliente.setIdcliente(4);
		
		//INVAMOS EL METODO BUSCAR
		TblCliente bus=crud.BuscarCliente(cliente);
		
		//IMPRIMIMOS POR PANTALLA EL REGISTRO BUSCADO
		System.out.println("Codigo "+bus.getIdcliente()+"\n"+
				" Nombre "+bus.getNombre()+"\n"+
				" Apellido : "+bus.getApellido()+"\n"+
				" Dni : "+bus.getDni()+"\n"+
				" Email : "+bus.getEmail()+"\n"+
				" Telf : "+bus.getTelf()+"\n"+
				" Sexo : "+bus.getSexo()+"\n"+
				" Nacionalidad : "+bus.getNacionalidad());
		*/
		
		//-------------------------------------------------------
		//********TESTEAMOS EL METODO LISTAR CLIENTES REGISTRADO EN LA BASE DE DATOS
		List<TblCliente> listado=crud.ListarCliente();		
		for(TblCliente lis:listado){
			//IMPRIMIMOS EN LA PANTALLA CONSOLA LOS DATOS RECUPERADOS
			System.out.println("Codigo "+lis.getIdcliente()+"\n"+
				" Nombre "+lis.getNombre()+"\n"+
				" Apellido : "+lis.getApellido()+"\n"+
				" Dni : "+lis.getDni()+"\n"+
				" Email : "+lis.getEmail()+"\n"+
				" Telf : "+lis.getTelf()+"\n"+
				" Sexo : "+lis.getSexo()+"\n"+
				" Nacionalidad : "+lis.getNacionalidad()+"\n"+"\n");
		}//FIN DEL METODO FOR....
		
		//-------------------------------------------------------
		
	} // FIN DEL METODO PRINCIPAL MAIN ...

} // FIN DE LA CLASE TESTENTIDADCLIENTE...
