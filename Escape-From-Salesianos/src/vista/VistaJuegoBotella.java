package vista;

import datos.Datos;

public class VistaJuegoBotella {

	// Print methods
	
	// Imprime las instrucciones del juego.
	public void printInstructions() {
		System.out.println("\t\t\tINSTRUCCIONES");
		System.out.println(" __________________________________________________________");
		System.out.println("| Usando dos botellas vacías de 7 y 3 litros de capacidad, |\n| reparte los 10 litros de una botella llena de agua,\t   |\n"
				+ "| de manera que tanto en la de 7 litros como en la de 10,  |\n| queden 5 litros exactamente. ¡¡Mucha suerte!!\t\t   |");
		System.out.println("|__________________________________________________________|\n");
	}

	// Imprime por pantalla el estado actual de las botellas.
	public void showBottles(Datos d) {
		System.out.println("[A] " + " [B] " + "[C] ");
		System.out
				.println("[" + d.getBotella10() + "] " + "[" + d.getBotella7() + "] " + "[" + d.getBotella3() + "]\n");
	}

	// Indica al usuario que botellas puede vaciar.
	public void showEmpty() {
		System.out.println("Introduzca el número asociado a la botella que desea vaciar y pulse Intro.");
		System.out.println("1. Botella [A] (límite 10 litros)\n" + "2. Botella [B] (límite 7 litros)\n"
				+ "3. Botella [C] (límite 3 litros)\n");
	}

	// Indica al usuario dónde puede vaciar la Botella A.
	public void showEmptyBottleA() {
		System.out.println("¿Dónde quieres verter el agua?\n"+"1. Botella [B]\n"+"2. Botella [C]\n"+"3. Retroceder\n");
	}

	// Indica al usuario dónde puede vaciar la Botella B.
	public void showEmptyBottleB() {
		System.out.println("¿Dónde quieres verter el agua?\n"+"1. Botella [A]\n"+"2. Botella [C]\n"+"3. Retroceder\n");
	}
	
	// Indica al usuario dónde puede vaciar la Botella C.
	public void showEmptyBottleC() {
		System.out.println("¿Dónde quieres verter el agua?\n"+"1. Botella [A]\n"+"2. Botella [B]\n"+"3. Retroceder\n");
	}
	
	// Advertencia de valor introducido no válido.
	public void notValidValue() {
		System.out.println("Valor introducido no válido, por favor, elija otro.\n");
	}
	
	// Advertencia de querer vaciar una botella ya vacía.
	public void alreadyEmpty() {
		System.out.println("¡Esa botella ya está vacía! Por favor, introduzca otra opción y pulse Intro.");
	}
	
	// Victoria
	public void printVictory() {
		System.out.println("¡¡Enhorabuena, has resuelto el enigma!!");
	}
}
