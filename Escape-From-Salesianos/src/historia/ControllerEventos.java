package historia;
import model.*;

public class ControllerEventos {
	/*
	 * La historia se desarrolla en 6 fases diferencias: una por cada juego.
	 * Esta avanzará según se vaya completando con éxito los juegos.
	 */
	
	//Este atributo lleva la cuenta de la fase en la que nos encontramos actualmente. 
	private static int fase;
	
	//Constructor
	ControllerEventos(){
		fase = 1; //El juego comienza por la fase 1.
	}
	//Getters y Setters 

	public static int getFase() {
		return fase;
	}

	public static void setFase(int fase) {
		ControllerEventos.fase = fase;
	}
	
	/*
	 * Métodos: comprueban si los juegos se han superado y pasan a la siguiente fase.
	 * Además, desactivan el juego superado para que este no se vuelva a ejecutar. 
	 * Estos métodos deben ser llamados por los métodos que comprueben 
	 */
	
	//Comprueba si se ha superado el juego de la Pizarra.
	public void checkPhase1(ModelJugador j1) {
		if(fase == 1 && j1.isVictoria()) {
			fase++;
		}	//Falta añadir a la clase Modelo correspondiente un atributo que indique si el juego está activo o no, de tal forma que en este paso se pueda "desactivar".
	}
	
	//Comprueba si se ha superado el juego del Granjero.
	public void checkPhase2() {// Hay que pasarle como parámetro una instancia de la clase Modelo correspondiente al juego.
		if(fase == 2) {//Falta añadir si hay victoria.
			fase++;
		}
	}
	
	//Obtiene el soplete tras abrir la puerta. 
	public void checkPhase3() {// Hay que pasarle como parámetro el inventario del jugador.
		if(fase == 3) {
			fase++;
		}
	}
	
	//
}
