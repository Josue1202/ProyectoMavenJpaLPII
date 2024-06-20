package Interfaces;

import java.util.List;

import Modelo.TblUsuario;

public interface IUsuario {
	
	//declaramos los metodos
	
		public void RegistrarUsuario(TblUsuario usuario);
		public void ActualizarUsuario(TblUsuario usuario);
		public void EliminarUsuario (TblUsuario usuario);
		public TblUsuario BuscarUsuario(TblUsuario usuario);
		public List<TblUsuario> ListarUsuario();

} //FIN DE LA INTERFACE
