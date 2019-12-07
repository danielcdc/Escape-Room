package tresenraya;

import java.util.Arrays;

public class Util {
		
	private char listaValores[]= {'1','2','3','4','5','6','7','8','9'};
	
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
	public char devolverUnaposicion(int posicion) { //Devuelve una posicion especifica
		return listaValores[posicion];
	}
	public void cambiarPosicion(int posicion,char inicial) { //Cambia la posicion que digamos en el array para después imprimirlo
		listaValores[posicion-1]=inicial;
	}
}
