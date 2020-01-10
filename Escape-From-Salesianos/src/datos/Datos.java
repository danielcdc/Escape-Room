package datos;

import java.util.Arrays;

import model.ModelAnimales;
import model.ModelJugador;
import model.ModelJugador3Raya;


public class Datos {

	private int vertic;

	private int horiz;

	private char listaValores3Raya[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	private ModelJugador3Raya[] listaJugadores3Raya = { new ModelJugador3Raya('O', false),
			new ModelJugador3Raya('X', false) };

	private int posTablero3Raya = 0;

	private int cero = 0, uno = 1, dos=2, fase = 1, tres=3, cuatro=4, cinco=5, seis=6, siete=7, ocho=8, nueve=9;


	private boolean comprobacion = false;

	ModelJugador jugador1 = new ModelJugador("Don Bosco", false);

	char[][] mapaClase = {
			{ '╔', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '▓', '▓', '▓', '▓', '▓', '╗' },
			{ '║', '█', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', '█', '█', '█', '█', '█', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', '█', '█', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', '█', '█', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', '█', '█', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '/', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '/' },
			{ '/', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '/' },
			{ '║', ' ', '█', '█', '█', '█', '█', '█', '█', '█', ' ', ' ', ' ', ' ', ' ', ' ', '█', '█', ' ', '║' },
			{ '║', ' ', ' ', ' ', 'P', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '╚', '═', '/', '/', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '╝' } };

	char[][] mapaClase1 = {
			{ '╔', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '▓', '▓', '▓', '▓', '▓', '╗' },
			{ '║', '█', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'P', '║' },
			{ '║', ' ', '█', '█', '█', '█', '█', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', '█', '█', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', '█', '█', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', '█', '█', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '/', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '/' },
			{ '/', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '/' },
			{ '║', ' ', '█', '█', '█', '█', '█', '█', '█', '█', ' ', ' ', ' ', ' ', ' ', ' ', '█', '█', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '╚', '═', '/', '/', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '╝' } };

	private int[] numeroSecreto = new int[3];
	private int[] numerosIntroduz = new int[3];
	
	//Para juego ajedrez
	private String nombre[]= {"Peon","Torre","Alfil","Caballo","Reina","Rey"};
	private char iniciales[]= {'P','T','A','C','Y','R'};
	private char inicialesEnemigas[]= {'p','t','a','c','y','r'};
	private char posicionX[]= {'A','B','C','D','E','F','G','H'};
	private char posicionY[]= {'1','2','3','4','5','6','7','8'};
	private int pul;
	private char piezaEnX,piezaEnY,movimientoEnX,movimientoEnY;
	
	//Para juego granjero
	String animal;
	String lobo = "lobo", oveja = "oveja", lechuga = "lechuga";
	ModelAnimales listaAnimales[] = { new ModelAnimales(lobo, true), new ModelAnimales(oveja, true),
			new ModelAnimales(lechuga, true) };
	ModelAnimales listaAnimales1[] = { new ModelAnimales(lobo, false), new ModelAnimales(oveja, false),
			new ModelAnimales(lechuga, false) };
	int turno;
	// Getters and setters

	public int getVertic() {
		return vertic;
	}

	public void setVertic(int vertic) {
		this.vertic = vertic;
	}

	public int getHoriz() {
		return horiz;
	}

	public void setHoriz(int horiz) {
		this.horiz = horiz;
	}

	public ModelJugador getJugador1() {
		return jugador1;
	}

	public void setJugador1(ModelJugador jugador1) {
		this.jugador1 = jugador1;
	}

	public char[] getListaValores3Raya() {
		return listaValores3Raya;
	}

	public void setListaValores3Raya(char[] listaValores3Raya) {
		this.listaValores3Raya = listaValores3Raya;
	}

	public char[][] getMapaClase() {
		return mapaClase;
	}

	public void setMapaClase(char[][] mapaClase) {
		this.mapaClase = mapaClase;
	}

	public char[][] getMapaClase1() {
		return mapaClase1;
	}

	public void setMapaClase1(char[][] mapaClase1) {
		this.mapaClase1 = mapaClase1;
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

	public int getFase() {
		return fase;
	}

	public void setFase(int fase) {
		this.fase = fase;
	}

	public int[] getNumeroSecreto() {
		return numeroSecreto;
	}

	public void setNumeroSecreto(int[] numeroSecreto) {
		this.numeroSecreto = numeroSecreto;
	}

	public int[] getNumerosIntroduz() {
		return numerosIntroduz;
	}

	public void setNumerosIntroduz(int[] numerosIntroduz) {
		this.numerosIntroduz = numerosIntroduz;
	}
	
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
	
	public int getDos() {
		return dos;
	}

	public void setDos(int dos) {
		this.dos = dos;
	}

	public int getTres() {
		return tres;
	}

	public void setTres(int tres) {
		this.tres = tres;
	}

	public int getCuatro() {
		return cuatro;
	}

	public void setCuatro(int cuatro) {
		this.cuatro = cuatro;
	}

	public int getCinco() {
		return cinco;
	}

	public void setCinco(int cinco) {
		this.cinco = cinco;
	}

	public int getSeis() {
		return seis;
	}

	public void setSeis(int seis) {
		this.seis = seis;
	}

	public int getSiete() {
		return siete;
	}

	public void setSiete(int siete) {
		this.siete = siete;
	}

	public int getOcho() {
		return ocho;
	}

	public void setOcho(int ocho) {
		this.ocho = ocho;
	}

	public int getNueve() {
		return nueve;
	}

	public void setNueve(int nueve) {
		this.nueve = nueve;
	}
	
	public String getAnimal() {
		return animal;
	}

	public void setAnimal(String animal) {
		this.animal = animal;
	}

	public String getLobo() {
		return lobo;
	}

	public void setLobo(String lobo) {
		this.lobo = lobo;
	}

	public String getOveja() {
		return oveja;
	}

	public void setOveja(String oveja) {
		this.oveja = oveja;
	}

	public String getLechuga() {
		return lechuga;
	}

	public void setLechuga(String lechuga) {
		this.lechuga = lechuga;
	}

	public ModelAnimales[] getListaAnimales() {
		return listaAnimales;
	}

	public void setListaAnimales(ModelAnimales[] listaAnimales) {
		this.listaAnimales = listaAnimales;
	}

	public ModelAnimales[] getListaAnimales1() {
		return listaAnimales1;
	}

	public void setListaAnimales1(ModelAnimales[] listaAnimales1) {
		this.listaAnimales1 = listaAnimales1;
	}

	public int getTurno() {
		return turno;
	}

	public void setTurno(int turno) {
		this.turno = turno;
	}

	@Override
	public String toString() {
		return "Datos [listaValores3Raya=" + Arrays.toString(listaValores3Raya) + ", listaJugadores3Raya="
				+ Arrays.toString(listaJugadores3Raya) + ", posTablero3Raya=" + posTablero3Raya + ", cero=" + cero
				+ ", uno=" + uno + ", comprobacion=" + comprobacion + ", jugador1=" + jugador1 + ", mapaClase="
				+ Arrays.toString(mapaClase) + ", mapaClase1=" + Arrays.toString(mapaClase1) + "]";
	}

}
