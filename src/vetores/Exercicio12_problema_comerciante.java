package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12_problema_comerciante {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, contLucro10, contLucro10_20, contLucro20;
		double totalVenda, totalCompra, lucroTotal;
		
		System.out.print("Serao digitados dados de quantos produtos? ");
		n = sc.nextInt();
		
		String [] nome = new String[n];
		double [] precoCompra = new double [n];
		double [] precoVenda = new double [n];
		double [] lucro = new double [n];
		
		for (i = 0; i < n; i++) {
			System.out.println("Produto " + (i+1));
			System.out.print("Nome: ");
			sc.nextLine();
			nome[i] = sc.nextLine();
			System.out.print("Preco compra: ");
			precoCompra[i] = sc.nextDouble();
			System.out.print("Preco venda: ");
			precoVenda[i] = sc.nextDouble();
			lucro[i] = (precoVenda[i] - precoCompra[i]) / precoCompra[i] * 100;
		}
		
		contLucro10 = 0;
		contLucro10_20 = 0;
		contLucro20 = 0;
		totalCompra = 0;
		totalVenda = 0;
		for (i = 0; i < n; i++) {
			if (lucro[i] < 10) {
				contLucro10 = contLucro10 + 1;
			}
			else if (lucro[i] <= 20) {
				contLucro10_20 = contLucro10_20 + 1;
			}
			else {
				contLucro20 = contLucro20 + 1;
			}
			totalCompra = totalCompra + precoCompra[i];
			totalVenda = totalVenda + precoVenda[i];
		}
		
		lucroTotal = totalVenda - totalCompra;
		
		System.out.println();
		
		System.out.println("RELATORIO FINAL:");
		System.out.println("Lucro abaixo de 10%: " + contLucro10);
		System.out.println("Lucro entre 10% e 20%: " + contLucro10_20);
		System.out.println("Lucro acima de 20%: " + contLucro20);
		System.out.println("Valor total de compra: " + String.format("%.2f", totalCompra));
		System.out.println("Valor total de venda: " + String.format("%.2f", totalVenda));
		System.out.print("Lucro total: " + String.format("%.2f", lucroTotal));
		
		sc.close();
		

	}

}
