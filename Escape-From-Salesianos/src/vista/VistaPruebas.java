package vista;

import controller.ControllerAjedrez;
import datos.Datos;
import model.ModelAjedrez;

public class VistaPruebas {
	
	public void imprimirPista1() {
		System.out.println("El conejo blanco saltó a la colina 100," + 
								" en 10110 encontró una zanahoria y en 11011 se encontró con el zorro");
	}
	
	public void imprimirCodigo(int [] num, int i) {
		
		if(i == 0) {
			
		
			System.out.print(" ┌────────────────────────────────────────────────┐\r\n" + 
					" |┌──────────────────────────────────────────────┐|\r\n" + 
					" ||                                              ||\r\n" + 
					" ||           " +num[0]);
		
		if(num[i] < 10 && num[i] >= 0){
			System.out.print("    ");
		}
						
						
		System.out.print("                              ||\r\n" + 
				" ||                                              ||\r\n" + 
				" ||                                              ||\r\n" + 
				" |└──────────────────────────────────────────────┘|\r\n" + 
				" |┌──────────────────────────────────────────────┐|\r\n" + 
				" ||┌─────────────────────┬──────────────────────┐||\r\n" + 
				" |||         1           |          2           |||\r\n" + 
				" |||                     |                      |||\r\n" + 
				" ||├─────────────────────┼──────────────────────┤||\r\n" + 
				" |||         3           |          4           |||\r\n" + 
				" |||                     |                      |||\r\n" + 
				" ||├─────────────────────┼──────────────────────┤||\r\n" + 
				" |||         5           |          6           |||\r\n" + 
				" |||                     |                      |||\r\n" + 
				" ||├─────────────────────┼──────────────────────┤||\r\n" + 
				" |||         7           |          8           |||\r\n" + 
				" |||                     |                      |||\r\n" + 
				" ||├─────────────────────┼──────────────────────┤||\r\n" + 
				" |||         9           |          0           |||\r\n" + 
				" ||├─────────────────────┼──────────────────────┤||\r\n" + 
				" |||        DEL          |         ENTER        |||\r\n" + 
				" |||                     |                      |||\r\n" + 
				" ||└─────────────────────┴──────────────────────┘||\r\n" + 
				" ||                                              ||\r\n" + 
				" |└──────────────────────────────────────────────┘|\r\n" + 
				" |                                                |\r\n" + 
				" |                     ALMACÉN                    |\r\n" + 
				" |                                                |\r\n" + 
				" └────────────────────────────────────────────────┘\n\n\n");
	}
		if(i == 1) {
			
			
			System.out.print(" ┌────────────────────────────────────────────────┐\r\n" + 
					" |┌──────────────────────────────────────────────┐|\r\n" + 
					" ||                                              ||\r\n" + 
					" ||           " +num[i-1]);
			
			if(num[i-1] < 10 && num[i-1] >= 0){
				System.out.print(" ");
			}
							
							
			System.out.print("    |    " +num[i]); 
					
			if(num[i] < 10 && num[i] >= 0){
				System.out.print(" ");
			}		
							
					
			System.out.print("                      ||\r\n" + 
					" ||                                              ||\r\n" + 
					" ||                                              ||\r\n" + 
					" |└──────────────────────────────────────────────┘|\r\n" + 
					" |┌──────────────────────────────────────────────┐|\r\n" + 
					" ||┌─────────────────────┬──────────────────────┐||\r\n" + 
					" |||         1           |          2           |||\r\n" + 
					" |||                     |                      |||\r\n" + 
					" ||├─────────────────────┼──────────────────────┤||\r\n" + 
					" |||         3           |          4           |||\r\n" + 
					" |||                     |                      |||\r\n" + 
					" ||├─────────────────────┼──────────────────────┤||\r\n" + 
					" |||         5           |          6           |||\r\n" + 
					" |||                     |                      |||\r\n" + 
					" ||├─────────────────────┼──────────────────────┤||\r\n" + 
					" |||         7           |          8           |||\r\n" + 
					" |||                     |                      |||\r\n" + 
					" ||├─────────────────────┼──────────────────────┤||\r\n" + 
					" |||         9           |          0           |||\r\n" + 
					" ||├─────────────────────┼──────────────────────┤||\r\n" + 
					" |||        DEL          |         ENTER        |||\r\n" + 
					" |||                     |                      |||\r\n" + 
					" ||└─────────────────────┴──────────────────────┘||\r\n" + 
					" ||                                              ||\r\n" + 
					" |└──────────────────────────────────────────────┘|\r\n" + 
					" |                                                |\r\n" + 
					" |                     ALMACÉN                    |\r\n" + 
					" |                                                |\r\n" + 
					" └────────────────────────────────────────────────┘\n\n\n");
		}
		
if(i == 2) {
			
			
			System.out.print(" ┌────────────────────────────────────────────────┐\r\n" + 
					" |┌──────────────────────────────────────────────┐|\r\n" + 
					" ||                                              ||\r\n" + 
					" ||           " +num[i-2]);
			
			if(num[i-2] < 10 && num[i-2] >= 0){
				System.out.print(" ");
			}
							
							
			System.out.print("    |    " +num[i-1]); 
					
			if(num[i-1] < 10 && num[i-1] >= 0){
				System.out.print(" ");
			}		
							
					
			System.out.print("    |    " +num[i]);
					
			if(num[i] < 10 && num[i] >= 0){
				System.out.print(" ");
			}		
					
			System.out.print("           ||\r\n" + 
					" ||                                              ||\r\n" + 
					" ||                                              ||\r\n" + 
					" |└──────────────────────────────────────────────┘|\r\n" + 
					" |┌──────────────────────────────────────────────┐|\r\n" + 
					" ||┌─────────────────────┬──────────────────────┐||\r\n" + 
					" |||         1           |          2           |||\r\n" + 
					" |||                     |                      |||\r\n" + 
					" ||├─────────────────────┼──────────────────────┤||\r\n" + 
					" |||         3           |          4           |||\r\n" + 
					" |||                     |                      |||\r\n" + 
					" ||├─────────────────────┼──────────────────────┤||\r\n" + 
					" |||         5           |          6           |||\r\n" + 
					" |||                     |                      |||\r\n" + 
					" ||├─────────────────────┼──────────────────────┤||\r\n" + 
					" |||         7           |          8           |||\r\n" + 
					" |||                     |                      |||\r\n" + 
					" ||├─────────────────────┼──────────────────────┤||\r\n" + 
					" |||         9           |          0           |||\r\n" + 
					" ||├─────────────────────┼──────────────────────┤||\r\n" + 
					" |||        DEL          |         ENTER        |||\r\n" + 
					" |||                     |                      |||\r\n" + 
					" ||└─────────────────────┴──────────────────────┘||\r\n" + 
					" ||                                              ||\r\n" + 
					" |└──────────────────────────────────────────────┘|\r\n" + 
					" |                                                |\r\n" + 
					" |                     ALMACÉN                    |\r\n" + 
					" |                                                |\r\n" + 
					" └────────────────────────────────────────────────┘\n\n\n");
}
		}
		
		

	
	public void imprimirLetreroMapaPrueba() {
		System.out.println( "┌── ─ ─ ─ ─ ─ ─ ─ ─ ─ ─ ───┐\n"
				           +"|MAPA DE DIMENSIÓN PARALELA|\n"
						   +"└──────────────────────────┘\n");
	}
	
