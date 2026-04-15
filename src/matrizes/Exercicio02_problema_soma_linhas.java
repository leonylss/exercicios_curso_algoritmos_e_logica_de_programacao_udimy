package matrizes;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02_problema_soma_linhas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, j, N, M;
		double somaLinhas;
		
		System.out.print("Qual a quantidade de linhas da matriz? ");
		N = sc.nextInt();
		System.out.print("Qual a quantidade de colunas da matriz? ");
		M = sc.nextInt();
		
		double [] [] mat = new double [N] [M];
		double [] vet = new double [N];
		
		for (i = 0; i < N; i++) {
			System.out.println("Digite os elementos da " + (i+1) + "a linha");
			for (j= 0; j < M; j++) {
				mat[i] [j] = sc.nextDouble();
			}
		}
		

		
		for (i = 0; i < N; i++) {
			somaLinhas = 0;
			for (j= 0; j < M; j++) {
				somaLinhas = somaLinhas + mat[i] [j];
			}
			vet[i] = somaLinhas;
		}
		
		System.out.println("VETOR GERADO:");
		for (i = 0; i < N; i++) {
			System.out.println(String.format("%.2f", vet[i]));
		}
		
		sc.close();
		

	}

}
