package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio01_problema_notas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		
		double nota1, nota2, notaFinal;
		
		System.out.print("Digite a primeira nota: ");
		nota1 = sc.nextDouble();
		System.out.print("Digite a segunda nota: ");
		nota2 = sc.nextDouble();
		
		notaFinal = nota1 + nota2;
		System.out.println ("NOTA FINAL = " + String.format("%.1f", notaFinal));
		
		if (notaFinal < 60) {
			System.out.print("REPROVADO ):");
		}
		
		sc.close();

	}

}
