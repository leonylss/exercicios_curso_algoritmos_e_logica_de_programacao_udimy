package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio13_problema_media_ponderada {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, n;
		double a, b, c, mediaPonderada;
		
		System.out.print("Quantos casos voce vai digitar? ");
		n = sc.nextInt();
		
		for (i = 1; i <= n; i++) {
			System.out.println("Digite tres numeros:");
			a = sc.nextDouble();
			b = sc.nextDouble();
			c = sc.nextDouble();
			mediaPonderada = ((a * 2) + (b * 3) + (c * 5)) / 10;
			System.out.println("MEDIA = " + String.format("%.1f", mediaPonderada));
		}
		
		sc.close();

	}

}