	public void imprimirIntroPrueba1() throws InterruptedException{
		
		imprimirPista1();
		
		Thread.sleep(300);
		System.out.println("------------------------------------------------"
				+		 "\n            CARGANDO PRUEBA 1...                "
				+		 "\n------------------------------------------------");
		Thread.sleep(4000);
		
		Thread.sleep(1000);
		
	}
	
	public void imprimirFinPrueba1() throws InterruptedException{
		
		System.out.print("      ███████████████\r\n");
		Thread.sleep(300);
		System.out.print("     ████████████████\r\n");
		Thread.sleep(300);
		System.out.print("    ██████████████████\r\n");
		Thread.sleep(300);
		System.out.print(		"   ████████████████████\r\n");
		Thread.sleep(300);
		System.out.print(		"   ████████████████████\r\n");
		Thread.sleep(300);
		System.out.print(		"  ██████████████████████\r\n");
		Thread.sleep(300);
		System.out.print(		"  █   █   █    █   █   █\r\n");
		Thread.sleep(300);
		System.out.print(		"  █   █████    █████   █\r\n");
		Thread.sleep(300);
		System.out.print(		"  ██████████████████████\r\n");
		Thread.sleep(300);
		System.out.print(		"   ████████████████████\r\n");
		Thread.sleep(300);
		System.out.print(		"   ████████████████████\r\n"); 
		Thread.sleep(300);
		System.out.print(		"   █  ▄ ▄ ▄ ▄ ▄ ▄ ▄   █\r\n");
		Thread.sleep(300);
		System.out.print(		"    █ ▄ ▄ ▄ ▄ ▄ ▄ ▄  █\r\n");
		Thread.sleep(300);
		System.out.print(		"     ████████████████\r\n");
		Thread.sleep(300);
		System.out.print(		"          ███████\r\n");
		Thread.sleep(300);
		System.out.print(		"          ███████\r\n");
		Thread.sleep(300);
		System.out.print(		"         █████████\r\n");
		Thread.sleep(300);
		System.out.print(		"        ███████████\r\n");
		Thread.sleep(300);
		System.out.print(		"      ███████████████\r\n");
		Thread.sleep(300);
		System.out.print(		"    ███████████████████\r\n");
		Thread.sleep(300);
		System.out.print(		"███████████████████████████\r\n");
		Thread.sleep(300);
		System.out.print(		"████ █████████████████ ████\r\n");
		Thread.sleep(300);
		System.out.print(		"████ █████████████████ ████\r\n"); 
		Thread.sleep(300);
		System.out.print(		"████ █████████████████ ████\r\n");
		Thread.sleep(300);
		System.out.println(		"████ █████████████████ ████");
		
		System.out.println("\n\n\n"+
								"\t\t\t┌────────────────────────────────────────────────────────┐");
		System.out.println(		"\t\t\t|    Voz anónima:                                        |");
		System.out.println(		"\t\t\t|                                                        |");
		System.out.println(		"\t\t\t|       ~No pensaba que fueses capaz de lograrlo..~      |");
		System.out.println(		"\t\t\t|                                                        |");
		System.out.println(     "\t\t\t└────────────────────────────────────────────────────────┘");
		Thread.sleep(3000);
		System.out.println(	    "\t\t\t...");
		Thread.sleep(3000);
		System.out.println("      ███████████████\r\n" + 
				"     ████████████████\r\n" + 
				"    ██████████████████\r\n" + 
				"   ████████████████████\r\n" + 
				"   ████████████████████\r\n" + 
				"  ██████████████████████\r\n" + 
				"  █   █   █    █   █   █\r\n" + 
				"  █   █████    █████   █\r\n" + 
				"  ██████████████████████\r\n" + 
				"   ████████████████████\r\n" + 
				"   ████████████████████\r\n" + 
				"   █  ▄ ▄ ▄ ▄ ▄ ▄ ▄   █\r\n" + 
				"    █ ▄ ▄ ▄ ▄ ▄ ▄ ▄  █\r\n" + 
				"     ████████████████\r\n" + 
				"          ███████\r\n" + 
				"          ███████\r\n" + 
				"         █████████\r\n" + 
				"        ███████████\r\n" + 
				"      ███████████████\r\n" + 
				"    ███████████████████\r\n" + 
				"███████████████████████████\r\n" + 
				"████ █████████████████ ████\r\n" + 
				"████ █████████████████ ████\r\n" + 
				"████ █████████████████ ████\r\n" + 
				"████ █████████████████ ████");
		System.out.println("\n\n\n"+
								"\t\t\t┌────────────────────────────────────────────────────────┐");
		System.out.println(		"\t\t\t|    Voz anónima:                                        |");
		System.out.println(		"\t\t\t|                                                        |");
		System.out.println(		"\t\t\t|       ~Pero si pensabas que este era el final, solo    |");
		System.out.println(		"\t\t\t|        es el comienzo del juego~                       |");
		System.out.println(     "\t\t\t└────────────────────────────────────────────────────────┘");
		Thread.sleep(3000);
		System.out.println(	    "\t\t\t...");
		Thread.sleep(3000);
		
	}
	

