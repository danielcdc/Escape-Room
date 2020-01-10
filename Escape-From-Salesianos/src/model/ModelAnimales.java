package model;

public class ModelAnimales {
		
	private String nombre;
	private boolean mostrar;
	
	public ModelAnimales(String nombre, boolean mostrar) {
		super();
		this.nombre = nombre;
		this.mostrar = mostrar;
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
	

}
