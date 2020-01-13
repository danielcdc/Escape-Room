package controller;

import crud.CrudJuegoBotella;
import model.ModelJuegoBotella;
import utilidades.Leer;
import vista.VistaJuegoBotella;

public class ControllerJuegoBotella {

	// Selecciona la botella que desea vaciar y la devuelve.
	public int chooseBottle(ModelJuegoBotella m, VistaJuegoBotella v) {
		int op;
		boolean out = false;
		op = Leer.datoInt();
		do {
			switch (op) {
			case 1:// Elige vaciar la botella A
				if (checkIsEmpty(m.getD().getBotella10())) {
					v.alreadyEmpty();
					op = Leer.datoInt();
				}	
				else
					out = true;
				break;
			case 2:// Elige vaciar la botella B
				if(checkIsEmpty(m.getD().getBotella7())){
					v.alreadyEmpty();
					op = Leer.datoInt();
				}
				else
				out = true;
				break;
			case 3:// Elige vaciar la botella C
				if(checkIsEmpty(m.getD().getBotella3())){
					v.alreadyEmpty();
					op = Leer.datoInt();
				}
				else
				out = true;
				break;
			default:
				v.notValidValue();
			}
		} while (!out);
		return op;
	}
	
	// Comprueba si la botella seleccionada está vacía y 
	// evita su selección. (No se puede vaciar algo ya vacío)
	public boolean checkIsEmpty(int bottle) {
		int cero = 0;
		if (bottle == cero)
			return true;
		else
			return false;
	}
	// Seleccionar la botella donde se desea verter el agua.
		public void pourWater(int choice, VistaJuegoBotella v, ModelJuegoBotella m, CrudJuegoBotella crud) {
			int op;
			int uno = 1, dos = 2, tres = 3;
			if (choice == uno) {
				v.showEmptyBottleA();
				op = Leer.datoInt();
				switch (op) {
				case 1:// Vertimos el contenido de la botella A en la botella B
					crud.transferAToB(m);
					break;
				case 2: // Vertimos el contenido de la botella A en la botella C
					crud.transferAToC(m);
					break;
				case 3:
					break;
				default:
					v.notValidValue();
				}
			}
			if (choice == dos) {
				v.showEmptyBottleB();
				op = Leer.datoInt();
				switch (op) {
				case 1:
					crud.transferBToA(m);
					break;
				case 2:
					crud.transferBToC(m);
					break;
				case 3:
					break;
				default:
					v.notValidValue();

				}
			}
			if (choice == tres) {
				v.showEmptyBottleC();
				op = Leer.datoInt();
				switch (op) {
				case 1:
					crud.transferCToA(m);
					break;
				case 2:
					crud.transferCToB(m);
					break;
				case 3:
					break;
				default:
					v.notValidValue();

				}
			}

		}
}
