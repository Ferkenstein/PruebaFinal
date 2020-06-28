package entidades;

import java.util.Scanner;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import negocios.Tablero;
public class Huevo {

	private int filaHuevo;
	private int columnaHuevo;
	private int puntajeLanzamiento;

	/**
	 * @param filaHuevo
	 * @param columnaHuevo
	 * @param puntajeLanzamiento
	 */
	public Huevo(int filaHuevo, int columnaHuevo, int puntajeLanzamiento) {
		super();
		this.filaHuevo = filaHuevo;
		this.columnaHuevo = columnaHuevo;
		this.puntajeLanzamiento = puntajeLanzamiento;
	}

	public Huevo() {
		// TODO Auto-generated constructor stub
	}

	
	
	
	public int pedirCoordenadaFila() {
		int sw=1;
		
	
		do {
		String tecladoFila = JOptionPane.showInputDialog("Introduce la coordenada de la Fila: ");
		filaHuevo = Integer.parseInt(tecladoFila);
		
		if (validarCoordenada(filaHuevo) != false) {
			sw=0;
		}
		}while (sw==1);
	
	
		
		
	return filaHuevo;
    
    }
//fin pedir coordenada fila
	public int pedirCoordenadaColumna() {
		
		int sw2=1;
	
				
		do {
		
		String tecladoColumna = JOptionPane.showInputDialog("Introduce la coordenada de la Columna: ");
		columnaHuevo = Integer.parseInt(tecladoColumna);
		if (validarCoordenada(columnaHuevo) != false) {
			sw2=0;
		}
		}while (sw2==1);
	
		
		
	return columnaHuevo;
    
    }

	
/////fin prdir cor columna
	public boolean validarCoordenada(int num) {
		if (num >= 0 && num <= 14) {
			return true;
		} else
			return false;
	}

	/**
	 * @return the filaHuevo
	 */
	public int getFilaHuevo() {
		return filaHuevo;
	}

	/**
	 * @return the columnaHuevo
	 */
	public int getColumnaHuevo() {
		return columnaHuevo;
	}

	/**
	 * @return the puntajeLanzamiento
	 */
	public int getPuntajeLanzamiento() {
		return puntajeLanzamiento;
	}

	/**
	 * @param filaHuevo the filaHuevo to set
	 */
	public void setFilaHuevo(int filaHuevo) {
		this.filaHuevo = filaHuevo;
	}

	/**
	 * @param columnaHuevo the columnaHuevo to set
	 */
	public void setColumnaHuevo(int columnaHuevo) {
		this.columnaHuevo = columnaHuevo;
	}

	/**
	 * @param puntajeLanzamiento the puntajeLanzamiento to set
	 */
	public void setPuntajeLanzamiento(int puntajeLanzamiento) {
		this.puntajeLanzamiento = puntajeLanzamiento;
	}

	@Override
	public String toString() {
		return "Huevo [filaHuevo=" + filaHuevo + ", columnaHuevo=" + columnaHuevo + ", puntajeLanzamiento="
				+ puntajeLanzamiento + "]";
	}

	
}
