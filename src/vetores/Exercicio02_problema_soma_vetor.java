package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02_problema_soma_vetor {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		double soma, media;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		double [] vet = new double [n];
		
		soma = 0;
		for (i = 0; i <= n-1; i++) {
			System.out.print("Digite um numero: ");
			vet [i] = sc.nextDouble();
			soma = soma + vet[i];
		}
		
		media = soma / n;
		
		System.out.println();
		
		System.out.print("VALORES = ");
		for (i = 0; i <= n-1; i++) {
			System.out.print(vet [i] + " ");
		}
		
		System.out.println();
		
		System.out.println("SOMA = " + String.format("%.2f", soma));
		System.out.println("MEDIA = " + String.format("%.2f", media));
		
		sc.close();

	}

}
