package br.edu.univas;

import java.util.Scanner;

public class Questao1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int countX = 0, countY = 0, countZ = 0, countNulo = 0, countBranco = 0;
		
		for(int i = 0; i < 1500; i++) {
			System.out.println("111 – Candidato X");
			System.out.println("222 – Candidato Y");
			System.out.println("333 – Candidato Z");
			System.out.println("0 – Branco");
			System.out.println("Qualquer outro valor digitado será considerado Nulo");
			System.out.print("Vote: ");
			int voto = scanner.nextInt();	
			if(voto == 111) countX++;
			else if(voto == 222) countY++;
			else if(voto == 333) countZ++;
			else if(voto == 0) countBranco++;
			else countNulo++;
		}
		scanner.close();
		System.out.println("Total de votos no candidato X: " + countX);
		System.out.println("Total de votos no candidato Y: " + countY);
		System.out.println("Total de votos no candidato Z: " + countZ);
		System.out.println("Total de votos em branco: " + countBranco);
		System.out.println("Total de votos nulos: " + countNulo);
	}
} 