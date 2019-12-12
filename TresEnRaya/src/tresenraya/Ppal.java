package tresenraya;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numJugadores = 2, turno = 0, elecciones = 0;
		int cero = 0, uno = 1;
		boolean comprobacion = false;
		char inicial, inicialEnemiga = 'X', inicialJugador = 'O';
		jugador listaJugadores[] = new jugador[numJugadores];
		Imprimir imp1 = new Imprimir();
		Jugabilidad jb1 = new Jugabilidad();
		Util ut1 = new Util();
		
		for (int i = 0; i < listaJugadores.length; i++) { // Crea una lista de jugadores
			if (i < uno) {
				inicial = inicialJugador;//Se eligen las iniciales
			} else { 
				inicial = inicialEnemiga;
			}
			listaJugadores[i] = new jugador(inicial, false);
		}
		/*jb1.generarTurnoInicial();//Se genera el turno aleatoriamente si el número aleatorio >5 empezamos si no empieza el enemigo
		System.out.println("Eligiendo aleatoriamente el primer turno");*/
		

		if (jb1.isTurno()) { // LLama al metodo para comprobar quien empieza
			while (listaJugadores[0].getVictoria() == false && listaJugadores[1].getVictoria() == false) {//
				imp1.imprimirmapaVacio(ut1);
				
				comprobacion = false;
				if (turno % 2 == cero) {// Si comenzamos nosotros tendremos los turnos pares
					if (turno < uno) {
						System.out.println("Comenzarás tú");// La primera vez sale un mensaje diferente
					} else {//Este else se ejecutará cada vez que no sea la primera vez que se ejecuta
						System.out.println("Tu turno");// Se indica al usuario que empieza el
					}
					while (comprobacion == false) {//Hace que se repita si intentas superponer valores
						System.out.println("Introduce una posicion del 1 al 9");// Se introduce donde debe ir la ficha
						elecciones = Leer.datoInt();
						if (jb1.comprobarRepetir(ut1, listaJugadores, elecciones, cero)) {//Se comprueba si ese sitio ya tiene una ficha
							ut1.cambiarPosicion(elecciones, listaJugadores[0].getfichas());// Se cambia la posicion en el array inicial
							jb1.comprobarGanadorJugador(ut1, listaJugadores); //Comprueba si hemos ganado
							turno++;
							comprobacion = true;//Si cumple las condiciones se pasa a true para que no se vuelva a repetir
						} else {
							System.out.println("No hagas trampas debemos ganar limpiamente");//Mensaje si no se cumple
						}
					}
				} else {
					System.out.println("Le toca a tu contrincante");
					System.out.println("El enemigo está eligiendo posición...");
					while (comprobacion == false) {
						elecciones = jb1.generarTurnoRival();//Genera un numero aleatorio que será la posicion
						if (jb1.comprobarRepetir(ut1, listaJugadores, elecciones, uno)) {//Evita que se repita
							ut1.cambiarPosicion(elecciones, listaJugadores[1].getfichas());//Cambia la array inicial
							jb1.comprobarGanadorEnemigo(ut1, listaJugadores);//Comprueba si has ganado
							turno++;
							comprobacion = true;
						} else {
							System.out.println("El enemigo está intentando hacer trampas y no se lo has permitido");
						}
					}
				}
			}

		} else {
			while (listaJugadores[0].getVictoria() == false && listaJugadores[1].getVictoria() == false) {
				imp1.imprimirmapaVacio(ut1);
				comprobacion = false;
				if (turno % 2 == cero) { // Lo mismo pero empezando el enemigo
					if (turno < uno) {
						System.out.println("Comenzará el enemigo");
					} else {
						System.out.println("Turno del enemigo");
					}
					System.out.println("El enemigo está eligiendo posición...");
					while (comprobacion == false) {
						elecciones = jb1.generarTurnoRival();
						if (jb1.comprobarRepetir(ut1, listaJugadores, elecciones, uno)) {
							ut1.cambiarPosicion(elecciones, listaJugadores[1].getfichas());
							jb1.comprobarGanadorEnemigo(ut1, listaJugadores);
							turno++;
							comprobacion = true;
						} else {
							System.out.println("Has impedido que el enemigo haga trampas y a elegido una nueva posicion");
						}
					}
				} else {
					System.out.println("Te toca");
					while (comprobacion == false) {
						System.out.println("Introduce una posicion del 1 al 9");
						elecciones = Leer.datoInt();
						if (jb1.comprobarRepetir(ut1, listaJugadores, elecciones, cero)) {
							ut1.cambiarPosicion(elecciones, listaJugadores[0].getfichas());
							jb1.comprobarGanadorJugador(ut1, listaJugadores);
							turno++;
							comprobacion=true;
						} else {
							System.out.println("No hagas trampas debemos ganar limpiamente");
						}
					}
				}
			}
		}
		imp1.imprimirmapaVacio(ut1);
		if (jb1.felicitar(listaJugadores)) {
			System.out.println("Felicidades has ganado");
		} else {
			System.out.println("El mal no puede ganar...");
		}

	}
}
