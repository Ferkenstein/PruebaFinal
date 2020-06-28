package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.Random;
import negocios.Tablero;
import entidades.Huevo;

public class Escenario {

	public static void main(String[] args) {
		
		Tablero tablero = new Tablero();
		tablero.inicializarMatriz();
		tablero.mostrarMatriz();
		//System.out.println("Segunda vez");
		//tablero.mostrarMatriz();
		//System.out.println("Tercera vez");
		//tablero.mostrarMatriz();
		//System.out.println("Cuarta vez");
		//tablero.mostrarMatriz();
		
		Huevo huevo=new Huevo();
		int C=huevo.pedirCoordenadaColumna();
		int F=huevo.pedirCoordenadaFila();
		//limpiar pantalla
		System.out.print("");
		System.out.flush();

	 int acu=0,totalpunt=0;
	 
	totalpunt=tablero.puntajeHuevo(F, C, acu);
	tablero.mostrarMatriz();
	System.out.println("puntaje "+totalpunt);
		
			
		

	}


}