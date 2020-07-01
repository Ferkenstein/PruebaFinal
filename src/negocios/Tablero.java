package negocios;

import java.util.ArrayList;
import java.util.Random;

import entidades.Carro;
import entidades.Huevo;

public class Tablero {

	// Creación Atributos Matriz
	String matrizEscenario[][] = new String [15][15];
	int filaKromis;
	int columnaKromis;
	int filaCaguano;
	int columnaCaguano;
	int filaTrupalla;
	int columnaTrupalla;

	Random generadorNumeroAleatorio = new Random();

	// Constructor de las posiciones de los carros
	public Tablero(int filaKromis, int columnaKromis, int filaCaguano, int columnaCaguano, int filaTrupalla,
			int columnaTrupalla) {
		super();
		this.filaKromis = -1;
		this.columnaKromis = -1;
		this.filaCaguano = -1;
		this.columnaCaguano = -1;
		this.filaTrupalla = -1;
		this.columnaTrupalla = -1;
	}
	
	// Constructor vacio
	public Tablero() { 

	}
	// Se recorre e imprime la matriz
	public void mostrarMatriz() {
	
		for (int x = 0; x < 15; x++) {
			System.out.print("\n");
			for (int y = 0; y < 15; y++) {
				if (y != 15) {
					System.out.print(matrizEscenario[x][y]);
				}
				System.out.print(" ");
			}
			System.out.print("|" + x);
		}
	}

	public void inicializarMatriz() {
		creacionMatrizVacia();
		for (int i = 0; i < 3; i++) {
			posicionKromis();
		}

		for (int j = 0; j < 5; j++) {
			posicionCaguano();
		}

		for (int z = 0; z < 10; z++) {
			posicionTrupalla();
		}

	}

	public void creacionMatrizVacia() {
		for (int x = 0; x < 15; x++) {
			for (int y = 0; y < 15; y++) {
				matrizEscenario[x][y] = " * ";
			}
		}
	}

	public void posicionKromis() {
		int switchKromi = 1;

		do {
			filaKromis = generadorNumeroAleatorio.nextInt(13); // Aleatorio
			columnaKromis = generadorNumeroAleatorio.nextInt(15); // Aleatorio

			while (filaKromis > 13) { // Validar que la fila debe ser menor a 13
				filaKromis = generadorNumeroAleatorio.nextInt(13);
			}
			// Validar espacios vacios
			if (matrizEscenario[filaKromis][columnaKromis] == " * ") {
				if (matrizEscenario[filaKromis + 1][columnaKromis] == " * ") { // Validar espacio libre
					if (matrizEscenario[filaKromis + 2][columnaKromis] == " * ") { // Validar espacio libre
						matrizEscenario[filaKromis][columnaKromis] = " K "; // Asigna la posición carro Kromi
						matrizEscenario[filaKromis + 1][columnaKromis] = " K "; // Asigna la posición carro Kromi
						matrizEscenario[filaKromis + 2][columnaKromis] = " K "; // Asigna la posición carro Kromi
						switchKromi = 0; // Salida del ciclo

					}
				}
			}

		} while (switchKromi == 1);
	}

	public void posicionCaguano() {
		int switchCaguano = 1;

		do {
			filaCaguano = generadorNumeroAleatorio.nextInt(15);
			columnaCaguano = generadorNumeroAleatorio.nextInt(14);

			while (filaCaguano > 15) { // Validar que la fila debe ser menor a 15
				filaCaguano = generadorNumeroAleatorio.nextInt(15);
			}
			// Validar Columna
			while (columnaCaguano >= 14) {
				columnaCaguano = generadorNumeroAleatorio.nextInt(14);
			}

			// Validar Espacios Vacios
			if (matrizEscenario[filaCaguano][columnaCaguano] == " * ") {
				if (matrizEscenario[filaCaguano][columnaCaguano + 1] == " * ") { // Validar espacio vacio del costado
					matrizEscenario[filaCaguano][columnaCaguano] = " C "; // Posicionar Caguano
					matrizEscenario[filaCaguano][columnaCaguano + 1] = " C ";
					switchCaguano = 0;
				}
			}

		} while (switchCaguano == 1); // Fin Validación
	}

	public void posicionTrupalla() {

		int switchTrupalla = 1;

		do {
			filaTrupalla = generadorNumeroAleatorio.nextInt(15); // Aleatorio
			columnaTrupalla = generadorNumeroAleatorio.nextInt(15);

			// Validar que la fila debe ser menor a 14
			while (filaTrupalla > 15) {
				filaTrupalla = generadorNumeroAleatorio.nextInt(15);
			}
			// Validar Columna
			while (columnaTrupalla > 15) {
				columnaTrupalla = generadorNumeroAleatorio.nextInt(15);
			}
			// Validar Espacios Vacios
			if (matrizEscenario[filaTrupalla][columnaTrupalla] == " * ") {
				
				matrizEscenario[filaTrupalla][columnaTrupalla] = " T ";
				switchTrupalla = 0;
			}

		} while (switchTrupalla == 1);
	}

