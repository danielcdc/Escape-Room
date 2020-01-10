package vista;
import datos.Datos;

public class VistaJuegoBotella {
	
	public void mostrarBotellas(Datos d) {
		System.out.println("[" + d.getBotella10() + "]" + "[" + d.getBotella7() + "]" + "[" + d.getBotella3() + "]");
	}
}
