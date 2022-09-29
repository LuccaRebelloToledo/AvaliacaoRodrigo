package br.edu.univas;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int pontuacao = 0, saldoGols = 0, golsFeitos = 0, golsSofridos = 0;
		String[] timesAdversarios = {"Sérvia", "Suíça", "Camarões"};
		
		for(int i = 0; i < 3; i++) {
			System.out.println("Brasil X " + timesAdversarios[i]);
			System.out.print("Gols Feitos contra " + timesAdversarios[i] + ": ");
			golsFeitos = scanner.nextInt();
			System.out.print("Gols Sofridos contra " + timesAdversarios[i] + ": ");
			golsSofridos = scanner.nextInt();
			
			if(golsFeitos > golsSofridos) pontuacao += 3;
			else if (golsFeitos == golsSofridos) pontuacao += 1;
			
			saldoGols += (golsFeitos - golsSofridos);
		}
		scanner.close();
		System.out.println("Resultado dos 3 jogos do Brasil na fase de grupos");
		System.out.println("Pontuação: " + pontuacao);
		System.out.println("Saldo de Gols: " + saldoGols);
	}
}