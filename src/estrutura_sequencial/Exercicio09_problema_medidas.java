package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09_problema_medidas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double medidaA, medidaB, medidaC, areaQuadrado, areaTriangulo, areaTrapezio;
		
		System.out.print("Digite a medida A: ");
		medidaA = sc.nextDouble();
		System.out.print("Digite a medida B: ");
		medidaB = sc.nextDouble();
		System.out.print("Digite a medida C: ");
		medidaC = sc.nextDouble();
		
		areaQuadrado = medidaA * medidaA;
		areaTriangulo = medidaA * medidaB / 2;
		areaTrapezio = (medidaA + medidaB) * medidaC / 2;
		
		System.out.println("AREA DO QUADRADO = " + String.format("%.4f", areaQuadrado));
		System.out.println("AREA DO TRIÂNGULO = " + String.format("%.4f", areaTriangulo));
		System.out.println("AREA DO TRAPÉZIO = " + String.format("%.4f", areaTrapezio));
		
		sc.close();
	}

}
