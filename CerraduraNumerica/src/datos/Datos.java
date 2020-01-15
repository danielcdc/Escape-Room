package datos;

public class Datos {
	
	//Datos del juego Cerradura
	private int res1 = 0, res2 = 0, res3 = 0;
	int op = 0;
	private int elec = 0;
	private int cerradura[] = new int[7];
	private int numerador[] = new int[9];
	private boolean comprobadores[] = new boolean[9];

	
	public int getRes1() {
		return res1;
	}
	public void setRes1(int res1) {
		this.res1 = res1;
	}
	public int getRes2() {
		return res2;
	}
	public void setRes2(int res2) {
		this.res2 = res2;
	}
	public int getRes3() {
		return res3;
	}
	public void setRes3(int res3) {
		this.res3 = res3;
	}
	public int getOp() {
		return op;
	}
	public void setOp(int op) {
		this.op = op;
	}
	public int getElec() {
		return elec;
	}
	public void setElec(int elec) {
		this.elec = elec;
	}
	public int[] getCerradura() {
		return cerradura;
	}
	public void setCerradura(int[] cerradura) {
		this.cerradura = cerradura;
	}
	public int[] getNumerador() {
		return numerador;
	}
	public void setNumerador(int[] numerador) {
		this.numerador = numerador;
	}
	public boolean[] getComprobadores() {
		return comprobadores;
	}
	public void setComprobadores(boolean[] comprobadores) {
		this.comprobadores = comprobadores;
	}

}
