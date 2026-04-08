package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07_problema_pares_consecutivos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, somaGeral, soma1, soma2, soma3, soma4, soma5;
		
		System.out.print("Digite um numero inteiro: ");
		x = sc.nextInt();
		
		
		
		while (x != 0) {
			if (x % 2 == 0) {
				soma1 = 0;
				soma1 = soma1 + x;
				soma2 = soma1 + 2;
				soma3 = soma2 + 2;
				soma4 = soma3 + 2;
				soma5 = soma4 + 2;
				
			
			}
			else {
				soma1 = 0;
				soma1 = soma1 + 1 + x;
				soma2 = soma1 + 2;
				soma3 = soma2 + 2;
				soma4 = soma3 + 2;
				soma5 = soma4 + 2;
				
			}
			somaGeral = soma1 + soma2 + soma3 + soma4 + soma5;
			System.out.println("SOMA = " + somaGeral);
			System.out.print("Digite um numero inteiro ");
			x = sc.nextInt();
		}
		
		sc.close();

	}

}
