package entregalobo;

import java.util.Arrays;

import puzzlelobo.Animales;
import puzzlelobo.Orillas;

public class ModelOrillas {
	
	 class Orillas {
			private  ModelAnimales listaAnimales[];
		
			
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
		public void setListaAnimalesPos(int i) {
			listaAnimales[i].setMostrar(true);
		}


		@Override
		public String toString() {
			return "Orillas [listaAnimales=" + Arrays.toString(listaAnimales) + "]";
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
			String nada="nada";
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
			if(nada.equalsIgnoreCase(animal)) {
				
			}
		}
		public boolean comprobarDerrota(Orillas listaOrillas[],int i) {
			int cero=0,uno=1,dos=2;
			boolean ganar=false;
			if(listaOrillas[i].getListaAnimales()[cero].isMostrar()==false && listaOrillas[i].getListaAnimales()[uno].isMostrar() && listaOrillas[i].getListaAnimales()[dos].isMostrar()) {
				ganar=false;
			}else if(listaOrillas[i].getListaAnimales()[dos].isMostrar()==false && listaOrillas[i].getListaAnimales()[cero].isMostrar() && listaOrillas[i].getListaAnimales()[uno].isMostrar()) {
				ganar=false;
			}else {
				ganar=true;
			}
			return ganar;
		}
		public void esperar() throws InterruptedException{
			System.out.println("Cargando...");
			Thread.sleep(500);
		}
	 }		
}
