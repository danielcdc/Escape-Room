package vista;

import datos.Datos;
import crud.CrudJCerradura;

public class VistaJCerradura {

	// Este metodo sirve para imprimir en pantalla el array cerradura

	public void intruciones(Datos d) {

		System.out.println("Bienvenido a este juego. Las normas son mas simples que hacer"
				+ " una variable y tu deber es abrir la siguiente cerradura, pero teniendo en cuenta:");
		System.out.println("1. La multiplicación de todas las líneas de la cerradura deben dar el mismo " + "resultado.");
		System.out.println("2. No puedes colocar 2 veces  el mismo número.");
		System.out.println("3. Si no consigues pasar el minijuego tendrás que hacer subconsultas...es broma :)"
				+ "Ni yo soy tan malo, simplemente por cada vez que falles mataremos un gatito :D");

	}

	// Muestra por pantalla la cerradura
	public void imprimirCerradura(Datos d) {

		System.out.println("[" + d.getCerradura()[0] + "]   " + "[" + d.getCerradura()[1] + "]");
		System.out.println(
				"[" + d.getCerradura()[2] + "]" + "[" + d.getCerradura()[3] + "]" + "[" + d.getCerradura()[4] + "]");
		System.out.println("[" + d.getCerradura()[5] + "]   " + "[" + d.getCerradura()[6] + "]");

	}

//Este metodo imprime el menu principal del programa
	public void imprimirMenuPrincipal(Datos d) {

		System.out.println("¿Que quieres hacer?");

		// un menu con un switch el cual permite varias opciones
		System.out.println("1.Insertar un número");
		System.out.println("2.Quitar un número");

	}

//este metodo sirve para imprimir un ejemplo de donde estan los lugares
	public void imprimirEjemplo(Datos d) {

		System.out.println("En que lugar quieres insertar 1 al 7");

		System.out.println("[" + d.getNumerador()[0] + "]   " + "[" + d.getNumerador()[1] + "]");
		System.out.println(
				"[" + d.getNumerador()[2] + "]" + "[" + d.getNumerador()[3] + "]" + "[" + d.getNumerador()[4] + "]");
		System.out.println("[" + d.getNumerador()[5] + "]   " + "[" + d.getNumerador()[6] + "]");
	}

//este es el menu para borrar
	public void imprimirMenuBorrar(Datos d) {

		System.out.println("En que lugar quieres borrar 1 al 7");

		System.out.println("[" + d.getNumerador()[0] + "]   " + "[" + d.getNumerador()[1] + "]");
		System.out.println(
				"[" + d.getNumerador()[2] + "]" + "[" + d.getNumerador()[3] + "]" + "[" + d.getNumerador()[4] + "]");
		System.out.println("[" + d.getNumerador()[5] + "]   " + "[" + d.getNumerador()[6] + "]");
	}

//Esto sirve para imprimir que numero escogiste en el menu de hueco
	public void imprimirValorOp(Datos d) {

		System.out.println("Usted eligio el hueco " + d.getOp());

	}
//este sirve para imprimir que numero insertaras del 1 al 9

	public void insertarD1H9(Datos d) {

		System.out.println("Que numero quieres insertarle, 1 al 9");
	}

//este metodo te dice que no puedes poner un numero repetido
	public void errorRepetirNumero(Datos d) {

		System.out.println("No puedes colocar 2 veces el mismo numero");
	}

	public void errorNumeroNoValido(Datos d) {

		System.out.println("Número no Valido");
	}

	public void errorMismoHueco(Datos d) {

		System.out.println("No puedes colocar 2 veces en el mismo hueco");
	}

	public void finalGanar(Datos d) {

		System.out.println("Ganaste");
	}

	public void finalPerder(Datos d) {

		System.out.println("Perdiste");
	}
}
