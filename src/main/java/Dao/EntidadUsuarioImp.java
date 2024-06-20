package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import Interfaces.IUsuario;
import Modelo.TblUsuario;

public class EntidadUsuarioImp implements IUsuario {

	//--------------------------------------------------------------------------------------------
	@Override
	public void RegistrarUsuario(TblUsuario usuario) {
		//ESTABLECER LA CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
		
		//GESTIONAR LAS ENTIDADES
		EntityManager emanager=em.createEntityManager();
		
		//INICIAMOS LA TRANSACCION
		emanager.getTransaction().begin();
		
		//REGISTRAMOS A LA BASE DE DATOS
		emanager.persist(usuario);
		
		//EMITIMOS MENSAJE POR PANTALLA
		System.out.println("Usuario registrado en la base de datos");
		
		//CONFIRMAMOS LA TRANSACCION
		emanager.getTransaction().commit();
		
		//CERRAMOS
		emanager.close();

		} //FIN DEL METODO REGISTRAR USUARIO


//--------------------------------------------------------------------------------------------
	@Override
	public void ActualizarUsuario(TblUsuario usuario) {
		//ESTABLECEMOS CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
		
		//GESTIONAR LAS ENTIDADES
		EntityManager emanager=em.createEntityManager();
		
		//INICIAMOS LA TRANSACCION
		emanager.getTransaction().begin();
		
		//ACTUALIZAR
		emanager.merge(usuario);
		
		//EMITIMOS MENSAJE POR CONSOLA
		System.out.println("Usuario Actualizado en la BD");
		
		//CONFIRMAMOS
		emanager.getTransaction().commit();
		
		//CERRAMOS LA CONEXION
		emanager.close();

		} //FIN DEL METODO ACTUALIZAR USUARIO


//--------------------------------------------------------------------------------------------

	@Override
	public void EliminarUsuario(TblUsuario usuario) {
		//ESTABLECEMOS LA CONEXION CON LA UNIDAD DE PERSISTENCIA
				EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
				
				//GESTIONAMOS LAS ENTIDADES
				EntityManager emanager=em.createEntityManager();
				
				//INICIAMOS LA TRANSACCION
				emanager.getTransaction().begin();
				
				//RECUPERAMOS EL CODIGO A ELIMINAR		
				TblUsuario elim=emanager.merge(usuario);
				
				//PROCEDEMOS A ELIMINAR EL REGISTRO
				emanager.remove(elim);
				
				//EMITIMOS MENSAJE POR CONSOLA
				System.out.println("Usuario Eliminado de la base de datos");
				
				//CONFIRMAMOS
				emanager.getTransaction().commit();
				
				//CERRAMOS LA CONEXION
				emanager.close();

				} //FIN DEL METODO ELIMINAR USUARIO


		//--------------------------------------------------------------------------------------------

	@Override
	public TblUsuario BuscarUsuario(TblUsuario usuario) {
		//ESTABLECEMOS LA CONEXION CON LA UNIDAD DE PERSISTENCIA
				EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
				
				//GESTIONAR LAS ENTIDADES
				EntityManager emanager=em.createEntityManager();
				
				//INICIAMOS LA TRANSACCION
				emanager.getTransaction().begin();
				
				//RECUPERAMOS EL CODIGO A BUSCAR
				TblUsuario bususuario=emanager.find(TblUsuario.class,usuario.getIdusuario());
				
				//EMITIMOS MENSAJE POR CONSOLA
				System.out.println("El Usuario Buscado es :" + bususuario);
				
				//CONFIRMAMOS
				emanager.getTransaction().commit();
				
				//CERRAMOS LA CONEXION
				emanager.close();
				
				//RETORNAMOS EL REGISTRO BUSCADO
				return bususuario;
				
		} //FIN DEL METODO BUSCAR USUARIO


		//--------------------------------------------------------------------------------------------

	@Override
	public List<TblUsuario> ListarUsuario() {
		//ESTABLECEMOS LA CONEXION CON LA UNIDAD DE PERSISTENCIA
		EntityManagerFactory em=Persistence.createEntityManagerFactory("ProyectoLPIIVILLAGARAY2024");
		
		//GESTIONAR LAS ENTIDADES
		EntityManager emanager=em.createEntityManager();
		
		//INICIAMOS LA TRANSACCION
		emanager.getTransaction().begin();
		
		//RECUPERAMOS LOS USUARIOS REGISTRADOS EN LA BASE DE DATOS
		//**************Utilizando JPQL*****************************
		//EL METODO createQuery DE entityManager SIRVE PARA LA CREACION
		//DE CONSULTAS DINAMICAS
		List<TblUsuario> listadousuarios=emanager.createQuery("select u from TblUsuario u", TblUsuario.class).getResultList();
		
		//CONFIRMAMOS LA TRANSACCION
		emanager.getTransaction().commit();
		
		//CERRAMOS LA CONEXION
		emanager.close();
		
		//RETORNAMOS LA LISTA DE CLIENTES RECUPERAMOS DE LA BASE DE DATOS
		return listadousuarios;
		
		} //FIN DEL METODO LISTAR USUARIO
//--------------------------------------------------------------------------------------------

}
