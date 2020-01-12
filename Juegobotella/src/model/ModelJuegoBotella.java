package model;

import controller.ControllerJuegoBotella;
import crud.CrudJuegoBotella;
import datos.Datos;
import vista.VistaJuegoBotella;

public class ModelJuegoBotella {
	// Atributos
	private Datos d;

	// Constructor (incialmente vacío)
	public ModelJuegoBotella(Datos d) {
		this.d = d;
	}

	// Inicia el juego. Este finaliza cuando se cumple la condición.
	public void ejecutarJuegoBotella(Datos d, ControllerJuegoBotella c, VistaJuegoBotella v, CrudJuegoBotella crud,
			ModelJuegoBotella m) {
		v.printInstructions();
		do {
			v.showBottles(d);
			v.showEmpty();
			int choice = c.chooseBottle(m, v);
			c.pourWater(choice, v, m, crud);
		} while (d.getBotella10() != 5 || d.getBotella7() != 5);// Condición para ganar la partida
		v.printVictory();
		Datos.fase += 1;
	}

	public Datos getD() {
		return d;
	}

	public void setD(Datos d) {
		this.d = d;
	}
}
