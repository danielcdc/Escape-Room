package crud;

import datos.Datos;
import utilidades.Leer;

public class CrudAjedrez {
	
	public void guardarX(Datos d1) {
		d1.setPiezaEnX(Leer.dato());
	}
	
	public void guardarY(Datos d1) {
		d1.setPiezaEnY(Leer.dato());
	}
	public void guardarMovY(Datos d1) {
		d1.setMovimientoEnY(Leer.dato());
	}
	public void guardarMovX(Datos d1) {
		d1.setMovimientoEnX(Leer.dato());
	}
}
