package tresenraya;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numJugadores = 2, contadorTurnos = 0, turno = 0, elecciones=0;
		int cero=0,uno=1;
		boolean comprobacion=false;
		char inicial, inicialEnemiga = 'X',inicialJugador='O';
		jugador listaJugadores[] = new jugador[numJugadores];
		Imprimir imp1 = new Imprimir();
		Jugabilidad jb1 = new Jugabilidad();
		Util ut1 = new Util();

		for (int i = 0; i < listaJugadores.length; i++) { // Crea una lista de jugadores
			if (i < uno) {
				inicial=inicialJugador;
			} else { // "Se elige automaticamente la inicial del enemigo"
				inicial = inicialEnemiga;
			}
			listaJugadores[i] = new jugador(inicial, false);
		}
		jb1.generarTurnoInicial();
		System.out.println("Eligiendo aleatoriamente el primer turno");

		if (jb1.isTurno()) { // LLama al metodo para comprobar quien empieza
			do {
				imp1.imprimirmapaVacio(ut1);
				comprobacion=false;
				if (turno % 2 == cero) {// Si comenzamos nosotros tendremos los turnos pares
					if (contadorTurnos < uno) {
						System.out.println("Comenzarás tú");// La primera vez sale un mensaje diferente
						contadorTurnos++;
					} else {
						System.out.println("Tu turno");// Se indica al usuario que empieza el
					}
					while(comprobacion==false){
						System.out.println("Introduce una posicion del 1 al 9");// Se introduce donde debe ir la ficha
						elecciones = Leer.datoInt();
						if(jb1.comprobarRepetir(ut1, listaJugadores, elecciones, cero)) {
							System.out.println("No hagas trampas debemos ganar limpiamente");
						}else {
							ut1.cambiarPosicion(elecciones, listaJugadores[0].getfichas());// Se cambia la posicion en el array
							jb1.comprobarGanadorJugador(ut1, listaJugadores);																// inicial
							turno++;
							comprobacion=true;
						}
					}
				} else {
					System.out.println("Le toca a tu contrincante");
					System.out.println("El enemigo está eligiendo posición...");
					while(comprobacion==false) {
						elecciones=jb1.generarTurnoRival();	
						if(jb1.comprobarRepetir(ut1, listaJugadores, elecciones, uno)) {
							System.out.println("El enemigo está intentando hacer trampas y no se lo has permitido");
						}else {
							ut1.cambiarPosicion(elecciones, listaJugadores[1].getfichas());																	
							jb1.comprobarGanadorEnemigo(ut1, listaJugadores);																			
							turno++;
							comprobacion=true;
						}
					}
				}
			} while (listaJugadores[0].getVictoria() == false || listaJugadores[1].getVictoria() == false);

		} else {
			do {
				imp1.imprimirmapaVacio(ut1);
				comprobacion=false;
				if (turno % 2 == cero) { // Lo mismo pero empezando el enemigo
					if (contadorTurnos < uno) {
						System.out.println("Comenzarás el enemigo");
						contadorTurnos++;
					} else {
						System.out.println("Turno del enemigo");
					}
					System.out.println("El enemigo está eligiendo posición...");
					while(comprobacion==false) {
						elecciones=jb1.generarTurnoRival();
						if(jb1.comprobarRepetir(ut1, listaJugadores, elecciones, uno)) {
							System.out.println("Has impedido que el enemigo haga trampas");
						}else {
						ut1.cambiarPosicion(elecciones, listaJugadores[1].getfichas());
						jb1.comprobarGanadorEnemigo(ut1, listaJugadores);
						turno++;
						comprobacion=true;
						}
					}
				} else {
					System.out.println("Te toca");
					while(comprobacion=false) {
						System.out.println("Introduce una posicion del 1 al 9");
						elecciones = Leer.datoInt();
						if(jb1.comprobarRepetir(ut1, listaJugadores, elecciones, cero)) {
							System.out.println("No hagas trampas debemos ganar limpiamente");
						}else {
							ut1.cambiarPosicion(elecciones, listaJugadores[0].getfichas());
							jb1.comprobarGanadorJugador(ut1, listaJugadores);
							turno++;
						}
					}
				}
			} while (listaJugadores[0].getVictoria() == false || listaJugadores[1].getVictoria() == false);
			}
		if(jb1.felicitar(listaJugadores)) {
			System.out.println("Felicidades has ganado");
		}else {
			System.out.println("El mal no puede ganar...");
		}

	}
}
