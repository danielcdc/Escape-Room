package model;

import java.util.Arrays;
import java.util.Random;

public class ModelJuegoPizarra {

	private Mapa mapaJuego;
	private int[] numeroSecreto;
	private ModelJugador j1;

	public ModelJuegoPizarra(Mapa mapaJuego, int[] numeroSecreto, ModelJugador j1) {

		this.mapaJuego = mapaJuego;
		this.numeroSecreto = numeroSecreto;
		this.j1 = j1;
	}

	public ModelJuegoPizarra(Mapa mapaJuego, int[] numeroSecreto) {
		super();
		this.mapaJuego = mapaJuego;
		this.numeroSecreto = numeroSecreto;
	}



	public Mapa getMapaJuego() {
		return mapaJuego;
	}

	public void setMapaJuego(Mapa mapaJuego) {
		this.mapaJuego = mapaJuego;
	}

	public int[] getNumeroSecreto() {
		return numeroSecreto;
	}

	public void setNumeroSecreto(int[] numeroSecreto) {
		this.numeroSecreto = numeroSecreto;
	}

	public ModelJugador getJ1() {
		return j1;
	}

	public void setJ1(ModelJugador j1) {
		this.j1 = j1;
	}

	@Override
	public String toString() {
		return "ModelJuegoPizarra [mapaJuego=" + mapaJuego + ", numeroSecreto=" + Arrays.toString(numeroSecreto)
				+ ", j1=" + j1 + "]";
	}

	public int[] generarNumerosSecretos() {
		Random rnd = new Random(System.nanoTime());
		int max = 20, min = 0;

		for (int i = 0; i < numeroSecreto.length; i++) {
			numeroSecreto[i] = rnd.nextInt(max - min + 1) - min;
		}

		return numeroSecreto;

	}

	public boolean asignarNumeroConMesa(int contJuegoPizz) {
		
		if (mapaJuego.getMapa()[6][7] == 'P' && contJuegoPizz == 0) {
			

			System.out.println("- - - - - - - - - - - - - - - - - - - - " + "-Don Bosco: Esta pantalla está encendida"
					+ "- - - - - - - - - - - - - - - - - - - - ");
			System.out.println("- - - - - - - - - - - - - - - - - - - - "
					+ "-Don Bosco: Es el primer número, lo apuntaré" + "- - - - - - - - - - - - - - - - - - - - ");

			System.out.println("╔═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╗\n"
					+ "║                                               ║\n"
					+ "                                                 \n"
					+ "║                                               ║\n"
					+ "                                                 \n" + "║                       " + numeroSecreto[0]
					+ "                      ║\n" + "                    ----------                   \n"
					+ "║                                               ║\n"
					+ "╚═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╝\n"
					+ "                      	▓▓▓                      \n"
					+ "                      	▓▓▓                      \n"
					+ "                      	▓▓▓                      \n"
					+ "                    ▓▓▓▓▓▓▓▓▓▓▓                  \n");

			System.out.println("A: " + numeroSecreto[0]);

			return true;

		}

		if (mapaJuego.getMapa()[12][7] == 'P' && contJuegoPizz == 1) {
			
			

			System.out.println("- - - - - - - - - - - - - - - - - - - - " + "-Don Bosco: Otra pantalla encendida"
					+ "- - - - - - - - - - - - - - - - - - - - ");
			System.out.println("- - - - - - - - - - - - - - - - - - - - "
					+ "-Don Bosco: Supongo que es el 2º, lo apuntaré" + "- - - - - - - - - - - - - - - - - - - - ");

			System.out.println("╔═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╗\n"
					+ "║                                               ║\n"
					+ "                                                 \n"
					+ "║                                               ║\n"
					+ "                                                 \n" + "║                        " + numeroSecreto[1]
					+ "                      ║\n" + "                    ----------                   \n"
					+ "║                                               ║\n"
					+ "╚═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╝\n"
					+ "                      	▓▓▓                      \n"
					+ "                      	▓▓▓                      \n"
					+ "                      	▓▓▓                      \n"
					+ "                    ▓▓▓▓▓▓▓▓▓▓▓                  \n");

			System.out.println("B: " + numeroSecreto[1]);

			return true;
			

		}
		
		if (mapaJuego.getMapa()[16][2] == 'P' && contJuegoPizz == 2) {

			System.out.println("- - - - - - - - - - - - - - - - - - - - " + "-Don Bosco: La ultima"
					+ "- - - - - - - - - - - - - - - - - - - - ");

			System.out.println("╔═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╗\n"
					+ "║            Deberias pensar en salir...        ║\n"
					+ "                                                 \n"
					+ "║                                               ║\n"
					+ "                                                 \n" + "║                       " + numeroSecreto[2]
					+ "                      ║\n" + "                    ----------                   \n"
					+ "║                                               ║\n"
					+ "╚═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╝\n"
					+ "                      	▓▓▓                      \n"
					+ "                      	▓▓▓                      \n"
					+ "                      	▓▓▓                      \n"
					+ "                    ▓▓▓▓▓▓▓▓▓▓▓                  \n");

			System.out.println("C: " + numeroSecreto[2]);

			return true;

		}
		
		return false;

	}

}
