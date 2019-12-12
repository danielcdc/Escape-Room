package escape_from_salesianos;

import controller.Controller3Raya;
import datos.Datos;
import model.Model3Raya;
import utilidades.Leer;
import vista.VistaMapas;

public class Ppal {
	/* d.listaValores3Raya, d.listaJugadores3Raya */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Datos d = new Datos();
		Model3Raya tresRaya = new Model3Raya(d);
		Controller3Raya c3Raya = new Controller3Raya();
		VistaMapas vistaMapas = new VistaMapas();
		int turno = 0, cero = 0, uno = 1;

		System.out.println(tresRaya);

		tresRaya.getD().setComprobacion(true);
		System.out.println(tresRaya.getD().isComprobacion());

		System.out.println("Eligiendo aleatoriamente el primer turno");

		if (c3Raya.generarTurnoInicial()) { // LLama al metodo para comprobar quien empieza
			while (tresRaya.getD().getListaJugadores3Raya()[cero].getVictoria() == false
					&& tresRaya.getD().getListaJugadores3Raya()[uno].getVictoria() == false) {//
				vistaMapas.imprimirmapa3Raya(tresRaya);

				tresRaya.getD().setComprobacion(false);

				if (turno % 2 == cero) {// Si comenzamos nosotros tendremos los turnos pares
					if (turno < uno) {
						System.out.println("Comenzarás tú");// La primera vez sale un mensaje diferente
					} else {// Este else se ejecutará cada vez que no sea la primera vez que se ejecuta
						System.out.println("Tu turno");// Se indica al usuario que empieza el
					}

					while (!tresRaya.getD().isComprobacion()) {// Hace que se repita si intentas superponer valores
						System.out.println("Introduce una posicion del 1 al 9");// Se introduce donde debe ir la ficha
						tresRaya.getD().setPosTablero3Raya(Leer.datoInt() - 1);
						if (c3Raya.comprobarRepetir(tresRaya, tresRaya.getD().getPosTablero3Raya(), cero)) {// Se
																											// comprueba
																											// si ese
																											// sitio ya
																											// tiene una
																											// ficha
							c3Raya.cambiarPosicion(tresRaya, tresRaya.getD().getPosTablero3Raya(),
									tresRaya.getD().getListaJugadores3Raya()[cero].getfichas());// Se cambia la posicion
																								// en
																								// el array inicial
							c3Raya.comprobarGanador3Raya(tresRaya, cero); // Comprueba si hemos ganado
							turno++;
							tresRaya.getD().setComprobacion(true);// Si cumple las condiciones se pasa a true para que
																	// no se vuelva a repetir
						} else {
							System.out.println("No hagas trampas debemos ganar limpiamente");// Mensaje si no se cumple
						}
					}
				} else {

					System.out.println("Le toca a tu contrincante");
					System.out.println("El enemigo está eligiendo posición...");

					while (!tresRaya.getD().isComprobacion()) {// Hace que se repita si intentas superponer valores
						tresRaya.getD().setPosTablero3Raya(c3Raya.generarTurnoRival() - 1);
						if (c3Raya.comprobarRepetir(tresRaya, tresRaya.getD().getPosTablero3Raya(), uno)) {// Se
																											// comprueba
																											// si ese
																											// sitio ya
																											// tiene una
																											// ficha
							c3Raya.cambiarPosicion(tresRaya, tresRaya.getD().getPosTablero3Raya(),
									tresRaya.getD().getListaJugadores3Raya()[uno].getfichas());// Se cambia la posicion
																								// en
																								// el array inicial
							c3Raya.comprobarGanador3Raya(tresRaya, uno); // Comprueba si hemos ganado
							turno++;
							tresRaya.getD().setComprobacion(true);// Si cumple las condiciones se pasa a true para que
																	// no se vuelva a repetir
						} else {
							System.out.println("Has impedido que el enemigo haga trampas");// Mensaje si no se cumple
						}

					}

				}
			} // while
		} else {

			while (tresRaya.getD().getListaJugadores3Raya()[cero].getVictoria() == false
					&& tresRaya.getD().getListaJugadores3Raya()[uno].getVictoria() == false) {//
				vistaMapas.imprimirmapa3Raya(tresRaya);

				tresRaya.getD().setComprobacion(false);

				if (turno % 2 == cero) {// Si comenzamos nosotros tendremos los turnos pares
					if (turno < uno) {
						System.out.println("Comenzará el enemigo");// La primera vez sale un mensaje diferente
					} else {// Este else se ejecutará cada vez que no sea la primera vez que se ejecuta
						System.out.println("Turno del enemigo");// Se indica al usuario que empieza el
					}

					System.out.println("Le toca a tu contrincante");
					System.out.println("El enemigo está eligiendo posición...");

					while (!tresRaya.getD().isComprobacion()) {// Hace que se repita si intentas superponer valores
						tresRaya.getD().setPosTablero3Raya(c3Raya.generarTurnoRival());
						if (c3Raya.comprobarRepetir(tresRaya, tresRaya.getD().getPosTablero3Raya(), uno)) {// Se
																											// comprueba
																											// si ese
																											// sitio ya
																											// tiene una
																											// ficha
							c3Raya.cambiarPosicion(tresRaya, tresRaya.getD().getPosTablero3Raya(),
									tresRaya.getD().getListaJugadores3Raya()[uno].getfichas());// Se cambia la posicion
																								// en
																								// el array inicial
							c3Raya.comprobarGanador3Raya(tresRaya, uno); // Comprueba si hemos ganado
							turno++;
							tresRaya.getD().setComprobacion(true);// Si cumple las condiciones se pasa a true para que
																	// no se vuelva a repetir
						} else {
							System.out.println("Has impedido que el enemigo haga trampas");// Mensaje si no se cumple
						}

					}

				} else {

					while (!tresRaya.getD().isComprobacion()) {// Hace que se repita si intentas superponer valores
						System.out.println("Introduce una posicion del 1 al 9");// Se introduce donde debe ir la ficha
						tresRaya.getD().setPosTablero3Raya(Leer.datoInt() - 1);
						if (c3Raya.comprobarRepetir(tresRaya, tresRaya.getD().getPosTablero3Raya(), cero)) {// Se
																											// comprueba
																											// si ese
																											// sitio ya
																											// tiene una
																											// ficha
							c3Raya.cambiarPosicion(tresRaya, tresRaya.getD().getPosTablero3Raya(),
									tresRaya.getD().getListaJugadores3Raya()[cero].getfichas());// Se cambia la posicion
																								// en
																								// el array inicial
							c3Raya.comprobarGanador3Raya(tresRaya, cero); // Comprueba si hemos ganado
							turno++;
							tresRaya.getD().setComprobacion(true);// Si cumple las condiciones se pasa a true para que
																	// no se vuelva a repetir
						} else {
							System.out.println("No hagas trampas debemos ganar limpiamente");// Mensaje si no se cumple
						}
					}

				}

			}

		}

		vistaMapas.imprimirmapa3Raya(tresRaya);
		if (c3Raya.felicitar(tresRaya)) {
			System.out.println("Felicidades has ganado");
		} else {
			System.out.println("El mal no puede ganar...");
		}

	}

}
