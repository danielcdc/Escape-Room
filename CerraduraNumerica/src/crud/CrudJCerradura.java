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
	public void insertarNumero(Datos d, ControllerJCerradura o, CrudJCerradura c, VistaJCerradura v) {
		int op = Leer.datoInt();
		d.setOp(op);
		int cero = 0, siete = 7;
		if (d.getOp() > cero && d.getOp() <= siete) {
			o.comprobado1a7(d, v, c);
		} else {
			v.errorNumeroNoValido();
		}
	}

	// Este método permite averiguar si el hueco no está ocupado.
	public void comprobarHuecoOcupado(Datos d, VistaJCerradura v) {

		int cero = 0;
		if (d.getCerradura()[d.getElec()] == cero) {
			v.insertarD1H9();
			elegirNumeroD1H9(d, v);

		} else {
			v.errorMismoHueco();
		}

	}

	// Este método sirve para elegir número a insertar.
	// Además comprueba si el número que se pretende insertar está entre
	// el 1 y el 9, ambos inclusive.
	public void elegirNumeroD1H9(Datos d, VistaJCerradura v) {

		int op = 0, uno = 1, cero = 0, nueve = 9;
		op = Leer.datoInt();
		d.setOp(op);
		d.setElec(d.getOp() - uno);
		if (d.getOp() > cero && d.getOp() <= nueve) {
			if (d.getComprobadores()[d.getOp()] == false) {
				d.getCerradura()[d.getElec()] = d.getOp();
				d.getComprobadores()[d.getOp()] = true;
			} else {
				v.errorRepetirNumero();
			}
		} else {
			v.errorNumeroNoValido();
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
			v.errorNumeroNoValido();
		}
	}

}
