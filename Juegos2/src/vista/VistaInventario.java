package vista;

import model.ModelInventario;
import utilidades.EsperaDeLectura;
import datos.Datos;

public class VistaInventario {

	public static void mostrarInventario(Datos d) throws InterruptedException {
		for(int i = 0; i < d.getListaDeHerramientas().length; i++) {
			if(d.getListaDeHerramientas()[i].getGuardado()) {
				System.out.println(d.getListaDeHerramientas()[i]);
			}
		}
	}

}
