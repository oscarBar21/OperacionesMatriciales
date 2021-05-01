package cdm1_oscar;

import java.util.Scanner;

public class CalculadoraMatrices {

	public static void main(String[] args) {
		Scanner dato = new Scanner(System.in);
		boolean salir = false;
		int opcion;

		while (!salir) {

			System.out.println("1. Suma");
			System.out.println("2. Escalar Matrizes");
			System.out.println("3. Multiplicaciopn de 2 matrizes");
			System.out.println("4. Transponer matrizes");
			System.out.println("5. Diagonal Principal");
			System.out.println("6. Matriz simetrica");
			System.out.println("7. Potencia de una matriz cuadrada");
			System.out.println("8. Resta de matrices");
			System.out.println("9. Salir");

			System.out.println("Elige una de las opciones");
			opcion = dato.nextInt();

			switch (opcion) {
			case 1:
				// SumarMatrices();
				break;
			case 2:
				// EscalarMatriz();
				break;
			case 3:
				// potenciaDeDosMatrices();
				break;
			case 4:
				// transponerMatriz();
				break;
			case 5:
				// diagonalPrincipal();
				break;
			case 6:
				// matrizSimetrica();
				break;
			case 7:
				// potenciaMatrizCuadrada();
				break;
			case 8:
				// restarMatrices();
				break;
			case 9:
				salir = true;
				break;
			default:
				System.out.println("Solo números entre 1-8 y el 9 para salir ");
			}

		}

	}

}
