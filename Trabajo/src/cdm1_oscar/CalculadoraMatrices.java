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
				SumarMatrices();
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

	private static int[][] CrearMatrices() {

		Scanner scn = new Scanner(System.in);

		System.out.println("Introduce el numero de filas:");
		int filas = scn.nextInt();

		System.out.println("Introduce el numero de columnas:");
		int columnas = scn.nextInt();

		int[][] matriz = new int[filas][columnas];

		System.out.println("Introduce la matriz:");
		for (int i = 0; i < filas; i++) {
			for (int j = 0; j < columnas; j++) {
				int numero = scn.nextInt();
				matriz[i][j] = numero;
			}
		}
		return matriz;
	}
	
	private static void SumarMatrices() {

		Scanner snc = new Scanner(System.in);
		int matrizA[][] = CrearMatrices();

		int matrizB[][] = CrearMatrices();

		// nueva matriz para almacenar el resultado
		int matrizC[][] = new int[matrizA.length][matrizB[0].length];
		int i, j;

		for (i = 0; i < matrizA.length; i++) {
			for (j = 0; j < matrizB[0].length; j++) {
				matrizC[i][j] = matrizA[i][j] + matrizB[i][j];
			}
		}

		// imprime el resultado
		System.out.println("Resultado de la suma :");

		for (i = 0; i < matrizA.length; i++) {
			for (j = 0; j < matrizB[0].length; j++) {
				System.out.print(matrizC[i][j] + " ");
			}

			System.out.println();
			System.out.println();

		}
	}
	
	
}
