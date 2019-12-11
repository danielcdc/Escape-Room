package puzzlelobo;

public class Animales {
		private String nombre;
		private boolean mostrar;
		public Animales(String nombre, boolean mostrar) {
			super();
			this.nombre = nombre;
			this.mostrar = mostrar;
		}
		public Animales() {
			super();
		}
		public String getNombre() {
			return nombre;
		}
		public void setNombre(String nombre) {
			this.nombre = nombre;
		}
		public boolean isMostrar() {
			return mostrar;
		}
		public void setMostrar(boolean mostrar) {
			this.mostrar = mostrar;
		}
		@Override
		public String toString() {
			return "Animales [nombre=" + nombre + ", mostrar=" + mostrar + "]";
		}
		
		
}
