package puzzlelobo;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dos = 2, turno = 0, cero = 0, tres = 3,uno=1;
		boolean victoria = false;
		String animal;
		String lobo = "lobo", oveja = "oveja", lechuga = "lechuga";
		Animales listaAnimales[] = { new Animales(lobo, false), new Animales(oveja, false),
				new Animales(lechuga, false) };
		Orillas listaOrillas[] = { new Orillas(listaAnimales), new Orillas(listaAnimales) };

		System.out.println("Comenzaremos en la orilla derecha");
		listaOrillas[cero].getListaAnimales()[0].setMostrar(true);
		listaOrillas[cero].getListaAnimales()[1].setMostrar(true);
		listaOrillas[cero].getListaAnimales()[2].setMostrar(true);
		while (listaOrillas[cero].getListaAnimales()[cero].isMostrar()|| listaOrillas[cero].getListaAnimales()[uno].isMostrar()|| listaOrillas[cero].getListaAnimales()[dos].isMostrar()) {
			if(turno % dos==cero) {
				for(int i=0;i<tres;i++) {
					if(listaOrillas[cero].getListaAnimales()[i].isMostrar()){
						System.out.println(listaOrillas[cero].getListaAnimales()[i].getNombre());
					}
				}
				System.out.println("¿Que quieres mover a la otra orilla?");
				animal=Leer.dato();
				
			}else {
				System.out.println();
			}
		}
	}

}
