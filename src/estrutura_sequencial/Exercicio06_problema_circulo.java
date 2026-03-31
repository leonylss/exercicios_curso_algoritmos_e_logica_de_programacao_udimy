package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06_problema_circulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double raioCirculo, area;
		
		System.out.print("Digite o valor do raio do circulo: ");
		raioCirculo = sc.nextDouble();
		
		area = Math.PI * Math.pow(raioCirculo, 2);
		
		System.out.print("AREA = " + String.format("%.3f", area));
		
		sc.close();
		

	}

}
