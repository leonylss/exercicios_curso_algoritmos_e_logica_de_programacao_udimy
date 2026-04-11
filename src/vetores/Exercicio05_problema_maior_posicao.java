package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05_problema_maior_posicao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, posicao;
		double maior;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double [] vet = new double [n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextDouble();
		}
		
		posicao = 0;
		maior = vet[0];
		for (i = 0; i < n; i++) {
			if (vet[i] > maior) {
				maior = vet[i];
				posicao = i;
			}
		}
		
		System.out.println();
		
		System.out.println("MAIOR VALOR = " + String.format("%.1f", maior));
		System.out.println("PASICAO DO MAIOR VALOR = " + posicao);
		
		sc.close();
		
	}

}
