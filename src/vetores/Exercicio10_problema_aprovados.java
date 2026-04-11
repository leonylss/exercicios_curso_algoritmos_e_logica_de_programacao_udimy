package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10_problema_aprovados {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i;
		
		
		System.out.print("Quantos alunos serao digitados? ");
		n = sc.nextInt();
		
		String [] nome = new String [n];
		double [] nota1 = new double [n];
		double [] nota2 = new double [n];
		double [] media = new double [n];
		
		
		
		for (i = 0; i < n; i++) {
			System.out.println("Digite nome, primeira e segunda nota do(a) " + (i+1) + "º aluno(a)");
			sc.nextLine();
			nome[i] = sc.nextLine();
			nota1[i] = sc.nextDouble();
			nota2[i] = sc.nextDouble();
			media[i] = (nota1[i] + nota2[i]) / 2;
		}
		
		
		System.out.println("Alunos aprovados:");
		for (i = 0; i < n; i++) {
			if (media[i] >= 6) {
				System.out.println(nome[i]);
			}
		}
		
		sc.close();

	}

}
