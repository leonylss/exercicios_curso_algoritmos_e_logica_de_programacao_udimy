package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10_problema_multiplos {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int x, xTemporario, y, multiplo;
		
		System.out.println("Digite dois numeros inteiros:");
		x = sc.nextInt();
		y = sc.nextInt();
		
		if (x < y) {
			xTemporario = x;
			x = y;
			y = xTemporario;
		}
		
		multiplo = x % y;
		if (multiplo == 0 ) {
			System.out.print("Sao multiplos");
		}
		else {
			System.out.print("Nao sao multiplos");
		}
		
		sc.close();

	}

}
