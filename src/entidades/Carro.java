package entidades;

import java.util.Date;

public class Carro {

	// Declarando atributos de la clase Carro
	private int numeroDeCarro;
	private int cantidadDeOcupantes;
	private Date fechaDeIngreso;
	private int filaCarro;
	private int columnaCarro;
	
	// Constructor por defecto
	public Carro(int numeroDeCarro, int cantidadDeOcupantes, Date fechaDeIngreso, int filaCarro, int columnaCarro) {
		super();
		this.numeroDeCarro = numeroDeCarro;
		this.cantidadDeOcupantes = cantidadDeOcupantes;
		this.fechaDeIngreso = fechaDeIngreso;
		this.filaCarro = filaCarro;
		this.columnaCarro = columnaCarro;
	}
	
	// Método get
	public int getNumeroDeCarro() {
		return numeroDeCarro;
	}
	
	public int getCantidadDeOcupantes() {
		return cantidadDeOcupantes;
	}
	
	public Date getFechaDeIngreso() {
		return fechaDeIngreso;
	}
	
	public int getFilaCarro() {
		return filaCarro;
	}
	
	public int getColumnaCarro() {
		return columnaCarro;
	}
	
	// Método set
	public void setNumeroDeCarro(int numeroDeCarro) {
		this.numeroDeCarro = numeroDeCarro;
	}
	
	public void setCantidadDeOcupantes(int cantidadDeOcupantes) {
		this.cantidadDeOcupantes = cantidadDeOcupantes;
	}
	
	public void setFechaDeIngreso(Date fechaDeIngreso) {
		this.fechaDeIngreso = fechaDeIngreso;
	}
	
	public void setFilaCarro(int filaCarro) {
		this.filaCarro = filaCarro;
	}
	
	public void setColumna(int columnaCarro) {
		this.columnaCarro = columnaCarro;
	}

	// Método String
	public String toString() {
		return "Carro [numeroDeCarro=" + numeroDeCarro + ", cantidadDeOcupantes=" + cantidadDeOcupantes
				+ ", fechaDeIngreso=" + fechaDeIngreso + ", filaCarro=" + filaCarro + ", columnaCarro=" + columnaCarro + "]";
	}
	
	
		
}
