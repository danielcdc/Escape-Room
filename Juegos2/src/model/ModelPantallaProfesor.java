package model;

public class ModelPantallaProfesor {
	boolean encendido;

	public ModelPantallaProfesor(boolean encendido) {
		super();
		this.encendido = encendido;
	}

	public boolean isEncendido() {
		return encendido;
	}

	public void setEncendido(boolean encendido) {
		this.encendido = encendido;
	}

	@Override
	public String toString() {
		return "PantallaProfesor [encendido=" + encendido + "]";
	}
	

}
