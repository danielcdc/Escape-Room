package puzzlelobo;

public class Orillas {

	
	
	public void moverseIzq(Animales listaAnimales[],int posicion) {
		if(listaAnimales[posicion].isMostrar()) {
			listaAnimales[posicion].setMostrar(false);
		}
	}
	public void moverseDere(Animales listaAnimales[],int posicion) {
		
	}
	public void mostrarEnIzq(Animales listaAnimales[],int posicion,Orillas listaOrillas[]) {
		int cero=0,uno=1,dos=2;
		if(listaAnimales[cero].isMostrar()) {
			System.out.println(listaAnimales[cero]);
		}
		if(listaAnimales[uno].isMostrar()) {
			System.out.println(listaAnimales[uno]);
		}
		if(listaAnimales[dos].isMostrar()) {
			System.out.println(listaAnimales[dos]);
		}
	}
	
	public void mostrarEnDere(Animales listaAnimales[],int posicion,Orillas listaOrillas[]) {
		int cero=0,uno=1,dos=2;
		if(listaAnimales[cero].isMostrar()) {
			System.out.println(listaAnimales[cero]);
		}
		if(listaAnimales[uno].isMostrar()) {
			System.out.println(listaAnimales[uno]);
		}
		if(listaAnimales[dos].isMostrar()) {
			System.out.println(listaAnimales[dos]);
		}
	}
}
