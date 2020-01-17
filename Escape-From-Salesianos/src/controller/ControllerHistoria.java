package controller;

import crud.*;
import datos.Datos;
import model.*;
import vista.*;

public class ControllerHistoria {
	
	// Comprueba si el jugador está en la fase y lugar correspondientes para activar un Huevo de Pascua.
	public void comprobarPEasterEgg(char[][] mapa, int fase) {
		
		int seis = 6, cinco = 5, tres = 3, cuatro = 4;
		
		if (mapa[seis][seis] == 'P' && fase == 1) {
			mapa[seis][seis] = '?';
		}
		if (mapa[tres][cinco] == 'P' && fase == 1) {
			mapa[tres][cinco] = '?';
		}
		if (mapa[cinco][cuatro] == 'P' && fase == 1) {
			mapa[cinco][cuatro] = '?';
		}
	}
	
	// Ejecuta un Huevo de Pascua.
	public void ejecutarEasterEgg(String mov, char[][] mapa, int fase) {
		
		int uno = 1, tres = 3, seis = 6, cinco = 5, cuatro = 4;

		comprobarPEasterEgg(mapa, fase);

		if (mov.equalsIgnoreCase("I")) {// Si no coincide la letra, no hace nada.
			if (mapa[seis][seis] == '?' && fase == uno) {
				System.out.println("Ejecuta este evento nº 1.");
			}
			if (mapa[tres][cinco] == '?' && fase == uno) {
				System.out.println("Ejecuta este evento nº 2.");
			}
			if (mapa[cinco][cuatro] == '?' && fase == uno) {
				System.out.println("Ejecuta este evento nº 3.");
			}
		}
	}
	
	// Comprueba e indica al usuario la posibilidad de activar un minijuego/prueba.
	public void comprobarPruebas(char[][] mapa, int fase) {
		int uno = 1, dos = 2, tres = 3, cuatro = 4, cinco = 5, diecisiete=17, dieciseis = 16, catorce = 14, quince = 15;
		char inter = '!', pers = 'P';
		
		if ((mapa[dos][diecisiete] == pers && fase == uno)) {
			mapa[dos][diecisiete] = inter;
		}
		
		if(mapa[cuatro][cuatro] == pers && fase == dos) {
			mapa[cuatro][cuatro] = inter;
		}
		if(mapa[dieciseis][dos] == pers && fase == tres) {
			mapa[dieciseis][dos]= inter;
		}
		
		if(mapa[cuatro][cuatro]== pers && fase == cuatro) {
			mapa[cuatro][cuatro]= inter;
		}
		if(mapa[catorce][dos]== pers && fase == cinco) {
			mapa[catorce][dos]= inter;
		}
		if(mapa[quince][dos]== pers && fase == cinco) {
			mapa[quince][dos]= inter;
		}	
		
	}
	
	// Inicia el juego principal Escape From Los Salesianos.
	public void ejecutarPrueba (String mov, char[][] mapa, int fase, Datos d,
								ControllerMapa cMapa, VistaMenu vMenu, VistaMapas vm, ModelMapa m1, ControllerJuegoPizarra cJP, String intro) throws InterruptedException {
		ModelJuegoPizarra mPizarra= new ModelJuegoPizarra(d);
		VistaPruebas vp = new VistaPruebas();
		ModelAjedrez Aj1= new ModelAjedrez(d);
		comprobarPEasterEgg(mapa, fase);
		ControllerAjedrez cj1=new ControllerAjedrez();
		CrudAjedrez c1=new CrudAjedrez();
		ControllerJuegoGranjero cr1= new ControllerJuegoGranjero();
		ControllerJuegoBotella cJb = new ControllerJuegoBotella();
		CrudGranjero crudG=new CrudGranjero(d);
		ModelAnimales mAnimal = new ModelAnimales(d);
		Model3Raya m3Raya = new Model3Raya(d);
		ModelJuegoBotella mJb = new ModelJuegoBotella(d);
		CrudJuegoBotella crudB = new CrudJuegoBotella();
		CrudHerramientas cIn = new CrudHerramientas();
		// Introducido por Dani el 16/01/20120
		VistaDialogos vd = new VistaDialogos();
		char inter = '!', pers = 'P';

		if (mov.equalsIgnoreCase("I")) {// Si no coincide la letra, no hace nada.
			if (mapa[d.getDos()][d.getDiecisiete()] == '!' && fase == d.getUno()) {
				d.getMapaClase()[d.getVertic()][d.getHoriz()] = 'P';
				vp.imprimirIntroPrueba1();
				mPizarra.iniciarJuegoPizarra(m1, vm, vMenu, mov, cMapa, cJP, intro);
				vp.imprimirFinPrueba1();
				vd.colarJuegoGranjero(d.getJugador1());// Diálogo 1
				do {
					mAnimal.empezarJuegoGranjero(crudG, cr1, vp);	
				}while(!d.isVictoriaAnimales());
				vd.obtenerSoplete(d.getJugador1());// Diálogo 2
				d.getListaDeHerramientas()[d.getCero()].setGuardado(true);
				d.setFase(d.getFase()+d.getUno());
				
			}
			
			if (mapa[d.getCuatro()][d.getCuatro()]==inter && fase == d.getDos()) {
				d.getMapaClase()[d.getVertic()][d.getHoriz()] = pers;
				vd.comentarioSoplete(d.getJugador1());// Diálogo 3
				m3Raya.iniciarJuego3Raya();
				if(d.getListaJugadores3Raya()[d.getCero()].getVictoria()==true) {
					vd.obtenerCD(d.getJugador1());// Diálogo 4
					d.setFase(d.getFase()+d.getUno());
					cIn.adquirirHerramienta(d, d.getDos());
				}
				
			}
			
			
			if (mapa[d.getDieciseis()][d.getDos()]==inter && fase == d.getTres()) {
				d.getMapaClase()[d.getVertic()][d.getHoriz()] = pers;
				do {
					//vd.comentarioCdRom(d.getJugador1());// Diálogo 5
					Aj1.iniciarJuegoAjedrez(vp, c1, cj1);
				} while(!d.isVictoriaAjedrez());
				vd.victoriaAjedrez(d.getJugador1());// Diálogo 6
				d.setFase(d.getFase()+d.getUno());
				
			}
			
			if (mapa[d.getCuatro()][d.getCuatro()]==inter && fase == d.getCuatro()) {
				d.getMapaClase()[d.getVertic()][d.getHoriz()] = pers;
				vd.comienzoJuegoBotella(d.getJugador1());// Diálogo 7
				mJb.ejecutarJuegoBotella(d, cJb, vp, crudB, mJb);
				d.setFase(d.getFase()+d.getUno());
				vd.obtenerLupa(d.getJugador1());// Diálogo 8
				cIn.adquirirHerramienta(d, d.getUno());
				d.setFase(d.getFase()+d.getUno());
			}
			if ((mapa[d.getCatorce()][d.getDos()]==inter || mapa[d.getQuince()][d.getDos()]== inter) && fase == d.getCinco()) {// Posiciones del mapa que dan a la puerta de salida
				vd.endGame(d.getJugador1());
				d.getJugador1().setVictoria(true);
			}
		
		}
		
		
}
	
	
	
	

}
