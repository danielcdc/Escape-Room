package tresenraya;

import java.util.Arrays;

public class Util {
		
	private char listaValores3Raya[];
	private ModelJugador3Raya listaJugadores[];
	
	public Util(char[] listaValores) {
		super();
		this.listaValores = listaValores;
	}
	public Util() {
		super();
	}
	
	public char[] getListaValores() {
		return listaValores;
	}
	
	public void setListaValores(char[] listaValores) {
		this.listaValores = listaValores;
	}
	
	
	@Override
	public String toString() {
		return "Util [listaValores=" + Arrays.toString(listaValores) + "]";
	}
	
}
