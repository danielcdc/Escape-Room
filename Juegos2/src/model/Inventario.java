package model;

import java.util.Arrays;

public class Inventario {
	private Herramientas listaDeHerramientas[];

	public Inventario(Herramientas[] listaDeHerramientas) {
		super();
		this.listaDeHerramientas = new Herramientas[10];
	}

	public Inventario(int tamInventario) {
		// TODO Auto-generated constructor stub
		this.listaDeHerramientas = new Herramientas[tamInventario];
	}

	public Herramientas[] getListaDeHerramientas() {
		return listaDeHerramientas;
	}

	public void setListaDeHerramientas(Herramientas[] listaDeHerramientas) {
		this.listaDeHerramientas = listaDeHerramientas;
	}

	
	@Override
	public String toString() {
		return "Inventario [listaDeHerramientas=" + Arrays.toString(listaDeHerramientas) + "]";
	}
	

}
