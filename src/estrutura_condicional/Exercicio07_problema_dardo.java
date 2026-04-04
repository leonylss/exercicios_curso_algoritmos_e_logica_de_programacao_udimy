package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07_problema_dardo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double medida1, medida2, medida3, maior;
		
		System.out.println("Digite as tres medidas: ");
		medida1 = sc.nextDouble();
		medida2 = sc.nextDouble();
		medida3 = sc.nextDouble();
		
		maior = medida1;
		if (maior < medida2) {
			maior = medida2;
		}
		if (maior < medida3) {
			maior = medida3;
		}
		
		System.out.print("MAIOR DISTANCIA = " + String.format("%.2f", maior));
		
		sc.close();
	}

}
