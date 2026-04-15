package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01_problema_diagonal_negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, N, contNegativos;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int [] [] mat = new int [N] [N];
		
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat[i] [j] = sc.nextInt();
			}
		}
		
		System.out.println("DIAGONAL PRINCIPAL:");
		
		for (i = 0; i < N; i++) {
			for (j = i; j == i; j++) {
				System.out.print(mat[i] [j] + " ");
			}
		}
		
		contNegativos = 0;
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				if (mat[i] [j] < 0) {
					contNegativos = contNegativos + 1;
				}
			}
		}
		
		System.out.print("\nQUANTIDADE DE NEGATIVOS = " + contNegativos);
		
		sc.close();
		

	}

}
