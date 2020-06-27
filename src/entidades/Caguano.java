package entidades;

import java.util.Date;

public class Caguano extends Carro {
	
// 5 CAGUANOS HORIZONTALES Y CON LETRA C (UTILIZA DOS CELDAS HORIZONTALES)
	
	private int alcanceTiro;
	private String colorConfite;
	/**
	 * @param numeroDeCarro
	 * @param cantidadDeOcupantes
	 * @param fechaDeIngreso
	 * @param fila
	 * @param columna
	 */
	public Caguano(int numeroDeCarro, int cantidadDeOcupantes, Date fechaDeIngreso, int filaCarro, int columnaCarro) {
		super(numeroDeCarro, cantidadDeOcupantes, fechaDeIngreso, filaCarro, columnaCarro);
		// TODO Auto-generated constructor stub
	}
	/**
	 * @return the alcanceTiro
	 */
	public int getAlcanceTiro() {
		return alcanceTiro;
	}
	/**
	 * @return the colorConfite
	 */
	public String getColorConfite() {
		return colorConfite;
	}
	/**
	 * @param alcanceTiro the alcanceTiro to set
	 */
	public void setAlcanceTiro(int alcanceTiro) {
		this.alcanceTiro = alcanceTiro;
	}
	/**
	 * @param colorConfite the colorConfite to set
	 */
	public void setColorConfite(String colorConfite) {
		this.colorConfite = colorConfite;
	}
	@Override
	public String toString() {
		return "Caguano [alcanceTiro=" + alcanceTiro + ", colorConfite=" + colorConfite + "]";
	}
	
	
}