	public void numOrdenador1(Datos d) {
		System.out.println("- - - - - - - - - - - - - - - - - - - - " + "-Don Bosco: Esta pantalla está encendida"
				+ "- - - - - - - - - - - - - - - - - - - - ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - " + "-Don Bosco: Es el primer número, lo apuntaré"
				+ "- - - - - - - - - - - - - - - - - - - - ");

		System.out.print("╔═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╗\n"
				+ "║                                               ║\n"
				+ "                                                 \n"
				+ "║                                               ║\n"
				+ "                                                 \n" + "║                       "
				+ d.getNumeroSecreto()[0]);
		
		if(d.getNumeroSecreto()[0] < 10 && d.getNumeroSecreto()[0] >= 0 ) {
			System.out.print(" ");
		}
		
		System.out.println("                      ║\n"
				+ "                    ----------                   \n"
				+ "║                                               ║\n"
				+ "╚═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╝\n"
				+ "                      	▓▓▓                      \n"
				+ "                      	▓▓▓                      \n"
				+ "                      	▓▓▓                      \n"
				+ "                    ▓▓▓▓▓▓▓▓▓▓▓                  \n");

		System.out.println("A: " + d.getNumeroSecreto()[0]);

	}

	public void numOrdenador2(Datos d) {

		System.out.println("- - - - - - - - - - - - - - - - - - - - " + "-Don Bosco: Otra pantalla encendida"
				+ "- - - - - - - - - - - - - - - - - - - - ");
		System.out.println("- - - - - - - - - - - - - - - - - - - - " + "-Don Bosco: Supongo que es el 2º, lo apuntaré"
				+ "- - - - - - - - - - - - - - - - - - - - ");

		System.out.print("╔═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╗\n"
				+ "║                                               ║\n"
				+ "                                                 \n"
				+ "║                                               ║\n"
				+ "                                                 \n" + "║                        "
				+ d.getNumeroSecreto()[1]);
				
		System.out.println("                      ║\n"
				+ "                    ----------                   \n"
				+ "║                                               ║\n"
				+ "╚═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╝\n"
				+ "                      	▓▓▓                      \n"
				+ "                      	▓▓▓                      \n"
				+ "                      	▓▓▓                      \n"
				+ "                    ▓▓▓▓▓▓▓▓▓▓▓                  \n");

		System.out.println("B: " + d.getNumeroSecreto()[1]);

	}

