package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01_problema_terreno {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double larguraTerreno, comprimentoTerreno, valorMetroQuadrado, areaTerreno, precoTerreno;
		
		System.out.print("Digite a largura do terreno: ");
		larguraTerreno = sc.nextDouble();
		
		System.out.print("Digite o comprimento do terreno: ");
		comprimentoTerreno = sc.nextDouble();
		
		System.out.print("Digite o valor do metro quadrado: ");
		valorMetroQuadrado = sc.nextDouble();
		
		areaTerreno = larguraTerreno * comprimentoTerreno;
		System.out.println("AREA TERRENO = " + String.format("%.2f", areaTerreno));
		
		precoTerreno = valorMetroQuadrado * areaTerreno;
		System.out.print("PRECO TERRENO = " + String.format("%.2f",precoTerreno));
		
		sc.close();

	}

}
