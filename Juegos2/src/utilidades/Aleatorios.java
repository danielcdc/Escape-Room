package utilidades;

import java.util.Random;

public class Aleatorios {
	public static int generarNumero(int desde, int hasta) {
		Random rnd = new Random (System.nanoTime());
		return rnd.nextInt(hasta-desde+1)+desde;
		
	}

}
