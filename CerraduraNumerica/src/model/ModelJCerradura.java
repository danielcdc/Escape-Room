package model;

import datos.Datos;
import controller.ControllerJCerradura;
import crud.CrudJCerradura;
import vista.VistaJCerradura;

public class ModelJCerradura {

	private Datos d;

	private boolean victoria = false;

	public void IniciarJuegoCerradura(Datos d, CrudJCerradura c, VistaJCerradura v, ControllerJCerradura o) {

		v.intruciones(d);
		c.ponerAFalso(d);
		c.rellenarNumerador(d);

		do {
			v.imprimirCerradura(d);
			v.imprimirMenuPrincipal(d);
			o.leerOperador(d, v, c, o);

			o.inimitar0(d);

		} while (d.getRes1() != d.getRes2() && d.getRes1() != d.getRes3() && !d.isDerrota());

		c.comprobarVictoria(d, v);
	}

}
