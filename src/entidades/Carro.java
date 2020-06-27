package entidades;

import java.util.Date;

public class Carro {

	// Declarando atributos de la clase Carro
	private int numeroDeCarro;
	private int cantidadDeOcupantes;
	private Date fechaDeIngreso;
	private int filaCarro;
	private int columnaCarro;
	/**
	 * @param numeroDeCarro
	 * @param cantidadDeOcupantes
	 * @param fechaDeIngreso
	 * @param fila
	 * @param columna
	 */
	public Carro(int numeroDeCarro, int cantidadDeOcupantes, Date fechaDeIngreso, int filaCarro, int columnaCarro) {
		super();
		this.numeroDeCarro = numeroDeCarro;
		this.cantidadDeOcupantes = cantidadDeOcupantes;
		this.fechaDeIngreso = fechaDeIngreso;
		this.filaCarro = filaCarro;
		this.columnaCarro = columnaCarro;
	}
	/**
	 * @return the numeroDeCarro
	 */
	public int getNumeroDeCarro() {
		return numeroDeCarro;
	}
	/**
	 * @return the cantidadDeOcupantes
	 */
	public int getCantidadDeOcupantes() {
		return cantidadDeOcupantes;
	}
	/**
	 * @return the fechaDeIngreso
	 */
	public Date getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	/**
	 * @return the fila
	 */
	public int getFilaCarro() {
		return filaCarro;
	}
	/**
	 * @return the columna
	 */
	public int getColumnaCarro() {
		return columnaCarro;
	}
	/**
	 * @param numeroDeCarro the numeroDeCarro to set
	 */
	public void setNumeroDeCarro(int numeroDeCarro) {
		this.numeroDeCarro = numeroDeCarro;
	}
	/**
	 * @param cantidadDeOcupantes the cantidadDeOcupantes to set
	 */
	public void setCantidadDeOcupantes(int cantidadDeOcupantes) {
		this.cantidadDeOcupantes = cantidadDeOcupantes;
	}
	/**
	 * @param fechaDeIngreso the fechaDeIngreso to set
	 */
	public void setFechaDeIngreso(Date fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	/**
	 * @param fila the fila to set
	 */
	public void setFilaCarro(int filaCarro) {
		this.filaCarro = filaCarro;
	}
	/**
	 * @param columna the columna to set
	 */
	public void setColumna(int columnaCarro) {
		this.columnaCarro = columnaCarro;
	}
	@Override
	public String toString() {
		return "Carro [numeroDeCarro=" + numeroDeCarro + ", cantidadDeOcupantes=" + cantidadDeOcupantes
				+ ", fechaDeIngreso=" + fechaDeIngreso + ", filaCarro=" + filaCarro + ", columnaCarro=" + columnaCarro + "]";
	}
	
	
		
}
