package model;

public class Archivador {
	boolean abierto;

	public Archivador(boolean abierto) {
		super();
		this.abierto = abierto;
	}

	public boolean isAbierto() {
		return abierto;
	}

	public void setAbierto(boolean abierto) {
		this.abierto = abierto;
	}

	@Override
	public String toString() {
		return "Archivador [abierto=" + abierto + "]";
	}

}
