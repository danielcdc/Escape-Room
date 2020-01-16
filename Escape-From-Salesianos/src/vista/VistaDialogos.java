package vista;

import model.ModelJugador;
import utilidades.EsperaDeLectura;

public class VistaDialogos {
	//Atributos
	int esperaLinea = 3000;// Controla el tiempo de espera a la que aparece cada línea.
	//Constructor
	public VistaDialogos() {
		
	}
	// Métodos
	// Diálogo 1: Imprime el diálogo tras superar el juego de la Pizarra.
	public void colarJuegoGranjero(ModelJugador j) throws InterruptedException {
		System.out.println("(Mientras asimilas la bizarrada que acabas de ver, escuchas un eco en tu cabeza) El Ángel - ¡Niño niño!");
		Thread.sleep(esperaLinea);
		System.out.println("(Te giras rápidamente hacia atrás, pero no hay nadie. Miras frenéticamente en todas las direcciones, pero nada.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - Creo que me estoy friendo el cerebro... A ver que hay detrás de la pue... ¿Pero que coj****?");
		Thread.sleep(esperaLinea);
		System.out.println("(Sorprendido, donde antes había una cerradura numérica, ahora hay una pantalla LCD con una pradera y un simpático"
				+ " granjero en medio.\nEl granjero te dice lo siguiente: \"Si la puerta quieres forzar, mi gratitud te has de ganar\"");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - Magnífico. Otra pruebecita chorra. ¡Espero que estés contento!");
		Thread.sleep(esperaLinea);
		System.out.println("(Escuchas en tu cabeza) El Ángel - Me parto y me mondo. Arreando que es gerundio.");
		EsperaDeLectura.esperaDeLectura();
	}
	// Diálogo 2: Imprime el diálogo tras superar el juego del Granjero.
	public void obtenerSoplete(ModelJugador j) throws InterruptedException {
		System.out.println(j.getNombre()+ " - Puf. Nada más salga de aquí, me voy a zampar un corderito entero.\n¡¡Ey, la cerradura ha desaparecido!! A ver que hay dentro...");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre()+ " - Que maravilla el VOP, lo ha calcado: hay tanto polvo como en la realidad. Mmm, ¿Qué es esto? Parece un soplete ... y tiene un código QR.\n"				
				+"Voy a probar a escanearlo, y... ");
		Thread.sleep(esperaLinea);
		System.out.println("Instanciador - Soplete añadido al Instancidador. Recuerde que los dematólogos NO recomiendan la ignito-depilación en casa.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - Ou Mama. Descuida, a estas alturas de la vida dudo que me vuelva metrosexual, o sexual en absoluto, para que engañarnos T_T");
		EsperaDeLectura.esperaDeLectura();		
	}
	// Diálogo 4: Imprime el diálogo tras superar el juego 3 en Raya y obtener el CD-ROM
	public void obtenerCD(ModelJugador j) throws InterruptedException{
		System.out.println(j.getNombre() + " - La partidita ha estado caldeada ... \n(Observas complaciente el manchón negro causado por el uso imprudente  del soplete)");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - Aunque vaya si escuece la puñetera quemadura, no me esperaba que el soplete fuera un lanzallamas de bolsillo.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - Bien, veamos que hay dentro de la puñetera cajita...¡¿Un CD-ROM?! ¡¿En serio?! ¡Joder, que estamos en el 2020 Ángel!");
		Thread.sleep(esperaLinea);
		System.out.println("(Escuchas en tu mente como un eco)- El Ángel - Y estando a 2020 aún no has limpiado el fondo de tu armario, y cada año nuevo juras que lo limpiarás, así desde 2008 so guarro.");
		Thread.sleep(esperaLinea);
		System.out.println("(Te giras rápidamente ante el súbito aguijonazo de la verdad, comprobando ansioso que en el aula no hay nadie)");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - ¿Cómo diantres sabes eso?");
		Thread.sleep(esperaLinea);
		System.out.println("El Ángel - Yo lo sé todo joven programador. Y yo que tú continuaría...No vaya a ser que me de por complicarte las cosas.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - Grrr, supongo que tiene razón el pelón. El CD-ROM tiene un código QR, voy a escanearlo...");
		Thread.sleep(esperaLinea);
		System.out.println("Instanciador - CD-ROM añadido al instanciador. Recuerde que debe colocar la parte brillante hacia abajo, a ser posible, si pringarla con los dedos.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - Hasta el Instanciador se recochinea de mí. No tiene maldad este juego ni ná...\nEn fin, voy a continuar, debe de haber algún ordenador"+
		" que pueda leer esto.");
		EsperaDeLectura.esperaDeLectura();		
	}
	// Diálogo 8: Imprime el diálogo tras supear el juego de la Botella.
	public void obtenerLupa(ModelJugador j) throws InterruptedException{
		System.out.println(j.getNombre() + " - ¡¡Por la retumbante voz de Dovahkiin y las barbas de Saruman!! Este juego si que ha sido una put***.\n¿Qué diantres? Me han censurado la última palabra...");
		Thread.sleep(esperaLinea);
		System.out.println("(Escuchas en tu mente como un eco) El Ángel - No se dicen palabrotas, estamos en un colegio salesiano.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - ¿Pero qué dices? ¡Pero si esto no es real! ¡Esta aula no es real, al igual que tú tampoco!");
		Thread.sleep(esperaLinea);
		System.out.println("El Ángel - ¿Estás completamente seguro de que no es real? A mí me parece que aún te escuece la quemadura que te hiciste.");
		Thread.sleep(esperaLinea);
		System.out.println("(Te miras la quemadura que te has hecho en la mano izquierda mientras maldices a El Ángel por lo bajo)");
		Thread.sleep(esperaLinea);
		System.out.println("El Ángel - Parece que duele, quizás deberías mandartelo a mirar. Puede que ese de ahí te sirva.");
		Thread.sleep(esperaLinea);
		System.out.println("(Miras en hacia la mesa de al lado y ves una lupa, al estilo Sherlock Holmes, que antes no estaba ahí)");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - Esto mejora por momentos (Das un profundo resoplido). ¿Qué será lo próximo? ¿Qué aparezca un examen de SQL?");
		Thread.sleep(esperaLinea);
		System.out.println("(Escuchas en tu mente una diabólica risa en tu mente que parece provenir de El Ángel. Algo dentro tuyo ha muerto y empiezas sudar como un pollo)");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - ... Mejor cierro el pico un rato. Eso ha sido muy siniestro. (Coges la lupa con la mano derecha)\nLa lupa tiene un código QR en mango, voy a escanearlo.");
		Thread.sleep(esperaLinea);
		System.out.println("Instanciador - Lupa añadida al instanciador. Deberías ser un poco más listo y hacerle caso a El Ángel.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - Mucho has dicho para no decir nad... Espera un segundo...\n (Te miras con lupa, literal, la quemadura de la mano izquierda y ante tu asombro "
				+ "ves lo siguiente)\n");
		Thread.sleep(esperaLinea);
		printCerradura();
		Thread.sleep(3000);
		System.out.println(j.getNombre() + " - ¡Me ha marcado como si de un esclavo me tratase!");
		Thread.sleep(esperaLinea);
		System.out.println("(Escuchas en tu mente como un eco)- El Ángel - Te falta añadir \"Sí, Dominus\". (Escuchas una leve carcajada)");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre()+ " - Encima de cachondeo, el que ha diseñado esta IA es de un pueblo de la sierra profunda de Cádiz fijo.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre()+" - Aunque bien es verdad que parece una pista. ¿Qué podrá ser? Debería ponerme en marcha y salir de aquí...");
		EsperaDeLectura.esperaDeLectura();		
	}
	
	public void printCerradura() {
		System.out.println(" ░░░███████████▓░░             \r\n" + 
				"       ░████████████████████░          \r\n" + 
				"     █████████████████████████░        \r\n" + 
				"   ▓███████████▓░░ ░░███████████░      \r\n" + 
				"  ████████████░       ░██████████░     \r\n" + 
				"░████████████          ███████████░    \r\n" + 
				"█████████████░░       ░████████████░   \r\n" + 
				"██████████████▒░░   ░░█████████████▓   \r\n" + 
				"████████████████░   ▓███████████████   \r\n" + 
				"████████████████░   ░███████████████   \r\n" + 
				"███████████████░     ███████████████   \r\n" + 
				"███████████████░     ░█████████████░   \r\n" + 
				"░█████████████▒      ░█████████████    \r\n" + 
				"  ████████████░       ████████████     \r\n" + 
				"  ░███████████░       ░█████████░░     \r\n" + 
				"    ░████████░        ░████████░       \r\n" + 
				"      ░█████████████████████░░         \r\n" + 
				"         ░▒██████████████░    \n");
	}
	// Diálogo 3: Imprime el diálogo tras usar el soplete, dando lugar al comienzo del juego de 3 en Raya.
	public void comentarioSoplete(ModelJugador j) throws InterruptedException{
		System.out.println(j.getNombre()+ " - Vaya, vaya. En el archivador del profesor hay una especie símbolo con la forma de llama. (Tu mente pirónmana ríe internamente).");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() +" - Voy a probar a meterle fuego, ¿Qué puede salir mal en un lugar virtual como este?\n(Sacas tu Instanciador del bolsillo, seleccionas"+
				" el soplete y pulsas Instanciar. Mágicamente, aparece un soplete idéntico al que encontraste en el cuartucho sucio)");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - Apunto a la víctima, y luego...¿Qué? Parece que hay un botón en el asa, lo voy a pulsar... (Pulsas el botón y...)");
		Thread.sleep(esperaLinea);
		System.out.println("El Ángel - Dracarys.");
		System.out.println("(FLOASSSSSH! Del soplete sale una deflagración más caliente que los empastes de un dragón.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() + " - ¡Ahí va la ostia Paxti! !¿Qué demonios tiene esto dentro?¡ ¿Napalm? ¿Cuajada? Me he quemado la mano izquierda y todo...");
		Thread.sleep(esperaLinea);
		System.out.println("(Observas detenidamente el estropicio que has causado, mientras te lames el anverso de la mano calcinada.\nHas dejado un boquete del tamaño de"
				+" la cabeza de una vaca. Dentro hay una cajita de metal con una pantalla Led acoplada)");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() +" - ¿Qué es esto? ¿Una caja dentro de una caja? Que original. ¿Qué pasa si toco la pantalla?");
		Thread.sleep(esperaLinea);
		System.out.println("(En la pantalla se imprime lo que parece un juego del 3 en Raya con una apariencia muy molona)");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() +" - Me parece que tendré que jugar. No parece haya ningún tipo de cerradura o pliegue para abrir la cajita. Al lío pues.");
		EsperaDeLectura.esperaDeLectura();
	}
	// Diálogo 5: Imprime el diálogo que da lugar al juego del Ajedrez.
	public void comentarioCdRom(ModelJugador j) throws InterruptedException {
		System.out.println(j.getNombre() +" - ¡Ey! Este ordenador tiene un lector CD-ROM. ¡Qué sucia está la mesa, demonios! Bueno, voy a introducirlo a ver que sale.");
		Thread.sleep(esperaLinea);
		System.out.println("(Introduces el CD-ROM en el lector. Escuchas el arcaico y característico sonido de los engranajes de plástico moviendose)");
		Thread.sleep(esperaLinea);
		System.out.println("(En la pantalla aparece El Ángel) - El Ángel - Pareces que vas avanzando pequeño saltamontes. Aunque espero que sepas jugar a la ajedrez.");
		Thread.sleep(esperaLinea);
		System.out.println("(Das un exhabrupto al manifestarse de repente la cara de El Ángel en la pantalla del ordenador)");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() +" - ¡La Virgen que susto! ¡Podrías avisar antes de aparecer así!");
		Thread.sleep(esperaLinea);
		System.out.println("El Ángel - Si quieres me desnudo.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() +" - ¡NO NO! ¿Dices que si sé jugar al ajedrez? Sí, jugué alguna vez.");
		Thread.sleep(esperaLinea);
		System.out.println("El Ángel - Que rápido te has dispuesto a la tarea. Muy bien, haz tu jugada maestra.");
		Thread.sleep(esperaLinea);
		System.out.println("(Acto seguido se desvanece la cara de El Ángel. Das un suspiro de alivio y ante ti se muestra un tablero de ajedrez con unas piezas ya dispuestas.");
		EsperaDeLectura.esperaDeLectura();
	}
	// Diálogo 6: Imprime el diálogo posterior al juego del Ajedrez.
	public void victoriaAjedrez(ModelJugador j) throws InterruptedException {
		System.out.println("(Se escucha el sonido que emitía el SO Windows XP al realizar jaque mate.\nUn lagrimilla recorre tu grasienta cara y evocas bellos recuerdos de tardes"
				+ " jugando al Pinball y viendo como moría tu PC al haberte descargado 2000 virus por Emule.");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() +" - Eso ha sonado por aquí cerca. Debería comprobar los ordenadores.");
		EsperaDeLectura.esperaDeLectura();
	}
	// Diálogo 7: Imprime el diálogo al interactuar con la mesa del profesor y da lugar al juego de la botella.
	public void comienzoJuegoBotella(ModelJugador j) throws InterruptedException {
		System.out.println(j.getNombre() +" - Vaya, resultaba ser el ordenador del profesor. Me está pidiendo una contraseña. Mmmm...");
		Thread.sleep(esperaLinea);
		System.out.println("(Pruebas a introducir 1234 y da error. Demasiado evidente. Introduces 4321 y acepta la contraseña. Quién lo iba a decir.)");
		Thread.sleep(esperaLinea);
		System.out.println("(Acto seguido, aparece en pantalla un fondo negro con un montón de 0s y 1s de color verde cayendo en cascada. Muy original.\nHay un iconito de un vaso"
				+ " con un nombre debajo: Click_Me");
		Thread.sleep(esperaLinea);
		System.out.println("Miras con sospecha el iconito, pero tu instinto programador te insta a clickear con fiereza el ratón del profesor sobre el icono.");
		Thread.sleep(esperaLinea);
		System.out.println("(Aparece en pantalla lo que parece 3 botellas y unas instrucciones)");
		Thread.sleep(esperaLinea);
		System.out.println(j.getNombre() +" - Estas botellas me han dado sed. Mataría por una cerveza. A ver de que va esto...");
		EsperaDeLectura.esperaDeLectura();
	}
	// Diálogo 9: Imprime el diálogo que da fin a la partida.
	public void endGame(ModelJugador j) throws InterruptedException{
		System.out.println("(Te acercas a la puerta e intentas abrirla, pero no cede bajo ningún medio)");
		Thread.sleep(esperaLinea);
		System.out.println(" - Aunque ahora que me fijo, parece que hay unas muescas diminutas en torno a la cerradura.\nVoy a probar a mirar con la lupa...");
		Thread.sleep(esperaLinea);
		System.out.println("(Procedes a mirar con la lupa el hueco de la cerradura y en el contorno logras apreciar unas palabras: \"No hay puerta\"");
		Thread.sleep(esperaLinea);
		System.out.println("(En menos de lo que dura un parpadeo y salir de tu asombro, apartas la vista de la cerradura y te das cuenta, boquiabierto, que la"
				+ " la puerta ha desaparecido. En su lugar está El Ángel mirándote altivamente con una sonrisita de oreja a oreja)");
		Thread.sleep(esperaLinea);
		System.out.println("(Antes de que puedas gesticular palabra te agarra por la camiseta con ambas manos con una fuerza sorprendente, acercandose a tu oreja"
				+ "derecha)- El Ángel - Hasta la vista, baby.");
		Thread.sleep(esperaLinea);
		System.out.println("(Acto seguido de transmitir tan fatal mensaje, te lanza por los aires hacia el patio cuadrado. Te acercas al suelo mientras gritas...");
		Thread.sleep(esperaLinea);
		System.out.println("(De repente lo ves, todo oscuro. Te llevas frenético las manos a la cabeza. Te quitas de encima el VOP y observas que estás en tu cuarto.");
		Thread.sleep(esperaLinea);
		System.out.println("(Observas el reloj: son las 21:30. Ha pasado solo una hora desde que te conectaste al VOP.");
		Thread.sleep(esperaLinea);
		System.out.println(" - Buf, vaya pesallida. (Acto seguido te da por mirarte la mano izquierda: tienes una quemadura con forma de la boca de una cerradudra."
				+ "No das crédito a lo que ves y recuerdas algo que dijo El Ángel minutos antes: \"¿Estás completamente seguro de que no es real?\")");
		Thread.sleep(esperaLinea);
		System.out.println("(En tu mente se cruza la cara de El Ángel sonriendo malévolamente)");
		Thread.sleep(esperaLinea);
		System.out.println("¿Continuará?");
	}
}
