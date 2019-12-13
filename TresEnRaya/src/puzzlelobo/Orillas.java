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


	public void movimientoDerAIzq(String animal,Orillas listaOrillas[]) {
		int cero=0,uno=1,dos=2;
		boolean mostrarD=false,mostrarI=true;
		if(listaOrillas[cero].getListaAnimales()[cero].getNombre().equalsIgnoreCase(animal)) {
			listaOrillas[cero].getListaAnimales()[cero].setMostrar(mostrarD);
			listaOrillas[uno].getListaAnimales()[cero].setMostrar(mostrarI);
		}
		if(listaOrillas[cero].getListaAnimales()[uno].getNombre().equalsIgnoreCase(animal)){
			listaOrillas[cero].getListaAnimales()[uno].setMostrar(mostrarD);
			listaOrillas[uno].getListaAnimales()[uno].setMostrar(mostrarI);
		}
		if(listaOrillas[uno].getListaAnimales()[dos].getNombre().equalsIgnoreCase(animal)){
			listaOrillas[cero].getListaAnimales()[dos].setMostrar(mostrarD);
			listaOrillas[uno].getListaAnimales()[dos].setMostrar(mostrarI);
		}
	}
	
	public void movimientoIzqADer(String animal,Orillas listaOrillas[]) {
		int cero=0,uno=1,dos=2;
		boolean mostrarD=true,mostrarI=false;
		if(listaOrillas[uno].getListaAnimales()[cero].getNombre().equalsIgnoreCase(animal)) {
			listaOrillas[uno].getListaAnimales()[cero].setMostrar(mostrarI);
			listaOrillas[cero].getListaAnimales()[cero].setMostrar(mostrarD);
		} 
		if(listaOrillas[uno].getListaAnimales()[uno].getNombre().equalsIgnoreCase(animal)) {
			listaOrillas[uno].getListaAnimales()[uno].setMostrar(mostrarI);
			listaOrillas[cero].getListaAnimales()[uno].setMostrar(mostrarD);
		}
		if (listaOrillas[uno].getListaAnimales()[dos].getNombre().equalsIgnoreCase(animal)){
			listaOrillas[uno].getListaAnimales()[dos].setMostrar(mostrarI);
			listaOrillas[cero].getListaAnimales()[dos].setMostrar(mostrarD);
		}
	}
	
	
	
}
