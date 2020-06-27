package entidades;

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
