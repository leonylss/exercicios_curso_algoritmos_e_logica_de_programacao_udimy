package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02_problema_retangulo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double baseRetangulo, alturaRetangulo, area, perimetro, diagonal;
		
		System.out.print("Base do retangulo: ");
		baseRetangulo = sc.nextDouble();
		
		System.out.print("Altura retangulo: ");
		alturaRetangulo = sc.nextDouble();
		
		area = baseRetangulo * alturaRetangulo;
		System.out.println("AREA = " + String.format("%.4f", area));
		
		perimetro = 2 * (baseRetangulo + alturaRetangulo);
		System.out.println("PERIMETRO = " + String.format("%.4f", perimetro));
		
		
		diagonal = Math.sqrt (Math.pow(baseRetangulo, 2) + Math.pow(alturaRetangulo, 2));
		System.out.print("DIAGONAL = " + String.format("%.4f", diagonal));
		
		sc.close();
		

	}

}
