package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;


public class Exercicio05_problema_troco {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		double dinheiroRecebido, precoUnitario, troco;
		int quantidadeProduto;
		
		System.out.print("Preço unitário do produto: ");
		precoUnitario = sc.nextDouble();
		System.out.print("Quantidade comprada: ");
		quantidadeProduto = sc.nextInt();
		System.out.print("Dinheiro recebido: ");
		dinheiroRecebido = sc.nextDouble();
		
		troco = dinheiroRecebido - precoUnitario * quantidadeProduto;
		System.out.print("TROCO = " + String.format("%.2f", troco));
		
		sc.close();
		

	}

}
