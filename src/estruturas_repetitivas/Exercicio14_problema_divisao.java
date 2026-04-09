package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio14_problema_divisao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, x, y, n;
		double divisao;
		
		System.out.print("Quantos numeros voce vai digitar? ");
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			System.out.print("Entre com o numerador: ");
			x = sc.nextInt();
			System.out.print("Entre com o denominador: ");
			y = sc.nextInt();
			if (y == 0) {
				System.out.println("DIVISAO IMPOSSIVEL");
			}
			else {
				divisao = (double)x / y;
				System.out.println("DIVISAO = " + String.format("%.2f", divisao));
			}
			
		}
		
		sc.close();

	}

}
