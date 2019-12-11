package main;

import crud.*;

public class TestAle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int nVs=0;
		Instanciador [] ins = new Instanciador [100];
		String nombreSoplete = "Soplete", descripcionSoplete="quema cosas";
		
		Objeto lista[] = new Objeto[10];
		System.out.println("Recojes soplete");
		lista[nVs]=new Objeto (nombreSoplete, descripcionSoplete, true);
		nVs++;
		for(int i=0; i<ins.length; i++) {
			ins[i].mostrarDescripcion(i, ins);
		}
		

	}

}
