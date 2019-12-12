package tresenraya;

import java.util.Arrays;

public class Util {
		
	private char listaValores3Raya[];
	private ModelJugador3Raya listaJugadores[];
	
	public Util(char[] listaValores3Raya) {
		super();
		this.listaValores3Raya = listaValores3Raya;
	}
	public Util() {
		super();
	}
	public char[] getListaValores3Raya() {
		return listaValores3Raya;
	}
	public void setListaValores3Raya(char[] listaValores3Raya) {
		this.listaValores3Raya = listaValores3Raya;
	}
	public ModelJugador3Raya[] getListaJugadores() {
		return listaJugadores;
	}
	public void setListaJugadores(ModelJugador3Raya[] listaJugadores) {
		this.listaJugadores = listaJugadores;
	}
	@Override
	public String toString() {
		return "Util [listaValores3Raya=" + Arrays.toString(listaValores3Raya) + "]";
	}
	
	
	
	
	
	
}
