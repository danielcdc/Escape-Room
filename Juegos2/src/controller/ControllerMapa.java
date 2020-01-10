package controller;

import datos.Datos;
import model.ModelMapa;
import utilidades.EsperaAlJugador;
import utilidades.Leer;
import vista.VistaInventario;

public class ControllerMapa {
	
	 public void encontrarP(char[][] mapa, ModelMapa m1) {
		 for (int i = 0; i < mapa.length; i++) {
			    for (int j = 0; j < mapa[i].length; j++) {
				if (mapa[i][j] == 'P' || mapa[i][j] == '?' || mapa[i][j] == '!') {
				    m1.getD().setVertic(i);
				    m1.getD().setHoriz(j);
				}
			    }
			}
	 }
	 
	 
	
	 public char[][] moverJugador(String mov, char[][] mapa, ModelMapa m1) {
			String izq = "a", derech = "d", delant = "w", atras = "s", inst = "m"; //ale
			char mes= '█', paredVert='║', paredHoriz='═', puert = '/', pizz='▓';

			encontrarP(mapa, m1);
			
			if(mapa[m1.getD().getVertic()][m1.getD().getHoriz()] == 'P') {

				if (mov.equalsIgnoreCase(izq)) {
				    if (mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != paredVert && mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != paredHoriz &&
					    mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != mes &&  mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != puert) {
					mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setHoriz(m1.getD().getHoriz()-1);

				    }
				}

				if (mov.equalsIgnoreCase(derech)) {
				    if (mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != paredVert && mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != paredHoriz &&
					    mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != mes &&  mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != puert) {
					mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setHoriz(m1.getD().getHoriz()+1);
				    }
				}

				if (mov.equalsIgnoreCase(delant)) {
				    if (mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != paredVert && mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != paredHoriz &&
					    mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != mes &&  mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != puert && mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != pizz) {
					mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setVertic(m1.getD().getVertic()+1);
				    }
				}

				if (mov.equalsIgnoreCase(atras)) {
				    if (mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != paredVert && mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != paredHoriz &&
					    mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != mes &&  mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != puert) {
					mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setVertic(m1.getD().getVertic()-1);
				    }
				}
			
			}
			
			if(mapa[m1.getD().getVertic()][m1.getD().getHoriz()] == '?' || mapa[m1.getD().getVertic()][m1.getD().getHoriz()] == '!') {
				
				if (mov.equalsIgnoreCase(izq)) {
				    if (mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != paredVert && mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != paredHoriz &&
					    mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != mes &&  mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != puert) {
					mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setHoriz(m1.getD().getHoriz()-1);

				    }
				}

				if (mov.equalsIgnoreCase(derech)) {
				    if (mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != paredVert && mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != paredHoriz &&
					    mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != mes &&  mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != puert) {
					mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setHoriz(m1.getD().getHoriz()+1);
				    }
				}

				if (mov.equalsIgnoreCase(delant)) {
				    if (mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != paredVert && mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != paredHoriz &&
					    mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != mes &&  mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != puert && mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != pizz) {
					mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setVertic(m1.getD().getVertic()+1);
				    }
				}

				if (mov.equalsIgnoreCase(atras)) {
				    if (mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != paredVert && mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != paredHoriz &&
					    mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != mes &&  mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != puert) {
					mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] = 'P';
					mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
					m1.getD().setVertic(m1.getD().getVertic()-1);
				    }
				}
				
				
				
				
			}

			return mapa;

		    }

}
