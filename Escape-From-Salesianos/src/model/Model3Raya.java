package model;

import datos.Datos;

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

}
