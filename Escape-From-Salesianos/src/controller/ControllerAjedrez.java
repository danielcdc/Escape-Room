package controller;

import datos.Datos;

public class ControllerAjedrez {
	
	public char devolverInicial(int posicion, Datos d) {
		return d.getIniciales()[posicion];
	}
	
	public char devolverInicialEnemiga(int posicion, Datos d) {
		return d.getIniciales()[posicion];
	}
	
	public char devolverPosicionX(int posicion, Datos d) {
		return d.getPosicionX()[posicion];
	}
	
	public char devolverPosicionY(int posicion, Datos d) {
		return d.getPosicionY()[posicion];
	}

}
