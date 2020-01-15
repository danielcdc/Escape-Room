package vista;

import model.Model3Raya;

public class VistaMapas {


	public void imprimirmapa3Raya(Model3Raya m1) { // Imprime el mapa con la posicion del array que le digamos
		int uno = 1, dos = 2, tres = 3, cuatro = 4, cinco = 5, seis = 6, siete = 7, ocho = 8, cero = 0;
		System.out.print("\t\t\t    ----------\n" + "\t\t\t    |" + m1.devolverUnaposicion(cero) + m1.devolverUnaposicion(cero) + "|"
				+ m1.devolverUnaposicion(uno) + m1.devolverUnaposicion(uno) + "|" + m1.devolverUnaposicion(dos)
				+ m1.devolverUnaposicion(dos) + "|\n" + "\t\t\t    |" + m1.devolverUnaposicion(cero)
				+ m1.devolverUnaposicion(cero) + "|" + m1.devolverUnaposicion(uno) + m1.devolverUnaposicion(uno)
				+ "|" + m1.devolverUnaposicion(dos) + m1.devolverUnaposicion(dos) + "|\n" + "\t\t\t    |--|--|--|\n" + "\t\t\t    |"
				+ m1.devolverUnaposicion(tres) + m1.devolverUnaposicion(tres) + "|" + m1.devolverUnaposicion(cuatro)
				+ m1.devolverUnaposicion(cuatro) + "|" + m1.devolverUnaposicion(cinco)
				+ m1.devolverUnaposicion(cinco) + "|\n" + "\t\t\t    |" + m1.devolverUnaposicion(tres)
				+ m1.devolverUnaposicion(tres) + "|" + m1.devolverUnaposicion(cuatro)
				+ m1.devolverUnaposicion(cuatro) + "|" + m1.devolverUnaposicion(cinco)
				+ m1.devolverUnaposicion(cinco) + "|\n" + "\t\t\t    |--|--|--|\n" + "\t\t\t    |" + m1.devolverUnaposicion(seis)
				+ m1.devolverUnaposicion(seis) + "|" + m1.devolverUnaposicion(siete) + m1.devolverUnaposicion(siete)
				+ "|" + m1.devolverUnaposicion(ocho) + m1.devolverUnaposicion(ocho) + "|\n" + "\t\t\t    |"
				+ m1.devolverUnaposicion(seis) + m1.devolverUnaposicion(seis) + "|" + m1.devolverUnaposicion(siete)
				+ m1.devolverUnaposicion(siete) + "|" + m1.devolverUnaposicion(ocho) + m1.devolverUnaposicion(ocho)
				+ "|\n" + "\t\t\t    ----------");
	}
	
	public void imprimirMapa(char[][] mapa) {
		for (int i = 0; i < mapa.length; i++) {
		    System.out.println();
		    for (int j = 0; j < mapa[i].length; j++) {
		    if(j == 0) {
		    	System.out.print("\t   ");
		    }
			System.out.print(mapa[i][j]);
		    }}
	}
	
	public void imprimirLetreroMapa() {
		System.out.println( "┌─── ─ ── ─ ─ ─ ─ ── ─ ───┐\n"
				           +"|       AULA 1º DAM       |\n"
						   +"└─────────────────────────┘\n");
	}

}
