package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08_problema_consumo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double distanciaPercorrida, combustivelGasto, consumoMedio;
		
		System.out.print("Distância percorrida: ");
		distanciaPercorrida = sc.nextDouble();
		System.out.print("Combustível gasto: ");
		combustivelGasto = sc.nextDouble();
		consumoMedio = distanciaPercorrida / combustivelGasto;
		System.out.print("CONSUMO MÉDIO = " + String.format("%.3f", consumoMedio));
		
		sc.close();

	}

}
