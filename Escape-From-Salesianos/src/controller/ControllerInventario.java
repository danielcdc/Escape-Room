package controller;

import datos.Datos;
import utilidades.Leer;
import vista.VistaInventario;

public class ControllerInventario {
	
	public void comprobarInventario(String mov, Datos d) throws InterruptedException  {
		VistaInventario vI = new VistaInventario();
		
		if(mov.equalsIgnoreCase("m")) {
			do {
			vI.mostrarInventario(d);
			mov = Leer.dato();
			}while(!mov.equalsIgnoreCase(""));
		}
	}

}
