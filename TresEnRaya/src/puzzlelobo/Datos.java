package puzzlelobo;

import java.util.Arrays;

public class Datos {
	 	
	private String orillaDerecha[];
	private String orillaIzq[];
	public Datos(String[] orillaDerecha, String[] orillaIzq) {
		super();
		this.orillaDerecha = orillaDerecha;
		this.orillaIzq = orillaIzq;
	}
	public Datos() {
		super();
	}
	public String[] getOrillaDerecha() {
		return orillaDerecha;
	}
	public void setOrillaDerecha(String[] orillaDerecha) {
		this.orillaDerecha = orillaDerecha;
	}
	public String[] getOrillaIzq() {
		return orillaIzq;
	}
	public void setOrillaIzq(String[] orillaIzq) {
		this.orillaIzq = orillaIzq;
	}
	@Override
	public String toString() {
		return "Datos [orillaDerecha=" + Arrays.toString(orillaDerecha) + ", orillaIzq=" + Arrays.toString(orillaIzq)
				+ "]";
	}
	
	
	public String devolverPosicionDerecha(int posicion) {
		return orillaDerecha[posicion];
	}
	public String devolverPosicionIzq(int posicion) {
		return orillaIzq[posicion];
	}
	
}
