package controller;

import crud.CrudAjedrez;
import crud.CrudGranjero;
import datos.Datos;
import model.Model3Raya;
import model.ModelAjedrez;
import model.ModelAnimales;
import model.ModelJuegoPizarra;
import model.ModelMapa;
import vista.VistaMapas;
import vista.VistaMenu;
import vista.VistaPruebas;

public class ControllerHistoria {
	
	// Comprueba si el jugador está en la fase y lugar correspondientes para activar un Huevo de Pascua.
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
	
	// Ejecuta un Huevo de Pascua.
	public void ejecutarEasterEgg(String mov, char[][] mapa, int fase) {

		comprobarPEasterEgg(mapa, fase);

		if (mov.equalsIgnoreCase("I")) {// Si no coincide la letra, no hace nada.
			if (mapa[6][6] == '?' && fase == 1) {
				System.out.println("Ejecuta este evento nº 1.");
			}
			if (mapa[3][5] == '?' && fase == 1) {
				System.out.println("Ejecuta este evento nº 2.");
			}
			if (mapa[5][4] == '?' && fase == 1) {
				System.out.println("Ejecuta este evento nº 3.");
			}
		}
	}
	
	// Comprueba e indica al usuario la posibilidad de activar un minijuego/prueba.
	public void comprobarPruebas(char[][] mapa, int fase) {
		if ((mapa[2][17] == 'P' && fase == 1)) {
			mapa[2][17] = '!';
		}
		
		if((mapa[4][4] == 'P' && fase == 2 )) {
			mapa[4][4] = '!';
		}
		if(mapa[16][2] == 'P' && fase ==3) {
			mapa[16][2]='!';
		}
		if(mapa[4][2]=='P' && fase ==4) {
			mapa[4][2]='!';
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
		CrudGranjero crudG=new CrudGranjero(d);
		ModelAnimales mAnimal = new ModelAnimales(d);
		Model3Raya m3Raya = new Model3Raya(d);
		
		if (mov.equalsIgnoreCase("I")) {// Si no coincide la letra, no hace nada.
			if (mapa[2][17] == '!' && fase == d.getUno()) {
				d.getMapaClase()[d.getVertic()][d.getHoriz()] = 'P';
				vp.imprimirIntroPrueba1();
				mPizarra.iniciarJuegoPizarra(m1, vm, vMenu, mov, cMapa, cJP, intro);
				vp.imprimirFinPrueba1();
				d.setFase(d.getFase()+d.getUno());
			}
			if (mapa [4][4] == '!' && fase == d.getDos() ) {
				mAnimal.empezarJuegoGranjero(crudG, cr1);
				if(d.isVictoriaAnimales()) {
					d.getMapaClase()[d.getVertic()][d.getHoriz()] = 'P';
					d.setFase(d.getFase()+d.getUno());
				}
				
			}
			if (mapa[16][2]=='!' && fase == d.getTres()) {
				d.getMapaClase()[d.getVertic()][d.getHoriz()] = 'P';
				Aj1.iniciarJuegoAjedrez(vp, c1, cj1);
				d.setFase(d.getFase()+d.getUno());
			}
			
			if (mapa[4][2]=='!' && fase == d.getCuatro()) {
				d.getMapaClase()[d.getVertic()][d.getHoriz()] = 'P';
				m3Raya.iniciarJuego3Raya();
				d.setFase(d.getFase()+d.getUno());
			}
		
		}
		
		
}
	
	
	
	

}
