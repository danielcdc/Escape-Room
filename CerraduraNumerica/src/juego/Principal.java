package juego;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		
		
		//variables necesarias para el juego
		
		boolean derrota = false;
		boolean victoria = false;
		int res1 = 0, res2 = 0, res3 = 0;
		int op = 0, elec = 0;
		int cerradura[] = new int[7];
		int numerador[] = new int[9];
		boolean comprobadores[] = new boolean[9];
		
		/*for que rellena el array comprobadores que sirve para comprobar si el numero a sido
		ya insertado*/

		for (int i = 0; i < comprobadores.length; i++) {
			comprobadores[i] = false;
		}
		
		
		/*
		 *For que rellena el array numerador que contendra todos los numeros del programa 
		 */
		for (int i = 0; i < numerador.length; i++) {
			numerador[i] = i+1;
		}

		/*
		 * Imprime la cerradura numerica mediante el array cerradura
		 */
		do {
			System.out.println("[" + cerradura[0] + "]   " + "[" + cerradura[1] + "]");
			System.out.println("[" + cerradura[2] + "]" + "[" + cerradura[3] + "]" + "[" 
			+ cerradura[4] + "]");
			System.out.println("[" + cerradura[5] + "]   " + "[" + cerradura[6] + "]");

			System.out.println("�Que quieres hacer?");

			//un menu con un switch el cual permite varias opciones
			System.out.println("1.Insertar un número");
			System.out.println("2.Quitar un numero");
			System.out.println("3.Rendirte y salir mientras te escondes de tu vergüenza");

			
			op = Leer.datoInt();
			switch (op) {
			
			/*en este caso se imprime un pequeño ejemplo que indica el puesto de las cerradura*/
			case 1: 

				System.out.println("En que lugar quieres insertar 1 al 7");
				
				System.out.println("[" + numerador[0] + "]   " + "[" + numerador[1] + "]");
				System.out.println("[" + numerador[2] + "]" + "[" + numerador[3] + "]" + "[" 
				+ numerador[4] + "]");
				System.out.println("[" + numerador[5] + "]   " + "[" + numerador[6] + "]");


				op = Leer.datoInt();
				
				if (op > 0 && op <= 7) {
					elec = op - 1;
					System.out.println("Usted eligio el hueco " + op);
					
					if (cerradura[elec]==0) {
						
					//permite selecionar un numero del uno al nueve	

					System.out.println("Que numero quieres insertarle, 1 al 9");

					op = Leer.datoInt();
					
					//Este if hace que no te permita poner un numero superior o inferior

					if (op > 0 && op <= 9 ) {

						if (comprobadores[op] == false) {

							cerradura[elec] = op;

							comprobadores[op] = true;
						
						} else {
							System.out.println("No puedes colocar 2 veces el mismo numero");
						}

					} else {
						System.out.println("Numero no valido");
					}
						
					}else {
						System.out.println("No puedes colocar 2 veces en el mismo hueco");
					}
				} else {
					System.out.println("Numero no valido");
				}

				break;

			case 2: // el caso 2 sirve para borrar
				
				//imprime el array el cual indica los lugares del array para borrar

				System.out.println("En que lugar quieres borrar 1 al 7");
				System.out.println("[" + numerador[0] + "]   " + "[" + numerador[1] + "]");
				System.out.println("[" + numerador[2] + "]" + "[" + numerador[3] + "]" + "[" 
				+ numerador[4] + "]");
				System.out.println("[" + numerador[5] + "]   " + "[" + numerador[6] + "]");
				
				op = Leer.datoInt();
				
				//este if hara que el numero no pueda ser muy pequeño o grande
				
				if (op > 0 && op <= 7) {
					elec = op - 1;
					System.out.println("Usted eligio el hueco " + op);

					System.out.println("Se procedera a su borrado");
					
					comprobadores [cerradura[elec]] = false;

					cerradura[elec] = 0;

				} else {
					System.out.println("Numero no valido");
				}

				break;

			case 3:
				
				//Este ccaso hara que la variable derrota se vuelva true y asi perder
				derrota = true;
				break;

			}

			//aqui se multiplican las lineas para comprobar el resultado
			res1 = cerradura[0] * cerradura[2] * cerradura[5];
			res2 = cerradura[2] * cerradura[3] * cerradura[4];
			res3 = cerradura[1] * cerradura[4] * cerradura[6];
			
			
			/*este if comprueba si alguno de los resultados es 0 para impedir la posibilidad de
			victoria mediante los 0 iniciales*/
			if (res1 == 0 || res2 == 0 || res3 == 0 ) {

				res1 = 1;
				res2 = 2;
				res3 = 3;

			}
			
			
			//Este while no te dejara pasar hasta que los 3 multiplos sean iguales o hayas perdido
		} while (res1 != res2 && res1 != res3 || !derrota);
		
		//este if selecionara si ganaste o perdiste    
		if (derrota) {
			System.out.println("Perdedor");
		}else {
			victoria = true;
			System.out.println("Has Ganado");
			
		}
		
	}

}
