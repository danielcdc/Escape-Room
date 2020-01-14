package controller;

import datos.Datos;
import vista.VistaJCerradura;
import crud.CrudJCerradura;
import utilidades.Leer;

public class ControllerJCerradura {

	// Este método sirve para leer el Operador para usarlo en un switch.

	public void leerOperador(Datos d, VistaJCerradura v, CrudJCerradura c, ControllerJCerradura o) {

		int op;
		op = Leer.datoInt();
		d.setOp(op);
		primerSwitch(d, o, c, v);
	}

	// Este método se ejecuta tras ejectuar la comprobacion de si es entre uno y 7 y da positivo,
	// sirve de enlace.
	public void comprobado1a7(Datos d, VistaJCerradura v, CrudJCerradura c) {
		int uno = 1;
		int elec = d.getOp() - uno;
		v.imprimirValorOp(d);
		d.setElec(elec);

		c.comprobarHuecoOcupado(d, v);

	}

	// Controla el primer menú con dos opciones: insertar un número en un hueco, o borrarlo.
	public void primerSwitch(Datos d, ControllerJCerradura o, CrudJCerradura c, VistaJCerradura v) {

		switch (d.getOp()) {

		case 1:
			v.imprimirEjemplo(d);
			c.insertarNumero(d, o, c, v);
			break;

		case 2:
			v.imprimirMenuBorrar(d);
			c.borrarNumero(d, v);
			break;

		default:
		}
	}

	// Evita que el jugador gane por tener los tres productos iguales a 0.
	// Mientras un producto sea igual a 0, este se le asignará el valor 1, 2 o 3 respectivamente.
	public void evitarProductoNulo(Datos d) {
		int cero = 0, uno = 1, dos = 2, tres = 3, cuatro = 4, cinco = 5, seis = 6;

		int calculator1 = d.getCerradura()[cero] * d.getCerradura()[dos] * d.getCerradura()[cinco];
		int calculator2 = d.getCerradura()[dos] * d.getCerradura()[tres] * d.getCerradura()[cuatro];
		int calculator3 = d.getCerradura()[uno] * d.getCerradura()[cuatro] * d.getCerradura()[seis];

		if (calculator1 == cero) {
			calculator1 = uno;
		}else if(calculator2 == cero) {
			calculator2 = dos;
		}else if(calculator3 == cero) {
			calculator3 = tres;
		}
	}

}
