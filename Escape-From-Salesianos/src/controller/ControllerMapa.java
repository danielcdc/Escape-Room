package controller;

import model.ModelMapa;

public class ControllerMapa {
	
	 public char[][] moverJugador(char mov, char[][] mapa) {
			int horiz = 0, vertic = 0;
			char izq = 'a', derech = 'd', delant = 'w', atras = 's', mes = '▄', paredVert='║', paredHoriz='═', puert = '/', pizz='▓';

			for (int i = 0; i < mapa.length; i++) {
			    for (int j = 0; j < mapa[i].length; j++) {
				if (mapa[i][j] == 'P') {
				    vertic = i;
				    horiz = j;
				}
			    }
			}

			if (mov == izq) {
			    if (mapa[vertic][horiz - 1] != paredVert && mapa[vertic][horiz - 1] != paredHoriz &&
				    mapa[vertic][horiz - 1] != mes &&  mapa[vertic][horiz - 1] != puert) {
				mapa[vertic][horiz - 1] = 'P';
				mapa[vertic][horiz] = ' ';
				horiz--;

			    }
			}

			if (mov == derech) {
			    if (mapa[vertic][horiz + 1] != paredVert && mapa[vertic][horiz + 1] != paredHoriz &&
				    mapa[vertic][horiz + 1] != mes &&  mapa[vertic][horiz + 1] != puert) {
				mapa[vertic][horiz + 1] = 'P';
				mapa[vertic][horiz] = ' ';
				horiz++;
			    }
			}

			if (mov == delant) {
			    if (mapa[vertic-1][horiz] != paredVert && mapa[vertic-1][horiz] != paredHoriz &&
				    mapa[vertic-1][horiz] != mes &&  mapa[vertic-1][horiz] != puert && mapa[vertic-1][horiz] != pizz) {
				mapa[vertic - 1][horiz] = 'P';
				mapa[vertic][horiz] = ' ';
				vertic++;
			    }
			}

			if (mov == atras) {
			    if (mapa[vertic+1][horiz] != paredVert && mapa[vertic+1][horiz] != paredHoriz &&
				    mapa[vertic+1][horiz] != mes &&  mapa[vertic+1][horiz] != puert) {
				mapa[vertic + 1][horiz] = 'P';
				mapa[vertic][horiz] = ' ';
				vertic--;
			    }
			}

			return mapa;

		    }

}
