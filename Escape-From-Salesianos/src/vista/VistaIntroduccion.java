package vista;

import utilidades.*;

public class VistaIntroduccion {
	static int esperaLinea = 1200;// Atributo que se utiliza para fijar la espera entre una linea y otra

	public static void mostrarAngel() throws InterruptedException {// dibujo de Angel/Morfeo
		int esperaAngel = 5000;
		System.out.println("                                                                               \r\n"
				+ "                                                                               \r\n"
				+ "                                                                               \r\n"
				+ "                                                                               \r\n"
				+ "                                  ░░░░░░░░░░░                          \r\n"
				+ "                              ▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓                          \r\n"
				+ "                          ▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓                          \r\n"
				+ "                       ▒▓░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓░                 \r\n"
				+ "                     ░▓░░▒▒▒▒▒▒▒▒▒▒▒▒░░░░░▒▒▒▒▒▒▒▒▒▒▒▒░▒▓░                 \r\n"
				+ "                     ▓░▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░░░▒▒▒▒▒▒▒▒▒▒░░▓                   \r\n"
				+ "                    ▓░▒▒▒▒▒▒▒▒▒▒▒▒▒░░░░░░░░░▒▒▒▒▒▒▒▒▒▒▒▒▒░▓                  \r\n"
				+ "                   ▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓            \r\n"
				+ "                   ▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓               \r\n"
				+ "                   ▓░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓                  \r\n"
				+ "                   ▓░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓                \r\n"
				+ "                   ▓░▒▒▒▒▓▓▓▓▒▒▒▒▒▒▒▒░░░░░▒▒▒▒▒▒▒▒▓▓▓▓▒▒▒▒░▓                \r\n"
				+ "                   ▓░▒▒▓▓▒▒▒▒▓▓▓▓▓▓▒▒▒▒▒▒▒▒▒▓▓▓▓▓█▒▒▒▒▓▓▒▒░▓             \r\n"
				+ "               ▒▓▓ ▓░▒▓▓▒█▓▓████████▒▒▒▒▒▒▒████████▓▓█▒▓▓▒░▓ ▓▓               \r\n"
				+ "              ▓▓▒▒▓░░▒▒██▓██████████▓█████▓██████████▓█▓▒▒░░▓▒▒▓▓        \r\n"
				+ "              ▓░░▒▓░▒▒▒▓████████████▒▒░░░▒▒████████████▒▒▒▒░▓▒░▓▓      \r\n"
				+ "              ▓░░▒▓░▒▒▒▒▒██████████▒▒▒░░░▒▒▒██████████▒▒▒▒▒░▓▒░▒▓    \r\n"
				+ "              ▓▒▒▒▓░▒▒░░░░░████▓▒▒▒▒▒▒░░░▒▒▒▒▒▒█████░░░░░▒▒░▓▒▒▓▓        \r\n"
				+ "              ▓▒▒▒▓░▒▒▒▒▒▒▒▒▒░░▒▒▒▒▒▒░▒▒▒░▒▒▒▒▒░░░▒▒▒▒▒▒▒▒▒░▓▒▒▓▓       \r\n"
				+ "               ▒▓▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▒▒▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒▒▓░      \r\n"
				+ "               ▒▓░▒▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓██▓▓▓▓▓██▓▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▒░▓░     \r\n"
				+ "                  ▓▓░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓▓               \r\n"
				+ "                   ▓░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░░▒▒▒░░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓            \r\n"
				+ "                   ▓░▒▒▒▒▒▒▒▒▒▒▒▒░▒▓▓▓▓▓▓▓▓▓▒░▒▒▒▒▒▒▒▒▒▒▒▒░▓       \r\n"
				+ "                   ▓░▒▒▒▒▒▒▒▒▒▒▒░▓▓▒▒▒▒▒▒▒▒▒▓▓░▒▒▒▒▒▒▒▒▒▒▒░▓       \r\n"
				+ "                    ▓░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▓            \r\n"
				+ "                     ▓░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▓▓▓▓▓▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓     \r\n"
				+ "                     ░▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░▒▓░     \r\n"
				+ "                       ▒▓░▒▒▒▒▒▒▒▒▒▒▒░░░░░▒▒▒▒▒▒▒▒▒▒▒░▓░        \r\n"
				+ "                          ▓▓░░▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒▒░░▓▓                \r\n"
				+ "                              ▓░░░▒▒▒▒▒▒▒▒▒▒▒░░▒▓        \r\n"
				+ "                               ░░░▓▓▓▓▓▓▓▓▓▓▓░░░      \r\n" + "         ");
		Thread.sleep(esperaAngel);
	}

