package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03_problema_alturas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, pessoasMenos16;
		
		double mediaAltura, pctMenos16, somaAlturas;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		String [] nome = new String [n];
		int [] idade = new int [n];
		double [] altura = new double [n];
		
		
		
		somaAlturas = 0;
		for (i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Idade: ");
			idade[i] = sc.nextInt();
			System.out.print("Altura: ");
			altura[i] = sc.nextDouble();
			somaAlturas = somaAlturas + altura[i];
		}
		
		System.out.println();
		
		mediaAltura = somaAlturas / n;
		System.out.println("Altura media: " + String.format("%.2f", mediaAltura));
		
		pessoasMenos16 = 0;
		for (i = 0; i < n; i++) {
			if (idade[i] < 16) {
				pessoasMenos16 = pessoasMenos16 + 1;
			}
		}
		
		pctMenos16 = (double)pessoasMenos16 / n * 100;
		System.out.println("Pessoas com menos de 16 anos: " + String.format("%.2f", pctMenos16) + "%");
		
		for (i = 0; i < n; i++) {
			if (idade[i] < 16) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}
