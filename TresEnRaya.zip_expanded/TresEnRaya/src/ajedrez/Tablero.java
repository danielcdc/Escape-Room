package ajedrez;

public class Tablero {
		public void imprimirTablero(Piezas p1) {
			int cero=0,uno=1,dos=2,tres=3,cinco=5,siete=7;
			String lineaCierre="-----------------------------------------";
			String lineaInter="|---------------------------------------|";
			String lineaMedio="|    |    |    |    |    |    |    |    |";
			
			System.out.println(lineaCierre+"\n"
								+"|"+p1.devolverPosicionX(cero)+"   |    |    |"+p1.devolverInicial(tres)+"  "+p1.devolverInicial(tres)+"|"+p1.devolverInicialEnemiga(tres)+"  "+p1.devolverInicialEnemiga(tres)+"|"+p1.devolverInicialEnemiga(uno)+"  "+p1.devolverInicialEnemiga(uno)+"|    |"+p1.devolverPosicionX(siete)+"   |"+"\n"
								+"|"+p1.devolverPosicionY(cero)+"   |    |    |"+p1.devolverInicial(tres)+"  "+p1.devolverInicial(tres)+"|"+p1.devolverInicialEnemiga(tres)+"  "+p1.devolverInicialEnemiga(tres)+"|"+p1.devolverInicialEnemiga(uno)+"  "+p1.devolverInicialEnemiga(uno)+"|    |    |"+"\n"
								+lineaInter+"\n"
								+"|"+p1.devolverInicial(uno)+"  "+p1.devolverInicial(uno)+"|    |    |"+p1.devolverInicial(dos)+"  "+p1.devolverInicial(dos)+"|"+p1.devolverInicialEnemiga(cinco)+"  "+p1.devolverInicialEnemiga(cinco)+"|"+p1.devolverInicial(cero)+"  "+p1.devolverInicial(cero)+"|    |    |"+"\n"
								+"|"+p1.devolverInicial(uno)+"  "+p1.devolverInicial(uno)+"|    |    |"+p1.devolverInicial(dos)+"  "+p1.devolverInicial(dos)+"|"+p1.devolverInicialEnemiga(cinco)+"  "+p1.devolverInicialEnemiga(cinco)+"|"+p1.devolverInicial(cero)+"  "+p1.devolverInicial(cero)+"|    |    |"+"\n"
								+lineaInter+"\n"
								+"|    |    |    |    |"+p1.devolverInicialEnemiga(cero)+"  "+p1.devolverInicialEnemiga(cero)+"|    |    |    |"+"\n"
								+"|    |    |    |    |"+p1.devolverInicialEnemiga(cero)+"  "+p1.devolverInicialEnemiga(cero)+"|    |    |    |"+"\n"
								+lineaInter+"\n"
								+lineaMedio+"\n"
								+lineaMedio+"\n"
								+lineaInter+"\n"
								+lineaMedio+"\n"
								+lineaMedio+"\n"
								+lineaInter+"\n"
								+"|    |    |    |    |"+p1.devolverInicial(cinco)+"  "+p1.devolverInicial(cinco)+"|    |    |    |"+"\n"
								+"|    |    |    |    |"+p1.devolverInicial(cinco)+"  "+p1.devolverInicial(cinco)+"|    |    |    |"+"\n"
								+lineaInter+"\n"
								+lineaMedio+"\n"
								+lineaMedio+"\n"
								+lineaInter+"\n"
								+"|"+p1.devolverPosicionY(siete)+"   |    |    |"+p1.devolverInicial(uno)+"  "+p1.devolverInicial(uno)+"|    |    |    |    |"+"\n"
								+"|    |    |    |"+p1.devolverInicial(uno)+"  "+p1.devolverInicial(uno)+"|    |    |    |    |"+"\n"
								+lineaCierre+"\n");		}
		
}
