package vista;

import controller.ControllerMapa;
import model.ModelMapa;

public class VistaMenu {
									//Al metodo que quieras le añades esto
	public void cargarBarra() throws InterruptedException {
		System.out.println("CARGANDO...");
		
		//esto son los parones (milisegundos)
		Thread.sleep(1000);

		System.out.print(
				"     _        _    \r\n" + 
				"   _( )__   _( )__ \r\n" + 
				" _|     _|_|     _|\r\n" + 
				"(_   _ (_(_   _ (_ \r\n" + 
				"  |_( )__| |_( )__|\n");

		Thread.sleep(1000);

		System.out.print( 
				" _|     _|_|     _|\r\n" + 
				"(_   _ (_(_   _ (_ \r\n" + 
				"  |_( )__| |_( )__|\n");

		Thread.sleep(1000);

		System.out.print( 
				" _|     _|_|     _|\r\n" + 
				"(_   _ (_(_   _ (_ \r\n" + 
				"  |_( )__| |_( )__|\n");
		Thread.sleep(1000);

		System.out.print( 
				" _|     _|_|     _|\r\n" + 
				"(_   _ (_(_   _ (_ \r\n" + 
						   "  |_( )__| |_( )__|");
		Thread.sleep(3000);
		
		System.out.println("  \n  |      |_|      |________________________________________________\n"
				+ 		   "  |                                                                |\n"
				+ 		   "  |                                                                |\n"
				+ 		   "  |╔═╗ ┬ ┬┌─┐  ┌─┐┌─┐┌┬┐┬┌─┐┌┐┌┌─┐┌─┐  ┌─┐┬    ┌┬┐┬┌─┐┌┬┐┌─┐┬─┐┬┌─┐|\n" + 
						   "  |║═╬╗│ │├┤   │  │ │││││├┤ ││││  ├┤   ├┤ │    ││││└─┐ │ ├┤ ├┬┘││ │|\r\n" + 
				           "  |╚═╝╚└─┘└─┘  └─┘└─┘┴ ┴┴└─┘┘└┘└─┘└─┘  └─┘┴─┘  ┴ ┴┴└─┘ ┴ └─┘┴└─┴└─┘|\r\n" + 
				           "  |________________________________________________________________|");
		Thread.sleep(2000);
		System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n"
				+ "\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

	}
	
