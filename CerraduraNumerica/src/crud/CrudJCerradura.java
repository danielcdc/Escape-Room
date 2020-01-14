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

	// Este método sirve para poner un número dentro de los huecos disponibles.
	public void insertarNumero(Datos d, ControllerJCerradura o, CrudJCerradura c, VistaJCerradura v) {

		int op = Leer.datoInt();
		d.setOp(op);
		comprobarNumeroD1H7(d, o, c, v);

	}

	// Este método permite saber si el número introducido está entre el 1 al 7 y
	// comprueba que no esté ya en uso.
	public void comprobarNumeroD1H7(Datos d, ControllerJCerradura o, CrudJCerradura c, VistaJCerradura v) {

		int cero = 0, siete = 7;
		if (d.getOp() > cero && d.getOp() <= siete) {
			o.comprobado1a7(d, v, c);
		} else {
			v.errorNumeroNoValido(d);
		}
	}

	// Este método permite averiguar si el hueco no está ocupado.
	public void comprobarHuecoOcupado(Datos d, VistaJCerradura v) {

		int cero = 0;
		if (d.getCerradura()[d.getElec()] == cero) {
			v.insertarD1H9(d);
			elegirNumeroD1H9(d, v);

		} else {
			v.errorMismoHueco(d);
		}

	}

	// Este método sirve para elegir número a insertar.
	public void elegirNumeroD1H9(Datos d, VistaJCerradura v) {

		int op = 0, uno = 1;
		op = Leer.datoInt();
		d.setOp(op);
		d.setElec(d.getOp() - uno);
		comprobarNumeroD1H9(d, v);

	}

	// Este método comprueba si el número que se pretende insertar está entre
	// el 1 y el 9, ambos inclusive.
	public void comprobarNumeroD1H9(Datos d, VistaJCerradura v) {

		int cero = 0, nueve = 9;
		if (d.getOp() > cero && d.getOp() <= nueve) {
			if (d.getComprobadores()[d.getOp()] == false) {
				d.getCerradura()[d.getElec()] = d.getOp();
				d.getComprobadores()[d.getOp()] = true;
			} else {
				v.errorRepetirNumero(d);
			}
		} else {
			v.errorNumeroNoValido(d);
		}
	}

	// Este método comprueba si dentro de un hueco existe un número introducido
	// previamente y lo elimina.
	public void borrarNumero(Datos d, VistaJCerradura v) {

		int op = Leer.datoInt();
		d.setOp(op);
		ComprobarBorradorD1H7(d, v);
	}

	// Comprueba si el hueco cuyo número se pretende borrar no está ya vacío.
	public void ComprobarBorradorD1H7(Datos d, VistaJCerradura v) {
		int cero = 0, uno = 1, siete = 7;
		if (d.getOp() > cero && d.getOp() <= siete) {
			d.setElec(d.getOp() - uno);
			v.imprimirValorOp(d);
			d.getComprobadores()[d.getCerradura()[d.getElec()]] = false;// ¿Qué hace esto?
			d.getCerradura()[d.getElec()] = cero;// ¿Y esto?
		} else {
			v.errorNumeroNoValido(d);
		}
	}

	/* Falta ajustar los métodos que controlan la victoria/derrota. */

	// este sirve para rendirte
	public void rendicion(Datos d) {

		boolean derrota = true;
		d.setDerrota(derrota);

	}

	// Comprueba si el jugador ha ganado la partida.
	public void comprobarVictoria(Datos d, VistaJCerradura v) {

		if (d.isDerrota()) {
			v.finalPerder(d);
		} else {
			v.finalGanar(d);

		}

	}

}
