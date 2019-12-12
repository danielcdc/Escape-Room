package puzzlelobo;

public class Ppal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int dos=2,turno=0;
		boolean mostrar=false;
		String lobo="lobo",oveja="oveja",lechuga="lechuga";
		Animales listaAnimales[]=new Animales[dos];
		
		for(int i=0;i<listaAnimales.length;i++) {
			if(i==0) {
				listaAnimales[i]=new Animales(lobo,mostrar);
			}else if(i==1) {
				listaAnimales[i]=new Animales(oveja,mostrar);
			}else {
				listaAnimales[i]=new Animales(lechuga,mostrar);
			}
		}
		System.out.println("Comenzaremos en la orilla derecha");
		
		
		
	}

}
