package datos;

import model.ModelJugador3Raya;

public class Datos {
	
	private char listaValores3Raya[]= {'1','2','3','4','5','6','7','8','9'};
	
	private ModelJugador3Raya [] listaJugadores3Raya = {new ModelJugador3Raya('O', false),
			new ModelJugador3Raya('X', false)};
	
	private int posTablero3Raya= 0;
	
	private int cero = 0, uno = 1;
	
	private boolean comprobacion = false;

	public char[] getListaValores3Raya() {
		return listaValores3Raya;
	}
	
	//Getters and setters

	public void setListaValores3Raya(char[] listaValores3Raya) {
		this.listaValores3Raya = listaValores3Raya;
	}
	
	public void setPosicionListaValores3Raya(char ficha, int i) {
		this.listaValores3Raya[i] = ficha;
	}

	public ModelJugador3Raya[] getListaJugadores3Raya() {
		return listaJugadores3Raya;
	}

	public void setListaJugadores3Raya(ModelJugador3Raya[] listaJugadores3Raya) {
		this.listaJugadores3Raya = listaJugadores3Raya;
	}

	public int getPosTablero3Raya() {
		return posTablero3Raya;
	}

	public void setPosTablero3Raya(int posTablero3Raya) {
		this.posTablero3Raya = posTablero3Raya;
	}

	public int getCero() {
		return cero;
	}

	public void setCero(int cero) {
		this.cero = cero;
	}

	public int getUno() {
		return uno;
	}

	public void setUno(int uno) {
		this.uno = uno;
	}

	public boolean isComprobacion() {
		return comprobacion;
	}

	public void setComprobacion(boolean comprobacion) {
		this.comprobacion = comprobacion;
	}
	
	

}
