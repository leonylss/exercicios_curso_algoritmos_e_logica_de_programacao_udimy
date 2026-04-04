package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06_problema_glicose {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double glicose;
		
		System.out.print("Digite a medida da glicose: ");
		glicose = sc.nextDouble();
		
		if (glicose <= 100) {
			System.out.println("Classifição: Normal");
		}
		else if (glicose <= 140) {
			System.out.println("Classifição: Elevado");
		}
		else {
			System.out.println("Classifição: Diabetes");
		}
		
		sc.close();
		
	}

}
