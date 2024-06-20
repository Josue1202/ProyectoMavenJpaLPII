package Test;


import java.util.List;

import Dao.EntidadTipoProductoImp;
import Modelo.TblTipoproducto;

public class TestEnntidadTipoProducto {

	public static void main(String[] args) {
		//INSTANCIAMOS LA ENTIDAD(CLASE) tblcliente
				TblTipoproducto tipoproducto=new TblTipoproducto();
				EntidadTipoProductoImp crud=new EntidadTipoProductoImp();
				
				//-----------------------------------------------------
				
				/*
				//*******TESTEAMOS EL AGREGAR
				//ASIGNAMOS DATOS
				tipoproducto.setDescripcion("Teclado");
								
				//INVOCAMOS EL METODO REGISTRAR
				crud.RegistrarTipoproducto(tipoproducto);;
				*/
				
				//-------------------------------------------------------
				
				/*
				//********TESTEAMOS EL ACTUALIZAR
				tipoproducto.setIdtipoproducto(2);;
				tipoproducto.setDescripcion("Audifonos");
				
				//INVOCAMOS EL METODO ACTUALIZAR
				crud.ActualizarTipoproducto(tipoproducto);
				*/
				
				//--------------------------------------------------------
				
				/*
				//********TESTEAMOS EL ELIMINAR
				tipoproducto.setIdtipoproducto(2);
				
				//INVOCAMOS EL METODO ELIMINAR DATOS
				crud.EliminarTipoproducto(tipoproducto);;
				*/
				
				//--------------------------------------------------------
				
				/*
				//********TESTEAMOS EL METODO BUSCAR
				tipoproducto.setIdtipoproducto(2);;
				
				//INVAMOS EL METODO BUSCAR
				TblTipoproducto bus=crud.BuscarTipoproducto(tipoproducto);
				
				//IMPRIMIMOS POR PANTALLA EL REGISTRO BUSCADO
				System.out.println("Codigo : "+bus.getIdtipoproducto()+"\n"+
						" Nombre "+bus.getDescripcion()+"\n"+"\n");
				*/		
				
				
				//-------------------------------------------------------
				
				/*
				//********TESTEAMOS EL METODO LISTAR CLIENTES REGISTRADO EN LA BASE DE DATOS
				List<TblTipoproducto> listado=crud.Listartipoproducto();		
				for(TblTipoproducto lis:listado){
					//IMPRIMIMOS EN LA PANTALLA CONSOLA LOS DATOS RECUPERADOS
					System.out.println("Codigo : "+lis.getIdtipoproducto()+"\n"+
						" Nombre : "+lis.getDescripcion()+"\n"+"\n");
				}//FIN DEL METODO FOR....
				*/
				//-------------------------------------------------------
				
			} // FIN DEL METODO PRINCIPAL MAIN ...
}
