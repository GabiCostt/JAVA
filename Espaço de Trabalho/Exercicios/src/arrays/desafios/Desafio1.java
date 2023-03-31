package arrays.desafios;

import java.util.Scanner;

public class Desafio1 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantidade de notas a ser informado: ");
		int quantidadeNotas = entrada.nextInt();
		
		double[] notas = new double[quantidadeNotas];
		for(int i = 0; i < quantidadeNotas; i++) {
			System.out.printf("%d nota: ", i+1);
			notas[i] = entrada.nextDouble();
		}
		entrada.close();

		double totalNota = 0;
		for(double nota: notas) {
			totalNota += nota;
		}
		double mediaNota = totalNota / quantidadeNotas;
		System.out.printf("Nota Total: %.1f", totalNota);
		System.out.printf("\nMedia: %.1f", mediaNota);
	}
}
