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
				EscalarMatriz();
				break;
			case 3:
				potenciaDeDosMatrices();
				break;
			case 4:
				transponerMatriz();
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
	
	private static void EscalarMatriz() {

		Scanner snc = new Scanner(System.in);

		int[][] matrizA = CrearMatrices();

		int i, j;

		// incializo numero para escalar matriz
		System.out.println("Introducir numero:");
		int n = snc.nextInt();

		// nueva matriz para almacenar el resultado
		int[][] matrizC = new int[matrizA.length][matrizA[0].length];

		// imprime el resultado
		System.out.println("Matriz escalada");

		for (int x = 0; x < matrizC.length; x++) {
			for (int y = 0; y < matrizC[x].length; y++) {
				System.out.print((matrizC[x][y] = n * matrizA[x][y]) + " ");
			}
		}

		System.out.println();
		System.out.println();
	}

	private static void potenciaDeDosMatrices() {
		Scanner dato = new Scanner(System.in);
		int[][] matrizA = CrearMatrices();
		int[][] matrizB = CrearMatrices();
		int y, x;

		// nueva matriz para almacenar el resultado
		int[][] producto = new int[matrizB.length][matrizB[0].length];

		for (int a = 0; a < matrizB[0].length; a++) {
			for (int i = 0; i < matrizA.length; i++) {
				int suma = 0;
				for (int j = 0; j < matrizA[0].length; j++) {
					suma += matrizB[i][j] * matrizB[j][a];
				}
				producto[i][a] = suma;
			}
		}

		// imprime el resultado
		System.out.print("Imprimiendo  Multiplicacion\n");
		for (int i = 0; i < matrizB.length; i++) {
			for (int j = 0; j < matrizB[0].length; j++) {
				System.out.printf("%d ", producto[i][j]);
			}
			System.out.println();
			System.out.println();
		}
	}
	
	private static void transponerMatriz() {

		Scanner snc = new Scanner(System.in);
		int matrizA[][] = CrearMatrices();
		int matrizC[][] = new int[matrizA[0].length][matrizA.length]; // nueva matriz para almacenar el resultado
		int i, j;

		for (i = 0; i < matrizA.length; i++) {
			for (j = 0; j < matrizA[i].length; j++) {
				matrizC[j][i] = matrizA[i][j];
			}
		}

		// imprime el resultado
		System.out.println("Matriz transpuesta");

		for (i = 0; i <= matrizA.length; i++) {
			for (j = 0; j < matrizA[0].length; j++) {
				System.out.print((matrizC[i][j]) + " ");
			}

			System.out.println();
		}

	}
	
	private static void diagonalPrincipal() {
		Scanner snc = new Scanner(System.in);
		int[][] matrizA = CrearMatrices();
		int[] diagonalPrincipal = new int[matrizA.length]; // nueva matriz para almacenar el resultado
		int x, y;

		for (int i = 0; i < matrizA.length; i++) {
			for (int j = 0; j < matrizA[i].length; j++) {
				if (i == j) {
					diagonalPrincipal[i] = matrizA[i][j];
				}
			}
		}

		// imprime el resultado
		System.out.println("Diagonal Principal");
		for (int i = 0; i < diagonalPrincipal.length; i++) {
			System.out.print(diagonalPrincipal[i]);
		}

		System.out.println();
		System.out.println();
	}
	
}
