package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05_problema_troco_verificado {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int quantidadeComprada;
		double precoUnitario, dinheiroRecebido, troco, diferenca;
		
		System.out.print("Preco unitario do produto: R$ ");
		precoUnitario = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidadeComprada = sc.nextInt();
		System.out.print("Dinheiro recebido: R$ ");
		dinheiroRecebido = sc.nextDouble();
		
		troco = dinheiroRecebido - quantidadeComprada * precoUnitario;
		if (troco < 0) {
			diferenca = quantidadeComprada * precoUnitario - dinheiroRecebido;
			System.out.println("DINHEIRO INSUFICIENTE. FALTAM R$ " 
			+ String.format("%.2f", diferenca) + " REAIS");
		}
		else {
			System.out.println("TROCO = R$ " + String.format("%.2f", troco));
		}
		
		sc.close();

	}

}
