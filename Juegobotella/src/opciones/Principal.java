package opciones;

import utilidades.Leer;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int fin = 0, luismi = 0, rafa = 0, angel = 0;

		int op = 0;

		boolean victory = false;
		
		
		do {

		if (angel == 1 && rafa == 1 && luismi == 1) {

		victory = true;

		}else {

		System.out.println("Con quien quieres hablar:");
		System.out.println("1.Luismi, 2.Rafa, 3.Angél");
		op = Leer.datoInt();

		switch (op) {

		case 1:

			if (luismi == 0) {
				System.out.println("Luismi: Juega este minijuego");
				System.out.println("¿Ganastes? 1.Si, 2.No");
				op = Leer.datoInt();

				if (op == 1) {
					luismi = 1;
				}

			} else {
				System.out.println("No encontraste a luismi");
			}

			break;

		case 2:

			if (rafa == 0) {
				System.out.println("Rafa: Juega este minijuego");
				System.out.println("¿Ganastes? 1.Si, 2.No");
				op = Leer.datoInt();

				if (op == 1) {
					rafa = 1;
				}

			} else {
				System.out.println("No encontraste a Rafa");
			}

			break;

		case 3:

			if (angel == 0) {
				System.out.println("Angél: Juega este minijuego");
				System.out.println("¿Ganastes? 1.Si, 2.No");
				op = Leer.datoInt();

				if (op == 1) {
					angel = 1;
				}

			} else {
				System.out.println("No encontraste a Angél");
			}

		}
		}
		}while (victory==false);
		
		System.out.println("A la siguiente sala");
	}

}
