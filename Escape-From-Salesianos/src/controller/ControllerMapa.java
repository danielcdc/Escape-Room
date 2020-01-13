package controller;

import datos.Datos;
import model.ModelMapa;
import utilidades.Leer;

public class ControllerMapa {

	// Obtiene la posición del jugador en el mapa del juego.
	public void encontrarP(char[][] mapa, ModelMapa m1) {
		for (int i = 0; i < mapa.length; i++) {
			for (int j = 0; j < mapa[i].length; j++) {
				if (mapa[i][j] == 'P' || mapa[i][j] == '?' || mapa[i][j] == '!') {
					m1.getD().setVertic(i);
					m1.getD().setHoriz(j);
				}
			}
		}
	}

	// Desplaza al jugador a través del mapa, devolviendo este con la posición en la
	// que se mueve el jugador.
	public char[][] moverJugador(String mov, char[][] mapa, ModelMapa m1) {
		String izq = "a", derech = "d", delant = "w", atras = "s";
		char mes = '█', paredVert = '║', paredHoriz = '═', puert = '/', pizz = '▓';

		// Ubica al jugador en el mapa.
		encontrarP(mapa, m1);

		/*
		 * Los siguientes métodos desplazan al jugador en la dirección indicada,
		 * evitando que atraviesen cualquier elemento que no debieran atravesar, tales
		 * como paredes, mesas y puertas.
		 */

		if (mapa[m1.getD().getVertic()][m1.getD().getHoriz()] == 'P') {// En el caso de que el estado del jugador sea el
																		// normal.

			// Desplaza al jugador una casilla a la izquierda.
			if (mov.equalsIgnoreCase(izq)) {
				if (mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != paredVert
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != paredHoriz
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != mes
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != puert) {
					mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setHoriz(m1.getD().getHoriz() - 1);

				}
			}

			// Desplaza al jugador una casilla a la derecha.
			if (mov.equalsIgnoreCase(derech)) {
				if (mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != paredVert
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != paredHoriz
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != mes
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != puert) {
					mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setHoriz(m1.getD().getHoriz() + 1);
				}
			}

			// Desplaza al jugador una casilla hacia arriba.
			if (mov.equalsIgnoreCase(delant)) {
				if (mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] != paredVert
						&& mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] != paredHoriz
						&& mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] != mes
						&& mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] != puert
						&& mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] != pizz) {
					mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setVertic(m1.getD().getVertic() + 1);
				}
			}

			// Desplaza al jugador una casilla hacia abajo.
			if (mov.equalsIgnoreCase(atras)) {
				if (mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] != paredVert
						&& mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] != paredHoriz
						&& mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] != mes
						&& mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] != puert) {
					mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setVertic(m1.getD().getVertic() - 1);
				}
			}

		}

		if (mapa[m1.getD().getVertic()][m1.getD().getHoriz()] == '?'
				|| mapa[m1.getD().getVertic()][m1.getD().getHoriz()] == '!') {// En el caso de que el jugador esté en
																				// una posición en la que peude
																				// interactuar con algún elementro del
																				// mapa.
			// Desplaza al jugador una casilla a la izquierda.
			if (mov.equalsIgnoreCase(izq)) {
				if (mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != paredVert
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != paredHoriz
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != mes
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != puert) {
					mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setHoriz(m1.getD().getHoriz() - 1);

				}
			}

			// Desplaza al jugador una casilla a la derecha.
			if (mov.equalsIgnoreCase(derech)) {
				if (mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != paredVert
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != paredHoriz
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != mes
						&& mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != puert) {
					mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setHoriz(m1.getD().getHoriz() + 1);
				}
			}

			// Desplaza al jugador una casilla hacia arriba.
			if (mov.equalsIgnoreCase(delant)) {
				if (mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] != paredVert
						&& mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] != paredHoriz
						&& mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] != mes
						&& mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] != puert
						&& mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] != pizz) {
					mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setVertic(m1.getD().getVertic() + 1);
				}
			}

			// Desplaza al jugador una casilla hacia abajo.
			if (mov.equalsIgnoreCase(atras)) {
				if (mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] != paredVert
						&& mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] != paredHoriz
						&& mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] != mes
						&& mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] != puert) {
					mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setVertic(m1.getD().getVertic() - 1);
				}
			}

		}

		return mapa;

	}

}
