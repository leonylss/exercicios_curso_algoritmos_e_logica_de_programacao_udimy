package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04_problema_cada_linha {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i ,j, N, maior;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int [] [] mat = new int [N] [N];
		
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i] [j] = sc.nextInt();
			}
		}
		
		System.out.println("MAIOR ELEMENTO DE CADA LIHNA:");
		for (i = 0; i < N; i++) {
			maior = mat[i] [0];
			for (j = 0; j < N; j++) {
				if (mat[i] [j] > maior) {
					maior = mat[i] [j];
				}
			}
			System.out.println(maior);
		}
		
		sc.close();

	}

}
