package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04_problema_operadora {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double minutos, valor;
		
		System.out.print("Digite a quantidade de minutos: ");
		minutos = sc.nextDouble();
		
		if (minutos <= 100) {
			valor = 50;
			System.out.println("Valor a pagar R$ " + String.format("%.2f", valor));
		}
		else {
			valor = 50 + ((minutos - 100) * 2);
			System.out.println("Valor a pagar: R$ " + String.format("%.2f", valor));
		}
		
		sc.close();
	}

}
