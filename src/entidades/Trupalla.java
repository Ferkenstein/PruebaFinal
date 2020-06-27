package entidades;

import java.util.Date;

public class Trupalla extends Carro {
	
	// 10 TRUPALLAS (OCUPAN 1 CELDA T)

	private int nivelArmadura;
	private String nombreManipulador;

	/**
	 * @param numeroDeCarro
	 * @param cantidadDeOcupantes
	 * @param fechaDeIngreso
	 * @param filaCarro
	 * @param columnaCarro
	 * @param nivelArmadura
	 * @param nombreManipulador
	 */
	public Trupalla(int numeroDeCarro, int cantidadDeOcupantes, Date fechaDeIngreso, int filaCarro, int columnaCarro,
			int nivelArmadura, String nombreManipulador) {
		super(numeroDeCarro, cantidadDeOcupantes, fechaDeIngreso, filaCarro, columnaCarro);
		validarNivelArmadura(nivelArmadura);
		this.nombreManipulador = nombreManipulador;
	}
	
	// Metodo para validar que el nivel de armadura corresponda al rango de 1 y 5

	public void validarNivelArmadura(int nivelArmadura) {

		if (nivelArmadura > 0 && nivelArmadura < 6) {
			this.nivelArmadura = nivelArmadura;
		} else {
			this.nivelArmadura = 1;

		}

	}

	/**
	 * @return the nivelArmadura
	 */
	public int getNivelArmadura() {
		return nivelArmadura;
	}

	/**
	 * @return the nombreManipulador
	 */
	public String getNombreManipulador() {
		return nombreManipulador;
	}

	/**
	 * @param nivelArmadura the nivelArmadura to set
	 */
	public void setNivelArmadura(int nivelArmadura) {
		this.nivelArmadura = nivelArmadura;
	}

	/**
	 * @param nombreManipulador the nombreManipulador to set
	 */
	public void setNombreManipulador(String nombreManipulador) {
		this.nombreManipulador = nombreManipulador;
	}

	@Override
	public String toString() {
		return "Trupalla [nivelArmadura=" + nivelArmadura + ", nombreManipulador=" + nombreManipulador + "]";
	}
	
	

}
