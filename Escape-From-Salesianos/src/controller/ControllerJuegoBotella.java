package controller;

import crud.CrudJuegoBotella;
import model.ModelJuegoBotella;
import utilidades.Leer;
import vista.VistaJuegoBotella;
import vista.VistaPruebas;

public class ControllerJuegoBotella {

	// Selecciona la botella que desea vaciar y la devuelve.
	public int chooseBottle(ModelJuegoBotella m, VistaPruebas v) {
		int op = 0;
		String choose;
		boolean out = false;
		choose = Leer.dato();
		do {
			if(choose.equalsIgnoreCase("1")) {// Elige vaciar la botella A
				if (checkIsEmpty(m.getD().getBotella10())) {
					v.alreadyEmpty();
					op = Leer.datoInt();
				}	
				else
					op = 1;
					out = true;
			}
			
			if(choose.equalsIgnoreCase("2")) {
			// Elige vaciar la botella B
				if(checkIsEmpty(m.getD().getBotella7())){
					v.alreadyEmpty();
					op = Leer.datoInt();
				}
				else
					op = 2;
					out = true;
			}
			if(choose.equalsIgnoreCase("3")) {
			// Elige vaciar la botella C
				if(checkIsEmpty(m.getD().getBotella3())){
					v.alreadyEmpty();
					op = Leer.datoInt();
				}
				else
					op = 3;
					out = true;
			}
			
			if(!choose.equalsIgnoreCase("1") && !choose.equalsIgnoreCase("2") && !choose.equalsIgnoreCase("3"))
				v.notValidValue();
	
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
		public void pourWater(int choice, VistaPruebas v, ModelJuegoBotella m, CrudJuegoBotella crud) {
			String choose;
			int uno = 1, dos = 2, tres = 3;
			if (choice == uno) {
				v.showEmptyBottleA();
				choose = Leer.dato();
			
				if(choose.equalsIgnoreCase("1")) 
			// Vertimos el contenido de la botella A en la botella B
					crud.transferAToB(m);
				
				if(choose.equalsIgnoreCase("2"))
			// Vertimos el contenido de la botella A en la botella C
					crud.transferAToC(m);
				
				if(choose.equalsIgnoreCase("3")) {
				
				
					}
			
				if(!choose.equalsIgnoreCase("1") && !choose.equalsIgnoreCase("2") && !choose.equalsIgnoreCase("3")) {
					v.opcionvalida();
					v.notValidValue();
				}
			}
			
			if (choice == dos) {
				v.showEmptyBottleB();
				choose = Leer.dato();
			
				if(choose.equalsIgnoreCase("1")) 
			// Vertimos el contenido de la botella A en la botella B
					crud.transferBToA(m);
				
				if(choose.equalsIgnoreCase("2"))
			// Vertimos el contenido de la botella A en la botella C
					crud.transferBToC(m);
				
				if(choose.equalsIgnoreCase("3")) {
				
				
				}
			
				if(!choose.equalsIgnoreCase("1") && !choose.equalsIgnoreCase("2") && !choose.equalsIgnoreCase("3")) {
					v.opcionvalida();
					v.notValidValue();
				}
			}
			
			if (choice == tres) {
				v.showEmptyBottleC();
				choose = Leer.dato();
			
				if(choose.equalsIgnoreCase("1")) 
			// Vertimos el contenido de la botella A en la botella B
					crud.transferCToA(m);
				
				if(choose.equalsIgnoreCase("2"))
			// Vertimos el contenido de la botella A en la botella C
					crud.transferCToB(m);
				
				if(choose.equalsIgnoreCase("3")) {
				
				
				}
			
				if(!choose.equalsIgnoreCase("1") && !choose.equalsIgnoreCase("2") && !choose.equalsIgnoreCase("3")) {
					v.opcionvalida();
					v.notValidValue();
				}
			}

		}
}
