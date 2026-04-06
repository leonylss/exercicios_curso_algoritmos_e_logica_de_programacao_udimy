package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02_media_idades {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int idade, soma, cont;
		double media;
		
		System.out.println("Digite as idades:");
		idade = sc.nextInt();
		
		soma = 0;
		cont = 0;
		if (idade < 0) {
			System.out.println("IMPOSSIVEL CALCULAR");
		}
		else {
			while (idade >= 0) {
					soma = soma + idade;
					cont = cont + 1;
					idade = sc.nextInt();
				}
				
			media = (double)soma / cont;
			System.out.print("MEDIA = " + String.format("%.2f", media));
		}
		
		sc.close();
		

	}

}
