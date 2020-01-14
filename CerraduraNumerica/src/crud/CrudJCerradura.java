package crud;

import datos.Datos;
import controller.ControllerJCerradura;
import vista.VistaJCerradura;
import utilidades.Leer;

public class CrudJCerradura {
	// Coloca todos los elementos de la matriz comprobadores a falso. Dicha matriz
	// evita que
	// se coloque dos veces el mismo nÃºmero en dos sitios distintos.

	public void ponerAFalso(Datos d) {

		boolean comprobar[] = new boolean[9];
		comprobar = d.getComprobadores();

		for (int i = 0; i < d.getComprobadores().length; i++) {
			comprobar[i] = false;
		}
		d.setComprobadores(comprobar);
	}

//Este metodo sirve para rellenar el array numerador, este array contiene numeros del 1 al 9
	// para que los pueda usar el programa

	public void rellenarNumerador(Datos d) {

		int numerar[] = new int[9];
		numerar = d.getNumerador();

		for (int i = 0; i < d.getNumerador().length; i++) {
			numerar[i] = i + 1;
		}
		d.setNumerador(numerar);
	}

	// este metodo sirve para poner un numero, esto sirve para elegir un hueco del 1
	// al 7

	public void insertarNumero(Datos d,ControllerJCerradura o, CrudJCerradura c,
			VistaJCerradura v) {

		int op = Leer.datoInt();
		
		d.setOp(op);
		
		comprobarNumeroD1H7(d,o,c,v);

	}

	// Este metodo permite saber si el numero esta entre el 1 al 7 para saber si es
	// posible de usar

	public void comprobarNumeroD1H7(Datos d,ControllerJCerradura o, CrudJCerradura c,
			VistaJCerradura v) {
		
		
		if (d.getOp() > 0 && d.getOp() <= 7) {
		
		o.comprobado1a7(d, v, c);
		
		}else {
			v.errorNumeroNoValido(d);
		}
	}

	// este metodo permite averiguar si el hueco no esta ocupado
	public void comprobarHuecoOcupado(Datos d, VistaJCerradura v) {

		if (d.getCerradura()[d.getElec()] == 0) {
			v.insertarD1H9(d);
			elegirNumeroD1H9(d, v);
			
		}else {
			v.errorMismoHueco(d);
		}
		
		}
	
	//este metodo sirve para elegir numero
	
	public void elegirNumeroD1H9(Datos d, VistaJCerradura v) {
		
		int op = 0;
		op= Leer.datoInt();

		d.setOp(op);
		d.setElec(d.getOp()-1);
		
		comprobarNumeroD1H9 (d, v);
		
		}
	
	//este metodo comprueba si el numero esta entre 1 y 9
public void comprobarNumeroD1H9(Datos d, VistaJCerradura v) {
		
	if (d.getOp() > 0 && d.getOp() <= 9 ) {

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

//este sirve para borrar un numero
public void borrarNumero (Datos d, VistaJCerradura v) {
	
	int op = Leer.datoInt();
	
	d.setOp(op);
	
	ComprobarBorradorD1H7(d, v);
	
	
}
//sirve para comprobar si el valor que le diste a borrar es correcto
public void ComprobarBorradorD1H7 (Datos d, VistaJCerradura v) {
	
	if (d.getOp() > 0 && d.getOp() <= 7) {
		
		d.setElec(d.getOp()-1);
		
		v.imprimirValorOp(d);

		System.out.println("Se procedera a su borrado");
		
		d.getComprobadores() [d.getCerradura()[d.getElec()]] = false;

		d.getCerradura()[d.getElec()] = 0;

	} else {
		v.errorNumeroNoValido(d);
	}	
}


//este sirve para rendirte
public void rendicion (Datos d) {
	
	boolean derrota = true;
	
	d.setDerrota(derrota);
	
}

//este metodo comprueba si ganaste o perdiste
public void comprobarVictoria (Datos d, VistaJCerradura v) {
	
	if (d.isDerrota()) {
		
		v.finalPerder(d);
		
	}else {
		
		v.finalGanar(d);
		
	}
	
}


}