	public int puntajeHuevo(int fila, int columna, int acumulador) {

		String posicion = matrizEscenario[fila][columna]; // Posicion de la Fila y Columna ingresada

		if (posicion == " * " || posicion == " H ") { // Si la posición ingresada corresponde a * o H esta mantiene el
														// mismo puntaje, no suma puntos.

			acumulador = acumulador + 0;
			matrizEscenario[fila][columna] = " H ";
		}

		if (posicion == " C ") { // Validación si la posicion ingresada corresponde a Caguano

			acumulador = acumulador + 2; // El puntaje aumenta 2
			matrizEscenario[fila][columna] = "HC "; // La posicion cambia a HC , quiere decir que la posicion Caguano
													// recibio un huevo
			// Puntaje adicional por completar el carro completo

			if (columna != 0 && columna != 14) { // Validando posiciones del centro de la matriz

				if (matrizEscenario[fila][columna] == "HC "
						&& (matrizEscenario[fila][columna + 1] == "HC " || matrizEscenario[fila][columna - 1] == "HC ")) {

					acumulador = acumulador + 7; // Adicionar el puntaje extra al total
				} else {
					if (columna == 0) { // Validar extremo de las matriz

						if (matrizEscenario[fila][columna] == "HC " && matrizEscenario[fila][columna + 1] == "HC ") {

							acumulador = acumulador + 7; // Adicionar el puntaje extra al total
						} else if (columna == 14) { // Validar extremo de las matriz

							if (matrizEscenario[fila][columna] == "HC " && matrizEscenario[fila][columna - 1] == "HC ") {

								acumulador = acumulador + 7; // Adicionar el puntaje extra al total
							}
						}
					}
				}
			}
		}

		if (posicion == " T ") { // Validación si la posicion ingresada corresponde a Trupalla

			acumulador = acumulador + 1; // El puntaje aumenta 2
			matrizEscenario[fila][columna] = "HT "; // La posicion cambia a HT , quiere decir que la posicion Trupalla
													// recibio un huevo
		}

		if (posicion == " K ") { // Validación si la posicion ingresada corresponde a Kromis

			acumulador = acumulador + 3; // El puntaje aumenta 3
			matrizEscenario[fila][columna] = "HK "; // La posicion cambia a HK , quiere decir que la posicion Kromis
													// recibio un huevo

			if (fila >= 2 && fila <= 12) { // Validando posiciones del centro de la matriz

				if ((matrizEscenario[fila][columna] == "HK " && matrizEscenario[fila + 1][columna] == "HK "
						&& matrizEscenario[fila + 2][columna] == "HK ")
						|| (matrizEscenario[fila][columna] == "HK " && matrizEscenario[fila - 1][columna] == "HK "
								&& matrizEscenario[fila + 1][columna] == "HK ")
						|| (matrizEscenario[fila][columna] == "HK " && matrizEscenario[fila - 1][columna] == "HK "
								&& matrizEscenario[fila - 2][columna] == "HK ")) {

					acumulador = acumulador + 10; // Adicionar el puntaje extra al total

				} else {

					if (fila == 0) { // Validando extremos de la matriz

						if (matrizEscenario[fila][columna] == "HK " && matrizEscenario[fila + 1][columna] == "HK "
								&& matrizEscenario[fila + 2][columna] == "HK ") {

							acumulador = acumulador + 10; // Adicionar el puntaje extra al total
						}

						if (fila == 14) { // Validando extremos de la matriz

							if (matrizEscenario[fila][columna] == "HK " && matrizEscenario[fila - 1][columna] == "HK "
									&& matrizEscenario[fila - 2][columna] == "HK ") {

								acumulador = acumulador + 10; // Adicionar el puntaje extra al total
							}

							if (fila == 13 || fila == 1) {

								if (matrizEscenario[fila][columna] == "HK " && matrizEscenario[fila - 1][columna] == "HK "
										&& matrizEscenario[fila + 1][columna] == "HK ") {

									acumulador = acumulador + 10; // Adicionar el puntaje extra al total
								}
							}

						}
					}

				}
			}
		}
		return acumulador;

	}
	// Método get
	public String[][] getMatrizEscenario() {
		return matrizEscenario;
	}

	public int getFilaKromis() {
		return filaKromis;
	}

	public int getColumnaKromis() {
		return columnaKromis;
	}

	public int getFilaCaguano() {
		return filaCaguano;
	}

	public int getColumnaCaguano() {
		return columnaCaguano;
	}

	public int getFilaTrupalla() {
		return filaTrupalla;
	}

	public int getColumnaTrupalla() {
		return columnaTrupalla;
	}

	public Random getGeneradorNumeroAleatorio() {
		return generadorNumeroAleatorio;
	}

	// Método set 
	public void setMatrizEscenario(String[][] matrizEscenario) {
		this.matrizEscenario = matrizEscenario;
	}

	public void setFilaKromis(int filaKromis) {
		this.filaKromis = filaKromis;
	}

	public void setColumnaKromis(int columnaKromis) {
		this.columnaKromis = columnaKromis;
	}

	public void setFilaCaguano(int filaCaguano) {
		this.filaCaguano = filaCaguano;
	}

	public void setColumnaCaguano(int columnaCaguano) {
		this.columnaCaguano = columnaCaguano;
	}

	public void setFilaTrupalla(int filaTrupalla) {
		this.filaTrupalla = filaTrupalla;
	}

	public void setColumnaTrupalla(int columnaTrupalla) {
		this.columnaTrupalla = columnaTrupalla;
	}

	public void setGeneradorNumeroAleatorio(Random generadorNumeroAleatorio) {
		this.generadorNumeroAleatorio = generadorNumeroAleatorio;
	}

}