package estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10_problema_duracao {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		int duracaoSegundos, horas, minutos, segundos;
		
		System.out.print("Digite a duração em segundos: ");
		duracaoSegundos = sc.nextInt();
		
		horas = duracaoSegundos / 3600;
		minutos = (duracaoSegundos % 3600) / 60;
		segundos = (duracaoSegundos % 3600) % 60;
		
		System.out.print(horas + ":" + minutos + ":" + segundos);
		
		sc.close();
		

	}

}
