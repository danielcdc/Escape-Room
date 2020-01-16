package model;

import datos.Datos;

public class ModelMapa {

    Datos d;
   

    public ModelMapa(Datos d) {
		super();
		this.d = d;
	}

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
