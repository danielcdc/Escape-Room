package crud;

import model.ModelJuegoBotella;

public class CrudJuegoBotella {

	// Methods

	/*
	 * Mueve el agua de una botella a otra. La ubicamos en CRUD debido a que los
	 * métodos aquí ubicados solo actualiza los atributos del juego (las botellas,
	 * guardadas en la clase Datos).
	 */
	public void transferAToB(ModelJuegoBotella m) {
		int botellaA;
		int botellaB;
		int cero = 0;

		// Se ejecuta si la botella que se quiere vaciar tiene una contenido mayor o
		// igual que aquella donde se quiere verter.
		if (m.getD().getBotella10() >= m.getD().getBotella7()) {

			if (m.getD().getBotella10() + m.getD().getBotella7() > m.getD().getLimite7()) {// Se ejecuta si la suma del
																							// contenido de la botella A
																							// y la botella B
				// es superior al límite de la botella B.

				botellaA = m.getD().getBotella10() - (m.getD().getLimite7() - m.getD().getBotella7());// Vacía la
																										// botella A.
				m.getD().setBotella10(botellaA);// Actualiza el valor del a botella A.

				botellaB = m.getD().getLimite7();// Llena enteramente la botella B.
				m.getD().setBotella7(botellaB);// Actualiza el valor de la botella B.

			} else {// Se ejecuta si la suma del contenido de la botella A y la botella B no supera
					// el límite establecido para esta última.

				botellaB = m.getD().getBotella10() + m.getD().getBotella7();// Vierte el contenido de la botella A en la
																			// botella B.
				m.getD().setBotella7(botellaB); // Actualiza el contenido de la botella B.

				botellaA = cero;// Vacía completamente la botella A.
				m.getD().setBotella10(botellaA);// Actualiza el valor de la botella A.
				;

			}
		}

		// Se ejecuta si la botella que se vacía tiene un contenido menor que aquella
		// donde se quiere verter
		if (m.getD().getBotella10() < m.getD().getBotella7()) {

			if (m.getD().getBotella10() + m.getD().getBotella7() > m.getD().getLimite7()) {// Se ejecuta si la suma del
																							// contenido de la botella A
																							// y la botella B
				// es superior al límite de la botella B.

				botellaA = m.getD().getBotella10() - (m.getD().getLimite7() - m.getD().getBotella7());// Vacía la
																										// botella A.
				m.getD().setBotella10(botellaA);// Actualiza el valor de la botella A.

				botellaB = m.getD().getLimite7();// Llena completamente la botella B.
				m.getD().setBotella7(botellaB);// Actualiza el valor de la botella B.

			} else {// Se ejecuta si la suma del contenido de la botella A y la botella B no supera
					// el límite establecido para esta última.

				botellaB = m.getD().getBotella10() + m.getD().getBotella7();// Vierte el contenido de la botella A en la
																			// botella B.
				m.getD().setBotella7(botellaB);// Actualiza el contenido de la botella B.

				botellaA = cero;// Vacía completamente la botella A.
				m.getD().setBotella10(botellaA);// Actualiza el valor de la botella A.
			}
		}
	}

	/*
	 * Los comentarios sobre los métodos anteriormente explicados son extrapolables
	 * a los siguientes, ya que lo único que varía son las botellas (atributos) que
	 * participan.
	 */

	public void transferAToC(ModelJuegoBotella m) {
		int botellaA;
		int botellaC;
		int cero = 0;
		if (m.getD().getBotella10() >= m.getD().getBotella3()) {

			if (m.getD().getBotella10() + m.getD().getBotella3() > m.getD().getLimite3()) {

				botellaA = m.getD().getBotella10() - (m.getD().getLimite3() - m.getD().getBotella3());
				m.getD().setBotella10(botellaA);

				botellaC = m.getD().getLimite3();
				m.getD().setBotella3(botellaC);

			} else {

				botellaC = m.getD().getBotella10() + m.getD().getBotella3();
				m.getD().setBotella3(botellaC);

				botellaA = cero;
				m.getD().setBotella10(botellaA);

			}
		}

		if (m.getD().getBotella10() < m.getD().getBotella3()) {

			if (m.getD().getBotella10() + m.getD().getBotella3() > m.getD().getLimite3()) {

				botellaA = m.getD().getBotella10() - (m.getD().getLimite3() - m.getD().getBotella3());
				m.getD().setBotella10(botellaA);

				botellaC = m.getD().getLimite3();
				m.getD().setBotella3(botellaC);
			} else {

				botellaC = m.getD().getBotella10() + m.getD().getBotella3();
				m.getD().setBotella3(botellaC);

				botellaA = cero;
				m.getD().setBotella10(botellaA);
			}
		}

	}

