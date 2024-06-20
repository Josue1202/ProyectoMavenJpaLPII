package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.ICliente;
import Modelo.TblCliente;

public class EntidadClienteImp implements ICliente{

	//--------------------------------------------------------------------------------------------
	@Override
	public void RegistrarCliente(TblCliente cliente) {
		//ESTABLECER LA CONEXION CON LA UNIDAD DE PERSISTENCIA
				EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
				
				//GESTIONAR LAS ENTIDADES
				EntityManager emanager=em.createEntityManager();
				
				//INICIAMOS LA TRANSACCION
				emanager.getTransaction().begin();
				
				//REGISTRAMOS A LA BASE DE DATOS
				emanager.persist(cliente);
				
				//EMITIMOS MENSAJE POR PANTALLA
				System.out.println("Cliente registrado en la base de datos");
				
				//CONFIRMAMOS LA TRANSACCION
				emanager.getTransaction().commit();
				
				//CERRAMOS
				emanager.close();
		
	}

	//--------------------------------------------------------------------------------------------
	@Override
	public void ActualizarCliente(TblCliente cliente) {
		//ESTABLECEMOS CONEXION CON LA UNIDAD DE PERSISTENCIA
				EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
				
				//GESTIONAR LAS ENTIDADES
				EntityManager emanager=em.createEntityManager();
				
				//INICIAMOS LA TRANSACCION
				emanager.getTransaction().begin();
				
				//ACTUALIZAR
				emanager.merge(cliente);
				
				//EMITIMOS MENSAJE POR CONSOLA
				System.out.println("Cliente Actualizado en la BD");
				
				//CONFIRMAMOS
				emanager.getTransaction().commit();
				
				//CERRAMOS LA CONEXION
				emanager.close();
				
			} //FIN DE METODO ACTUALIZAR CLIENTE
			
			
	//--------------------------------------------------------------------------------------------
	@Override
	public void EliminarCliente(TblCliente cliente) {
		//ESTABLECEMOS LA CONEXION CON LA UNIDAD DE PERSISTENCIA
				EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
				
				//GESTIONAMOS LAS ENTIDADES
				EntityManager emanager=em.createEntityManager();
				
				//INICIAMOS LA TRANSACCION
				emanager.getTransaction().begin();
				
				//RECUPERAMOS EL CODIGO A ELIMINAR		
				TblCliente elim=emanager.merge(cliente);
				
				//PROCEDEMOS A ELIMINAR EL REGISTRO
				emanager.remove(elim);
				
				//EMITIMOS MENSAJE POR CONSOLA
				System.out.println("Cliente Eliminado de la base de datos");
				
				//CONFIRMAMOS
				emanager.getTransaction().commit();
				
				//CERRAMOS LA CONEXION
				emanager.close();		
				
			} //FIN DE METODO ELIMINAR CLIENTE
			

	//--------------------------------------------------------------------------------------------
	@Override
	public TblCliente BuscarCliente(TblCliente cliente) {
		//ESTABLECEMOS LA CONEXION CON LA UNIDAD DE PERSISTENCIA
				EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
				
				//GESTIONAR LAS ENTIDADES
				EntityManager emanager=em.createEntityManager();
				
				//INICIAMOS LA TRANSACCION
				emanager.getTransaction().begin();
				
				//RECUPERAMOS EL CODIGO A BUSCAR
				TblCliente buscliente=emanager.find(TblCliente.class,cliente.getIdcliente());
				
				//EMITIMOS MENSAJE POR CONSOLA
				System.out.println("El Cliente Buscado es :" + buscliente);
				
				//CONFIRMAMOS
				emanager.getTransaction().commit();
				
				//CERRAMOS LA CONEXION
				emanager.close();
				
				//RETORNAMOS EL REGISTRO BUSCADO
				return buscliente;
				
			} //FIN DE METODO BUSCAR CLIENTE
			
			
			
	//--------------------------------------------------------------------------------------------
	@Override
	public List<TblCliente> ListarCliente() {
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
				List<TblCliente> listadoclientes=emanager.createQuery("select c from TblCliente c", TblCliente.class).getResultList();
				
				//CONFIRMAMOS LA TRANSACCION
				emanager.getTransaction().commit();
				
				//CERRAMOS LA CONEXION
				emanager.close();
				
				//RETORNAMOS LA LISTA DE CLIENTES RECUPERAMOS DE LA BASE DE DATOS
				return listadoclientes;
				
			} //FIN DE METODO LISTAR CLIENTE
			
			//--------------------------------------------------------------------------------------------
	
}
