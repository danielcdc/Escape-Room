package minijuego;
import datos.Datos;
import vista.VistaJuegoBotella;
import controller.ControllerJuegoBotella;
import model.ModelJuegoBotella;
import crud.CrudJuegoBotella;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instanciamos los elementos componentes del juego.
		Datos d = new Datos();
		VistaJuegoBotella v = new VistaJuegoBotella(); 
		ControllerJuegoBotella c = new ControllerJuegoBotella();
		ModelJuegoBotella m = new ModelJuegoBotella(d);
		CrudJuegoBotella crud = new CrudJuegoBotella();
		
		//Check methods
		
		//Print methods
		/*
		v.showBottles(m.getD());// Imprime el estado de las botellas por pantalla.
		v.showEmpty();// Muestra las botellas que puede vaciar el usuario.
		v.showEmptyBottleA();// Muestra dónde puede vaciar la botella A.
		v.showEmptyBottleB();// Muestra dónde puede vaciar la botella B.
		v.showEmptyBottleC();// Muestra dónde puede vaciar la botella C.
		v.printVictory();*/
		
		//Game
		
		m.ejecutarJuegoBotella(d, c, v, crud, m);
		
	}

}
