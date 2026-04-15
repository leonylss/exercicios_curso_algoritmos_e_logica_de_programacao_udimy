package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05_problema_soma_matrizes {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, N, M;
		
		System.out.print("Quantas linhas vai ter cada matriz? ");
		N = sc.nextInt();
		System.out.print("Quantas colunas vai ter cada matriz? ");
		M = sc.nextInt();
		
		int [] [] a = new int [N] [M];
		int [] [] b = new int [N] [M];
		int [] [] matSoma = new int [N] [M];
		
		System.out.println("Digite os valores da matriz A:");
		for (i = 0; i < N; i++) {
			for (j = 0; j < M; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				a[i] [j] = sc.nextInt();
			}
		}
		
		System.out.println("Digite os valores da matriz B:");
		for (i = 0; i < N; i++) {
			for (j = 0; j < M; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				b[i] [j] = sc.nextInt();
			}
		}
		
		
		for (i = 0; i < N; i++) {
			for (j = 0; j < M; j++) {
				matSoma[i] [j] = a[i] [j] + b[i] [j];
			}
		}
		
		System.out.println("MATRIZ SOMA:");
		for (i = 0; i < N; i++) {
			for (j = 0; j < M; j++) {
				System.out.print(matSoma[i] [j] + " ");
			}
			System.out.println();
		}
		
		sc.close();

	}

}
