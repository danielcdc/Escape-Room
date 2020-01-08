package controller;

import datos.Datos;
import model.ModelJuegoPizarra;
import model.ModelMapa;
import vista.VistaMapas;
import vista.VistaMenu;
import vista.VistaPruebas;

public class ControllerHistoria {

	public void comprobarPEasterEgg(char[][] mapa, int fase) {
		if (mapa[6][6] == 'P' && fase == 1) {
			mapa[6][6] = '?';
		}
		if (mapa[3][5] == 'P' && fase == 1) {
			mapa[3][5] = '?';
		}
		if (mapa[5][4] == 'P' && fase == 1) {
			mapa[5][4] = '?';
		}
	}

	public void ejecutarEasterEgg(String mov, char[][] mapa, int fase) {

		comprobarPEasterEgg(mapa, fase);

		if (mov.equalsIgnoreCase("I")) {// Si no coincide la letra, no hace nada.
			if (mapa[6][6] == '?' && fase == 1) {
				System.out.println("Ejecuta este evento nº 1.");
			}
			if (mapa[3][5] == 'P' && fase == 1) {
				System.out.println("Ejecuta este evento nº 2.");
			}
			if (mapa[5][4] == 'P' && fase == 1) {
				System.out.println("Ejecuta este evento nº 3.");
			}
		}
	}
	
	public void comprobarPruebas(char[][] mapa, int fase) {
		if (mapa[2][17] == 'P' && fase == 1) {
			mapa[2][17] = '!';
		}
		
	}
	
	public void ejecutarPrueba (String mov, char[][] mapa, int fase, Datos d,
								ControllerMapa cMapa, VistaMenu vMenu, VistaMapas vm, ModelMapa m1, ControllerJuegoPizarra cJP, String intro) throws InterruptedException {
		ModelJuegoPizarra mPizarra= new ModelJuegoPizarra(d);
		VistaPruebas vp = new VistaPruebas();
		
		comprobarPEasterEgg(mapa, fase);

		if (mov.equalsIgnoreCase("I")) {// Si no coincide la letra, no hace nada.
			if (mapa[2][17] == '!' && fase == 1) {
				vp.imprimirIntroPrueba1();
				mPizarra.iniciarJuegoPizarra(m1, vm, vMenu, mov, cMapa, cJP, intro);
			}
		}
	}
	
	

}
