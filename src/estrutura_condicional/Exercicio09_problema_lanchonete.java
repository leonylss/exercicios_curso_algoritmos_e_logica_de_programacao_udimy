package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09_problema_lanchonete {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int codigoProduto, quantidadeComprada;
		double pagamento;
		
		System.out.print("Codigo do produto comprado (1 a 5): ");
		codigoProduto = sc.nextInt();
		System.out.print("Quantidade comprada: ");
		quantidadeComprada = sc.nextInt();
		
		if (codigoProduto == 1) {
			pagamento = quantidadeComprada * 5.00;
			
		}
		else if (codigoProduto == 2) {
			pagamento = quantidadeComprada * 3.50;
		}
		else if (codigoProduto == 3) {
			pagamento = quantidadeComprada * 4.80;
		}
		else if (codigoProduto == 4) {
			pagamento = quantidadeComprada * 8.90;
		}
		else {
			pagamento = quantidadeComprada * 7.32;
		}
		
		System.out.println("Valor a pagar: R$ " + String.format("%.2f", pagamento));
		
		sc.close();
		
	}

}
