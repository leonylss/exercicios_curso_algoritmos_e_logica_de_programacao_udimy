package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04_problema_numeros_pares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n, qtdNumerosPares;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int [] vet = new int [n];
		
		
		for (i = 0; i < n; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println();
		
		qtdNumerosPares = 0;
		System.out.println("NUMEROS PARES:");
		for (i = 0; i < n; i++) {
			if (vet[i] % 2 == 0) {
				qtdNumerosPares = qtdNumerosPares + 1;
				System.out.print(vet[i] + " ");
			}
		}
		
		System.out.println();
		
		System.out.print("\nQUANTIDADE DE PARES = " + qtdNumerosPares);
		
		sc.close();

	}

}
