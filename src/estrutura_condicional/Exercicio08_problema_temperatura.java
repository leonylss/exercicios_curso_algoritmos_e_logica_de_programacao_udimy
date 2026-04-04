package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08_problema_temperatura {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner (System.in);
		
		char escala;
		double temperaturaCelsius, temperaturaFahrenheit;
		
		System.out.print("Voce vai digitar a temperatura em qual escala (C/F)? ");
		escala = sc.next().charAt(0);
		
		if (escala == 'C' || escala == 'c') {
			System.out.print("Digite a temperatura em Celsius: ");
			temperaturaCelsius = sc.nextDouble();
			temperaturaFahrenheit = temperaturaCelsius * 1.8 + 32;
			System.out.println("Temperatura equivalente em Fahrenheit: "
			+ String.format("%.2f", temperaturaFahrenheit));
		}
		
		else {
			System.out.print("Digite a temperatura em Fahrenheit: ");
			temperaturaFahrenheit = sc.nextDouble();
			temperaturaCelsius = 5.0 / 9 * (temperaturaFahrenheit - 32);
			System.out.println("Temperatura equivalente em Celsius: "
			+ String.format("%.2f", temperaturaCelsius));
		}
		
		sc.close();
		

	}

}
