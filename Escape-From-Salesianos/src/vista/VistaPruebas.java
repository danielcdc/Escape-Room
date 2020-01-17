package vista;

import controller.ControllerAjedrez;
import datos.Datos;

public class VistaPruebas {
	
	public void imprimirInstrucc3Raya() {
		System.out.println(" El juego trata de ir marcando los espacios del tablero alternadamente hasta que uno de los \njugadores consiga hacer tres en raya.\n"
				+ " La línea puede ser horizontal, diagonal o vertical. Un jugador será el símbolo X y el otro O.");
	}
	
	public void imprimirTitu3Raya() {
		System.out.println("  ____  _                          __   _____   _                                   \r\n" + 
				" / ___|| |_ __ _ _ __ ___    ___  / _| |___ /  (_)_ __     __ _   _ __ _____      __\r\n" + 
				" \\___ \\| __/ _` | '__/ __|  / _ \\| |_    |_ \\  | | '_ \\   / _` | | '__/ _ \\ \\ /\\ / /\r\n" + 
				"  ___) | || (_| | |  \\__ \\ | (_) |  _|  ___) | | | | | | | (_| | | | | (_) \\ V  V / \r\n" + 
				" |____/ \\__\\__,_|_|  |___/  \\___/|_|   |____/  |_|_| |_|  \\__,_| |_|  \\___/ \\_/\\_/  \r\n" + 
				"                                                                                    \n");
		System.out.println("[1] Comenzar\n[2] Instrucciones");
	}
	
	public void imprimirPista1() {
		System.out.println("El conejo blanco saltó a la colina 100," + 
								" en 10110 encontró una zanahoria y en 11011 se encontró con el zorro");
	}
	
	public void imprimirIntro1() {
		
		System.out.println(
				"        ██████████████\r\n" + 
				"       ████████████████\r\n" + 
				"      █                █\r\n" + 
				"     █                  █\r\n" + 
				"    █                    █\r\n" + 
				"    █   ▄▄▄▄▄    ▄▄▄▄▄   █\r\n" + 
				"    █   █   █    █   █   █\r\n" + 
				"    █   █████    █████   █\r\n" + 
				"    █                    █\r\n" + 
				"     █                  █\r\n" + 
				"     ████████████████████\r\n" + 
				"     █  ▄▄▄▄▄▄▄▄▄▄▄▄▄▄  █\r\n" + 
				"      █ ▄▄▄▄▄▄▄▄▄▄▄▄▄▄ █\r\n" + 
				"      ██████████████████\r\n" + 
				"            ███████\r\n" + 
				"            ███████\r\n" + 
				"          ███████████\r\n" + 
				"         █████████████\r\n" + 
				"       █████████████████\r\n" + 
				" █████████████████████████████\r\n" + 
				" ███████████████████████ █████\r\n" + 
				" █████ ██  TITO BOSCO  █ █████\r\n" + 
				" █████ █████████████████ █████\r\n" + 
				" █████ █████████████████ █████\r\n" + 
				" █████ █████████████████ █████");
		
		System.out.println("╔──────────────────────────────────────────╗"
						 + "║                                          ║ "
						 + "║                                          ║ "
						 + "║                                          ║ ");
	}
	
