package Test;

import java.util.List;

import Dao.EntidadUsuarioImp;
import Modelo.TblUsuario;


public class TestEntidadUsuario {

	public static void main(String[] args) {
				//INSTANCIAMOS LA ENTIDAD(CLASE) tblcliente
				TblUsuario usuario=new TblUsuario();
				EntidadUsuarioImp crud=new EntidadUsuarioImp();
				
				//-----------------------------------------------------
				
				/*
				//*******TESTEAMOS EL AGREGAR
				//ASIGNAMOS DATOS
				usuario.setUsuario("Cabezon");
				usuario.setPassword("123");
				
				//INVOCAMOS EL METODO REGISTRAR
				crud.RegistrarUsuario(usuario);
				*/
				
				//-------------------------------------------------------
				
				/*
				//********TESTEAMOS EL ACTUALIZAR
				usuario.setIdusuario(1);
				usuario.setUsuario("Roberto alexander");
				usuario.setPassword("123456");
								
				//INVOCAMOS EL METODO ACTUALIZAR
				crud.ActualizarUsuario(usuario);
				*/
				
				//--------------------------------------------------------
				
				/*
				//********TESTEAMOS EL ELIMINAR
				usuario.setIdusuario(5);
				
				//INVOCAMOS EL METODO ELIMINAR DATOS
				crud.EliminarUsuario(usuario);
				*/
				
				//--------------------------------------------------------
				
				/*
				//********TESTEAMOS EL METODO BUSCAR
				usuario.setIdusuario(1);
				
				//INVAMOS EL METODO BUSCAR
				TblUsuario bus=crud.BuscarUsuario(usuario);
				
				//IMPRIMIMOS POR PANTALLA EL REGISTRO BUSCADO
				System.out.println("Codigo "+bus.getIdusuario()+"\n"+
						" Nombre "+bus.getUsuario()+"\n"+
						" Apellido : "+bus.getPassword()+"\n");
				*/
				
				//-------------------------------------------------------
				
				
				//********TESTEAMOS EL METODO LISTAR USUARIOS REGISTRADO EN LA BASE DE DATOS
				List<TblUsuario> listado=crud.ListarUsuario();		
				for(TblUsuario lis:listado){
					//IMPRIMIMOS EN LA PANTALLA CONSOLA LOS DATOS RECUPERADOS
					System.out.println("Codigo "+lis.getIdusuario()+"\n"+
						" Nombre "+lis.getUsuario()+"\n"+
						" Apellido : "+lis.getPassword()+"\n"+"\n");
				}//FIN DEL METODO FOR....
							
				//-------------------------------------------------------
				
			} // FIN DEL METODO PRINCIPAL MAIN ...

} // FIN DE LA CLASE TESTENTIDADCLIENTE...
