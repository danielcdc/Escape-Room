package vista;

import datos.Datos;

public class VistaJCerradura {

	// Este metodo sirve para imprimir en pantalla el array cerradura

	public void intruciones() {

		System.out.println("Bienvenido a este juego.\nLas normas son mas simples que hacer"
				+ " una variable y tu deber es abrir la siguiente cerradura, pero teniendo en cuenta lo siguiente:\n");
		System.out
				.println("1. La multiplicación de todas las líneas de la cerradura deben dar el mismo " + "resultado.");
		System.out.println("2. No puedes colocar 2 veces  el mismo número.");
		System.out.println("3. Si no consigues pasar el minijuego tendrás que hacer subconsultas...es broma :)\n"
				+ " Ni yo soy tan malo, simplemente por cada vez que falles mataremos un gatito :D\n");

	}

	// Muestra por pantalla la cerradura.
	public void imprimirCerradura(Datos d) {

		System.out.println("[" + d.getCerradura()[0] + "]   " + "[" + d.getCerradura()[1] + "]");
		System.out.println(
				"[" + d.getCerradura()[2] + "]" + "[" + d.getCerradura()[3] + "]" + "[" + d.getCerradura()[4] + "]");
		System.out.println("[" + d.getCerradura()[5] + "]   " + "[" + d.getCerradura()[6] + "]");

	}

	// Este metodo imprime el menú principal del programa.
	public void imprimirMenuPrincipal() {

		System.out.println("¿Qué quieres hacer?");
		System.out.println("1. Insertar un número");
		System.out.println("2. Quitar un número");

	}

	// Este método sirve para imprimir un ejemplo de dónde puede el usuario colocar
	// los números.
	public void imprimirEjemplo(Datos d) {

		System.out.println("¿Dónde desea insertar un número? Dispone de los huecos del 1 al 7.\n"
				+ "Introduzca un número y pulse Intro.");

		System.out.println("[" + d.getNumerador()[0] + "]   " + "[" + d.getNumerador()[1] + "]");
		System.out.println(
				"[" + d.getNumerador()[2] + "]" + "[" + d.getNumerador()[3] + "]" + "[" + d.getNumerador()[4] + "]");
		System.out.println("[" + d.getNumerador()[5] + "]   " + "[" + d.getNumerador()[6] + "]");
	}

	// El menú que presenta las opciones a poder borrar.
	public void imprimirMenuBorrar(Datos d) {

		System.out.println("Indique el hueco donde se encuentra el número que desea borrar y pulse Intro.\n"
				+ "Dispone de los huecos del 1 al 7.");

		System.out.println("[" + d.getNumerador()[0] + "]   " + "[" + d.getNumerador()[1] + "]");
		System.out.println(
				"[" + d.getNumerador()[2] + "]" + "[" + d.getNumerador()[3] + "]" + "[" + d.getNumerador()[4] + "]");
		System.out.println("[" + d.getNumerador()[5] + "]   " + "[" + d.getNumerador()[6] + "]");
	}

	//Indica al usuario el hueco elegido donde insertará un número.
	public void imprimirValorOp(Datos d) {

		System.out.println("Usted eligió el hueco " + d.getOp());

	}
	
	//Indica al usuario que números puede insertar.
	public void insertarD1H9() {

		System.out.println("¿Qué número desea insertar? Introduzca un número del 1 al 9 y pulse Intro.");
	}

	//Indica al usuario que no puede insertar 2 veces el mismo número.
	public void errorRepetirNumero() {

		System.out.println("No puedes colocar 2 veces el mismo número.");
	}
	
	// Indica al usuario que el espacio que pretende ocupar, ya lo está.
	public void errorMismoHueco() {

		System.out.println("Este hueco ya está ocupado.");
	}
	
	// Indica al usuario que ha finalizado con éxito el juego.
	public void finalGanar() {

		System.out.println("¡Clic! ¡Has abierto la cerradura! ¡Felicidades máquina!");
	}
	
	// Indica al usuario que la opción insertada no es una opción válida y
	// que debe elegir otra.
	public void opcionNoDisponible() {
		System.out.println("Opción introducida no válida. Por favor, inserte otra y pulse Intro.");
	}
}
