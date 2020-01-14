package juego;
import datos.Datos;
import model.ModelJCerradura;
import vista.VistaJCerradura;
import controller.ControllerJCerradura;
import crud.CrudJCerradura;

public class Pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Datos d = new Datos();
		ModelJCerradura m = new ModelJCerradura();
		CrudJCerradura c = new CrudJCerradura();
		VistaJCerradura v= new VistaJCerradura();
		ControllerJCerradura o= new ControllerJCerradura();
		m.IniciarJuegoCerradura(d, c, v, o);
		
	
		
	}

}
