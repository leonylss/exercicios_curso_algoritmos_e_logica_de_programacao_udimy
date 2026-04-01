package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02_problema_baskara {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double coeficienteA, coeficienteB, coeficienteC, x1, x2, delta;
		
		System.out.print("Coeficiente a: ");
		coeficienteA = sc.nextDouble();
		System.out.print("Coeficiente b: ");
		coeficienteB = sc.nextDouble();
		System.out.print("Coeficiente c: ");
		coeficienteC = sc.nextDouble();
		
		delta = (Math.pow(coeficienteB, 2)) - (4 * coeficienteA * coeficienteC);
		
		if (delta < 0 || coeficienteA == 0) {
			System.out.println("Esta equecão nao possui raizes reais");
		}
		else {
			x1 = ((-coeficienteB) + Math.sqrt(delta)) / (2 * coeficienteA);
			x2 = ((-coeficienteB) - Math.sqrt(delta)) / (2 * coeficienteA);
			System.out.println("X1 = " + String.format("%.4f", x1));
			System.out.println("X2 = " + String.format("%.4f", x2));
		}
		
		sc.close();
		

	}

}
