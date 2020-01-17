package datos;

import java.util.Arrays;

import model.ModelAnimales;
import model.ModelHerramientas;
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
			{ '║', 'P', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
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

	char[][] mapaClase1 = {
			{ '╔', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '▓', '▓', '▓', '▓', '▓', '╗' },
			{ '║', '█', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', '█', '█', '█', '█', '█', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
			{ '║', ' ', '█', '█', ' ', 'P', '█', '█', ' ', ' ', ' ', '█', '█', ' ', ' ', ' ', '█', '█', ' ', '║' },
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
	private String piezaEnX,piezaEnY,movimientoEnX,movimientoEnY;
	private boolean victoriaAjedrez=false;
	
	//Para juego granjero
	private String animal;
	private String lobo = "lobo", oveja = "oveja", lechuga = "lechuga";
	private ModelAnimales listaAnimales[] = { new ModelAnimales(lobo, true), new ModelAnimales(oveja, true),
			new ModelAnimales(lechuga, true) };
	private ModelAnimales listaAnimales1[] = { new ModelAnimales(lobo, false), new ModelAnimales(oveja, false),
			new ModelAnimales(lechuga, false) };
	private boolean victoriaAnimales = false; 
	private int turno;
	
	//INVENTARIO
	private ModelHerramientas listaDeHerramientas[] = {new ModelHerramientas("Soplete", "Un soplete normal y corriente. Tiene un conejo blanco impreso en él y una frase de advertencia: NO funde adamantiun. Inflamable significa flamable", false), 
		new ModelHerramientas("CD-ROM", "El título impreso en la carcasa reza lo siguiente: \"Juego de ajedrez sencillito para Dummies. Edad recomendada de 2 a 5 años mentales\"" , false),
		new ModelHerramientas("Lupa", "Para usarla presiona la tecla del logotipo de Windows (⊞ Win) + signo más (+)", false)};
	
	//Juego de las Botellas
	
	// Representa el contenido inicial de las botellas.
	private int botella10 = 10;
	private int botella7 = 0;
	private int botella3 = 0;
		
	// Representa el volumen máximo de cad abotella.
	private int limite10 = 10;
	private int limite7 = 7;
	private int limite3 = 3;
		
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
	public boolean getPiezaEnX(String pieza) {
		return piezaEnX.equalsIgnoreCase(pieza);
	}
	public void setPiezaEnX(String piezaEnX) {
		this.piezaEnX = piezaEnX;
	}
	public boolean getPiezaEnY(String pieza) {
		return piezaEnY.equalsIgnoreCase(pieza);
	}
	public void setPiezaEnY(String piezaEnY) {
		this.piezaEnY = piezaEnY;
	}
	public boolean getMovimientoEnX(String mov) {
		return movimientoEnX.equalsIgnoreCase(mov);
	}
	public void setMovimientoEnX(String movimientoEnX) {
		this.movimientoEnX = movimientoEnX;
	}
	public boolean getMovimientoEnY(String mov) {
		return movimientoEnY.equalsIgnoreCase(mov);
	}
	public void setMovimientoEnY(String movimientoEnY) {
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
	

	public boolean isVictoriaAnimales() {
		return victoriaAnimales;
	}

	public void setVictoriaAnimales(boolean victoriaAnimales) {
		this.victoriaAnimales = victoriaAnimales;
	}

	public ModelHerramientas[] getListaDeHerramientas() {
		return listaDeHerramientas;
	}

	public void setListaDeHerramientas(ModelHerramientas[] listaDeHerramientas) {
		this.listaDeHerramientas = listaDeHerramientas;
	}
	
	public int getBotella10() {
		return botella10;
	}

	public void setBotella10(int botella10) {
		this.botella10 = botella10;
	}

	public int getBotella7() {
		return botella7;
	}

	public void setBotella7(int botella7) {
		this.botella7 = botella7;
	}

	public int getBotella3() {
		return botella3;
	}

	public void setBotella3(int botella3) {
		this.botella3 = botella3;
	}

	public int getLimite10() {
		return limite10;
	}

	public void setLimite10(int limite10) {
		this.limite10 = limite10;
	}

	public int getLimite7() {
		return limite7;
	}

	public void setLimite7(int limite7) {
		this.limite7 = limite7;
	}

	public int getLimite3() {
		return limite3;
	}

	public void setLimite3(int limite3) {
		this.limite3 = limite3;
	}
	
	
	public boolean isVictoriaAjedrez() {
		return victoriaAjedrez;
	}

	public void setVictoriaAjedrez(boolean victoriaAjedrez) {
		this.victoriaAjedrez = victoriaAjedrez;
	}

	@Override
	public String toString() {
		return "Datos [vertic=" + vertic + ", horiz=" + horiz + ", listaValores3Raya="
				+ Arrays.toString(listaValores3Raya) + ", listaJugadores3Raya=" + Arrays.toString(listaJugadores3Raya)
				+ ", posTablero3Raya=" + posTablero3Raya + ", cero=" + cero + ", uno=" + uno + ", dos=" + dos
				+ ", fase=" + fase + ", tres=" + tres + ", cuatro=" + cuatro + ", cinco=" + cinco + ", seis=" + seis
				+ ", siete=" + siete + ", ocho=" + ocho + ", nueve=" + nueve + ", comprobacion=" + comprobacion
				+ ", jugador1=" + jugador1 + ", mapaClase=" + Arrays.toString(mapaClase) + ", mapaClase1="
				+ Arrays.toString(mapaClase1) + ", numeroSecreto=" + Arrays.toString(numeroSecreto)
				+ ", numerosIntroduz=" + Arrays.toString(numerosIntroduz) + ", nombre=" + Arrays.toString(nombre)
				+ ", iniciales=" + Arrays.toString(iniciales) + ", inicialesEnemigas="
				+ Arrays.toString(inicialesEnemigas) + ", posicionX=" + Arrays.toString(posicionX) + ", posicionY="
				+ Arrays.toString(posicionY) + ", pul=" + pul + ", piezaEnX=" + piezaEnX + ", piezaEnY=" + piezaEnY
				+ ", movimientoEnX=" + movimientoEnX + ", movimientoEnY=" + movimientoEnY + ", animal=" + animal
				+ ", lobo=" + lobo + ", oveja=" + oveja + ", lechuga=" + lechuga + ", listaAnimales="
				+ Arrays.toString(listaAnimales) + ", listaAnimales1=" + Arrays.toString(listaAnimales1)
				+ ", victoriaAnimales=" + victoriaAnimales + ", turno=" + turno + ", listaDeHerramientas="
				+ Arrays.toString(listaDeHerramientas) + ", botella10=" + botella10 + ", botella7=" + botella7
				+ ", botella3=" + botella3 + ", limite10=" + limite10 + ", limite7=" + limite7 + ", limite3=" + limite3
				+ "]";
	}
	
}
