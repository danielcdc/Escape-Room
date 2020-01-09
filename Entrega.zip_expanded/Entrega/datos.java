package Entrega;

public class datos {

	private String nombre[]= {"peon","torre","alfil","caballo","reina","rey"};
	private char iniciales[]= {'P','T','A','C','Y','R'};
	private char inicialesEnemigas[]= {'p','t','a','c','y','r'};
	private char posicionX[]= {'A','B','C','D','E','F','G','H'};
	private char posicionY[]= {'1','2','3','4','5','6','7','8'};
	int pul;
	char piezaEnX,piezaEnY,movimientoEnX,movimientoEnY;
	
	public int getPul() {
		return pul;
	}
	public void setPul(int pul) {
		this.pul = pul;
	}
	public char getPiezaEnX() {
		return piezaEnX;
	}
	public void setPiezaEnX(char piezaEnX) {
		this.piezaEnX = piezaEnX;
	}
	public char getPiezaEnY() {
		return piezaEnY;
	}
	public void setPiezaEnY(char piezaEnY) {
		this.piezaEnY = piezaEnY;
	}
	public char getMovimientoEnX() {
		return movimientoEnX;
	}
	public void setMovimientoEnX(char movimientoEnX) {
		this.movimientoEnX = movimientoEnX;
	}
	public char getMovimientoEnY() {
		return movimientoEnY;
	}
	public void setMovimientoEnY(char movimientoEnY) {
		this.movimientoEnY = movimientoEnY;
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
}