	public void transferBToA(ModelJuegoBotella m) {
		int botellaB;
		int botellaA;
		int cero = 0;
		if (m.getD().getBotella7() >= m.getD().getBotella10()) {

			if (m.getD().getBotella7() + m.getD().getBotella10() > m.getD().getLimite10()) {

				botellaB = m.getD().getBotella7() - (m.getD().getLimite10() - m.getD().getBotella10());
				m.getD().setBotella7(botellaB);

				botellaA = m.getD().getLimite10();
				m.getD().setBotella10(botellaA);

			} else {

				botellaA = m.getD().getBotella7() + m.getD().getBotella10();
				m.getD().setBotella10(botellaA);

				botellaB = cero;
				m.getD().setBotella7(botellaB);

			}
		}

		if (m.getD().getBotella7() < m.getD().getBotella10()) {

			if (m.getD().getBotella7() + m.getD().getBotella10() > m.getD().getLimite10()) {

				botellaB = m.getD().getBotella7() - (m.getD().getLimite10() - m.getD().getBotella10());
				m.getD().setBotella7(botellaB);

				botellaA = m.getD().getLimite10();
				m.getD().setBotella10(botellaA);

			} else {

				botellaA = m.getD().getBotella7() + m.getD().getBotella10();
				m.getD().setBotella10(botellaA);

				botellaB = cero;
				m.getD().setBotella7(botellaB);
			}
		}

	}

	public void transferBToC(ModelJuegoBotella m) {
		int botellaB;
		int botellaC;
		int cero = 0;
		if (m.getD().getBotella7() >= m.getD().getBotella3()) {

			if (m.getD().getBotella7() + m.getD().getBotella3() > m.getD().getLimite3()) {

				botellaB = m.getD().getBotella7() - (m.getD().getLimite3() - m.getD().getBotella3());
				m.getD().setBotella7(botellaB);

				botellaC = m.getD().getLimite3();
				m.getD().setBotella3(botellaC);

			} else {

				botellaC = m.getD().getBotella7() + m.getD().getBotella3();
				m.getD().setBotella3(botellaC);

				botellaB = cero;
				m.getD().setBotella7(botellaB);

			}
		}

		else {

			if (m.getD().getBotella7() + m.getD().getBotella3() > m.getD().getLimite3()) {

				botellaB = m.getD().getBotella7() - (m.getD().getLimite3() - m.getD().getBotella3());
				m.getD().setBotella7(botellaB);

				botellaC = m.getD().getLimite3();
				m.getD().setBotella3(botellaC);
			} else {

				botellaC = m.getD().getBotella7() + m.getD().getBotella3();
				m.getD().setBotella3(botellaC);

				botellaB = cero;
				m.getD().setBotella7(botellaB);
			}
		}
	}

	public void transferCToA(ModelJuegoBotella m) {
		int botellaC;
		int botellaA;
		int cero = 0;
		if (m.getD().getBotella3() >= m.getD().getBotella10()) {

			if (m.getD().getBotella3() + m.getD().getBotella10() > m.getD().getLimite10()) {

				botellaC = m.getD().getBotella3() - (m.getD().getLimite10() - m.getD().getBotella10());
				m.getD().setBotella3(botellaC);

				botellaA = m.getD().getLimite10();
				m.getD().setBotella10(botellaA);

			} else {

				botellaA = m.getD().getBotella3() + m.getD().getBotella10();
				m.getD().setBotella10(botellaA);

				botellaC = cero;
				m.getD().setBotella3(botellaC);

			}
		}

		if (m.getD().getBotella3() < m.getD().getBotella10()) {

			if (m.getD().getBotella3() + m.getD().getBotella10() > m.getD().getLimite10()) {

				botellaC = m.getD().getBotella3() - (m.getD().getLimite10() - m.getD().getBotella10());
				m.getD().setBotella3(botellaC);

				botellaA = m.getD().getLimite10();
				m.getD().setBotella10(botellaA);
			} else {

				botellaA = m.getD().getBotella3() + m.getD().getBotella10();
				m.getD().setBotella10(botellaA);

				botellaC = cero;
				m.getD().setBotella3(botellaC);
			}
		}
	}

	public void transferCToB(ModelJuegoBotella m) {
		int botellaC;
		int botellaB;
		int cero = 0;
		if (m.getD().getBotella3() >= m.getD().getBotella7()) {

			if (m.getD().getBotella3() + m.getD().getBotella7() > m.getD().getLimite7()) {

				botellaC = m.getD().getBotella3() - (m.getD().getLimite7() - m.getD().getBotella7());
				m.getD().setBotella3(botellaC);

				botellaB = m.getD().getLimite7();
				m.getD().setBotella7(botellaB);

			} else {

				botellaB = m.getD().getBotella3() + m.getD().getBotella7();
				m.getD().setBotella7(botellaB);

				botellaC = cero;
				m.getD().setBotella3(botellaC);

			}
		}

		if (m.getD().getBotella3() < m.getD().getBotella7()) {

			if (m.getD().getBotella3() + m.getD().getBotella7() > m.getD().getLimite7()) {

				botellaC = m.getD().getBotella3() - (m.getD().getLimite7() - m.getD().getBotella7());
				m.getD().setBotella3(botellaC);

				botellaB = m.getD().getLimite7();
				m.getD().setBotella7(botellaB);

			} else {

				botellaB = m.getD().getBotella3() + m.getD().getBotella7();
				m.getD().setBotella7(botellaB);

				botellaC = cero;
				m.getD().setBotella3(botellaC);
			}
		}
	}
}
