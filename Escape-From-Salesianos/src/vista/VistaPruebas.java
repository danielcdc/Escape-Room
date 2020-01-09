package vista;

import datos.Datos;

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

}
