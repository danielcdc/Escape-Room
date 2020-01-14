package controller;

import java.util.Random;

import datos.Datos;
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
	public void felicitar(Datos d) {
		
		if (d.getListaJugadores3Raya()[d.getCero()].getVictoria()) {
			System.out.println("Felicidades has ganado");
		}else {
			System.out.println("El mal no puede ganar...");
		}
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
	
	public boolean rellenoTablero(Datos d) {
		int cont=0;
		boolean repetir=false;
		for(int i=0;i<d.getListaJugadores3Raya().length;i++) {
			if(d.getListaValores3Raya()[i]=='O' || d.getListaValores3Raya()[i]=='X');
				cont++;
		}
		if(cont==9 && (d.getListaJugadores3Raya()[d.getCero()].getVictoria()==false || d.getListaJugadores3Raya()[d.getUno()].getVictoria()==false)) {
			repetir=true;
		}
		return repetir;
	}

}
