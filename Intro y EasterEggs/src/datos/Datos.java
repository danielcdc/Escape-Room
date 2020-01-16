package datos;

import java.util.Arrays;

import model.ModelHerramientas;
import model.ModelJugador;
import model.ModelJugador3Raya;

public class Datos {
	//ale
	private String dibujoSoplete = "║    ████████                   \\r\\n\" + \r\n" + 
			"				\"║██████    █████████████████████\\r\\n\" + \r\n" + 
			"				\"║██  ██🔥    🔥██           ██    ██ \\r\\n\" + \r\n" + 
			"				\"║██████    █████████████████████\\r\\n\" + \r\n" + 
			"				\"║    ████████                   \\r\\n\" + \r\n" + 
			"				\"║   ██      ██                  \\r\\n\" + \r\n" + 
			"				\"║  ████████████                  \\r\\n\" + \r\n" + 
			"				\"║  ██        ██                       \\r\\n\" + \r\n" + 
			"				\"║  ██ (\\\\__/) ██                    \\r\\n\" + \r\n" + 
			"				\"║  ██(='.'=) ██                    \\r\\n\" + \r\n" + 
			"				\"║  ██(\\\")-(\\\") ██                   \\r\\n\" + \r\n" + 
			"				\"║  ██        ██                     \\r\\n\" + \r\n" + 
			"				\"║  ██        ██              \\r\\n\" + \r\n" + 
			"				\"║  ████████████   ";
	private String dibujoCD = "║          ████████             \r\n" + 
			"║      ████▓▓▓▓▓▓▓▓████         \r\n" + 
			"║    ██▒▒▓▓▓▓▓▓▓▓▓▓▒▒░░██       \r\n" + 
			"║  ██▓▓░░▒▒▓▓▓▓▓▓▒▒░░  ▒▒██     \r\n" + 
			"║  ██▓▓▓▓░░▒▒████░░  ▒▒▓▓██     \r\n" + 
			"║██▓▓▓▓▓▓▓▓██    ██▒▒▓▓▓▓▓▓██   \r\n" + 
			"║██▓▓▓▓▓▓██        ██▓▓▓▓▓▓██   \r\n" + 
			"║██▓▓▓▓▓▓██        ██▓▓▓▓▓▓██   \r\n" + 
			"║██▓▓▓▓▓▓▒▒██    ██▓▓▓▓▓▓▓▓██   \r\n" + 
			"║  ██▓▓▒▒  ░░████▒▒▓▓▓▓▓▓██     \r\n" + 
			"║  ██▒▒  ░░▒▒▓▓▓▓░░▒▒▓▓▓▓██     \r\n" + 
			"║    ██░░▒▒▓▓▓▓▓▓▓▓░░▒▒██       \r\n" + 
			"║      ████▓▓▓▓▓▓▓▓████         \r\n" + 
			"║          ████████   ";
	private String dibujoLupa =  "║      ██████████               \r\n" + 
			"║    ██          ██             \r\n" + 
			"║  ██    ▒▒▒▒      ██           \r\n" + 
			"║██    ▒▒            ██         \r\n" + 
			"║██  ▒▒              ██         \r\n" + 
			"║██  ▒▒              ██         \r\n" + 
			"║██                  ██         \r\n" + 
			"║  ██              ██           \r\n" + 
			"║    ██          ████           \r\n" + 
			"║      ██████████    ████       \r\n" + 
			"║                    ██████     \r\n" + 
			"║                      ██████   \r\n" + 
			"║                        ██████ \r\n" + 
			"║                          ████ ";
			
	private ModelHerramientas listaDeHerramientas[] = {new ModelHerramientas("Soplete", "Un soplete normal y corriente. Tiene un conejo blanco impreso en él y una frase de advertencia: NO funde adamantiun. Inflamable significa flamable", false), 
			new ModelHerramientas("CD-ROM", "El título impreso en la carcasa reza lo siguiente: “Juego de ajedrez sencillito para Dummies. Edad recomendada de 2 a 5 años mentales", false),
			new ModelHerramientas("Lupa", "Para usarla presiona la tecla del logotipo de Windows (⊞ Win) + signo más (+)", false)};
	//f ale
	private int vertic;

	private int horiz;

	private char listaValores3Raya[] = { '1', '2', '3', '4', '5', '6', '7', '8', '9' };

	private ModelJugador3Raya[] listaJugadores3Raya = { new ModelJugador3Raya('O', false),
			new ModelJugador3Raya('X', false) };

	private int posTablero3Raya = 0;

	private int cero = 0, uno = 1, fase = 1;

	private boolean comprobacion = false;

	ModelJugador jugador1 = new ModelJugador("Don Bosco", false);

	char[][] mapaClase = {
			{ '╔', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '═', '▓', '▓', '▓', '▓', '▓', '╗' },
			{ '║', '█', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', ' ', 'P', ' ', ' ', ' ', ' ', ' ', ' ', '║' },
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

	@Override
	public String toString() {
		return "Datos [listaValores3Raya=" + Arrays.toString(listaValores3Raya) + ", listaJugadores3Raya="
				+ Arrays.toString(listaJugadores3Raya) + ", posTablero3Raya=" + posTablero3Raya + ", cero=" + cero
				+ ", uno=" + uno + ", comprobacion=" + comprobacion + ", jugador1=" + jugador1 + ", mapaClase="
				+ Arrays.toString(mapaClase) + ", mapaClase1=" + Arrays.toString(mapaClase1) + "]";
	}

	public ModelHerramientas[] getListaDeHerramientas() {
		return listaDeHerramientas;
	}

	public void setListaDeHerramientas(ModelHerramientas listaDeHerramientas[]) {
		this.listaDeHerramientas = listaDeHerramientas;
	}

}
