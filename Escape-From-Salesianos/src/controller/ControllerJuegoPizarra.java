package controller;

import datos.Datos;
import model.ModelMapa;
import utilidades.Leer;
import vista.VistaPruebas;

public class ControllerJuegoPizarra {

	public boolean asignarNumeroConMesa(int contJuegoPizz, ModelMapa m1, Datos d, String intro) {//Si ModelMapa ya contiene "Datos d",¿ Cuál es el punto de pasar como parámetro
																									// Datos d?
		VistaPruebas vp = new VistaPruebas();

		if (m1.getD().getMapaClase1()[6][7] == 'P' && contJuegoPizz == 0) {

			do {
				vp.numOrdenador1(d);
				intro = Leer.dato();
			} while (!intro.equalsIgnoreCase(""));
			return true;

		}

		if (m1.getD().getMapaClase1()[12][7] == 'P' && contJuegoPizz == 1) {
			do {
				vp.numOrdenador2(d);
				intro = Leer.dato();
			} while (!intro.equalsIgnoreCase(""));
			return true;

		}

		if (m1.getD().getMapaClase1()[16][2] == 'P' && contJuegoPizz == 2) {
			do {
				vp.numOrdenador3(d);
				intro = Leer.dato();
			} while (!intro.equalsIgnoreCase(""));
			return true;

		}

		return false;

	}

	private void guardarPuerta(Datos d, int i, int num1) {

		d.getNumerosIntroduz()[i] = num1;
	}

	public boolean comprobarPuerta(int[] num, int[] num1) {
		boolean comprob = false;

		for (int i = 0; i < num.length; i++) {
			if (num[i] == num1[i]) {
				comprob = true;
			} else {
				comprob = false;
			}

		}

		return comprob;

	}

}
