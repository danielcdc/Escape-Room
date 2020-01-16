package controller;

import datos.Datos;

public class ControllerAjedrez {
	
	// Devuelve las letras que representan las piezas del jugador.
	public char devolverInicial(int posicion, Datos d) {
		return d.getIniciales()[posicion];
	}
	// Devuelve las letras que representan las piezas de la IA enemiga.
	public char devolverInicialEnemiga(int posicion, Datos d) {
		return d.getInicialesEnemigas()[posicion];
	}
	// Devuelve la posición en las coordenadas del eje X del tablero.
	public char devolverPosicionX(int posicion, Datos d) {
		return d.getPosicionX()[posicion];
	}
	// Devuelve la posición en las coordenadas del eje Y del tablero.
	public char devolverPosicionY(int posicion, Datos d) {
		return d.getPosicionY()[posicion];
	}

}