	public void imprimirPortada() {

		System.out.println(
				"   \t/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\ \r\n"
			  + "    \t\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\/////////// ");

		System.out.println("\r\n"
				+ "                                                          ▄████████    ▄████████  ▄████████    ▄████████    ▄███████▄    ▄████████                         ██╗\r\n"
				+ "                                                         ███    ███   ███    ███ ███    ███   ███    ███   ███    ███   ███    ███                        ██╔╝\r\n"
				+ "                                                         ███    █▀    ███    █▀  ███    █▀    ███    ███   ███    ███   ███    █▀                        ██╔╝ \r\n"
				+ "                                                        ▄███▄▄▄       ███        ███          ███    ███   ███    ███  ▄███▄▄▄                          ██╔╝  \r\n"
				+ "                                                       ▀▀███▀▀▀     ▀███████████ ███        ▀███████████ ▀█████████▀  ▀▀███▀▀▀                         ██╔╝   \r\n"
				+ "                                                         ███    █▄           ███ ███    █▄    ███    ███   ███          ███    █▄                      ╚═╝    \r\n"
				+ "                                                         ███    ███    ▄█    ███ ███    ███   ███    ███   ███          ███    ███                             \r\n"
				+ "                                                         ██████████  ▄████████▀  ████████▀    ███    █▀   ▄████▀        ██████████                             \r\n"
				+ "                                                                                                                                                               \r\n"
				+ "                                                               ▄████████    ▄████████  ▄██████▄    ▄▄▄▄███▄▄▄▄                                             ██╗\r\n"
				+ "                                                              ███    ███   ███    ███ ███    ███ ▄██▀▀▀███▀▀▀██▄                                          ██╔╝\r\n"
				+ "                                                              ███    █▀    ███    ███ ███    ███ ███   ███   ███                                         ██╔╝ \r\n"
				+ "                                                             ▄███▄▄▄      ▄███▄▄▄▄██▀ ███    ███ ███   ███   ███                                        ██╔╝  \r\n"
				+ "                                                            ▀▀███▀▀▀     ▀▀███▀▀▀▀▀   ███    ███ ███   ███   ███                                       ██╔╝   \r\n"
				+ "                                                              ███        ▀███████████ ███    ███ ███   ███   ███                                       ╚═╝    \r\n"
				+ "                                                              ███          ███    ███ ███    ███ ███   ███   ███                                               \r\n"
				+ "                                                              ███          ███    ███  ▀██████▀   ▀█   ███   █▀                                                \r\n"
				+ "                                                                           ███    ███                                                                          \r\n"
				+ "                                                ▄████████    ▄████████  ▄█          ▄████████    ▄████████  ▄█     ▄████████ ███▄▄▄▄    ▄██████▄     ▄████████                       ██╗\r\n"
				+ "                                               ███    ███   ███    ███ ███         ███    ███   ███    ███ ███    ███    ███ ███▀▀▀██▄ ███    ███   ███    ███                      ██╔╝\r\n"
				+ "                                               ███    █▀    ███    ███ ███         ███    █▀    ███    █▀  ███▌   ███    ███ ███   ███ ███    ███   ███    █▀                      ██╔╝ \r\n"
				+ "                                               ███          ███    ███ ███        ▄███▄▄▄       ███        ███▌   ███    ███ ███   ███ ███    ███   ███                           ██╔╝  \r\n"
				+ "                                             ▀███████████ ▀███████████ ███       ▀▀███▀▀▀     ▀███████████ ███▌ ▀███████████ ███   ███ ███    ███ ▀███████████                   ██╔╝   \r\n"
				+ "                                                      ███   ███    ███ ███         ███    █▄           ███ ███    ███    ███ ███   ███ ███    ███          ███                   ╚═╝    \r\n"
				+ "                                                ▄█    ███   ███    ███ ███▌    ▄   ███    ███    ▄█    ███ ███    ███    ███ ███   ███ ███    ███    ▄█    ███ \r\n"
				+ "                                              ▄████████▀    ███    █▀  █████▄▄██   ██████████  ▄████████▀  █▀     ███    █▀   ▀█   █▀   ▀██████▀   ▄████████▀  \r\n"
				+ "                                                                       ▀                                                                                       \r\n"
				+ "");
		
		System.out.println(
				"   \t/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\__/\\\\\\\\\\\\\\\\\\\\\\ \r\n"
						+ "    \t\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\///////////__\\/////////// ");
		
		


	}
	
	public void imprimirMenu() {
		System.out.println("\t\t| [1] Iniciar\t\t\t\t\t\t|"
				+ "\n\t\t| [2] Más sobre Escape From Salesianos...\t\t|"
				+ "\n\t\t| [3] Donativo\t\t\t\t\t\t|"
				+ "\n\t\t| [0] Salir\t\t\t\t\t\t|\n"
				+   "\t\t|_______________________________________________________|");
	}
	
	public void imprimirMenuMapa(ModelMapa m1) {
		ControllerMapa cm = new ControllerMapa();
		
		cm.encontrarP(m1.getD().getMapaClase(), m1);
		
		System.out.println("\n\n[w] Delante, [s] Atras, [a] Izquierda, [d] Derecha");
		//ale
		if(m1.getD().getMapaClase()[m1.getD().getVertic()][m1.getD().getHoriz()] != '?' && 
				m1.getD().getMapaClase()[m1.getD().getVertic()][m1.getD().getHoriz()] != '!') {
			System.out.println("┌────────────────────┐\n"
					+ 		   "│  [M] Instanciador  │\n"
					+          "└────────────────────┘\n"); //Imprime el botón M
		}
		if(m1.getD().getMapaClase()[m1.getD().getVertic()][m1.getD().getHoriz()] == '?' || 
				m1.getD().getMapaClase()[m1.getD().getVertic()][m1.getD().getHoriz()] == '!') {
			System.out.println("┌────────────────────┐ ┌────────────────────┐\n"
					+ 		   "│  [I] Interactuar   │ │  [M] Instanciador  │\n"
					+          "└────────────────────┘ └────────────────────┘\n");//Imprime el botón M y el botón I
		}
		//F ale
	}

}