	public void numOrdenador3(Datos d) {

		System.out.println("- - - - - - - - - - - - - - - - - - - - " + "-Don Bosco: La ultima"
				+ "- - - - - - - - - - - - - - - - - - - - ");

		System.out.print("╔═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╗\n"
				+ "║            Deberias pensar en salir...        ║\n"
				+ "                                                 \n"
				+ "║                                               ║\n"
				+ "                                                 \n" + "║                       "
				+ d.getNumeroSecreto()[2]);
		
		if(d.getNumeroSecreto()[2] < 10 && d.getNumeroSecreto()[2] >= 0 ) {
			System.out.print(" ");
		}
		
		System.out.println("                      ║\n"
				+ "                    ----------                   \n"
				+ "║                                               ║\n"
				+ "╚═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╝\n"
				+ "                      	▓▓▓                      \n"
				+ "                      	▓▓▓                      \n"
				+ "                      	▓▓▓                      \n"
				+ "                    ▓▓▓▓▓▓▓▓▓▓▓                  \n");

		System.out.println("C: " + d.getNumeroSecreto()[2]);

	}
	
	public void imprimirInstruccAjedrez() {
		
		System.out.println("\nBienvenidos en esta prueba encontrarás un tablero de ajedrez que se divide de A-H en la horizontal y de 1-8 en la vertical");
		System.out.println("Usted deverá elegir en que posicion se encuentra la pieza que a de mover y hacia donde ha de moverse");
		System.out.println("Ten en cuenta que las piesas que se muestran en mayúsculas son las tuyas y en minúsculas la del enemigo");
		System.out.println("\nP: Peon\nT: Torre\nA: Alfil\nC: Caballo\nY: Reina\nR: Rey\n\n");
		System.out.println("Solo tiene un movimiento, Buena suerte\n\n");
		
	}
	
