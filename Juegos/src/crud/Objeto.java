package crud;

public class Objeto {
	String nombre;
	String descripcion;
	boolean instanciado;
	
	public Objeto(String nombre, String descripcion, boolean instanciado) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.instanciado = instanciado;
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

	public boolean isInstanciado() {
		return instanciado;
	}

	public void setInstanciado(boolean instanciado) {
		this.instanciado = instanciado;
	}

}
