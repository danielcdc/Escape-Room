package vista;

public class Introduccion {
	
	public static void esperaDeLectura() throws  InterruptedException{
		System.out.println("Pulsa Enter para continuar.");
	}
	
	public static void barraCarga() throws  InterruptedException{
		int esperaLinea= 1000;
		Thread.sleep(esperaLinea);
	}
	public static void mostrarIntroduccion () throws  InterruptedException{
		//Párrafo 1
		int esperaLinea= 1000;
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
		esperaDeLectura();
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
		esperaDeLectura();
		//Párrafo 3
		Limpiar.clear();
		System.out.println("Inicializando Ultimate Fantasy, sincronizando….");
		System.out.println("____________");
		System.out.println("");
		System.out.println("");
		
		

	}

}
