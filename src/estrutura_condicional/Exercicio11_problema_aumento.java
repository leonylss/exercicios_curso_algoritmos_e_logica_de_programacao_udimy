package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11_problema_aumento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double salario, novoSalario, aumento; 
		int porcentagem;
		
		System.out.print("Digite o salario da pessoa: R$ ");
		salario = sc.nextDouble();
		
		if (salario <= 1000) {
			aumento = salario * 0.20;
			novoSalario = salario + aumento;
			porcentagem = 20;
		}
		else if (salario <= 3000) {
			aumento = salario * 0.15;
			novoSalario = salario + aumento;
			porcentagem = 15;
		}
		else if (salario <= 8000) {
			aumento = salario * 0.10;
			novoSalario = salario + aumento;
			porcentagem = 10;
		}
		else {
			aumento = salario * 0.05;
			novoSalario = salario + aumento;
			porcentagem = 5;
		}
		
		System.out.println("Novo salario = R$ " + String.format("%.2f", novoSalario));
		System.out.println("Aumento = R$ " + String.format("%.2f", aumento));
		System.out.print("Porcentagem = " + porcentagem + "%");
		
		sc.close();

	}

}
