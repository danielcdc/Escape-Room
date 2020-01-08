package model;

import datos.Datos;

public class ModelMapa {
	//¿No es necesario indicarle el tipo de acceso?
	Datos d;
	//Constructor
	public ModelMapa(Datos d) {
		super();
		this.d = d;
	}
	//Getters y Setters
	public Datos getD() {
		return d;
	}

	public void setD(Datos d) {
		this.d = d;
	}

	@Override
	public String toString() {
		return "ModelMapa [d=" + d + "]";
	}

}