	public void imprimirCodigo(int [] num, int i) {
		
		int diez = 10, cero = 0, uno = 1, dos = 2;
		
		if(i == cero) {
			
		
			System.out.print(" ┌────────────────────────────────────────────────┐\r\n" + 
					" |┌──────────────────────────────────────────────┐|\r\n" + 
					" ||                                              ||\r\n" + 
					" ||           " +num[0]);
		
		if(num[i] < diez && num[i] >= cero){
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
		if(i == uno) {
			
			
			System.out.print(" ┌────────────────────────────────────────────────┐\r\n" + 
					" |┌──────────────────────────────────────────────┐|\r\n" + 
					" ||                                              ||\r\n" + 
					" ||           " +num[i-1]);
			
			if(num[i-uno] < diez && num[i-uno] >= cero){
				System.out.print(" ");
			}
							
							
			System.out.print("    |    " +num[i]); 
					
			if(num[i] < diez && num[i] >= cero){
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
		
if(i == dos) {
			
			
			System.out.print(" ┌────────────────────────────────────────────────┐\r\n" + 
					" |┌──────────────────────────────────────────────┐|\r\n" + 
					" ||                                              ||\r\n" + 
					" ||           " +num[i-dos]);
			
			if(num[i-dos] < diez && num[i-2] >= cero){
				System.out.print(" ");
			}
							
							
			System.out.print("    |    " +num[i-1]); 
					
			if(num[i-1] < diez && num[i-1] >= cero){
				System.out.print(" ");
			}		
							
					
			System.out.print("    |    " +num[i]);
					
			if(num[i] < diez && num[i] >= cero){
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
	
	public void imprimirLetreroPerderGranjero() {
		System.out.println("--------------------\n"
				+ 		   "|      DERROTA     |\n"
				+          "--------------------\n");
		System.out.println("\n\n\n"+
				"\t\t\t┌────────────────────────────────────────────────────────┐");
		System.out.println(		"\t\t\t|    Voz anónima:                                        |");
		System.out.println(		"\t\t\t|                                                        |");
		System.out.println(		"\t\t\t|       ~Pero si pensabas que este era el final, solo    |");
		System.out.println(		"\t\t\t|        es el comienzo del juego~                       |");
		System.out.println(     "\t\t\t└────────────────────────────────────────────────────────┘"
							  + "                                                   [Intro]");
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
				+ d.getNumeroSecreto()[d.getCero()]);
		
		if(d.getNumeroSecreto()[d.getCero()] < d.getDiez() && d.getNumeroSecreto()[d.getDiez()] >= d.getCero() ) {
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

		System.out.println("A: " + d.getNumeroSecreto()[d.getCero()]);

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
				+ d.getNumeroSecreto()[d.getUno()]);
				
		System.out.println("                      ║\n"
				+ "                    ----------                   \n"
				+ "║                                               ║\n"
				+ "╚═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╝\n"
				+ "                      	▓▓▓                      \n"
				+ "                      	▓▓▓                      \n"
				+ "                      	▓▓▓                      \n"
				+ "                    ▓▓▓▓▓▓▓▓▓▓▓                  \n");

		System.out.println("B: " + d.getNumeroSecreto()[d.getUno()]);

	}

	public void numOrdenador3(Datos d) {

		System.out.println("- - - - - - - - - - - - - - - - - - - - " + "-Don Bosco: La ultima"
				+ "- - - - - - - - - - - - - - - - - - - - ");

		System.out.print("╔═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═ ═╗\n"
				+ "║            Deberias pensar en salir...        ║\n"
				+ "                                                 \n"
				+ "║                                               ║\n"
				+ "                                                 \n" + "║                       "
				+ d.getNumeroSecreto()[d.getDos()]);
		
		if(d.getNumeroSecreto()[d.getDos()] < d.getDiez() && d.getNumeroSecreto()[d.getDos()] >= d.getCero() ) {
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

		System.out.println("C: " + d.getNumeroSecreto()[d.getDos()]);

	}
	
	public void imprimirInstruccAjedrez() {
		
		System.out.println("\nBienvenidos en esta prueba encontrarás un tablero de ajedrez que se divide de A-H en la horizontal y de 1-8 en la vertical");
		System.out.println("Usted deverá elegir en que posicion se encuentra la pieza que a de mover y hacia donde ha de moverse");
		System.out.println("Ten en cuenta que las piezas que se muestran en mayúsculas son las tuyas y en minúsculas la del enemigo");
		System.out.println("\nP: Peon\nT: Torre\nA: Alfil\nC: Caballo\nY: Reina\nR: Rey\n\n");
		System.out.println("Solo tiene un movimiento, Buena suerte\n\n");
		
	}
	
	public void imprimirTableroAjedrez(ControllerAjedrez d1, Datos d) {
		String lineaCierre="─────────────────────────────────────────";
		String lineaInter= "├───────────────────────────────────────┤";
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


		public void printInstructions() {
			System.out.println("\t\t     INSTRUCCIONES");
			System.out.println(" __________________________________________________________");
			System.out.println("| Usando dos botellas vacías de 7 y 3 litros de capacidad, |\n| reparte los 10 litros de una botella llena de agua,\t   |\n"
					+ "| de manera que tanto en la de 7 litros como en la de 10,  |\n| queden 5 litros exactamente. ¡¡Mucha suerte!!\t\t   |");
			System.out.println("|__________________________________________________________|\n");
		}
		
		// Imprime por pantalla el estado actual de las botellas.
		public void showBottles(Datos d) {
			System.out.println("\t▄▄▄▄▄\t\t▄▄▄▄▄\t\t▄▄▄▄▄\n"
					+ 		   "\t ███\t\t ███\t\t ███\n"
					+          "\t█████\t\t█████\t\t█████\n"
					+          "\t█████\t\t█████\t\t█████\n");
			System.out.println("\t [A]" + "\t\t [B] " + "\t\t [C] ");
			System.out
					.println("\t [" + d.getBotella10() + "] " + "\t\t [" + d.getBotella7() + "] " + "\t\t [" + d.getBotella3() + "]\n");
		}
		
		// Indica al usuario que botellas puede vaciar.
		public void showEmpty() {
			System.out.println("Introduzca el número asociado a la botella que desea vaciar y pulse Intro.");
			System.out.println("1. Botella [A] (límite 10 litros)\n" + "2. Botella [B] (límite 7 litros)\n"
					+ "3. Botella [C] (límite 3 litros)\n");
		}
		
		// Indica al usuario dónde puede vaciar la Botella A.
		public void showEmptyBottleA() {
			System.out.println("¿Dónde quieres verter el agua?\n"+"1. Botella [B]\n"+"2. Botella [C]\n"+"3. Retroceder\n");
		}
		
		// Indica al usuario dónde puede vaciar la Botella B.
		public void showEmptyBottleB() {
			System.out.println("¿Dónde quieres verter el agua?\n"+"1. Botella [A]\n"+"2. Botella [C]\n"+"3. Retroceder\n");
		}
		
		// Indica al usuario dónde puede vaciar la Botella C.
		public void showEmptyBottleC() {
			System.out.println("¿Dónde quieres verter el agua?\n"+"1. Botella [A]\n"+"2. Botella [B]\n"+"3. Retroceder\n");
		}
		
		// Advertencia de valor introducido no válido.
		public void notValidValue() {
			System.out.println("Valor introducido no válido, por favor, elija otro.\n");
		}
		
		// Advertencia de querer vaciar una botella ya vacía.
		public void alreadyEmpty() {
			System.out.println("¡Esa botella ya está vacía! Por favor, introduzca otra opción y pulse Intro.");
		}
		
		// Victoria
		public void printVictory() {
			System.out.println("¡¡Enhorabuena, has resuelto el enigma!!");
		}
		
		public void imprimirMenuMapaPrueba() {
			System.out.println("\n\n[w] Delante, [s] Atras, [a] Izquierda, [d] Derecha");
			
		}

		public void imprimirEleccionAleatoria(){
			System.out.println("Eligiendo aleatoriamente el primer turno");
		}
		public void imprimirMensajeTurno(int turno){
			int cero = 0;
			
			if(turno==cero) {
			System.out.println("Comenzarás tú");
			}else {
			System.out.println("Tu turno");
			}
		}
		public void imprimirInstruccionesUsuario() {
			System.out.println("Introduce una posicion del 1 al 9");
		}
		public void imprimirMensajeTurnoEnemigo() {
			System.out.println("Le toca a tu contrincante");
			System.out.println("El enemigo está eligiendo posición...");
		}
		public void imprimirMensajeComienzoEnemigo(int turno) {
			int cero=0;
			
			if(turno==cero) {
				System.out.println("Comenzará el enemigo");
			}else {
				System.out.println("Turno del enemigo");
			}
		}
		public void imprimirTrampas() {
			System.out.println("No hagas trampas debemos ganar limpiamente");
		}
		public void imprimirTrampasEnemigas() {
			System.out.println("Has impedido que el enemigo haga trampas");
		}
		
		public void imprimirPerder() {
			
			System.out.println( "╔────────────────────────╗\n"+
								"║El mal no puede ganar...║\n"
							  + "╚────────────────────────╝");
			
		}
		
		public void imprimirGanar() {
			
			System.out.println( "╔────────────────────────╗\n"+
								"║     FELICIDADES ...    ║\n"
							  + "╚────────────────────────╝");
			
		}
		
		public void imprimirEmpatar3Raya() {
			
			System.out.println( "╔─────────────────────────────╗\n"+
								"║Te has quedado a nada campeón║\n"
							  + "╚─────────────────────────────╝");
			
		}
		
	public void imprimirPersonajes(int i) {
		
		int cero = 0, uno = 1;
		if(i == cero) {
		System.out.println("\n                              ( oo|\r\n" + 
				"                         O    _\\=/_\r\n" + 
				"                         #   /  _  \\                 ______________\r\n" + 
				"                          \\\\//|/.\\|\\\\              /\r\n" + 
				"                           \\/_ \\_/ _||__________ /\r\n" + 
				" ______                   /   |\\ /| ||\r\n" + 
				"        \\_______________/     \\_ _/ #\r\n" + 
				"                              | | |\r\n" + 
				"                              | | |\r\n" + 
				"                              []|[]\r\n" + 
				"                              | | |\r\n" + 
				"_____________________________/_]_[_\\_______________________________");
		}
		
		if(i == uno) {
		System.out.println("\n                              ( oo|\r\n" + 
				"                         X    _\\=/_\r\n" + 
				"                         #   /  _  \\                 ______________\r\n" + 
				"                          \\\\//|/.\\|\\\\              /\r\n" + 
				"                           \\/_ \\_/ _||__________ /\r\n" + 
				" ______                   /   |\\ /| ||\r\n" + 
				"        \\_______________/     \\_ _/ #\r\n" + 
				"                              | | |\r\n" + 
				"                              | | |\r\n" + 
				"                              []|[]\r\n" + 
				"                              | | |\r\n" + 
				"_____________________________/_]_[_\\_______________________________");
		}
	}	
	public void imprimirIntroAjedrez() {
		System.out.println("\n\n╔═╗ ┬┌─┐┌┬┐┬─┐┌─┐┌─┐\r\n" + 
				"╠═╣ │├┤  ││├┬┘├┤ ┌─┘\r\n" + 
				"╩ ╩└┘└─┘─┴┘┴└─└─┘└─┘");
		System.out.println("[1] Intrucciones\n[2] Enfrentarse");
	}
	public void imprimirEjeX() {
		System.out.println("¿En que posición del eje X está la pieza a mover?");
	}
	public void imprimirEjeY() {
		System.out.println("¿En que posición del eje Y está la pieza a mover?");
	}
	public void ejerHorizontal() {
		System.out.println("A que casilla del eje horizontal debe moverse");
	}
	public void ejeVertical() {
		System.out.println("A que casilla del eje vertical debe moverse");
	}
	public void felicitacionesAjedrez() {
		System.out.println("Felicidades has pasado la prueba");
	}
	public void derrotaAjedrez() {
		System.out.println("Como siga así nos quedaremos atrapados para siempre...");
	}
	public void opcionvalida() {
		System.out.println("¡Introduzca una opción válida!");
	}
	
	public void imprimirLetreroOrillaDerecha() {
		System.out.println("Estamos en la orilla derecha:");
	}
	
	public void imprimirLetreroOrillaIzq() {
		System.out.println("Estamos en la orilla izquierda:");
	}
	
	public void imprimirMoverOrilla() {
		System.out.println("¿Qué quieres mover a la otra orilla?");
	}
}


