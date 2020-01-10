package controller;

import crud.CrudGranjero;
import datos.Datos;

import utilidades.Leer;

public class ControllerJuegoGranjero {
	
	private Datos d;
	
	public void empezarJuegoGranjero(CrudGranjero crg) {
		boolean victoria=false;
		while(!d.getListaAnimales()[d.getCero()].isMostrar() || d.getListaAnimales()[d.getUno()].isMostrar() || d.getListaAnimales()[d.getDos()].isMostrar()) {
			if(d.getTurno() % d.getCero()==d.getCero()) {
				System.out.println("Estamos en la orilla derecha:");
				for(int i=0;i<d.getTres();i++) {
					if(d.getListaAnimales()[i].isMostrar()){
						System.out.println(d.getListaAnimales()[i].getNombre());
					}
				}//Cierre for
				System.out.println("¿Qué quieres mover a la otra orilla?");
				d.setAnimal(Leer.dato());
				crg.movimientoDerAIzq(d.getAnimal());
				if(!comprobarDerrota()) {
					d.getListaAnimales()[d.getCero()].setMostrar(false);
					d.getListaAnimales()[d.getUno()].setMostrar(false);
					d.getListaAnimales()[d.getDos()].setMostrar(false);
					victoria=false;
				}else {
					victoria=true;
				}
				d.setTurno(d.getTurno()+d.getUno());
			}else {//Cierre turno
				System.out.println("Estamos en la orilla izquierda");
				for(int i=0;i<d.getTres();i++) {
					if(d.getListaAnimales1()[i].isMostrar()){
						System.out.println(d.getListaAnimales1()[i].getNombre());
					}
				}//Cierre for
				System.out.println("¿Qué quieres mover a la otra orilla?");
				d.setAnimal(Leer.dato());
				crg.movimientoIzqADer(d.getAnimal());
				if(!comprobarDerrota()) {
					d.getListaAnimales1()[d.getCero()].setMostrar(false);
					d.getListaAnimales1()[d.getUno()].setMostrar(false);
					d.getListaAnimales1()[d.getDos()].setMostrar(false);
					victoria=false;
				}else {
					victoria=true;
				}
				
			}
			d.setTurno(d.getTurno()+d.getUno());
		}
		if(victoria==true) {
			System.out.println("\n\n\n\nFelicidades has ganado");
			}else {
				System.out.println("\n\n\n\nHas perdido");
			}
	}
	
	public boolean comprobarDerrota() {
		int cero=0,uno=1,dos=2;
		boolean ganar=false;
		if(d.getListaAnimales()[cero].isMostrar()==false && d.getListaAnimales()[uno].isMostrar() && d.getListaAnimales()[dos].isMostrar()) {
			ganar=false;
		}else if(d.getListaAnimales1()[cero].isMostrar()==false && d.getListaAnimales1()[uno].isMostrar() && d.getListaAnimales1()[dos].isMostrar()) {
			ganar=false;
		}else {
			ganar=true;
		}
		return ganar;
	}
}
