package datos;

import model.*;

public class DatosInventario {
	public ModelHerramientas soplete=new ModelHerramientas("Soplete", "Un soplete normal y corriente. Tiene un conejo blanco impreso en él y una frase de advertencia: NO funde adamantiun. Inflamable significa flamable");
	public ModelHerramientas cdrom=new ModelHerramientas("CD-ROM", "El título impreso en la carcasa reza lo siguiente: “Juego de ajedrez sencillito para Dummies. Edad recomendada de 2 a 5 años mentales");
	public ModelHerramientas lupa=new ModelHerramientas("Lupa", "Para usarla presiona la tecla del logotipo de Windows (⊞ Win) + signo más (+)");
	public DatosInventario() {
		super();
	}
	public DatosInventario(ModelHerramientas soplete, ModelHerramientas cdrom, ModelHerramientas lupa) {
		super();
		this.soplete = soplete;
		this.cdrom = cdrom;
		this.lupa = lupa;
	}
	public ModelHerramientas getSoplete() {
		return soplete;
	}
	public void setSoplete(ModelHerramientas soplete) {
		this.soplete = soplete;
	}
	public ModelHerramientas getCdrom() {
		return cdrom;
	}
	public void setCdrom(ModelHerramientas cdrom) {
		this.cdrom = cdrom;
	}
	public ModelHerramientas getLupa() {
		return lupa;
	}
	public void setLupa(ModelHerramientas lupa) {
		this.lupa = lupa;
	}
	@Override
	public String toString() {
		return "DatosInventario [soplete=" + soplete + ", cdrom=" + cdrom + ", lupa=" + lupa + "]";
	}
}
