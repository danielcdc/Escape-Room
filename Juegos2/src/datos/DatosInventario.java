package datos;

import model.*;

public class DatosInventario {
	
	public Herramientas soplete=new Herramientas("Soplete", "Quema cosas");
	public Herramientas cdrom=new Herramientas("CD-ROM", "Un disco");
	public Herramientas lupa=new Herramientas("Lupa", "Ver mejor");
	
	public DatosInventario() {
		super();
	}
	public DatosInventario(Herramientas soplete, Herramientas cdrom, Herramientas lupa) {
		super();
		this.soplete = soplete;
		this.cdrom = cdrom;
		this.lupa = lupa;
	}
	public Herramientas getSoplete() {
		return soplete;
	}
	public void setSoplete(Herramientas soplete) {
		this.soplete = soplete;
	}
	public Herramientas getCdrom() {
		return cdrom;
	}
	public void setCdrom(Herramientas cdrom) {
		this.cdrom = cdrom;
	}
	public Herramientas getLupa() {
		return lupa;
	}
	public void setLupa(Herramientas lupa) {
		this.lupa = lupa;
	}
	@Override
	public String toString() {
		return "DatosInventario [soplete=" + soplete + ", cdrom=" + cdrom + ", lupa=" + lupa + "]";
	}
	
	

}
