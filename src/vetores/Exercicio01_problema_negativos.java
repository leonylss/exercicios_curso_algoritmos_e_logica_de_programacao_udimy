package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01_problema_negativos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		int [] vet = new int [n];
		
		for (i = 0; i <= n-1; i++) {
			System.out.print("Digite um numero: ");
			vet[i] = sc.nextInt();
		}
		
		System.out.println("\nNUMEROS NEGATIVOS:");
		for (i = 0; i <= n-1; i++) {
			if (vet[i] < 0) {
				System.out.println(vet[i]);
			}
		}
		
		sc.close();
		

	}

}
