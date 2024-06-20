package Interfaces;

import java.util.List;

import Modelo.TblProducto;

public interface IProducto {
	
	//declaramos los metodos
	
		public void RegistrarProducto(TblProducto producto);
		public void Actualizarproducto(TblProducto producto);
		public void Eliminarproducto(TblProducto producto);
		public TblProducto BuscarUsuario(TblProducto producto);
		public List<TblProducto> Listarproducto();

} //FIN DE LA INTERFACE
