package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09_problema_soma_impares {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, xTem, y, i, soma;
		
		System.out.println("Digite dois numeros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x > y) {
			xTem = x;
			x = y;
			y = xTem;
		}
		
		soma = 0;
		for (i = x + 1; i <= y - 1; i++) {
			if (i % 2 != 0) {
				soma = soma + i;
			}
		}
		
		System.out.println("SOMA DOS IMPARES = " + soma);
		
		sc.close();

	}

}
