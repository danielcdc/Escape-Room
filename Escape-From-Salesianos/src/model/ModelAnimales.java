package model;

import controller.ControllerJuegoGranjero;
import crud.CrudGranjero;
import datos.Datos;
import utilidades.Leer;

public class ModelAnimales {
		
	private String nombre;
	private boolean mostrar;
	private Datos d;
	
	public ModelAnimales(String nombre, boolean mostrar) {
		super();
		this.nombre = nombre;
		this.mostrar = mostrar;
	}
	
	public ModelAnimales(Datos d) {
		super();
		this.d = d;
	}

	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public boolean isMostrar() {
		return mostrar;
	}
	public void setMostrar(boolean mostrar) {
		this.mostrar = mostrar;
	}
	@Override
	public String toString() {
		return "ModelAnimales [nombre=" + nombre + ", mostrar=" + mostrar + "]";
	}
	
	public void empezarJuegoGranjero(CrudGranjero crg, ControllerJuegoGranjero cAnimal) {
		
		for(int i = 0; i < d.getListaAnimales().length; i++) {
			d.getListaAnimales()[i].setMostrar(true);
		}
		//CAMBIAME PUTA
		for(int i = 0; i < d.getListaAnimales1().length; i++) {
			d.getListaAnimales1()[i].setMostrar(false);
		}
		
		d.setTurno(d.getCero());
		

		while(d.getListaAnimales()[d.getCero()].isMostrar() || d.getListaAnimales()[d.getUno()].isMostrar() || d.getListaAnimales()[d.getDos()].isMostrar()) {
			if(d.getTurno() % d.getDos()==d.getCero()) {
				System.out.println("Estamos en la orilla derecha:");
				for(int i=0;i<d.getTres();i++) {
					if(d.getListaAnimales()[i].isMostrar()){
						System.out.println(d.getListaAnimales()[i].getNombre());
					}
				}//Cierre for
				System.out.println("¿Qué quieres mover a la otra orilla?");
				d.setAnimal(Leer.dato());
				crg.movimientoDerAIzq(d.getAnimal());
				if(!cAnimal.comprobarDerrotaDer(d)) {
					d.getListaAnimales()[d.getCero()].setMostrar(false);
					d.getListaAnimales()[d.getUno()].setMostrar(false);
					d.getListaAnimales()[d.getDos()].setMostrar(false);
					d.setVictoriaAnimales(false);
				}else {
					d.setVictoriaAnimales(true);
				}
				d.setTurno(d.getTurno()+d.getUno());
			}else {//Cierre turno
				System.out.println("Estamos en la orilla izquierda");
				for(int i=0;i<d.getTres();i++) {
					if(d.getListaAnimales1()[i].isMostrar()){
						System.out.println(d.getListaAnimales1()[i].getNombre());
					}
				}//Cierre for
				System.out.println("¿Qué quieres mover a la otra orilla?");
				d.setAnimal(Leer.dato());
				crg.movimientoIzqADer(d.getAnimal());
				if(!cAnimal.comprobarDerrotaIzq(d)) {
					d.getListaAnimales1()[d.getCero()].setMostrar(false);
					d.getListaAnimales1()[d.getUno()].setMostrar(false);
					d.getListaAnimales1()[d.getDos()].setMostrar(false);
					d.setVictoriaAnimales(false);
				}else {
					d.setVictoriaAnimales(true);
				}
				d.setTurno(d.getTurno()+d.getUno());
			}
			
		}
		if(d.isVictoriaAnimales()) {
			System.out.println("\n\n\n\nFelicidades has ganado");
			}else {
				System.out.println("\n\n\n\nHas perdido");
			}
	}
	

}
