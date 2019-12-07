package tresenraya;

import java.util.Random;

public class Jugabilidad {
		private boolean turno;
		
	
	public Jugabilidad(boolean turno) {
			super();
			this.turno = turno;
		}
	


	public Jugabilidad() {
		super();
	}



	public boolean isTurno() {
			return turno;
		}


		public void setTurno(boolean turno) {
			this.turno = turno;
		}


	public boolean generarTurnoInicial() {//Genera un turno inicial si el numero aleatorio es mayor que 5 empieza usuario sino el enemigo
		int num,hasta=10,desde=0,cinco=5;
		Random rnd=new Random(System.nanoTime());
		num=rnd.nextInt(hasta-desde+1)+desde;
		if(num<cinco) {
			turno=true;
		}
		return turno;
	}
	public int generarTurnoRival(){//Genera la posición que el enemigo usará
		int num,uno=1,hasta=8,desde=0;
		Random rnd=new Random(System.nanoTime());
		num=rnd.nextInt(hasta-desde+uno)+desde;
		return num;
	}
}
