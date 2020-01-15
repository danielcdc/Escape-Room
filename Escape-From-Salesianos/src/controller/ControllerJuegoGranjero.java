package controller;

import crud.CrudGranjero;
import datos.Datos;

import utilidades.Leer;

public class ControllerJuegoGranjero {
	
	public boolean comprobarDerrotaDer(Datos d) {
		int cero=0,uno=1,dos=2;
		boolean ganar=false;
		if((d.getListaAnimales()[cero].isMostrar()==false && d.getListaAnimales()[uno].isMostrar() && d.getListaAnimales()[dos].isMostrar())
				|| (d.getListaAnimales()[cero].isMostrar() && d.getListaAnimales()[uno].isMostrar() && d.getListaAnimales()[dos].isMostrar() == false)) {
			ganar=false;
		}else {
			ganar=true;
		}
		return ganar;
	}
	public boolean comprobarDerrotaIzq(Datos d) {
		int cero=0,uno=1,dos=2;
		boolean ganar=false;
		if((d.getListaAnimales1()[cero].isMostrar()==false && d.getListaAnimales1()[uno].isMostrar() && d.getListaAnimales1()[dos].isMostrar())	
				|| (d.getListaAnimales1()[cero].isMostrar() && d.getListaAnimales1()[uno].isMostrar() && d.getListaAnimales1()[dos].isMostrar() == false)) {
			ganar=false;
		}else {
			ganar=true;
		}
		return ganar;
	}
	
}
