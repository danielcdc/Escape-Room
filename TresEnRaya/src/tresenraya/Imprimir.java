package tresenraya;



public class Imprimir {
		

		public Imprimir() {
			super();
		}


		
		public void imprimirmapaVacio(Util ut1){ //Imprime el mapa con la posicion del array que le digamos
			int	uno=1,dos=2,tres=3,cuatro=4,cinco=5,seis=6,siete=7,ocho=8,cero=0;
			System.out.println("----------\n"
					+ "|"+ut1.devolverUnaposicion(cero)+ut1.devolverUnaposicion(cero)+"|"+ut1.devolverUnaposicion(uno)+ut1.devolverUnaposicion(uno)+"|"+ut1.devolverUnaposicion(dos)+ut1.devolverUnaposicion(dos)+"|\n"
					+ "|"+ut1.devolverUnaposicion(cero)+ut1.devolverUnaposicion(cero)+"|"+ut1.devolverUnaposicion(uno)+ut1.devolverUnaposicion(uno)+"|"+ut1.devolverUnaposicion(dos)+ut1.devolverUnaposicion(dos)+"|\n"
					+ "|--|--|--|\n"
					+ "|"+ut1.devolverUnaposicion(tres)+ut1.devolverUnaposicion(tres)+"|"+ut1.devolverUnaposicion(cuatro)+ut1.devolverUnaposicion(cuatro)+"|"+ut1.devolverUnaposicion(cinco)+ut1.devolverUnaposicion(cinco)+"|\n"
					+ "|"+ut1.devolverUnaposicion(tres)+ut1.devolverUnaposicion(tres)+"|"+ut1.devolverUnaposicion(cuatro)+ut1.devolverUnaposicion(cuatro)+"|"+ut1.devolverUnaposicion(cinco)+ut1.devolverUnaposicion(cinco)+"|\n"
					+ "|--|--|--|\n"
					+ "|"+ut1.devolverUnaposicion(seis)+ut1.devolverUnaposicion(seis)+"|"+ut1.devolverUnaposicion(siete)+ut1.devolverUnaposicion(siete)+"|"+ut1.devolverUnaposicion(ocho)+ut1.devolverUnaposicion(ocho)+"|\n"
					+ "|"+ut1.devolverUnaposicion(seis)+ut1.devolverUnaposicion(seis)+"|"+ut1.devolverUnaposicion(siete)+ut1.devolverUnaposicion(siete)+"|"+ut1.devolverUnaposicion(ocho)+ut1.devolverUnaposicion(ocho)+"|\n"
					+ "----------");
		}
		
		
	
	}
