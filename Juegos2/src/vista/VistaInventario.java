package vista;

import utilidades.*;
import datos.Datos;

public class VistaInventario {

	public static void mostrarInventario(Datos d) throws InterruptedException {//Muestra en el inventario los objetos guardados
		System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		for(int i = 0; i < d.getListaDeHerramientas().length; i++) {
			if(d.getListaDeHerramientas()[i].getGuardado()) {
				System.out.println(d.getListaDeHerramientas()[i]);
				System.out.println("╠════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
			}
		}
		System.out.println("║Pulsa Enter para salir del menú.");
		System.out.println("╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════");
		Leer.dato();//espera hasta que el jugador pulse enter
	}

}
