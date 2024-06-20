package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ITipoProducto;
import Modelo.TblTipoproducto;

public class EntidadTipoProductoImp implements ITipoProducto {

	@Override
	public void RegistrarTipoproducto(TblTipoproducto tipoproducto) {
		//ESTABLECER LA CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
		
		//GESTIONAR LAS ENTIDADES
		EntityManager emanager=em.createEntityManager();
		
		//INICIAMOS LA TRANSACCION
		emanager.getTransaction().begin();
		
		//REGISTRAMOS A LA BASE DE DATOS
		emanager.persist(tipoproducto);
		
		//EMITIMOS MENSAJE POR PANTALLA
		System.out.println("Tipo de Producto registrado en la base de datos");
		
		//CONFIRMAMOS LA TRANSACCION
		emanager.getTransaction().commit();
		
		//CERRAMOS
		emanager.close();

}

//--------------------------------------------------------------------------------------------

	@Override
	public void ActualizarTipoproducto(TblTipoproducto tipoproducto) {
		//ESTABLECEMOS CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
		
		//GESTIONAR LAS ENTIDADES
		EntityManager emanager=em.createEntityManager();
		
		//INICIAMOS LA TRANSACCION
		emanager.getTransaction().begin();
		
		//ACTUALIZAR
		emanager.merge(tipoproducto);
		
		//EMITIMOS MENSAJE POR CONSOLA
		System.out.println("Tipo de Producto Actualizado en la BD");
		
		//CONFIRMAMOS
		emanager.getTransaction().commit();
		
		//CERRAMOS LA CONEXION
		emanager.close();
		
	} //FIN DE METODO ACTUALIZAR CLIENTE
	
	
//--------------------------------------------------------------------------------------------

	@Override
	public void EliminarTipoproducto(TblTipoproducto tipoproducto) {
		//ESTABLECEMOS LA CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
		
		//GESTIONAMOS LAS ENTIDADES
		EntityManager emanager=em.createEntityManager();
		
		//INICIAMOS LA TRANSACCION
		emanager.getTransaction().begin();
		
		//RECUPERAMOS EL CODIGO A ELIMINAR		
		TblTipoproducto elim=emanager.merge(tipoproducto);
		
		//PROCEDEMOS A ELIMINAR EL REGISTRO
		emanager.remove(elim);
		
		//EMITIMOS MENSAJE POR CONSOLA
		System.out.println("Tipo de Producto Eliminado de la base de datos");
		
		//CONFIRMAMOS
		emanager.getTransaction().commit();
		
		//CERRAMOS LA CONEXION
		emanager.close();		
		
	} //FIN DE METODO ELIMINAR CLIENTE
	

//--------------------------------------------------------------------------------------------

	@Override
	public TblTipoproducto BuscarTipoproducto(TblTipoproducto tipoproducto) {
		//ESTABLECEMOS LA CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
		
		//GESTIONAR LAS ENTIDADES
		EntityManager emanager=em.createEntityManager();
		
		//INICIAMOS LA TRANSACCION
		emanager.getTransaction().begin();
		
		//RECUPERAMOS EL CODIGO A BUSCAR
		TblTipoproducto bustipoproducto=emanager.find(TblTipoproducto.class,tipoproducto.getIdtipoproducto());
		
		//EMITIMOS MENSAJE POR CONSOLA
		System.out.println("El Tipo de Prodcuto Buscado es :" + bustipoproducto);
		
		//CONFIRMAMOS
		emanager.getTransaction().commit();
		
		//CERRAMOS LA CONEXION
		emanager.close();
		
		//RETORNAMOS EL REGISTRO BUSCADO
		return bustipoproducto;
		
	} //FIN DE METODO BUSCAR TIPO DE PRODUCTO
	
	
	
//--------------------------------------------------------------------------------------------

	@Override
	public List<TblTipoproducto> Listartipoproducto() {
		//ESTABLECEMOS LA CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
		
		//GESTIONAR LAS ENTIDADES
		EntityManager emanager=em.createEntityManager();
		
		//INICIAMOS LA TRANSACCION
		emanager.getTransaction().begin();
		
		//RECUPERAMOS LOS CLIENTES REGISTRADOS EN LA BASE DE DATOS
		//**************Utilizando JPQL*****************************
		//EL METODO createQuery DE entityManager SIRVE PARA LA CREACION
		//DE CONSULTAS DINAMICAS
		List<TblTipoproducto> listadotipoproductos=emanager.createQuery("select c from TblTipoproducto c", TblTipoproducto.class).getResultList();
		
		//CONFIRMAMOS LA TRANSACCION
		emanager.getTransaction().commit();
		
		//CERRAMOS LA CONEXION
		emanager.close();
		
		//RETORNAMOS LA LISTA DE CLIENTES RECUPERAMOS DE LA BASE DE DATOS
		return listadotipoproductos;
		
	} //FIN DE METODO LISTAR TIPO DE PRODUCTO
	
	//--------------------------------------------------------------------------------------------
	

}
