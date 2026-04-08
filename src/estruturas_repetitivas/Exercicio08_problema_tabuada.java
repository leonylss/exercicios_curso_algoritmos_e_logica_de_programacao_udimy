package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08_problema_tabuada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n, i, multiplicacao;
		
		System.out.print("Deseja a tabuada para qual valor? ");
		n = sc.nextInt();
		
		
		for (i = 1; i <= 10; i++) {
			multiplicacao = n * i;
			System.out.println(n + " x " + i + " = " + multiplicacao);
		}
		sc.close();

	}

}
