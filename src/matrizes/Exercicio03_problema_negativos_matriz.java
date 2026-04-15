package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03_problema_negativos_matriz {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, N, M;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		N = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		M = sc.nextInt();
		
		int [] [] mat = new int [N] [M];
		
		for (i = 0; i < N; i++) {
			for (j = 0; j < M; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i] [j] = sc.nextInt();
			}
		}
		
		System.out.println("VALORES NEGATIVOS:");
		for (i = 0; i < N; i++) {
			for (j = 0; j < M; j++) {
				if (mat[i] [j] < 0) {
					System.out.println(mat[i] [j]);
				}
			}
		}
		
		sc.close();

	}

}
