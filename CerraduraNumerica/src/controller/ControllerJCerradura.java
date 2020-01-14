package controller;

import datos.Datos;
import vista.VistaJCerradura;
import crud.CrudJCerradura;
import utilidades.Leer;

public class ControllerJCerradura {
	
//Este metodo sirve para leer el Operador y asi usarlo en un switch
	
public void leerOperador(Datos d, VistaJCerradura v, CrudJCerradura c, 
		ControllerJCerradura o) {
		
		int op = 0;
		op = Leer.datoInt();
		
		d.setOp(op);
		
		primerSwitch(d, o, c, v);
	}
//este metodo se ejecuta tras ejectuar la comprobacion de si es entre 1 y 7 y da positivo,
//sirve de enlaze
public void comprobado1a7(Datos d, VistaJCerradura v, CrudJCerradura c) {
	
	int elec = 0;
	elec = d.getOp() - 1;
	v.imprimirValorOp(d);
	d.setElec(elec);
	
	c.comprobarHuecoOcupado(d, v);
			
}


//Este es el primer switch el cual te permite elegir opcion en el menu principal
	public void primerSwitch(Datos d,ControllerJCerradura o, CrudJCerradura c,
			VistaJCerradura v) {
	
	switch (d.getOp()) {
	
	case 1:
		v.imprimirEjemplo(d);
		c.insertarNumero(d, o, c, v);
		
		break;
		
	case 2:
		v.imprimirMenuBorrar(d);
		c.borrarNumero(d, v);
		break;
		
	default:
		break;
	
	}
	}
	//hace que no puedas perder debido a 0
	public void inimitar0(Datos d) {
			
		int calculator1 = 0;
		int calculator2 = 0;
		int calculator3 = 0;
		calculator1 = d.getRes1();
		calculator2 = d.getRes2();
		calculator3 = d.getRes3();
		
		calculator1 = d.getCerradura()[0] * d.getCerradura()[2] * d.getCerradura()[5];
		calculator2 = d.getCerradura()[2] * d.getCerradura()[3] * d.getCerradura()[4];
		calculator3 = d.getCerradura()[1] * d.getCerradura()[4] * d.getCerradura()[6];
		
		if (calculator1 == 0 || calculator2 == 0 || calculator3 == 0) {

		d.setRes1(1);
		d.setRes2(2);
		d.setRes3(3);
		}
}

}
