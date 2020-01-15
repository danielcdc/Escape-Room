package model;

import datos.Datos;
import controller.ControllerJCerradura;
import crud.CrudJCerradura;
import vista.VistaJCerradura;

public class ModelJCerradura {
	
	// Atributos 
	private Datos d;
	private boolean victoria = false;
	
	// Método que inicia el juego.
	public void IniciarJuegoCerradura(Datos d, CrudJCerradura c, VistaJCerradura v, ControllerJCerradura o) {
		// Imprime las instrucciones y prepara el juego.
		v.intruciones();
		c.ponerAFalso(d);
		c.rellenarNumerador(d);
		// Ejecuta el juego propiamente.
		do {
			v.imprimirCerradura(d);
			v.imprimirMenuPrincipal();
			o.elegirOpcion(d, o, c, v);
			//o.evitarProductoNulo(d);

		} while (d.getRes1() != d.getRes2() && d.getRes1() != d.getRes3());
	}
	
	//Getters y Setters
	public Datos getD() {
		return d;
	}

	public void setD(Datos d) {
		this.d = d;
	}

	public boolean isVictoria() {
		return victoria;
	}

	public void setVictoria(boolean victoria) {
		this.victoria = victoria;
	}

	@Override
	public String toString() {
		return "ModelJCerradura [d=" + d + ", victoria=" + victoria + "]";
	}
		
}
