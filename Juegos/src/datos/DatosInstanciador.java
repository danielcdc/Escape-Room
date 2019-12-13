package datos;

import crud.*;

public class DatosInstanciador {

	public Objeto [] ins = {new Objeto("Soplete", "Quema cosas", false), new Objeto("CD-ROM", "Un disco", false), new Objeto("Lupa", "Mejora para ver", false) };

	public DatosInstanciador() {
		super();
		this.ins = ins;
	}

	public Objeto[] getIns() {
		return ins;
	}

	public void setIns(Objeto[] ins) {
		this.ins = ins;
	}
	

}
