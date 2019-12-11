package model;

import java.util.Arrays;

public class Model3Raya {

	private char listaValores3Raya[];
	private ModelJugador3Raya listaJugadores[];

	public Model3Raya(char[] listaValores) {
		super();
		this.listaValores3Raya = listaValores;
	}

	public Model3Raya() {
		super();
	}

	public char[] getListaValores3Raya() {
		return listaValores3Raya;
	}

	public void setListaValores3Raya(char[] listaValores) {
		this.listaValores3Raya = listaValores;
	}

	public ModelJugador3Raya[] getListaJugadores() {
		return listaJugadores;
	}

	public void setListaJugadores(ModelJugador3Raya[] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}

	@Override
	public String toString() {
		return "Model3Raya [listaValores3Raya=" + Arrays.toString(listaValores3Raya) + ", listaJugadores="
				+ Arrays.toString(listaJugadores) + "]";
	}

}
