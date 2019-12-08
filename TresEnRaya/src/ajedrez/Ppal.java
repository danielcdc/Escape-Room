package ajedrez;

import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int pul;
		char piezaEnX,piezaEnY,movimientoEnX,movimientoEnY;
		Piezas pt1=new Piezas();
		Tablero t1=new Tablero();
		do {
			System.out.println("1.Intrucciones\n2.Enfrentarse");
			pul=Leer.datoInt();
			switch(pul) {
				case 1:
					System.out.println("Bienvenidos en esta prueba encontrarás un tablero de ajedrez que se divide de A-H en la horizontal y de 1-8 en la vertical");
					System.out.println("Usted deverá elegir en que posicion se encuentra la pieza que a de mover y hacia donde ha de moverse");
					System.out.println("Ten en cuenta que las piesas que se muestran en mayúsculas son las tuyas y en minúsculas la del enemigo");
					System.out.println("P:Peon,T:Torre,A:Alfil,C:Caballo,Y:Reina,R:Rey");
					System.out.println("Solo tiene un movimiento, Buena suerte");
					break;
				case 2:
					t1.imprimirTablero(pt1);
					for(int i=0;i<pt1.getPosicionX().length;i++) {
						System.out.print(pt1.devolverPosicionX(i)+"  ");
					}
					piezaEnX=Leer.datoChar();
					for(int i=0;i<pt1.getPosicionY().length;i++) {
						System.out.print(pt1.devolverPosicionY(i)+"  ");
					}
					piezaEnY=Leer.datoChar();
					System.out.println("A que casilla del eje horizontal debe moverse");
					movimientoEnX=Leer.datoChar();
					System.out.println("A que casilla del eje vertical debe moverse");
					movimientoEnY=Leer.datoChar();
					if((piezaEnX=='F' && piezaEnY=='2') && movimientoEnX=='E'&& movimientoEnY=='1') {
						System.out.println("Felicidades has pasado la prueba");
					}else {
						System.out.println("El mal ha vuelto a ganar ten más cuidado");
					}
					break;
			}//cierre switch menu instrucciones y jugar 
		}while(pul==1 || pul==2); //Cierre del do de jugar e instrucciones
		
	}

}
