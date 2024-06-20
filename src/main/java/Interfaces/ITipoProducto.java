package Interfaces;

import java.util.List;

import Modelo.TblTipoproducto;



public interface ITipoProducto {
	
	public void RegistrarTipoproducto(TblTipoproducto tipoproducto);
	public void ActualizarTipoproducto(TblTipoproducto tipoproducto);
	public void EliminarTipoproducto(TblTipoproducto tipoproducto);
	public TblTipoproducto BuscarTipoproducto(TblTipoproducto tipoproducto);
	public List<TblTipoproducto> Listartipoproducto();

} //FIN DE LA INTERFACE
