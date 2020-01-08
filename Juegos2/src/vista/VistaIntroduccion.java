package vista;

import utilidades.*;

public class VistaIntroduccion {

	static int esperaLinea = 500;
	
	public static void barraCarga() throws  InterruptedException{
		int esperaMedia= 10;
		int laEternaEspera = 1990;
		for(int i=0; i<=100; i++) {
			Limpiar.clear();
			System.out.println("\t\t\t\t\t\tInicializando Ultimate Fantasy, sincronizando….");
			System.out.println("");
			System.out.println("\t\t\t\t\t\t\t\t\t"+i+"%");
			Thread.sleep(esperaMedia);
			if (i==99) {
				Thread.sleep(laEternaEspera);
			}
		}
		Thread.sleep(esperaLinea);
	}
	public static void mostrarIntroduccion () throws  InterruptedException{
		//Párrafo 1
		Limpiar.clear();
		System.out.println("Después de un ardua semana de exámenes, proyectos y  soborn… entrega de dádivas a los profesores en forma de diversos alimentos,");
		Thread.sleep(esperaLinea);
		Limpiar.clear();
		System.out.println("Después de un ardua semana de exámenes, proyectos y  soborn… entrega de dádivas a los profesores en forma de diversos alimentos,\n"
				+ "vuelves a casa tan rápido cómo te lo permiten tus piernas y el concurrido tráfico. Tras comerte un señor potaje de garbanzos, echarte una siesta\n");
		Thread.sleep(esperaLinea);
		Limpiar.clear();
		System.out.println("Después de un ardua semana de exámenes, proyectos y  soborn… entrega de dádivas a los profesores en forma de diversos alimentos,\n"
				+ "vuelves a casa tan rápido cómo te lo permiten tus piernas y el concurrido tráfico. Tras comerte un señor potaje de garbanzos, echarte una siesta\n"
				+ "de 3 horas y media y plantearte la razón de tu existencia durante los 30 segundos que tardas en hacer de vientre, vas a tu cuarto a echarte una\n");
		Thread.sleep(esperaLinea);
		Limpiar.clear();
		System.out.println("Después de un ardua semana de exámenes, proyectos y  soborn… entrega de dádivas a los profesores en forma de diversos alimentos,\n"
				+ "vuelves a casa tan rápido cómo te lo permiten tus piernas y el concurrido tráfico. Tras comerte un señor potaje de garbanzos, echarte una siesta\n"
				+ "de 3 horas y media y plantearte la razón de tu existencia durante los 30 segundos que tardas en hacer de vientre, vas a tu cuarto a echarte una\n"
				+ "partidita al Ultimate Fantasy. ");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		//Párrafo 2
		Limpiar.clear();
		System.out.println("Entras en tu cuarto y se te hincha el pecho como un pavo al ver tu flamante VOP (Virtual Object Projector). El VOP es una consola");
		Thread.sleep(esperaLinea);
		Limpiar.clear();
		System.out.println("Entras en tu cuarto y se te hincha el pecho como un pavo al ver tu flamante VOP (Virtual Object Projector). El VOP es una consola\n"
				+ "puntera que, mediante la sincronización de las ondas cerebrales en tiempo real del usuario, permite a este jugar, experimentar y sentir los");
		Thread.sleep(esperaLinea);
		Limpiar.clear();
		System.out.println("Entras en tu cuarto y se te hincha el pecho como un pavo al ver tu flamante VOP (Virtual Object Projector). El VOP es una consola\n"
				+ "puntera que, mediante la sincronización de las ondas cerebrales en tiempo real del usuario, permite a este jugar, experimentar y sentir los\n"
				+ "detalles del juego con un realismo pasmoso. Mientras se actualiza el último parche piensa en los pobres jabalíes e iletrados goblins que vas a");
		Thread.sleep(esperaLinea);
		Limpiar.clear();
		System.out.println("Entras en tu cuarto y se te hincha el pecho como un pavo al ver tu flamante VOP (Virtual Object Projector). El VOP es una consola\n"
				+ "puntera que, mediante la sincronización de las ondas cerebrales en tiempo real del usuario, permite a este jugar, experimentar y sentir los\n"
				+ "detalles del juego con un realismo pasmoso. Mientras se actualiza el último parche piensa en los pobres jabalíes e iletrados goblins que vas a\n"
				+ "diezmar con tu motosierra oxidada. Tras una angustiosa espera de 2 minutos, te colocas el casco (ocupa hasta la nariz) y arrancas el juego…");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		//Barra de carga
		Limpiar.clear();
		barraCarga();
		//Párrafo 3
		Limpiar.clear();
		System.out.println("Todo se vuelve negro, algo va mal, pierdes momentáneamente la consciencia. Cuando empiezas a ver te encuentras…");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
	}

	public static void mostrarFase1 () throws  InterruptedException{
		//Párrafo 1
		Limpiar.clear();
		System.out.println("Te encuentras en el Aula 08, sentado en tu sitio (sí, en el tuyo, justo como diría tu madre), vestido con la misma ropa con la que");
		Thread.sleep(esperaLinea);
		Limpiar.clear();
		System.out.println("Te encuentras en el Aula 08, sentado en tu sitio (sí, en el tuyo, justo como diría tu madre), vestido con la misma ropa con la que\n"
				+ "terminaste la jornada unas horas atrás. Estás solo, y parece que es de noche, ya que por las ventanas no se ve otra cosa que no sea penumbra.");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		//Párrafo 2
		Limpiar.clear();
		System.out.println("Se te empieza a formar los goterones de sudor en la frente, y antes de entrar en estado de histeria y ponerte a gritar, te da por observar el");
		Thread.sleep(esperaLinea);
		Limpiar.clear();
		System.out.println("Se te empieza a formar los goterones de sudor en la frente, y antes de entrar en estado de histeria y ponerte a gritar, te da por observar el\n"
				+ "reloj de la clase: las 20:30, la hora en la que te conectaste al VOP…");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
		//Párrafo 3
		Limpiar.clear();
		System.out.println("Empiezas a gritar la palabra clave “Terminar instancia”, pero la sesión no se cierra, permaneces en el mismo sitio sentado y anonado, ya que");
		Thread.sleep(esperaLinea);
		Limpiar.clear();
		System.out.println("Empiezas a gritar la palabra clave “Terminar instancia”, pero la sesión no se cierra, permaneces en el mismo sitio sentado y anonado, ya que\n"
				+ "estaba ocurriendo lo imposible: no puedes desconectarte del VOP.");
		Thread.sleep(esperaLinea);
		EsperaDeLectura.esperaDeLectura();
	}
}
