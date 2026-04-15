package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06_problema_acima_diagonal {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, N, soma;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		int [] [] mat = new int [N] [N];
		
		for (i = 0; i < N; i++) {
			for (j = 0; j < N; j++) {
				System.out.print("Elemento [" + i + "," + j + "]: ");
				mat [i] [j] = sc.nextInt();
			}
		}
		
		soma = 0;
		for (i = 0; i < N; i++) {
			for (j = i+1; j < N; j++) {
				soma = soma + mat[i] [j];
			}
		}
		
		System.out.print("SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = " + soma);
		
		sc.close();

	}

}
