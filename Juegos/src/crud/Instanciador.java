package crud;

import java.util.Arrays;

public class Instanciador {

	private Objeto ins [];

	public Instanciador(Objeto[] ins) {
		super();
		this.ins = ins;
	}

	public Objeto[] getIns() {
		return ins;
	}

	public void setIns(Objeto[] ins) {
		this.ins = ins;
	}

	@Override
	public String toString() {
		return "Instanciador [ins=" + Arrays.toString(ins) + "]";
	}


	
}
