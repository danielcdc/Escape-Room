package datos;

import model.*;

public class DatosInventario {
	
	public Herramientas soplete=new Herramientas("Soplete", "Un soplete normal y corriente. Tiene un conejo blanco impreso en él y una frase de advertencia: NO funde adamantiun. Inflamable significa flamable");
	public Herramientas cdrom=new Herramientas("CD-ROM", "El título impreso en la carcasa reza lo siguiente: “Juego de ajedrez sencillito para Dummies. Edad recomendada de 2 a 5 años mentales");
	public Herramientas lupa=new Herramientas("Lupa", "Para usarla presiona la tecla del logotipo de Windows (⊞ Win) + signo más (+)");
	
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
