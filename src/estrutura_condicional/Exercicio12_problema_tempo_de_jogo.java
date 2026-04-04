package estrutura_condicional;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio12_problema_tempo_de_jogo {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int horaInicial, horaFinal, duracao;
		
		System.out.print("Hora inical: ");
		horaInicial = sc.nextInt();
		System.out.print("Hora final: ");
		horaFinal = sc.nextInt();
		
		if (horaInicial < horaFinal) {
			duracao = horaFinal - horaInicial;
		}
		else {
			duracao = 24-horaInicial + horaFinal;
		}
		
		System.out.println("O jogo durou " + duracao + " hora(s)");
		
		sc.close();

	}

}
