package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09_problema_mais_velho {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US); 
		Scanner sc = new Scanner(System.in);
		
		int i, n, maisVelho, posicao;
		
		System.out.print("Quantas pessoas voce vai digitar? ");
		n = sc.nextInt();
		
		String [] nome = new String [n];
		int [] idade = new int [n];
		
		for (i = 0; i < n; i++) {
			System.out.println("Dados da " + (i+1) + "a pessoa:");
			System.out.print("Nome: ");
			sc.nextLine();
			nome [i] = sc.nextLine();
			System.out.print("Idade: ");
			idade [i] = sc.nextInt();
		}
		
		posicao = 0;
		maisVelho = idade[0];
		for (i = 0; i < n; i++) {
			if (idade[i] > maisVelho) {
				maisVelho = idade[i];
				posicao = i;
			}
		}
		
		System.out.print("PESSOA MAIS VELHA: " + nome[posicao]);
		
		sc.close();
		

	}

}
