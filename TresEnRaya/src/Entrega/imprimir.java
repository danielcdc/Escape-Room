package Entrega;



public class imprimir {
		
	
	public void imprimirTablero(datos d1) {
		int cero=0,uno=1,dos=2,tres=3,cinco=5,siete=7;
		String lineaCierre="-----------------------------------------";
		String lineaInter="|---------------------------------------|";
		String lineaMedio="|    |    |    |    |    |    |    |    |";
		
		System.out.println(lineaCierre+"\n"
							+"|"+d1.devolverPosicionX(cero)+"   |    |    |"+d1.devolverInicial(tres)+"  "+d1.devolverInicial(tres)+"|"+d1.devolverInicialEnemiga(tres)+"  "+d1.devolverInicialEnemiga(tres)+"|"+d1.devolverInicialEnemiga(uno)+"  "+d1.devolverInicialEnemiga(uno)+"|    |"+d1.devolverPosicionX(siete)+"   |"+"\n"
							+"|"+d1.devolverPosicionY(cero)+"   |    |    |"+d1.devolverInicial(tres)+"  "+d1.devolverInicial(tres)+"|"+d1.devolverInicialEnemiga(tres)+"  "+d1.devolverInicialEnemiga(tres)+"|"+d1.devolverInicialEnemiga(uno)+"  "+d1.devolverInicialEnemiga(uno)+"|    |    |"+"\n"
							+lineaInter+"\n"
							+"|"+d1.devolverInicial(uno)+"  "+d1.devolverInicial(uno)+"|    |    |"+d1.devolverInicial(dos)+"  "+d1.devolverInicial(dos)+"|"+d1.devolverInicialEnemiga(cinco)+"  "+d1.devolverInicialEnemiga(cinco)+"|"+d1.devolverInicial(cero)+"  "+d1.devolverInicial(cero)+"|    |    |"+"\n"
							+"|"+d1.devolverInicial(uno)+"  "+d1.devolverInicial(uno)+"|    |    |"+d1.devolverInicial(dos)+"  "+d1.devolverInicial(dos)+"|"+d1.devolverInicialEnemiga(cinco)+"  "+d1.devolverInicialEnemiga(cinco)+"|"+d1.devolverInicial(cero)+"  "+d1.devolverInicial(cero)+"|    |    |"+"\n"
							+lineaInter+"\n"
							+"|    |    |    |    |"+d1.devolverInicialEnemiga(cero)+"  "+d1.devolverInicialEnemiga(cero)+"|    |    |    |"+"\n"
							+"|    |    |    |    |"+d1.devolverInicialEnemiga(cero)+"  "+d1.devolverInicialEnemiga(cero)+"|    |    |    |"+"\n"
							+lineaInter+"\n"
							+lineaMedio+"\n"
							+lineaMedio+"\n"
							+lineaInter+"\n"
							+lineaMedio+"\n"
							+lineaMedio+"\n"
							+lineaInter+"\n"
							+"|    |    |    |    |"+d1.devolverInicial(cinco)+"  "+d1.devolverInicial(cinco)+"|    |    |    |"+"\n"
							+"|    |    |    |    |"+d1.devolverInicial(cinco)+"  "+d1.devolverInicial(cinco)+"|    |    |    |"+"\n"
							+lineaInter+"\n"
							+lineaMedio+"\n"
							+lineaMedio+"\n"
							+lineaInter+"\n"
							+"|"+d1.devolverPosicionY(siete)+"   |    |    |"+d1.devolverInicial(uno)+"  "+d1.devolverInicial(uno)+"|    |    |    |    |"+"\n"
							+"|    |    |    |"+d1.devolverInicial(uno)+"  "+d1.devolverInicial(uno)+"|    |    |    |    |"+"\n"
							+lineaCierre+"\n");		}
	
}
