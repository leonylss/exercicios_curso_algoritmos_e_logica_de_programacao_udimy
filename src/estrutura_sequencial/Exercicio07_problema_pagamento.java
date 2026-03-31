package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07_problema_pagamento {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		String nome;
		double valorHora, horasTrabalhadas, valorPagamento;
		
		System.out.print("Nome: ");
		nome = sc.nextLine();
		System.out.print("Valor por horas: ");
		valorHora = sc.nextDouble();
		System.out.print("Horas trabalhadas: ");
		horasTrabalhadas = sc.nextDouble();
		valorPagamento = valorHora * horasTrabalhadas;
		System.out.print("O pagamento para " + nome + " deve ser R$ " 
		+ String.format("%.2f", valorPagamento));
		
		sc.close();

	}

}
