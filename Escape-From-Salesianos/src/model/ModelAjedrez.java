package model;

import controller.ControllerAjedrez;
import crud.CrudAjedrez;
import datos.Datos;
import utilidades.Leer;
import vista.VistaPruebas;

public class ModelAjedrez {
	
	private Datos d;

	public ModelAjedrez(Datos d) {
		super();
		this.d = d;
	}

	public Datos getD() {
		return d;
	}

	public void setD(Datos d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "ModelAjedrez [d=" + d + "]";
	}
	
	public void iniciarJuegoAjedrez(VistaPruebas vP,CrudAjedrez c1,ControllerAjedrez cj1) {
		do {
			System.out.println("\n\n╔═╗ ┬┌─┐┌┬┐┬─┐┌─┐┌─┐\r\n" + 
					"╠═╣ │├┤  ││├┬┘├┤ ┌─┘\r\n" + 
					"╩ ╩└┘└─┘─┴┘┴└─└─┘└─┘");
			System.out.println("[1] Intrucciones\n[2] Enfrentarse");
			d.setPul(Leer.datoInt());
			switch(d.getPul()) {
				case 1:
					vP.imprimirInstruccAjedrez();
					break;
				case 2:
					vP.imprimirTableroAjedrez(cj1,d);
					for(int i=0;i<d.getPosicionX().length;i++) {
						System.out.print(cj1.devolverPosicionX(i,d)+"  ");
					}
					System.out.println("¿En que posición del eje X está la pieza a mover?");
					c1.guardarX(d);
					for(int i=0;i<d.getPosicionY().length;i++) {
						System.out.print(cj1.devolverPosicionY(i,d)+"  ");
					}
					System.out.println("¿En que posición del eje Y está la pieza a mover?");
					c1.guardarY(d);
					System.out.println("A que casilla del eje horizontal debe moverse");
					c1.guardarMovX(d);
					System.out.println("A que casilla del eje vertical debe moverse");
					c1.guardarMovY(d);
					if((d.getPiezaEnX()=='F' && d.getPiezaEnY()=='2') && d.getMovimientoEnX()=='E'&& d.getMovimientoEnY()=='1') {
						System.out.println("Felicidades has pasado la prueba");
					}else {
						System.out.println("Como siga así nos quedaremos atrapados para siempre...");
					}
					break;
			}//cierre switch menu instrucciones y jugar 
		}while(!(d.getPiezaEnX()=='F' && d.getPiezaEnY()=='2') && !(d.getMovimientoEnX()=='E'&& d.getMovimientoEnY()=='1')); //Cierre del do de jugar e instrucciones
		
	}

}
