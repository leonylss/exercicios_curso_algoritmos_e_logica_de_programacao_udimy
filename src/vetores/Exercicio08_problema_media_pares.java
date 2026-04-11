package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08_problema_media_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, somaPares, contPares;
		double mediaPares;
		
		System.out.print("Quantos elementos vai ter o vetor? ");
		n = sc.nextInt();
		
		int [] vet = new int [n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		contPares = 0;
		somaPares = 0;
		for (i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				somaPares = somaPares + vet[i];
				contPares = contPares + 1;
			}
		}
		
		if (contPares == 0) {
			System.out.print("NENHUM NUMERO PAR");
		}
		else {
			mediaPares = (double)somaPares / contPares;
			System.out.println("MEDIA DOS PARES = " + String.format("%.1f", mediaPares));
		}
		
		sc.close();

	}

}
