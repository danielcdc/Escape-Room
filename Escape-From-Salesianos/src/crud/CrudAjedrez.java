package crud;

import datos.Datos;
import utilidades.Leer;

public class CrudAjedrez {
	
	public void guardarX(Datos d1) {
		d1.setPiezaEnX(Leer.datoChar());
	}
	
	public void guardarY(Datos d1) {
		d1.setPiezaEnY(Leer.datoChar());
	}
	public void guardarMovY(Datos d1) {
		d1.setMovimientoEnY(Leer.datoChar());
	}
	public void guardarMovX(Datos d1) {
		d1.setMovimientoEnX(Leer.datoChar());
	}
}
