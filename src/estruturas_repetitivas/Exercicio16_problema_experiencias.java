package estruturas_repetitivas;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio16_problema_experiencias {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int i, qtdTestes, qtdCobaias, contRato, contSapo, contCoelho, totalCobaias;
		char tipoCobaia;
		double percentualCoelho, percentualRato, percentualSapo;
		
		System.out.print("Quantos casos de teste serao digitados? ");
		qtdTestes = sc.nextInt();
		
		contRato = 0;
		contSapo = 0;
		contCoelho = 0;
		
		for (i = 1; i <= qtdTestes; i++) {
			System.out.print("Quantidade de cobaias: ");
			qtdCobaias = sc.nextInt();
			System.out.print("Tipo de cobaia: ");
			tipoCobaia = sc.next().charAt(0);
			
			if (tipoCobaia == 'r' || tipoCobaia == 'R') {
				contRato = contRato + qtdCobaias;
			}
			else if (tipoCobaia == 's' || tipoCobaia == 'S') {
				contSapo = contSapo + qtdCobaias;
			}
			else if (tipoCobaia == 'c' || tipoCobaia == 'C') {
				contCoelho = contCoelho + qtdCobaias;
			}
		}
		
		
		System.out.println();
		
		totalCobaias = contRato + contSapo + contCoelho;
		System.out.println("RELATORIO FINAL:");
		System.out.println("Total: " + totalCobaias + " cobaias");
		System.out.println("Total de coelhos: " + contCoelho);
		System.out.println("Total de ratos: " + contRato);
		System.out.println("Total de sapos: " + contSapo);
		
		percentualCoelho = (double)contCoelho / totalCobaias * 100;
		percentualRato = (double)contRato / totalCobaias * 100;
		percentualSapo = (double)contSapo / totalCobaias * 100;
		
		System.out.println("Percentual de coelhos: " + String.format("%.2f", percentualCoelho) + " %");
		System.out.println("Percentual de ratos: " + String.format("%.2f", percentualRato) + " %");
		System.out.println("Percentual de sapos: " + String.format("%.2f", percentualSapo) + " %");
		
		sc.close();

	}

}
