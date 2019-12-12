package puzzlelobo;

public class Orillas {
		private Animales listaAnimales[];
	
		
	public Orillas(Animales[] listaAnimales) {
			super();
			this.listaAnimales = listaAnimales;
		}

	
	public Orillas() {
		super();
	}
	

	public Animales[] getListaAnimales() {
		return listaAnimales;
	}


	public void setListaAnimales(Animales[] listaAnimales) {
		this.listaAnimales = listaAnimales;
	}


	public void movimientoDerAIzq(String animal,int numAnimal,Orillas listaOrillas[]) {
		int cero=0,uno=1;
		boolean mostrarD=false,mostrarI=true;
		if(listaOrillas[cero].getListaAnimales()[numAnimal].getNombre().equalsIgnoreCase(animal)) {
			listaOrillas[cero].getListaAnimales()[numAnimal].setMostrar(mostrarD);
			listaOrillas[uno].getListaAnimales()[numAnimal].setMostrar(mostrarI);
		}
	}
	
	public void movimientoIzqADer(String animal,int numAnimal,Orillas listaOrillas[]) {
		int cero=0,uno=1;
		boolean mostrarD=true,mostrarI=false;
		if(listaOrillas[uno].getListaAnimales()[numAnimal].getNombre().equalsIgnoreCase(animal)) {
			listaOrillas[uno].getListaAnimales()[numAnimal].setMostrar(mostrarI);
			listaOrillas[cero].getListaAnimales()[numAnimal].setMostrar(mostrarD);
		}
	}
	
	
	
}