	public static void barraCarga() throws InterruptedException {// Barra de carga rápida que se para mas tiempo en el
																	// 99%
		int esperaMedia = 10;
		int laEternaEspera = 1990;// Tiempo de espera para el 99%
		for (int i = 0; i <= 100; i++) {
			Limpiar.clear();
			System.out.println("\t\t\t\t\t\tInicializando Ultimate Fantasy, sincronizando….");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t" + i + "%");
			Thread.sleep(esperaMedia);
			if (i == 99) {
				Thread.sleep(laEternaEspera);
			}
		}
		Thread.sleep(esperaLinea);
	}

	public static void mostrarIntroduccion() throws InterruptedException {// Muestra la introducción
		// Párrafo 1
		Limpiar.clear();
		System.out.println("Después de un ardua semana de exámenes, proyectos y  soborn… entrega de dádivas a los profesores en forma de diversos alimentos,");
		Thread.sleep(esperaLinea);
		System.out.println("vuelves a casa tan rápido cómo te lo permiten tus piernas y el concurrido tráfico. Tras comerte un señor potaje de garbanzos, echarte una siesta");
		Thread.sleep(esperaLinea);
		System.out.println("de 3 horas y media y plantearte la razón de tu existencia durante los 30 segundos que tardas en hacer de vientre, vas a tu cuarto a echarte una");
		Thread.sleep(esperaLinea);
		System.out.println("partidita al Ultimate Fantasy. ");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		// Párrafo 2
		Limpiar.clear();
		System.out.println("Entras en tu cuarto y se te hincha el pecho como un pavo al ver tu flamante VOP (Virtual Object Projector). El VOP es una consola");
		Thread.sleep(esperaLinea);
		System.out.println("puntera que, mediante la sincronización de las ondas cerebrales en tiempo real del usuario, permite a este jugar, experimentar y sentir los");
		Thread.sleep(esperaLinea);
		System.out.println("detalles del juego con un realismo pasmoso. Mientras se actualiza el último parche piensa en los pobres jabalíes e iletrados goblins que vas a");
		Thread.sleep(esperaLinea);
		System.out.println("diezmar con tu motosierra oxidada. Tras una angustiosa espera de 2 minutos, te colocas el casco (ocupa hasta la nariz) y arrancas el juego…");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		// Barra de carga
		Limpiar.clear();
		barraCarga();
		// Párrafo 3
		Limpiar.clear();
		System.out.println(
				"Todo se vuelve negro, algo va mal, pierdes momentáneamente la consciencia. Cuando empiezas a ver te encuentras…");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
	}

