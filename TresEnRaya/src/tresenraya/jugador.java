package tresenraya;



public class jugador {
		
		
		private char fichas;
		private boolean victoria;
		
		public jugador( char fichas, boolean victoria) {
			super();
			
			this.fichas = fichas;
			this.victoria = victoria;
		}
		
		
		public jugador() {
			super();
		}


		public char getfichas() {
			return fichas;
		}
		public void setFichas(char fichas) {
			this.fichas = fichas;
		}
		public boolean getVictoria() {
			return victoria;
		}
		public void setVictoria(boolean victoria) {
			this.victoria = victoria;
		}


		@Override
		public String toString() {
			return "jugador [fichas=" + fichas + ", victoria=" + victoria + "]";
		}

		
		
		
		
		
}
