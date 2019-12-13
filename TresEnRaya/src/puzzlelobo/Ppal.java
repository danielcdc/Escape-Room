package puzzlelobo;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		int dos = 2, turno = 0, cero = 0, tres = 3,uno=1;
		boolean victoria = false;
		String animal;
		String lobo = "lobo", oveja = "oveja", lechuga = "lechuga";
		Animales listaAnimales[] = { new Animales(lobo, true), new Animales(oveja, true),
				new Animales(lechuga, true) };
		Animales listaAnimales1[] = { new Animales(lobo, false), new Animales(oveja, false),
				new Animales(lechuga, false) };
		Orillas listaOrillas[] = { new Orillas(listaAnimales), new Orillas(listaAnimales1) };
	
		
		while (listaOrillas[cero].getListaAnimales()[cero].isMostrar()|| listaOrillas[cero].getListaAnimales()[uno].isMostrar()|| listaOrillas[cero].getListaAnimales()[dos].isMostrar()) {
			if(turno % dos==cero) {
				System.out.println("Estamos en la orilla derecha:");
				System.out.println();
				for(int i=0;i<tres;i++) {
					if(listaOrillas[cero].getListaAnimales()[i].isMostrar()){
						System.out.println(listaOrillas[cero].getListaAnimales()[i].getNombre());
					}
				}
				
				System.out.println("¿Que quieres mover a la otra orilla?");
				animal=Leer.dato();
				listaOrillas[cero].movimientoDerAIzq(animal, listaOrillas);
				if(!listaOrillas[cero].comprobarDerrota(listaOrillas, cero)) {
					listaOrillas[cero].getListaAnimales()[cero].setMostrar(false);
					listaOrillas[cero].getListaAnimales()[uno].setMostrar(false);
					listaOrillas[cero].getListaAnimales()[dos].setMostrar(false);
					victoria=false;
				}else {
					victoria=true;
				}
				listaOrillas[cero].esperar();
				turno++;
			}else {
				System.out.println("\n\n\n\n\nNos encontramos en la orilla izquierda:");
				for(int i=0;i<tres;i++) {
					if(listaOrillas[uno].getListaAnimales()[i].isMostrar()){
						System.out.println(listaOrillas[uno].getListaAnimales()[i].getNombre());
					}
				}
				System.out.println("¿Que quieres mover a la otra orilla?\n\n");
				animal=Leer.dato();
				listaOrillas[uno].movimientoDerAIzq(animal, listaOrillas);
				listaOrillas[uno].esperar();
				if(!listaOrillas[uno].comprobarDerrota(listaOrillas, uno)) {
					listaOrillas[cero].getListaAnimales()[cero].setMostrar(false);
					listaOrillas[cero].getListaAnimales()[uno].setMostrar(false);
					listaOrillas[cero].getListaAnimales()[dos].setMostrar(false);
					victoria=false;
				}else {
					victoria=true;
				}
				turno++;
			}
		}
		if(victoria==true) {
		System.out.println("\n\n\n\nFelicidades has ganado");
		}else {
			System.out.println("\n\n\n\nHas perdido");
		}
	}

}
