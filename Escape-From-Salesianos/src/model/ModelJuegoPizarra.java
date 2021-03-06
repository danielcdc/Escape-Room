package model;

import java.util.Random;

import controller.ControllerJuegoPizarra;
import controller.ControllerMapa;
import datos.Datos;
import utilidades.Leer;
import vista.VistaMapas;
import vista.VistaMenu;
import vista.VistaPruebas;

public class ModelJuegoPizarra {

	private Datos d;

	public ModelJuegoPizarra(Datos d) {
		super();
		this.d = d;
	}

	public Datos getD() {
		return d;
	}

	public void setD(Datos d) {
		this.d = d;
	}

	public int[] generarNumerosSecretos() {
		Random rnd = new Random(System.nanoTime());
		int max = 20, min = 0;

		for (int i = 0; i < d.getNumeroSecreto().length; i++) {
			d.getNumeroSecreto()[i] = rnd.nextInt(max - min + 1) - min;
		}

		return d.getNumeroSecreto();

	}

	@Override
	public String toString() {
		return "ModelJuegoPizarra [d=" + d + "]";
	}

	public void iniciarJuegoPizarra(ModelMapa m1, VistaMapas vm, VistaMenu vMenu, String mov, ControllerMapa cMapa,
			ControllerJuegoPizarra cJP, String intro) {
		boolean ganad1 = false;
		int cont = 0, num1 = 0;
		VistaPruebas vp = new VistaPruebas();

		generarNumerosSecretos();

		do {
			vp.imprimirLetreroMapaPrueba();
			vp.imprimirPista1();
			vm.imprimirMapa(m1.getD().getMapaClase1());
			vp.imprimirMenuMapaPrueba();
			mov = Leer.dato();
			cMapa.moverJugador(mov, m1.getD().getMapaClase1(), m1);
			if (cJP.asignarNumeroConMesa(cont, m1, d, intro)) {
				cont++;
			}

			if (d.getMapaClase1()[13][16] == 'P' && cont == 3) {
				do {

					cJP.resetearNumeros(d.getNumerosIntroduz());

					for (int i = 0; i < d.getNumeroSecreto().length; i++) {

						do {
							vp.imprimirCodigo(d.getNumerosIntroduz(), i);
							num1 = Leer.datoInt();
						} while (num1 >= 100 || num1 < 0);
						cJP.guardarPuerta(d, i, num1);
					}

				} while (!cJP.comprobarPuerta(d.getNumeroSecreto(), d.getNumerosIntroduz()));

				ganad1 = true;

			}

		} while (!ganad1);

	}

}
