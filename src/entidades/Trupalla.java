package entidades;

import java.util.Date;

public class Trupalla extends Carro {
	
// Crear 10 Trupallas (Ocupar 1 celda por T)

	// Declarando atributos de la clase Trupalla
	private int nivelArmadura;
	private String nombreManipulador;

	// Constructor por defecto
	public Trupalla(int numeroDeCarro, int cantidadDeOcupantes, Date fechaDeIngreso, int filaCarro, int columnaCarro,
			int nivelArmadura, String nombreManipulador) {
		super(numeroDeCarro, cantidadDeOcupantes, fechaDeIngreso, filaCarro, columnaCarro);
		validarNivelArmadura(nivelArmadura);
		this.nombreManipulador = nombreManipulador;
	}
	
	// Método para validar que el nivel de armadura corresponda al rango de 1 y 5
	public void validarNivelArmadura(int nivelArmadura) {

		if (nivelArmadura > 0 && nivelArmadura < 6) {
			this.nivelArmadura = nivelArmadura;
		} else {
			this.nivelArmadura = 1;
		}
	}

	// Método get
	public int getNivelArmadura() {
		return nivelArmadura;
	}

	public String getNombreManipulador() {
		return nombreManipulador;
	}

	// Método set
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	public void setNombreManipulador(String nombreManipulador) {
		this.nombreManipulador = nombreManipulador;
	}

	// Método String
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreManipulador=" + nombreManipulador + "]";
	}

}
