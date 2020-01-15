package model;

import controller.Controller3Raya;
import datos.Datos;
import utilidades.Leer;
import vista.VistaMapas;
import vista.VistaPruebas;

public class Model3Raya {

	private Datos d;

	public Model3Raya(Datos d) {
	
		this.d = d;
	}

	public Datos getD() {
		return d;
	}

	public void setD(Datos d) {
		this.d = d;
	}

	/*
	 * public Model3Raya() { super(); }
	 * 
	 * public char[] getListaValores3Raya() { return listaValores3Raya; }
	 * 
	 * public void setListaValores3Raya(char[] listaValores) {
	 * this.listaValores3Raya = listaValores; }
	 * 
	 * public ModelJugador3Raya[] getListaJugadores() { return listaJugadores; }
	 * 
	 * public void setListaJugadores(ModelJugador3Raya[] listaJugadores) {
	 * this.listaJugadores = listaJugadores; }
	 */

	public char devolverUnaposicion(int posicion) { // Devuelve una posicion especifica
		return d.getListaValores3Raya()[posicion];
	}

	@Override
	public String toString() {
		return "Model3Raya [d=" + d + "]";
	}
	
	public void iniciarJuego3Raya() {
		Datos d1 = new Datos ();
		//IMPORTANTE CAMBIAR
		d.setListaValores3Raya(d1.getListaValores3Raya());
		d.setListaJugadores3Raya(d1.getListaJugadores3Raya());
		
		Controller3Raya c3Raya = new Controller3Raya();
		if (c3Raya.generarTurnoInicial()) { // LLama al metodo para comprobar quien empieza
			comienzoJugador();
		} else {
			comienzoEnemigo();
		}
	}
	
