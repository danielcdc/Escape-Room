package crud;
import datos.*;
public class CrudHerramientas {
	//Índice 0 Soplete
	//Índice 1 CD
	//Índice 2 Lupa
	
	public void adquirirHerramienta(Datos d, int indice) {//Añade una herramienta al inventario
		System.out.println("");
		d.getListaDeHerramientas()[1].setGuardado(true);
		//d.getListaDeHerramientas()[1];
	}
	public void UsarHerramienta( int indice) {//Usa una herramienta del inventario
		
	}
	
}
