package ajedrez;

import java.util.Arrays;

public class Piezas {
			
	private String nombre[]= {"peon","torre","alfil","caballo","reina","rey"};
	private char iniciales[]= {'P','T','A','C','Y','R'};
	private char inicialesEnemigas[]= {'p','t','a','c','y','r'};
	private char posicionX[]= {'A','B','C','D','E','F','G','H'};
	private char posicionY[]= {'1','2','3','4','5','6','7','8'};
	
	
	
	
	public Piezas(String[] nombre, char[] iniciales, char[] inicialesEnemigas, char[] posicionX, char[] posicionY) {
		super();
		this.nombre = nombre;
		this.iniciales = iniciales;
		this.inicialesEnemigas = inicialesEnemigas;
		this.posicionX = posicionX;
		this.posicionY = posicionY;
	}
	public Piezas() {
		super();
	}
	public String[] getNombre() {
		return nombre;
	}
	public void setNombre(String[] nombre) {
		this.nombre = nombre;
	}
	public char[] getIniciales() {
		return iniciales;
	}
	public void setIniciales(char[] iniciales) {
		this.iniciales = iniciales;
	}
	
	
	public char[] getInicialesEnemigas() {
		return inicialesEnemigas;
	}
	public void setInicialesEnemigas(char[] inicialesEnemigas) {
		this.inicialesEnemigas = inicialesEnemigas;
	}
	
	
	public char[] getPosicionX() {
		return posicionX;
	}
	public void setPosicionX(char[] posicionX) {
		this.posicionX = posicionX;
	}
	public char[] getPosicionY() {
		return posicionY;
	}
	public void setPosicionY(char[] posicionY) {
		this.posicionY = posicionY;
	}
	@Override
	public String toString() {
		return "Piezas [nombre=" + Arrays.toString(nombre) + ", iniciales=" + Arrays.toString(iniciales)
				+ ", inicialesEnemigas=" + Arrays.toString(inicialesEnemigas) + "]";
	}
	
	public char devolverInicial(int posicion) {
		return iniciales[posicion];
	}
	public char devolverInicialEnemiga(int posicion) {
		return inicialesEnemigas[posicion];
	}
	public char devolverPosicionX(int posicion) {
		return posicionX[posicion];
	}
	public char devolverPosicionY(int posicion) {
		return posicionY[posicion];
	}
	
}