	public void comienzoJugador() {
		Model3Raya tresRaya = new Model3Raya(d);
		Controller3Raya c3Raya = new Controller3Raya();
		VistaPruebas vp=new VistaPruebas();
		VistaMapas vistaMapas = new VistaMapas();
		int turno = 0, cero = 0, uno = 1;
		while (!tresRaya.getD().getListaJugadores3Raya()[cero].getVictoria() 
				&& !tresRaya.getD().getListaJugadores3Raya()[uno].getVictoria() 
				&& !c3Raya.rellenoTablero(d)) {//
			vistaMapas.imprimirmapa3Raya(tresRaya);

			tresRaya.getD().setComprobacion(false);

			if (turno % 2 == cero) {// Si comenzamos nosotros tendremos los turnos pares
				
					vp.imprimirMensajeTurno(d);// La primera vez sale un mensaje diferente al resto de las veces
				
				while (!tresRaya.getD().isComprobacion()) {// Hace que se repita si intentas superponer valores
					vp.imprimirInstruccionesUsuario();// Se introduce donde debe ir la ficha
					tresRaya.getD().setPosTablero3Raya(Leer.datoInt() - 1);
					if(  !c3Raya.rellenoTablero(d)) {
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
						c3Raya.comprobarGanador3Raya( cero,d); // Comprueba si hemos ganado
						turno++;
						tresRaya.getD().setComprobacion(true);// Si cumple las condiciones se pasa a true para que
																// no se vuelva a repetir
					} else {
						vp.imprimirTrampas();// Mensaje si no se cumple
					}
					
					}else {
						d.getListaJugadores3Raya()[cero].setVictoria(true);
						tresRaya.getD().setComprobacion(true);
					}
				}
			} else {
				
				vp.imprimirMensajeTurnoEnemigo();

				while (!tresRaya.getD().isComprobacion() ) {// Hace que se repita si intentas superponer valores
					tresRaya.getD().setPosTablero3Raya(c3Raya.generarTurnoRival() - 1);
					if(!c3Raya.rellenoTablero(d)) {
					if (c3Raya.comprobarRepetir(tresRaya, tresRaya.getD().getPosTablero3Raya(), uno) ) {// Se
																										// comprueba
																										// si ese
																										// sitio ya
																										// tiene una
																										// ficha
						c3Raya.cambiarPosicion(tresRaya, tresRaya.getD().getPosTablero3Raya(),
								tresRaya.getD().getListaJugadores3Raya()[uno].getfichas());// Se cambia la posicion
																							// en
																							// el array inicial
						c3Raya.comprobarGanador3Raya( uno,d); // Comprueba si hemos ganado
						turno++;
						tresRaya.getD().setComprobacion(true);// Si cumple las condiciones se pasa a true para que
																// no se vuelva a repetir
					} else {
						vp.imprimirTrampasEnemigas();// Mensaje si no se cumple
					}
					
					}else {
						d.getListaJugadores3Raya()[d.getUno()].setVictoria(true);
						tresRaya.getD().setComprobacion(true);
					}

				}

			}
		} // while
		c3Raya.felicitar(d, c3Raya.rellenoTablero(d));
	}
	public void comienzoEnemigo(){
		Model3Raya tresRaya = new Model3Raya(d);
		Controller3Raya c3Raya = new Controller3Raya();
		VistaPruebas vp=new VistaPruebas();
		VistaMapas vistaMapas = new VistaMapas();
		int turno = 0, cero = 0, uno = 1;
		while (!tresRaya.getD().getListaJugadores3Raya()[cero].getVictoria() 
				&& !tresRaya.getD().getListaJugadores3Raya()[uno].getVictoria() 
				&& !c3Raya.rellenoTablero(d)) {//
			vistaMapas.imprimirmapa3Raya(tresRaya);

			tresRaya.getD().setComprobacion(false);

			if (turno % 2 == cero) {// Si comenzamos nosotros tendremos los turnos pares
				
					vp.imprimirMensajeComienzoEnemigo(d);// La primera vez sale un mensaje diferente
				

				vp.imprimirMensajeTurnoEnemigo();

				while (!tresRaya.getD().isComprobacion() ) {// Hace que se repita si intentas superponer valores
					tresRaya.getD().setPosTablero3Raya(c3Raya.generarTurnoRival()-1);
					if(!c3Raya.rellenoTablero(d)) {
					if (c3Raya.comprobarRepetir(tresRaya, tresRaya.getD().getPosTablero3Raya(), uno)  ) {// Se
																										// comprueba
																										// si ese
																										// sitio ya
																										// tiene una
																										// ficha
						c3Raya.cambiarPosicion(tresRaya, tresRaya.getD().getPosTablero3Raya(),
								tresRaya.getD().getListaJugadores3Raya()[uno].getfichas());// Se cambia la posicion
																							// en
																							// el array inicial
						c3Raya.comprobarGanador3Raya( uno, d);// Comprueba si hemos ganado
						turno++;
						tresRaya.getD().setComprobacion(true);// Si cumple las condiciones se pasa a true para que
																// no se vuelva a repetir
					} else {
						vp.imprimirTrampasEnemigas();// Mensaje si no se cumple
					}
					
					}else {
						d.getListaJugadores3Raya()[d.getUno()].setVictoria(true);
						tresRaya.getD().setComprobacion(true);
					}

				}

			} else {

				while (!tresRaya.getD().isComprobacion() ) {// Hace que se repita si intentas superponer valores
					vp.imprimirInstruccionesUsuario();// Se introduce donde debe ir la ficha
					tresRaya.getD().setPosTablero3Raya(Leer.datoInt() - 1);
					if(!c3Raya.rellenoTablero(d)) {
					if (c3Raya.comprobarRepetir(tresRaya, tresRaya.getD().getPosTablero3Raya(), cero) ) {// Se
																										// comprueba
																										// si ese
																										// sitio ya
																										// tiene una
																										// ficha
						c3Raya.cambiarPosicion(tresRaya, tresRaya.getD().getPosTablero3Raya(),
								tresRaya.getD().getListaJugadores3Raya()[cero].getfichas());// Se cambia la posicion
																							// en
																							// el array inicial
						c3Raya.comprobarGanador3Raya( cero, d); // Comprueba si hemos ganado
						turno++;
						tresRaya.getD().setComprobacion(true);// Si cumple las condiciones se pasa a true para que
																// no se vuelva a repetir
					} else {
						vp.imprimirTrampas();// Mensaje si no se cumple
					}
					}else {
						d.getListaJugadores3Raya()[d.getUno()].setVictoria(true);
						tresRaya.getD().setComprobacion(true);
					}

				}

			}

		}
		vistaMapas.imprimirmapa3Raya(tresRaya);
		c3Raya.felicitar(d, c3Raya.rellenoTablero(d));
	}
}
