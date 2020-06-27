package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;

public class Escenario {

	public static void main(String[] args) {

		// Atributos de la matriz
		char matrizEscenario[][] = new char[15][15];
		int filaKromis;
		int columnaKromis;
		int filaCaguano;
		int columnaCaguano;
		int filaTrupalla;
		int columnaTrupalla;
		
		// Creación de los Random
		Random filaK = new Random();
		Random columnaK = new Random();
		Random filaC = new Random();
		Random columnaC = new Random();
		Random filaT = new Random();
		Random columnaT = new Random();
		
		// Rellenamos la matriz con astericos
		for (int x = 0; x < 15; x++) {
			System.out.print("\n");
			for (int y = 0; y < 15; y++) {
				matrizEscenario[x][y] = '*';

			}
		}
	
		// Creacion de KROMIS en el tablero con su respectiva validacion
		
		for (int cantK = 0; cantK < 3; cantK++) { // Metodo cantidadKromi 
			int switchKromi = 1;

			do {
				filaKromis = filaK.nextInt(15); // Aleatorio 
				columnaKromis = columnaK.nextInt(15); // Aleatorio

				//Validar que la fila debe ser menor  a 13
				while (filaKromis > 13) {
					filaKromis = filaK.nextInt(15);

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
		
		// Creacion de CAGUANO en el tablero con su respectiva validacion

		// Validar Fila y Columna Caguano  
		for (int cantC = 0; cantC < 5; cantC++) {

		int switchCaguano = 1;

		do {
			filaCaguano = filaC.nextInt(15);
			columnaCaguano = columnaC.nextInt(15);

			//Validar que la fila debe ser menor  a 13
			while (filaCaguano > 15) {
				filaCaguano = filaC.nextInt(15);
			}
			// Validar Columna
			while (columnaCaguano >= 14) {
				columnaCaguano = columnaC.nextInt(15);
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

		// Creacion de Trupalla en el tablero con su respectiva validacion
		for (int cantT = 0; cantT < 10; cantT++) {
		
			int switchTrupalla = 1;

		do {
			filaTrupalla = filaT.nextInt(15); //Aleatorio
			columnaTrupalla = columnaT.nextInt(15);

			// Validar que la fila debe ser menor a 13
			while (filaTrupalla > 15) {
				filaTrupalla = filaT.nextInt(15);
			}
			// validar columna
			while (columnaTrupalla > 15) {
				columnaTrupalla = columnaT.nextInt(15);
			}
			// Validar Espacios Vacios 
			if (matrizEscenario[filaTrupalla][columnaTrupalla] == '*') {
				matrizEscenario[filaTrupalla][columnaTrupalla] = 'T';
				switchTrupalla = 0;
			}

		} while (switchTrupalla == 1);
		}

		for (int cantT = 0; cantT < 10; cantT++) { //Crear 10 Trupallas

			int switchTrupalla = 1;

			do {
				filaTrupalla = filaT.nextInt(15);
				columnaTrupalla = columnaT.nextInt(15);

				// Validar que la fila debe ser menor a 13
				while (filaTrupalla > 15) {
					filaTrupalla = filaT.nextInt(15);
				}

				// validar columna
				while (columnaTrupalla > 15) {
					columnaTrupalla = columnaT.nextInt(15);

				}

				if (matrizEscenario[filaTrupalla][columnaTrupalla] == '*') { //Validar Espacios
					matrizEscenario[filaTrupalla][columnaTrupalla] = 'T';
					switchTrupalla = 0;

				}

			} while (switchTrupalla == 1);
			}

		// Imprimir Matriz
		for (int x = 0; x < 15; x++) {
			System.out.print("\n");
			for (int y = 0; y < 15; y++) {
				if (y != 15) {
					System.out.print(matrizEscenario[x][y]);
				}

				System.out.print("\t");
			}
		}
}
}