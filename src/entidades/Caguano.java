package entidades;

import java.util.Date;

public class Caguano extends Carro {
	
// 5 Caguanos Horizontales y con letra C (Utiliza 2 celdas Horizontales)
	
	// Declarando atributos de la clase Caguano
	private int alcanceTiro;
	private String colorConfite;
	
	// Constructor por defecto
	public Caguano(int numeroDeCarro, int cantidadDeOcupantes, Date fechaDeIngreso, int filaCarro, int columnaCarro) {
		super(numeroDeCarro, cantidadDeOcupantes, fechaDeIngreso, filaCarro, columnaCarro);
	}

	// Método get
	public int getAlcanceTiro() {
		return alcanceTiro;
	}
	
	public String getColorConfite() {
		return colorConfite;
	}

	// Método set
	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}

	public void setColorConfite(String colorConfite) {
		this.colorConfite = colorConfite;
	}

	// Método String
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfite=" + colorConfite + "]";
	}

}
