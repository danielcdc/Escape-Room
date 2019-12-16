package juego;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {

		int res1 = 0, res2 = 0, res3 = 0;
		int op = 0, elec = 0;
		int cerradura[] = new int[7];
		int numerador[] = new int[9];
		boolean comprobadores[] = new boolean[9];

		for (int i = 0; i < comprobadores.length; i++) {
			comprobadores[i] = false;
		}
		
		for (int i = 0; i < numerador.length; i++) {
			numerador[i] = i+1;
		}

		do {
			System.out.println("[" + cerradura[0] + "]   " + "[" + cerradura[1] + "]");
			System.out.println("[" + cerradura[2] + "]" + "[" + cerradura[3] + "]" + "[" 
			+ cerradura[4] + "]");
			System.out.println("[" + cerradura[5] + "]   " + "[" + cerradura[6] + "]");

			System.out.println("¿Que quieres hacer?");

			System.out.println("1.Insertar un numero");
			System.out.println("2.Quitar un numero");
			System.out.println("3.Rendirte y salir mientras te escondes de tu verguenza");

			op = Leer.datoInt();
			switch (op) {

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

					System.out.println("Cual numero quieres insertarle, 1 al 9");

					op = Leer.datoInt();

					if (op > 0 && op <= 9) {

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

			case 2:

				System.out.println("En que lugar quieres borrar 1 al 7");
				System.out.println("[" + numerador[0] + "]   " + "[" + numerador[1] + "]");
				System.out.println("[" + numerador[2] + "]" + "[" + numerador[3] + "]" + "[" 
				+ numerador[4] + "]");
				System.out.println("[" + numerador[5] + "]   " + "[" + numerador[6] + "]");
				
				op = Leer.datoInt();
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
				break;

			}

			res1 = cerradura[0] * cerradura[2] * cerradura[5];
			res2 = cerradura[2] * cerradura[3] * cerradura[4];
			res3 = cerradura[1] * cerradura[4] * cerradura[6];

			if (res1 == 0 || res2 == 0 || res3 == 0) {

				res1 = 1;
				res2 = 2;
				res3 = 3;

			}

		} while (res1 != res2 && res1 != res3);

		System.out.println("Has Ganado");
	}

}
