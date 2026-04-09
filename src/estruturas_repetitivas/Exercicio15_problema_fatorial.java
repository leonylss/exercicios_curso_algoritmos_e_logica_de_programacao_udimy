package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio15_problema_fatorial {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, fatorial;
		
		System.out.print("Digite o valor de N: ");
		n = sc.nextInt();
		if (n == 0) {
			fatorial = 1;
		}
		else {
			fatorial = n;
			for (i = n-1; i >= 1; i--) {
			fatorial = fatorial * i;
			}
		}
		System.out.println("FATORIAL = " + fatorial);
		
		sc.close();
		

	}

}
