package controller;

import datos.Datos;
import utilidades.*;
import model.ModelJuegoPizarra;
import model.ModelMapa;
import vista.VistaInventario;
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
		//ale
		if (mapa[12][16] == 'P' && fase == 1) {//Ordenador cooper
			mapa[12][16] = '?';
		}
		if (mapa[13][18] == 'P' && fase == 1) {//soplete
			mapa[13][18] = '?';
		}
		if (mapa[14][18] == 'P' && fase == 1) {//soplete
			mapa[14][18] = '?';
		}
		if (mapa[13][1] == 'P' && fase != 99) {//puerta hacia fuera cerrada
			mapa[13][1] = '?';
		}
		if (mapa[14][1] == 'P' && fase != 99) {//puerta hacia fuera cerrada
			mapa[14][1] = '?';
		}
		if (mapa[13][1] == 'P' && fase == 99) {//puerta hacia fuera abierta
			mapa[13][1] = '?';
		}
		if (mapa[14][1] == 'P' && fase == 99) {//puerta hacia fuera abierta
			mapa[14][1] = '?';
		}
		if (mapa[16][3] == 'P' && fase == 1) {//puerta hacia fuera 2º
			mapa[16][3] = '?';
		}
		if (mapa[16][2] == 'P' && fase == 1) {//puerta hacia fuera 2º
			mapa[16][2] = '?';
		}
		
		//f ale
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
			//ale
			if (mapa[12][16] == '?' && fase == 1) {
				System.out.println("Se ve un proyecto en Eclipse llamado Consultoría de materiales, seguro que sacan un 10");
			}
			if ((mapa[13][18] == '?' || mapa[14][18] == '?') && fase == 1) {//revisar fase
				System.out.println("consegir soplete");
			}
			if ((mapa[13][1] == '?' || mapa[14][1] == '?') && fase != 99) {//revisar fase
				System.out.println("La puerta no se puede abrir. A ver cuando la arreglan(눈_눈)");
			}
			if ((mapa[13][1] == '?' || mapa[14][1] == '?') && fase == 99) {//revisar fase
				System.out.println("Sales");
			}
			if ((mapa[16][2] == '?' || mapa[16][3] == '?') && fase == 1) {//revisar fase
				System.out.println("La puerta está cerrada, espero que VOP aún no haya cargado el mapa (╥﹏╥), quizas se cargue el año que viene si apruebo");
			}
			
			
			//f ale
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
				d.getMapaClase()[d.getVertic()][d.getHoriz()] = 'P';
				vp.imprimirIntroPrueba1();
				mPizarra.iniciarJuegoPizarra(m1, vm, vMenu, mov, cMapa, cJP, intro);
				vp.imprimirFinPrueba1();
				fase++;
			}
		}
		//ale
		if (mov.equalsIgnoreCase("M")) {
			VistaInventario.mostrarInventario(d);
			System.out.println("Pulsa Enter para salir del menú.");
			EsperaAlJugador.esperaAlJugador();
		}
		//f ale
	}
	
	
	
	

}
