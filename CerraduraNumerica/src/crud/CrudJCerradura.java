package crud;

import datos.Datos;
import controller.ControllerJCerradura;
import vista.VistaJCerradura;
import utilidades.Leer;

public class CrudJCerradura {

	// Coloca todos los elementos del array comprobadores a falso. Dicha matriz
	// evita que se coloque dos veces el mismo número en dos sitios distintos.
	public void ponerAFalso(Datos d) {

		boolean comprobar[] = d.getComprobadores();
		for (int i = 0; i < d.getComprobadores().length; i++) {
			comprobar[i] = false;
		}
		d.setComprobadores(comprobar);
	}

	// Este método sirve para rellenar el array numerador: dicho array contiene
	// números del 1 al 9.
	public void rellenarNumerador(Datos d) {

		int numerar[] = d.getNumerador();
		for (int i = 0; i < d.getNumerador().length; i++) {
			numerar[i] = i++;
		}
		d.setNumerador(numerar);
	}

	// Elige el número a colocar en un hueco y comprueba que este es válido.
	public void elegirHueco(Datos d, ControllerJCerradura o, CrudJCerradura c, VistaJCerradura v) {

		boolean out = false;
		int cero = 0, uno = 1, siete = 7;
		do {
			String choose = Leer.dato();
			int op = Integer.parseInt(choose);
			d.setOp(op);
			if (d.getOp() > cero && d.getOp() <= siete) { // Comprueba si el valor insertado está dentro de rango.
				if (comprobarHuecoOcupado(d, v)) {// Comprueba si el hueco elegido está vacío.
					int elec = d.getOp() - uno;
					v.imprimirValorOp(d);
					d.setElec(elec);
					out = true;
				} else {
					v.errorMismoHueco();
				}
			} else {
				v.opcionNoDisponible();
			}
		} while (!out);
		c.elegirNumeroD1H9(d, v);
	}

	// Este método permite averiguar si el hueco no está ocupado.
	public boolean comprobarHuecoOcupado(Datos d, VistaJCerradura v) {

		int cero = 0;
		if (d.getCerradura()[d.getElec()] == cero) {
			return true;

		} else {
			return false;
		}

	}

	// Este método sirve para elegir número a insertar, y lo inserta.
	// Además comprueba si el número que se pretende insertar está entre
	// el 1 y el 9, ambos inclusive.
	public void elegirNumeroD1H9(Datos d, VistaJCerradura v) {

		int op = 0, uno = 1, cero = 0, nueve = 9;
		op = Leer.datoInt();
		d.setOp(op);
		d.setElec(d.getOp() - uno);
		if (d.getOp() > cero && d.getOp() <= nueve) {
			if (d.getComprobadores()[d.getOp()] == false) {
				d.getCerradura()[d.getElec()] = d.getOp();// ¿Esto que hace?
				d.getComprobadores()[d.getOp()] = true;
			} else {
				v.errorRepetirNumero();
			}
		} else {
			v.opcionNoDisponible();
			;
		}
	}

	// Elige la posición cuyo número se desea retirar y comprueba que este es un
	// valor válido.
	public void borrarNumero(Datos d, VistaJCerradura v) {
		int cero = 0, uno = 1, siete = 7;
		int op = Leer.datoInt();
		d.setOp(op);
		if (d.getOp() > cero && d.getOp() <= siete) {
			d.setElec(d.getOp() - uno);
			v.imprimirValorOp(d);
			d.getComprobadores()[d.getCerradura()[d.getElec()]] = false;
			d.getCerradura()[d.getElec()] = cero;
		} else {
			v.opcionNoDisponible();
			;
		}
	}

}
