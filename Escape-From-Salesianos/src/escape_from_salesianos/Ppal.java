package escape_from_salesianos;

import controller.Controller3Raya;
import controller.ControllerHistoria;
import controller.ControllerJuegoPizarra;
import controller.ControllerMapa;
import datos.Datos;
import model.Model3Raya;
import model.ModelJugador;
import model.ModelMapa;
import utilidades.Leer;
import vista.VistaMapas;
import vista.VistaMenu;

public class Ppal {
	/* d.listaValores3Raya, d.listaJugadores3Raya */
											//Aqui se le añade también
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		Datos d = new Datos();
		boolean ganad = false;
		VistaMenu vM = new VistaMenu();
		VistaMapas vMapa = new VistaMapas();
		ModelMapa mapaHistoria = new ModelMapa(d);
		ControllerMapa cMapa = new ControllerMapa();
		ControllerJuegoPizarra cJP = new ControllerJuegoPizarra();
		
		int opt = 0;
		String mov= "";
		String opt1 = "";
		String intro= "";
		ControllerHistoria cHistory = new ControllerHistoria();
		/*VA CON ESTO LA OPT1 COMO PRUEBA PARA LEER SOLO DANDO INTRO
		 * opt1 = Leer.dato();
		if(opt1.equalsIgnoreCase("")) {
			System.out.println("Funciona");
		} else {
			System.out.println("chupala");
		}*/
		
		do {
			
			/*vM.cargarBarra();
			vM.imprimirPortada();
			*/
			vM.imprimirMenu();
			opt = Leer.datoInt();
			switch(opt) {
			
			case 1:
				
				do {
					vMapa.imprimirMapa(mapaHistoria.getD().getMapaClase());
					vM.imprimirMenuMapa(mapaHistoria);
					mov = Leer.dato();
					cMapa.moverJugador( mov, mapaHistoria.getD().getMapaClase(), mapaHistoria);
					cHistory.ejecutarEasterEgg(mov, mapaHistoria.getD().getMapaClase(), mapaHistoria.getD().getFase());
					cHistory.comprobarPruebas(mapaHistoria.getD().getMapaClase(), mapaHistoria.getD().getFase());
					cHistory.ejecutarPrueba(mov,mapaHistoria.getD().getMapaClase(), mapaHistoria.getD().getFase(), d, cMapa, vM, vMapa, mapaHistoria, cJP, intro);
					
					
				}while(!d.getJugador1().isVictoria());
				
				break;
			
			case 2:
				System.out.println("Proximamente..\n\n");
				break;
			
			case 3:
				System.out.println("Proximamente..\n\n");
				break;
			
			case 0:
				System.out.println("¡Hasta luego!");
				break;
			
			
			
			
			}
			
			
			
				
				
			    
			

		} while (!ganad);

	}

}
