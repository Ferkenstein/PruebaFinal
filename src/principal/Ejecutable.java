package principal;

import java.util.Scanner;

import entidades.Huevo;
import negocios.Tablero;

public class Ejecutable {

	public static void main(String[] args) {

		// Comienzo Menú 

		int opcion=0;
		int acumulador = 0, totalPuntaje = 0;
		Scanner teclado = new Scanner(System.in);
		Scanner tecladoRespuesta = new Scanner(System.in);
		Tablero tablero = new Tablero();
		tablero.inicializarMatriz();
		do {

			// Mostrar Menú

			System.out.println("\n");
			System.out.println("l----> Mostrar Matriz");
			System.out.println("2----> Tirar Huevo");
			System.out.println("3----> salir");
			opcion = teclado.nextInt();

			
			if (opcion == 1) { // Opción mostrar Matriz
				System.out.println(" 0   1   2   3   4   5   6   7   8   9   10  11  12  13  14");
				System.out.println("------------------------------------------------------------");
				tablero.mostrarMatriz();
			}
			;
			if (opcion == 2) { // Opción Tirar Huevo
				int respuesta = 0;

				do {
					Huevo huevo = new Huevo();

					int F = huevo.pedirCoordenadaFila(); 
					int C = huevo.pedirCoordenadaColumna();

					System.out.println("----------------------------  ");
					System.out.println("                               ");

					totalPuntaje = tablero.puntajeHuevo(F, C, acumulador);
					acumulador = totalPuntaje;

					System.out.println("Puntaje Parcial  : " + totalPuntaje);

					System.out.print("Desea hacer otro Tiro de Huevo :");
					System.out.println("                               ");
					System.out.print("0--->SI");
					System.out.println("                               ");
					System.out.print("1--->NO");

					respuesta = tecladoRespuesta.nextInt();
					System.out.print("\033[H\033[2J");
					System.out.flush();
					
				} while (respuesta == 0);
				
			}
			

		} while (opcion != 3);

		tablero.mostrarMatriz();
		System.out.println("\n");
		System.out.println("Gracias por Jugar! " );
		System.out.println("Puntaje Total :" + totalPuntaje);

	}

}
