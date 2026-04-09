package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12_problema_par_impar {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int x, n, i;
		
		System.out.print("Quantos numeros voce vai digitar: ");
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			System.out.print("Digite um numero: ");
			x = sc.nextInt();
			if (x < 0 && x % 2 == 0) {
				System.out.println("PAR NEGATIVO");
			}
			else if (x > 0 && x % 2 == 0) {
				System.out.println("PAR POSITIVO");
			}
			else if (x > 0 && x % 2 != 0) {
				System.out.println("IMPAR POSITIVO");
			}
			else if (x < 0 && x % 2 != 0) {
				System.out.println("IMPAR NEGATIVO");
			}
			else {
				System.out.println("NULO");
			}
		}
		
		sc.close();

	}

}
