package entidades;

import java.util.Date;

public class Kromi extends Carro {
 // Crear solo 3 Kromis (Utiliza 3 Celdas De Forma Vertical, celda definida por K)
	
	// Declarando atributos de la clase Kromi
	private int anioDeFabricacion;
	private String marca;

	// Constructor por defecto
	public Kromi(int numeroDeCarro, int cantidadDeOcupantes, Date fechaDeIngreso, int filaCarro, int columnaCarro) {
		super(numeroDeCarro, cantidadDeOcupantes, fechaDeIngreso, filaCarro, columnaCarro);
	}
	
	// Método get
	public int getAnioDeFabricacion() {
		return anioDeFabricacion;
	}
	
	public String getMarca() {
		return marca;
	}

	// Método set
	public void setAnioDeFabricacion(int anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}
	
	public void setMarca(String marca) {
		this.marca = marca;
	}

	// Método String 
	public String toString() {
		return "Kromi [anioDeFabricacion=" + anioDeFabricacion + ", marca=" + marca + "]";
	}

}
