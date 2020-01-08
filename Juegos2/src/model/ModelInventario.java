package model;

import java.util.Arrays;

public class ModelInventario {
	private ModelHerramientas listaDeHerramientas[];

	public ModelInventario(ModelHerramientas[] listaDeHerramientas) {
		super();
		this.listaDeHerramientas = new ModelHerramientas[10];
	}

	public ModelInventario(int tamInventario) {
		// TODO Auto-generated constructor stub
		this.listaDeHerramientas = new ModelHerramientas[tamInventario];
	}

	public ModelHerramientas[] getListaDeHerramientas() {
		return listaDeHerramientas;
	}

	public void setListaDeHerramientas(ModelHerramientas[] listaDeHerramientas) {
		this.listaDeHerramientas = listaDeHerramientas;
	}

	
	@Override
	public String toString() {
		return "Inventario [listaDeHerramientas=" + Arrays.toString(listaDeHerramientas) + "]";
	}
	

}
