package Entrega;


import utilidades.Leer;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		datos d1=new datos();
		imprimir imp=new imprimir ();
		
		do {
			System.out.println("1.Intrucciones\n2.Enfrentarse");
			d1.setPul(Leer.datoInt());
			switch(d1.getPul()) {
				case 1:
					System.out.println("Bienvenidos en esta prueba encontrarás un tablero de ajedrez que se divide de A-H en la horizontal y de 1-8 en la vertical");
					System.out.println("Usted deverá elegir en que posicion se encuentra la pieza que a de mover y hacia donde ha de moverse");
					System.out.println("Ten en cuenta que las piesas que se muestran en mayúsculas son las tuyas y en minúsculas la del enemigo");
					System.out.println("P:Peon,T:Torre,A:Alfil,C:Caballo,Y:Reina,R:Rey");
					System.out.println("Solo tiene un movimiento, Buena suerte");
					break;
				case 2:
					imp.imprimirTablero(d1);
					for(int i=0;i<d1.getPosicionX().length;i++) {
						System.out.print(d1.devolverPosicionX(i)+"  ");
					}
					d1.setPiezaEnX(Leer.datoChar());
					for(int i=0;i<d1.getPosicionY().length;i++) {
						System.out.print(d1.devolverPosicionY(i)+"  ");
					}
					d1.setPiezaEnY(Leer.datoChar());
					System.out.println("A que casilla del eje horizontal debe moverse");
					d1.setMovimientoEnX(Leer.datoChar());
					System.out.println("A que casilla del eje vertical debe moverse");
					d1.setMovimientoEnY(Leer.datoChar());
					if((d1.getPiezaEnX()=='F' && d1.getPiezaEnY()=='2') && d1.getMovimientoEnX()=='E'&& d1.getMovimientoEnY()=='1') {
						System.out.println("Felicidades has pasado la prueba");
					}else {
						System.out.println("El mal ha vuelto a ganar ten más cuidado");
					}
					break;
			}//cierre switch menu instrucciones y jugar 
		}while(d1.getPul()==1 || d1.getPul()==2); //Cierre del do de jugar e instrucciones
	}

}
