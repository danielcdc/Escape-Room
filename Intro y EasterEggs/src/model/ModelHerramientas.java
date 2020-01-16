package model;

public class ModelHerramientas {
	private String nombre;
	private String descripcion;
	private boolean guardado;
	public ModelHerramientas(String nombre, String descripcion, boolean guardado) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.guardado = guardado;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public boolean getGuardado() {
		return guardado;
	}
	public void setGuardado(boolean guardado) {
		this.guardado = guardado;
	}
	@Override
	public String toString() {//toString modificado para mostrar el inventario
		return "║Nombre: " + nombre + "\n║Descripcion: " + descripcion;
	}
	
	

}
