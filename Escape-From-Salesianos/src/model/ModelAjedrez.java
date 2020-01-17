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
			vP.imprimirIntroAjedrez();
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
					vP.imprimirEjeX();
					c1.guardarX(d);
					for(int i=0;i<d.getPosicionY().length;i++) {
						System.out.print(cj1.devolverPosicionY(i,d)+"  ");
					}
					vP.imprimirEjeY();
					c1.guardarY(d);
					vP.ejerHorizontal();
					c1.guardarMovX(d);
					vP.ejeVertical();
					c1.guardarMovY(d);
					if(((d.getPiezaEnX("F") && d.getPiezaEnY("2")) && (d.getMovimientoEnX("E") && d.getMovimientoEnY("1")))) {
						vP.imprimirGanar();
						d.setVictoriaAjedrez(true);
					}else {
						vP.imprimirPerder();
					}
					break;
			}//cierre switch menu instrucciones y jugar 
		}while(!((d.getPiezaEnX("F") && d.getPiezaEnY("2")) && !(d.getMovimientoEnX("E") && d.getMovimientoEnY("1")))); //Cierre del do de jugar e instrucciones
		
	}

}
