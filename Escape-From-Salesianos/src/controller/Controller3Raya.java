package controller;

import java.util.Random;

import model.Model3Raya;
import model.ModelJugador3Raya;
import tresenraya.Util;
import tresenraya.jugador3Raya;

public class Controller3Raya {
	
	public char devolverUnaposicion(,int posicion) { //Devuelve una posicion especifica
		return listaValores3Raya[posicion];
	}
	public void cambiarPosicion(char [] listaValores3Raya, int posicion,char inicial) { //Cambia la posicion que digamos en el array para después imprimirlo
		listaValores3Raya[posicion-1]=inicial;
	}
	
	public boolean generarTurnoInicial() {//Genera un turno inicial si el numero aleatorio es mayor que 5 empieza usuario sino el enemigo
		int num,hasta=10,desde=0,cinco=5;
		Random rnd=new Random(System.nanoTime());
		num=rnd.nextInt(hasta-desde+1)+desde;
		if(num<cinco) {
			turno=true;
		}
		return turno;
	}
	public int generarTurnoRival(){//Genera la posición que el enemigo usará
		int num,uno=1,hasta=9,desde=1;
		Random rnd=new Random(System.nanoTime());
		num=rnd.nextInt(hasta-desde+uno)+desde;
		return num;
	}
	
	public void comprobarGanadorJugador(Model3Raya m1) {
		int cero=0,uno=1,dos=2,tres=3,cuatro=4,cinco=5,seis=6,siete=7,ocho=8;
		if((ut1.devolverUnaposicion(cero)==listaJugadores[cero].getfichas() && ut1.devolverUnaposicion(uno)==listaJugadores[cero].getfichas() && ut1.devolverUnaposicion(dos)==listaJugadores[cero].getfichas())
				|| (ut1.devolverUnaposicion(tres)==listaJugadores[cero].getfichas() && ut1.devolverUnaposicion(cuatro)==listaJugadores[cero].getfichas() && ut1.devolverUnaposicion(cinco)==listaJugadores[cero].getfichas()) 
				|| (ut1.devolverUnaposicion(seis)==listaJugadores[cero].getfichas() &&  ut1.devolverUnaposicion(siete)==listaJugadores[cero].getfichas() && ut1.devolverUnaposicion(ocho)==listaJugadores[cero].getfichas()) 
				|| (ut1.devolverUnaposicion(cero)==listaJugadores[cero].getfichas() &&  ut1.devolverUnaposicion(tres)==listaJugadores[cero].getfichas() && ut1.devolverUnaposicion(seis)==listaJugadores[cero].getfichas())
				|| (ut1.devolverUnaposicion(uno)==listaJugadores[cero].getfichas() &&  ut1.devolverUnaposicion(cuatro)==listaJugadores[cero].getfichas() && ut1.devolverUnaposicion(siete)==listaJugadores[cero].getfichas())
				|| (ut1.devolverUnaposicion(dos)==listaJugadores[cero].getfichas() &&  ut1.devolverUnaposicion(cinco)==listaJugadores[cero].getfichas() && ut1.devolverUnaposicion(ocho)==listaJugadores[cero].getfichas())
				|| (ut1.devolverUnaposicion(cero)==listaJugadores[cero].getfichas() &&  ut1.devolverUnaposicion(cuatro)==listaJugadores[cero].getfichas() && ut1.devolverUnaposicion(ocho)==listaJugadores[cero].getfichas())
				|| (ut1.devolverUnaposicion(seis)==listaJugadores[cero].getfichas() &&  ut1.devolverUnaposicion(cuatro)==listaJugadores[cero].getfichas() && ut1.devolverUnaposicion(dos)==listaJugadores[cero].getfichas())) {
			
			listaJugadores[cero].setVictoria(true);	
	   }	
	}
	public void comprobarGanadorEnemigo(Util ut1,ModelJugador3Raya listaJugadores[]) {
		int cero=0,uno=1,dos=2,tres=3,cuatro=4,cinco=5,seis=6,siete=7,ocho=8;
		if((ut1.devolverUnaposicion(cero)==listaJugadores[uno].getfichas() && ut1.devolverUnaposicion(uno)==listaJugadores[uno].getfichas() && ut1.devolverUnaposicion(dos)==listaJugadores[uno].getfichas())
				|| (ut1.devolverUnaposicion(tres)==listaJugadores[uno].getfichas() && ut1.devolverUnaposicion(cuatro)==listaJugadores[uno].getfichas() && ut1.devolverUnaposicion(cinco)==listaJugadores[uno].getfichas()) 
				|| (ut1.devolverUnaposicion(seis)==listaJugadores[uno].getfichas() &&  ut1.devolverUnaposicion(siete)==listaJugadores[uno].getfichas() && ut1.devolverUnaposicion(ocho)==listaJugadores[uno].getfichas()) 
				|| (ut1.devolverUnaposicion(cero)==listaJugadores[uno].getfichas() &&  ut1.devolverUnaposicion(tres)==listaJugadores[uno].getfichas() && ut1.devolverUnaposicion(seis)==listaJugadores[uno].getfichas())
				|| (ut1.devolverUnaposicion(uno)==listaJugadores[uno].getfichas() &&  ut1.devolverUnaposicion(cuatro)==listaJugadores[uno].getfichas() && ut1.devolverUnaposicion(siete)==listaJugadores[uno].getfichas())
				|| (ut1.devolverUnaposicion(dos)==listaJugadores[uno].getfichas() &&  ut1.devolverUnaposicion(cinco)==listaJugadores[uno].getfichas() && ut1.devolverUnaposicion(ocho)==listaJugadores[uno].getfichas())
				|| (ut1.devolverUnaposicion(cero)==listaJugadores[uno].getfichas() &&  ut1.devolverUnaposicion(cuatro)==listaJugadores[uno].getfichas() && ut1.devolverUnaposicion(ocho)==listaJugadores[uno].getfichas())
				|| (ut1.devolverUnaposicion(seis)==listaJugadores[uno].getfichas() &&  ut1.devolverUnaposicion(cuatro)==listaJugadores[uno].getfichas() && ut1.devolverUnaposicion(dos)==listaJugadores[uno].getfichas())) {
			
			listaJugadores[uno].setVictoria(true);	
	   }	
	}
	public boolean felicitar(jugador3Raya listaJugadores[]) {
		boolean felicitar=false;
		int cero=0;
		if(listaJugadores[cero].getVictoria()==true) {
			felicitar=true;
		}
		return felicitar;
	}
	public boolean comprobarRepetir(Util ut1, ModelJugador3Raya listaJugadores[],int posicion,int numeroJugador) {
		int numeroJugador1=0;
		
		if(numeroJugador == 0) {
			numeroJugador1=1;
		}
		
		
		if(ut1.getListaValores()[posicion-1]!=listaJugadores[numeroJugador].getfichas()) {
			if(ut1.getListaValores()[posicion-1]!=listaJugadores[numeroJugador1].getfichas()) {
			return true;
			} else {
			return false;
			}
		}else {
			return false;
		}
		
	}

}
