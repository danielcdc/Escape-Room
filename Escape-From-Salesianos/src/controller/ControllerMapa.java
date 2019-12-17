package controller;

import datos.Datos;
import model.ModelMapa;
import utilidades.Leer;

public class ControllerMapa {
	
	 public void encontrarP(char[][] mapa, ModelMapa m1) {
		 for (int i = 0; i < mapa.length; i++) {
			    for (int j = 0; j < mapa[i].length; j++) {
				if (mapa[i][j] == 'P') {
				    m1.getD().setVertic(i);
				    m1.getD().setHoriz(j);
				}
			    }
			}
	 }
	
	 public char[][] moverJugador(char mov, char[][] mapa, ModelMapa m1) {
			char izq = 'a', derech = 'd', delant = 'w', atras = 's', mes = '█', paredVert='║', paredHoriz='═', puert = '/', pizz='▓';

			encontrarP(mapa, m1);
			

			if (mov == izq) {
			    if (mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != paredVert && mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != paredHoriz &&
				    mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != mes &&  mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] != puert) {
				mapa[m1.getD().getVertic()][m1.getD().getHoriz() - 1] = 'P';
				mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
				m1.getD().setHoriz(m1.getD().getHoriz()-1);

			    }
			}

			if (mov == derech) {
			    if (mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != paredVert && mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != paredHoriz &&
				    mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != mes &&  mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] != puert) {
				mapa[m1.getD().getVertic()][m1.getD().getHoriz() + 1] = 'P';
				mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
				m1.getD().setHoriz(m1.getD().getHoriz()+1);
			    }
			}

			if (mov == delant) {
			    if (mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != paredVert && mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != paredHoriz &&
				    mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != mes &&  mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != puert && mapa[m1.getD().getVertic()-1][m1.getD().getHoriz()] != pizz) {
				mapa[m1.getD().getVertic() - 1][m1.getD().getHoriz()] = 'P';
				mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
				m1.getD().setVertic(m1.getD().getVertic()+1);
			    }
			}

			if (mov == atras) {
			    if (mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != paredVert && mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != paredHoriz &&
				    mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != mes &&  mapa[m1.getD().getVertic()+1][m1.getD().getHoriz()] != puert) {
				mapa[m1.getD().getVertic() + 1][m1.getD().getHoriz()] = 'P';
				mapa[m1.getD().getVertic()][m1.getD().getHoriz()] = ' ';
				m1.getD().setVertic(m1.getD().getVertic()-1);
			    }
			}

			return mapa;

		    }

}