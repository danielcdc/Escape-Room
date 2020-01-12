package minijuego;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int botella10 = 10;
		int botella7 = 0;
		int botella3 = 0;

		int limite10 = 10;
		int limite7 = 7;
		int limite3 = 3;

		int op = 0;

		do {

			System.out.println("[" + botella10 + "]" + "[" + botella7 + "]" + "[" + botella3 + "]");

			System.out.println("Pulsa cual quieres vertir 1.botella A, 2.Botella B y " + "3.Botella C");

			op = Leer.datoInt();

			switch (op) {

			// comienza la botella 10

			case 1:

				System.out.println("�En cual la quieres vertir? 1.Botella B , 2.Botella C " + "3.Volver atras");

				op = Leer.datoInt();
				switch (op) {

				// vertir en botella B
				case 1:
					
					if (botella10 >= botella7) {//Hay más agua en A que en B

						if (botella10 + botella7 > limite7) {// Si la suma de A + B es superior al límite de B.

							botella10 = botella10 - (limite7 - botella7);

							botella7 = limite7;

						} else {

							botella7 = botella10 + botella7;
							botella10 = 0;

						}
					}
					// Corrige el desborde 
					if (botella10 < botella7) {

						if (botella10 + botella7 > limite7) {

							botella10 = botella10 - (limite7 - botella7);

							botella7 = limite7;

						} else {

							botella7 = botella10 + botella7;
							botella10 = 0;
						}
					}

					break;

				// vertir en botella c
				case 2:

					if (botella10 >= botella3) {

						if (botella10 + botella3 > limite3) {

							botella10 = botella10 - (limite3 - botella3);

							botella3 = limite3;

						} else {

							botella3 = botella10 + botella3;
							botella10 = 0;

						}
					}

					if (botella10 < botella3) {

						if (botella10 + botella3 > limite3) {

							botella10 = botella10 - (limite3 - botella3);

							botella3 = limite3;

						} else {

							botella3 = botella10 + botella3;
							botella10 = 0;
						}
					}

					break;

				case 3:
					break;

				}

				break;

			// empezamos con la botella 7
			case 2:

				System.out.println("�En cual la quieres vertir? 1.Botella A , 2.Botella C " + "3.Volver atras");

				op = Leer.datoInt();
				switch (op) {

				// vertir en botella A
				case 1:

					if (botella7 >= botella10) {

						if (botella7 + botella10 > limite10) {

							botella7 = botella7 - (limite10 - botella10);

							botella10 = limite10;

						} else {

							botella10 = botella7 + botella10;
							botella7 = 0;

						}
					}

					if (botella7 < botella10) {

						if (botella7 + botella10 > limite10) {

							botella7 = botella7 - (limite10 - botella10);

							botella10 = limite10;

						} else {

							botella10 = botella7 + botella10;
							botella7 = 0;
						}
					}

					break;

				// vertir en botella c

				case 2:

					if (botella7 >= botella3) {

						if (botella7 + botella3 > limite3) {

							botella7 = botella7 - (limite3 - botella3);

							botella3 = limite3;

						} else {

							botella3 = botella7 + botella3;
							botella7 = 0;

						}
					}

					else {

						if (botella7 + botella3 > limite3) {

							botella7 = botella7 - (limite3 - botella3);

							botella3 = limite3;

						} else {

							botella3 = botella7 + botella3;
							botella7 = 0;
						}
					}

					break;

				case 3:
					break;

				}

				break;

			// comenzando por la botella c

			case 3:

				System.out.println("�En cual la quieres vertir? 1.Botella A , 2.Botella B " + "3.Volver atras");

				op = Leer.datoInt();
				switch (op) {

				// vertir en botella a
				case 1:

					if (botella3 >= botella10) {

						if (botella3 + botella10 > limite10) {

							botella3 = botella3 - (limite10 - botella10);

							botella10 = limite10;

						} else {

							botella10 = botella3 + botella10;
							botella3 = 0;

						}
					}

					if (botella3 < botella10) {

						if (botella3 + botella10 > limite10) {

							botella3 = botella3 - (limite10 - botella10);

							botella10 = limite10;

						} else {

							botella10 = botella3 + botella10;
							botella3 = 0;
						}
					}

					break;

				// vertir en botella b
				case 2:

					if (botella3 >= botella7) {

						if (botella3 + botella7 > limite7) {

							botella3 = botella3 - (limite7 - botella7);

							botella7 = limite7;

						} else {

							botella7 = botella3 + botella7;
							botella3 = 0;

						}
					}

					if (botella3 < botella7) {

						if (botella3 + botella7 > limite7) {

							botella3 = botella3 - (limite7 - botella7);

							botella7 = limite7;

						} else {

							botella7 = botella10 + botella7;
							botella3 = 0;
						}
					}

					break;

				case 3:
					break;

				}

				break;

			}

		} while (botella10 != 5 || botella7 != 5);

		System.out.println("Has ganado");

	}

}
