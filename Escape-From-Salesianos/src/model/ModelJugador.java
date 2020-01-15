package model;

import java.util.Arrays;

public class ModelJugador {

	private String nombre;
	private int vida;
	private ModelObjeto[] inventario;
	private boolean victoria;

	public ModelJugador(String nombre, boolean victoria) {
		super();
		this.nombre = nombre;
		this.victoria = victoria;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	public ModelObjeto[] getInventario() {
		return inventario;
	}

	public void setInventario(ModelObjeto[] inventario) {
		this.inventario = inventario;
	}

	public boolean isVictoria() {
		return victoria;
	}

	public void setVictoria(boolean victoria) {
		this.victoria = victoria;
	}

	@Override
	public String toString() {
		return "ModelJugador [nombre=" + nombre + ", vida=" + vida + ", inventario=" + Arrays.toString(inventario)
				+ ", victoria=" + victoria + "]";
	}

}
