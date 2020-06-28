package negocios;

import java.util.ArrayList;
import java.util.Random;

import entidades.Carro;
import entidades.Huevo;

public class Tablero {

	// Creación Atributos Matriz
	char matrizEscenario[][] = new char[15][15];
	int filaKromis;
	int columnaKromis;
	int filaCaguano;
	int columnaCaguano;
	int filaTrupalla;
	int columnaTrupalla;

	Random generadorNumeroAleatorio = new Random();

	private ArrayList<Object> carroList; // Arreglo de 18 carros
	private ArrayList<Huevo> tirosHuevos; // Arreglo de tiros de huevos

	/**
	 * @param carroList
	 * @param tirosHuevos
	 */

	public void crearCarro() {
		// crear subclase de la clase carro, y asignar a la lista respectiva carroList o
		// tirosHuevo

	}

	// Constructor de las posiciones
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

	public Tablero() { // Constructor vacio

	}

	public void mostrarMatriz() {
		for (int x = 0; x < 15; x++) {
			System.out.print("\n");
			for (int y = 0; y < 15; y++) {
				if (y != 15) {
					System.out.print(matrizEscenario[x][y]);

				}

				System.out.print(" ");
			}

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
			System.out.print("\n");
			for (int y = 0; y < 15; y++) {
				matrizEscenario[x][y] = '*';
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
			if (matrizEscenario[filaKromis][columnaKromis] == '*') {
				if (matrizEscenario[filaKromis + 1][columnaKromis] == '*') { // Validar espacio libre
					if (matrizEscenario[filaKromis + 2][columnaKromis] == '*') { // Validar espacio libre
						matrizEscenario[filaKromis][columnaKromis] = 'K'; // Asigna la posición carro Kromi
						matrizEscenario[filaKromis + 1][columnaKromis] = 'K'; // Asigna la posición carro Kromi
						matrizEscenario[filaKromis + 2][columnaKromis] = 'K'; // Asigna la posición carro Kromi
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
			if (matrizEscenario[filaCaguano][columnaCaguano] == '*') {
				if (matrizEscenario[filaCaguano][columnaCaguano + 1] == '*') { // Validar espacio vacio del costado
					matrizEscenario[filaCaguano][columnaCaguano] = 'C'; // Posicionar Caguano
					matrizEscenario[filaCaguano][columnaCaguano + 1] = 'C';
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
			if (matrizEscenario[filaTrupalla][columnaTrupalla] == '*') {
				matrizEscenario[filaTrupalla][columnaTrupalla] = 'T';
				switchTrupalla = 0;
			}

		} while (switchTrupalla == 1);
	}

	public void lanzarHuevo() {
		// crear instancia clase huevo, solicitar coordenadas, calcular el puntaje y
		// almacenar
	}

	public void calcularPuntaje() {
		lanzarHuevo();
	}

	/**
	 * @return the carroList
	 */
	public ArrayList<Object> getCarroList() {
		return carroList;
	}

	/**
	 * @return the tirosHuevos
	 */
	public ArrayList<Huevo> getTirosHuevos() {
		return tirosHuevos;
	}

	/**
	 * @param carroList the carroList to set
	 */
	public void setCarroList(ArrayList<Object> carroList) {
		this.carroList = carroList;
	}

	/**
	 * @param tirosHuevos the tirosHuevos to set
	 */
	public void setTirosHuevos(ArrayList<Huevo> tirosHuevos) {
		this.tirosHuevos = tirosHuevos;
	}

	@Override
	public String toString() {
		return "Tablero [carroList=" + carroList + ", tirosHuevos=" + tirosHuevos + "]";
	}

public int puntajeHuevo(int fila, int columna,int acomulador) {
		
		char posicion=matrizEscenario[fila][columna];
		
		if (posicion=='*'|| posicion=='H'){
			acomulador=acomulador+0;
		}else if (posicion=='C'){
			   acomulador=acomulador+2;
		}else if (posicion=='T'){
			   acomulador=acomulador+1;	   
		}else if (posicion=='K'){
			   acomulador=acomulador+3;
		
		}	
	matrizEscenario[fila][columna]='H';
	
		
	return acomulador;}
	

}