	public static void mostrarFase1() throws InterruptedException {// Muestra la introduccion a la primera fase
		// Párrafo 1
		Limpiar.clear();
		System.out.println(
				"Te encuentras en el Aula 08, sentado en tu sitio (sí, en el tuyo, justo como diría tu madre), vestido con la misma ropa con la que");
		Thread.sleep(esperaLinea);
		System.out.println("terminaste la jornada unas horas atrás. Estás solo, y parece que es de noche, ya que por las ventanas no se ve otra cosa que no sea penumbra.");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		// Párrafo 2
		Limpiar.clear();
		System.out.println(
				"Se te empieza a formar los goterones de sudor en la frente, y antes de entrar en estado de histeria y ponerte a gritar, te da por observar el");
		Thread.sleep(esperaLinea);
		System.out.println("reloj de la clase: las 20:30, la hora en la que te conectaste al VOP…");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		// Párrafo 3
		Limpiar.clear();
		System.out.println(
				"Empiezas a gritar la palabra clave “Terminar instancia”, pero la sesión no se cierra, permaneces en el mismo sitio sentado y anonanado, ya que");
		Thread.sleep(esperaLinea);
		System.out.println("estaba ocurriendo lo imposible: no puedes desconectarte del VOP.");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		// La clase huele mal
		Limpiar.clear();
		System.out.println(
				"Vuelves a dar gracias nuevamente a que el VOP no es capaz todavía de virtualizar los olores.");
		EsperaDeLectura.esperaDeLectura();
		// Párrafo 4
		Limpiar.clear();
		System.out.println(
				"Te giras en dirección hacia la pizarra y te encuentras con una siniestra imagen: tu profesor de programación, Ángel, está de pie, con un traje");
		Thread.sleep(esperaLinea);
		System.out.println("blanco impecable, corbata negra y unas ridículas gafas de sol negras sin patillas mirándote impasible.");
		EsperaDeLectura.esperaDeLectura();
	}

	public static void mostrarConversacion(String jugador) throws InterruptedException {// Muestra la introduccion la
																						// conversación con Angel con el
																						// nombre personalizado asignado
																						// como "jugador"
		mostrarAngel();
		Limpiar.clear();
		System.out.println("- ¿?: Saludos " + jugador
				+ ", veo que estás un poco desorientado, por no decir que te has quedado como tonto.");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();

		Limpiar.clear();
		System.out.println("- " + jugador + ": ¿Ángel? ¿Qué está pasando aquí? ¿Qué hago aquí? ¿Dónde está mi madre?");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();

		Limpiar.clear();
		System.out.println(
				"- ¿?: ¿Ángel? ¿Con qué así se llama esta representación? Yo no son Ángel, yo soy El Ángel, guardián de este programa, el “Master and Commander”");
		Thread.sleep(esperaLinea);
		System.out.println("de todo lo que ocurre en este lugar. Pero no sufras, estoy aquí para echarte un cable a salir de aquí para que… puedas volver con tu madre (deja entrever");
		Thread.sleep(esperaLinea);
		System.out.println("una leve y casi imperceptible sonrisita burlona) 乁(￣∇￣).");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		Limpiar.clear();
		System.out.println("- " + jugador
				+ ": Vale muy bien, ¿Eres un virus o qué? ¿Has venido de regalo con el último parche o qué?");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		Limpiar.clear();
		System.out.println(
				"- El Ángel: Como puedes ver las puertas y ventanas están cerradas a cal y canto y ni aun suponiendo que estuvieses en buena forma física, no");
		Thread.sleep(esperaLinea);
		System.out.println("podrías forzarla ni romperla. Debes ingeniártelas para salir de este sitio. Para ello, tienes en tu bolsillo derecho un regalito.");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		Limpiar.clear();
		System.out.println("- " + jugador + ": ⊙▂⊙ ¡!! ¿Qué es esta cosa? ¿Un smartphone?");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		Limpiar.clear();
		System.out.println(
				"- El Ángel: Es un Instanciador. Crea instancias u objetos de aquellos elementos que hayas escaneado con la cámara que viene detrás.");
		Thread.sleep(esperaLinea);
		System.out.println("Cuándo encuentres algo que consideres de interés, prueba a intentar escanearlo: quizás obtengas un código que te permita instanciar.");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		Limpiar.clear();
		System.out.println(
				"Miras detenidamente el aparato: es un smartphone negro simple y sin marca alguna, con una cámara detrás. En la pantalla solo hay una lista");
		Thread.sleep(esperaLinea);
		System.out.println("vacía y dos botones: Escanear e Instanciar.");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		Limpiar.clear();
		System.out.println("- " + jugador + ": Y si…");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		Limpiar.clear();
		System.out.println("- El Ángel: No hay “y sis”. Buena suerte.");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		Limpiar.clear();
	}
}
