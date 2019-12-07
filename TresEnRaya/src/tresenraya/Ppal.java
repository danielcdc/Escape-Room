package tresenraya;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int numJugadores = 2, uno = 1,cero=0, contadorTurnos = 0, turno=0, elecciones;
		char inicial, inicialEnemiga = 'A';
		jugador listaJugadores[] = new jugador[numJugadores];
		Imprimir imp1 = new Imprimir();
		Jugabilidad jb1 = new Jugabilidad();
		Util ut1=new Util();
		/* imp1.crearMapaVacio(); */
		imp1.imprimirmapaVacio();

		for (int i = 0; i < listaJugadores.length; i++) { // Crea una lista de jugadores
			if (i < uno) {
				System.out.println("Introduce tu inicial");
				inicial = Leer.datoChar();
			} else { //"Se elige automaticamente la inicial del enemigo"
				inicial = inicialEnemiga;
			}
			listaJugadores[i] = new jugador(inicial, false);
		}
		jb1.generarTurnoInicial();
		System.out.println("Eligiendo aleatoriamente el primer turno");

		
			imp1.imprimirmapaVacio();//Se imprime siempre con la inicial que se modifica 
			if (jb1.isTurno()) { // LLama al metodo para comprobar quien empieza
				do {
				if(turno%2==cero) {//Si comenzamos nosotros tendremos los turnos pares
					if (contadorTurnos < uno) {
						System.out.println("Comenzarás tú");//La primera vez sale un mensaje diferente
						contadorTurnos++;
					} else {
						System.out.println("Tu turno");//Se indica al usuario que empieza el
					}
					System.out.println("Introduce una posicion del 1 al 9");//Se introduce donde debe ir la ficha 
					elecciones=Leer.datoInt();
					elecciones=elecciones-1;//Se le resta uno para acceder a lla posicion que realmente quería el usuario(se empieza desde 0)
					ut1.cambiarPosicion(elecciones, listaJugadores[0].getfichas());//Se cambia la posicion en el array inicial
					turno++;
				}else {
					System.out.println("Le toca a tu contrincante");
					ut1.cambiarPosicion(jb1.generarTurnoRival(), listaJugadores[1].getfichas());//Se genera aleatoriamente la posicion que modifica
					//Todavia no está modificada para que no pueda acceder a donde ya está ocupado
					turno++;
				}
				}while (listaJugadores[0].getVictoria() == false || listaJugadores[1].getVictoria() == false);

			} else {
				do {
				if(turno%2==cero) { //Lo mismo pero empezando el enemigo
					if (contadorTurnos < uno) {
						System.out.println("Comenzarás el enemigo");
						contadorTurnos++;
					} else {
						System.out.println("Turno del enemigo");
					}
					System.out.println("El enemigo está eligiendo posición...");
					ut1.cambiarPosicion(jb1.generarTurnoRival(), listaJugadores[1].getfichas());
					turno++;
				}else {
					System.out.println("Te toca");
					System.out.println("Introduce una posicion del 1 al 9");
					elecciones=Leer.datoInt();
					elecciones=elecciones-1;
					ut1.cambiarPosicion(elecciones, listaJugadores[0].getfichas());
					turno++;
				}
			}while (listaJugadores[0].getVictoria() == false || listaJugadores[1].getVictoria() == false);
		

	}

	}
}
