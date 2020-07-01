package entidades;

import java.util.Scanner;

public class Huevo {

	// Declarando atributos de la clase Carro
	private int filaHuevo;
	private int columnaHuevo;
	private int puntajeLanzamiento;

	// Constructor por defecto
	public Huevo(int filaHuevo, int columnaHuevo, int puntajeLanzamiento) {
		super();
		this.filaHuevo = filaHuevo;
		this.columnaHuevo = columnaHuevo;
		this.puntajeLanzamiento = puntajeLanzamiento;
	}

	// Constructor
	public Huevo() {
	}
	
	// Ingresar y Validar Coordenada Fila
	public int pedirCoordenadaFila() {
		int switchFila=1;
		Scanner tecladoFila = new Scanner(System.in);
		
		do {
			System.out.println("Ingrese Fila:");
			filaHuevo= tecladoFila.nextInt();
			
		if (validarCoordenada(filaHuevo) != false) {
			switchFila=0;
		}
		
		} while (switchFila==1);
	return filaHuevo;
    
    }
	// Ingresar y Validar Coordenada Columna
	public int pedirCoordenadaColumna() {

		int switchColumna = 1;
		Scanner tecladoColumna = new Scanner(System.in);

		do {

			System.out.println("Ingrese Columna:");
			columnaHuevo = tecladoColumna.nextInt();
			if (validarCoordenada(columnaHuevo) != false) {
				switchColumna = 0;
			}
		} while (switchColumna == 1);

		return columnaHuevo;

	}

	// Validar Coordenada Ingresada
	public boolean validarCoordenada(int num) {
		if (num >= 0 && num <= 14) {
			return true;
		} else
			return false;
	}
	
	// Método get
	public int getFilaHuevo() {
		return filaHuevo;
	}

	public int getColumnaHuevo() {
		return columnaHuevo;
	}

	public int getPuntajeLanzamiento() {
		return puntajeLanzamiento;
	}

	// Método set
	public void setFilaHuevo(int filaHuevo) {
		this.filaHuevo = filaHuevo;
	}

	public void setColumnaHuevo(int columnaHuevo) {
		this.columnaHuevo = columnaHuevo;
	}

	public void setPuntajeLanzamiento(int puntajeLanzamiento) {
		this.puntajeLanzamiento = puntajeLanzamiento;
	}

	// Método String
	public String toString() {
		return "Huevo [filaHuevo=" + filaHuevo + ", columnaHuevo=" + columnaHuevo + ", puntajeLanzamiento="
				+ puntajeLanzamiento + "]";
	}

}
