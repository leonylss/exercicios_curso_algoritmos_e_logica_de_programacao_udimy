package vetores;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio11_problema_dados_pessoas {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int n, i, numeroHomens, numeroMulheres;
		double menorAltura, maiorAltura, mediaAtrMulheres, somaAtrMulheres;
		
		System.out.print("Quantas pessoas serao digitadas? ");
		n = sc.nextInt();
		
		double [] altura = new double [n];
		char [] genero = new char [n];
		
		for (i = 0; i < n; i++) {
			System.out.print("Altura da " + (i+1) + "a pessoa: ");
			altura[i] = sc.nextDouble();
			System.out.print("Genero da " + (i+1) + "a pessoa (F/M): ");
			genero[i] = sc.next().charAt(0);
		}
		
		
		
		somaAtrMulheres = 0;
		menorAltura = altura[0];
		maiorAltura = altura [0];
		numeroMulheres = 0;
		numeroHomens = 0;
		for (i = 0; i < n; i++) {
			if (altura[i] < menorAltura) {
				menorAltura = altura[i];
			}
			if (altura[i] > maiorAltura) {
				maiorAltura = altura[i];
			}
			if (genero[i] == 'f' || genero[i] == 'F') {
				numeroMulheres = numeroMulheres + 1;
				somaAtrMulheres = somaAtrMulheres + altura[i];
			}
			if (genero[i] == 'm' || genero[i] == 'M') {
				numeroHomens = numeroHomens + 1;
			}
		}
		
		mediaAtrMulheres = somaAtrMulheres / numeroMulheres;
		
		System.out.println("Menor altura = " + String.format("%.2f", menorAltura));
		System.out.println("Maior altura = " + String.format("%.2f", maiorAltura));
		System.out.println("Media altura das mulheres = " + String.format("%.2f", mediaAtrMulheres));
		System.out.println("Numero de homens = " + numeroHomens);
		
		sc.close();

	}

}
