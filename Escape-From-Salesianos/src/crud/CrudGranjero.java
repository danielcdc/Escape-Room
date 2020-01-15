package crud;

import datos.Datos;

public class CrudGranjero {
		private Datos d;
		
	public Datos getD() {
			return d;
		}

		
		public CrudGranjero(Datos d) {
		super();
		this.d = d;
	}


		public void setD(Datos d) {
			this.d = d;
		}

	

	public CrudGranjero() {
			super();
		}


	public void movimientoDerAIzq(String animal) {
		int cero=0,uno=1,dos=2;
		boolean mostrarD=false,mostrarI=true;
		if(d.getListaAnimales()[cero].getNombre().equalsIgnoreCase(animal)) {
			d.getListaAnimales()[cero].setMostrar(mostrarD);
			d.getListaAnimales1()[cero].setMostrar(mostrarI);
		}
		if(d.getListaAnimales()[uno].getNombre().equalsIgnoreCase(animal)){
			d.getListaAnimales()[uno].setMostrar(mostrarD);
			d.getListaAnimales1()[uno].setMostrar(mostrarI);
		}
		if(d.getListaAnimales()[dos].getNombre().equalsIgnoreCase(animal)){
			d.getListaAnimales()[dos].setMostrar(mostrarD);
			d.getListaAnimales1()[dos].setMostrar(mostrarI);
		}
	}
	
	public void movimientoIzqADer(String animal) {
		boolean mostrarD=true,mostrarI=false;
		if(d.getListaAnimales1()[d.getCero()].getNombre().equalsIgnoreCase(animal)) {
			d.getListaAnimales1()[d.getCero()].setMostrar(mostrarI);
			d.getListaAnimales()[d.getCero()].setMostrar(mostrarD);
		} 
		if(d.getListaAnimales1()[d.getUno()].getNombre().equalsIgnoreCase(animal)) {
			d.getListaAnimales1()[d.getUno()].setMostrar(mostrarI);
			d.getListaAnimales()[d.getUno()].setMostrar(mostrarD);
		}
		if (d.getListaAnimales1()[d.getDos()].getNombre().equalsIgnoreCase(animal)){
			d.getListaAnimales1()[d.getDos()].setMostrar(mostrarI);
			d.getListaAnimales()[d.getDos()].setMostrar(mostrarD);
		}
	}
}