	public void imprimirTableroAjedrez(ControllerAjedrez d1, Datos d) {
		String lineaCierre="\n\n-----------------------------------------";
		String lineaInter="|---------------------------------------|";
		String lineaMedio="|    |    |    |    |    |    |    |    |";
		
		System.out.println(lineaCierre+"\n"
							+"|"+d1.devolverPosicionX(d.getCero(), d)+"   |    |    |"+d1.devolverInicial(d.getTres(), d)+"  "+d1.devolverInicial(d.getTres(), d)+"|"+d1.devolverInicialEnemiga(d.getTres(), d)+"  "+d1.devolverInicialEnemiga(d.getTres(), d)+"|"+d1.devolverInicialEnemiga(d.getUno(), d)+"  "+d1.devolverInicialEnemiga(d.getUno(), d)+"|    |"+d1.devolverPosicionX(d.getSiete(), d)+"   |"+"\n"
							+"|"+d1.devolverPosicionY(d.getCero(), d)+"   |    |    |"+d1.devolverInicial(d.getTres(), d)+"  "+d1.devolverInicial(d.getTres(), d)+"|"+d1.devolverInicialEnemiga(d.getTres(), d)+"  "+d1.devolverInicialEnemiga(d.getTres(), d)+"|"+d1.devolverInicialEnemiga(d.getUno(), d)+"  "+d1.devolverInicialEnemiga(d.getUno(), d)+"|    |    |"+"\n"
							+lineaInter+"\n"
							+"|"+d1.devolverInicial(d.getUno(), d)+"  "+d1.devolverInicial(d.getUno(), d)+"|    |    |"+d1.devolverInicial(d.getDos(),d)+"  "+d1.devolverInicial(d.getDos(),d)+"|"+d1.devolverInicialEnemiga(d.getCinco(),d)+"  "+d1.devolverInicialEnemiga(d.getCinco(),d)+"|"+d1.devolverInicial(d.getCero(), d)+"  "+d1.devolverInicial(d.getCero(), d)+"|    |    |"+"\n"
							+"|"+d1.devolverInicial(d.getUno(), d)+"  "+d1.devolverInicial(d.getUno(), d)+"|    |    |"+d1.devolverInicial(d.getDos(),d)+"  "+d1.devolverInicial(d.getDos(),d)+"|"+d1.devolverInicialEnemiga(d.getCinco(),d)+"  "+d1.devolverInicialEnemiga(d.getCinco(),d)+"|"+d1.devolverInicial(d.getCero(), d)+"  "+d1.devolverInicial(d.getCero(), d)+"|    |    |"+"\n"
							+lineaInter+"\n"
							+"|    |    |    |    |"+d1.devolverInicialEnemiga(d.getCero(), d)+"  "+d1.devolverInicialEnemiga(d.getCero(), d)+"|    |    |    |"+"\n"
							+"|    |    |    |    |"+d1.devolverInicialEnemiga(d.getCero(), d)+"  "+d1.devolverInicialEnemiga(d.getCero(), d)+"|    |    |    |"+"\n"
							+lineaInter+"\n"
							+lineaMedio+"\n"
							+lineaMedio+"\n"
							+lineaInter+"\n"
							+lineaMedio+"\n"
							+lineaMedio+"\n"
							+lineaInter+"\n"
							+"|    |    |    |    |"+d1.devolverInicial(d.getCinco(),d)+"  "+d1.devolverInicial(d.getCinco(),d)+"|    |    |    |"+"\n"
							+"|    |    |    |    |"+d1.devolverInicial(d.getCinco(),d)+"  "+d1.devolverInicial(d.getCinco(),d)+"|    |    |    |"+"\n"
							+lineaInter+"\n"
							+lineaMedio+"\n"
							+lineaMedio+"\n"
							+lineaInter+"\n"
							+"|"+d1.devolverPosicionY(d.getSiete(), d)+"   |    |    |"+d1.devolverInicial(d.getUno(), d)+"  "+d1.devolverInicial(d.getUno(), d)+"|    |    |    |    |"+"\n"
							+"|    |    |    |"+d1.devolverInicial(d.getUno(), d)+"  "+d1.devolverInicial(d.getUno(), d)+"|    |    |    |    |"+"\n"
							+lineaCierre+"\n");		}

}
