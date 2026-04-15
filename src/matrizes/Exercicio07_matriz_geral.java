package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07_matriz_geral {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, N, linha, coluna;
		double somaPositivo;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		double [] [] mat = new double [N] [N];
		double [] [] matNova = new double [N] [N];
		
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i] [j] = sc.nextDouble();
			}
		}
		
		somaPositivo = 0;
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				if (mat[i] [j] >= 0) {
					somaPositivo = somaPositivo + mat[i] [j];
				}
			}
		}
		
		System.out.println();
		
		System.out.println("SOMA DOS POSITOS: " + String.format("%.1f", somaPositivo));
		
		System.out.println();
		
		System.out.print("Escolha uma linha: ");
		linha = sc.nextInt();
		
		System.out.print("LINHA ESCOLHIDA: ");
		for (i = linha; i == linha; i++) {
			for (j = 0; j < N; j++) {
				System.out.print(String.format("%.1f", mat[i] [j]) + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("\nEscolha uma coluna: ");
		coluna = sc.nextInt();
		
		System.out.print("COLUNA ESCOLHIDA: ");
		for (i = 0; i < N; i++) {
			for (j = coluna; j == coluna; j++) {
				System.out.print(String.format("%.1f", mat[i] [j]) + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("\nDIAGONAL PRINCIPAL: ");
		for (i = 0; i < N; i++) {
			for (j = i; j == i; j++) {
				System.out.print(String.format("%.1f", mat[i] [j]) + " ");
			}
		}
		
		System.out.println();
		
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				if (mat[i] [j] < 0) {
					mat[i] [j] = Math.pow(mat[i] [j], 2);
				}
				matNova[i] [j] = mat[i] [j];
			}
		}
		
		System.out.println();
		
		System.out.println("MATRIZ ALTERADA:");
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				System.out.print(String.format("%.1f", matNova[i] [j]) + " ");
			}
			System.out.println();
		}
		
		sc.close();
		
		

	}

}
