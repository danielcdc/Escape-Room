package controller;

import java.util.Random;

import model.Model3Raya;

public class Controller3Raya {

	// Cambia la posicion indicada en el array para después imprimirla.
	public void cambiarPosicion(Model3Raya m1, int posicion, char inicial) {
		m1.getD().setPosicionListaValores3Raya(inicial, posicion);
	}

	// Genera el turno inicial: si el numero aleatorio es mayor que 5
	// empieza usuario, en caso contrario, la IA enemiga. Devuelve un booleano.
	public boolean generarTurnoInicial() {
		boolean turno = false;
		int num, hasta = 10, desde = 0, cinco = 5;
		Random rnd = new Random(System.nanoTime());
		num = rnd.nextInt(hasta - desde + 1) + desde;
		if (num < cinco) {
			turno = true;
		}
		return turno;
	}

	// Genera la posición que la IA enemiga usará y la devuelve.
	public int generarTurnoRival() {
		int num, uno = 1, hasta = 9, desde = 1;
		Random rnd = new Random(System.nanoTime());
		num = rnd.nextInt(hasta - desde + uno) + desde;
		return num;
	}
	
	// Comprueba si el jugador ha ganado la partida.
	public void comprobarGanador3Raya(Model3Raya mdr, int num) {
		int uno = 1, dos = 2, tres = 3, cuatro = 4, cinco = 5, seis = 6, siete = 7, ocho = 8;
		if ((mdr.devolverUnaposicion(num) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
				&& mdr.devolverUnaposicion(uno) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
				&& mdr.devolverUnaposicion(dos) == mdr.getD().getListaJugadores3Raya()[num].getfichas())
				|| (mdr.devolverUnaposicion(tres) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(cuatro) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(cinco) == mdr.getD().getListaJugadores3Raya()[num].getfichas())
				|| (mdr.devolverUnaposicion(seis) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(siete) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(ocho) == mdr.getD().getListaJugadores3Raya()[num].getfichas())
				|| (mdr.devolverUnaposicion(num) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(tres) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(seis) == mdr.getD().getListaJugadores3Raya()[num].getfichas())
				|| (mdr.devolverUnaposicion(uno) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(cuatro) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(siete) == mdr.getD().getListaJugadores3Raya()[num].getfichas())
				|| (mdr.devolverUnaposicion(dos) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(cinco) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(ocho) == mdr.getD().getListaJugadores3Raya()[num].getfichas())
				|| (mdr.devolverUnaposicion(num) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(cuatro) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(ocho) == mdr.getD().getListaJugadores3Raya()[num].getfichas())
				|| (mdr.devolverUnaposicion(seis) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(cuatro) == mdr.getD().getListaJugadores3Raya()[num].getfichas()
						&& mdr.devolverUnaposicion(dos) == mdr.getD().getListaJugadores3Raya()[num].getfichas())) {

			mdr.getD().getListaJugadores3Raya()[num].setVictoria(true);
		}
	}
	
	// Activa la felicitación al jugador al ganar.
	public boolean felicitar(Model3Raya m1) {
		boolean felicitar = false;

		int cero = 0;
		if (m1.getD().getListaJugadores3Raya()[cero].getVictoria() == true) {
			felicitar = true;
		}
		return felicitar;
	}
	
	public boolean comprobarRepetir(Model3Raya m1, int posicion, int numeroJugador) {
		int numeroJugador1 = 0;

		if (numeroJugador == 0) {
			numeroJugador1 = 1;
		}

		if (m1.getD().getListaValores3Raya()[posicion] != m1.getD().getListaJugadores3Raya()[numeroJugador]
				.getfichas()) {
			if (m1.getD().getListaValores3Raya()[posicion] != m1.getD().getListaJugadores3Raya()[numeroJugador1]
					.getfichas()) {
				return true;
			} else {
				return false;
			}
		} else {
			return false;
		}

	}

}
