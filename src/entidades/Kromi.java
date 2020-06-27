package entidades;

import java.util.Date;

public class Kromi extends Carro {
 // CREAR SOLO 3 (UTILIZA 3 CELDAS DE FORMA VERTICAL, celda definida por K)
	private int anioDeFabricacion;
	private String marca;
	/**
	 * @param numeroDeCarro
	 * @param cantidadDeOcupantes
	 * @param fechaDeIngreso
	 * @param filaCarro
	 * @param columnaCarro
	 */
	public Kromi(int numeroDeCarro, int cantidadDeOcupantes, Date fechaDeIngreso, int filaCarro, int columnaCarro) {
		super(numeroDeCarro, cantidadDeOcupantes, fechaDeIngreso, filaCarro, columnaCarro);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the anioDeFabricacion
	 */
	public int getAnioDeFabricacion() {
		return anioDeFabricacion;
	}
	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}
	/**
	 * @param anioDeFabricacion the anioDeFabricacion to set
	 */
	public void setAnioDeFabricacion(int anioDeFabricacion) {
		this.anioDeFabricacion = anioDeFabricacion;
	}
	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}
	@Override
	public String toString() {
		return "Kromi [anioDeFabricacion=" + anioDeFabricacion + ", marca=" + marca + "]";
	}
	
	
}
