package arrays.desafios;

import java.util.Scanner;

public class DesafioPessoal {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
			while(true) {
				System.out.print("Qual o nome do Aluno(a)?: ");
				String nomeAluno = entrada.next();
				
				System.out.print("Quantidade de nota a ser informado: ");
				int quantidadeNotas = entrada.nextInt();
				
				double[] notas = new double[quantidadeNotas];
				for(int i = 0; i < quantidadeNotas; i++) {
					System.out.printf("%d nota: ", i+1);
					notas[i] = entrada.nextDouble();
				}
				
				double notaTotal = 0;
				for(int i = 0; i < quantidadeNotas; i++) {
					notaTotal += notas[i];
				}
				
				double media = notaTotal / quantidadeNotas;
				System.out.println("============================");
				System.out.printf("Nota Total de %s: %.1f \nNota Media de %s: %.1f", 
						nomeAluno, notaTotal, nomeAluno, media);
				System.out.println("\n============================");
				
				System.out.print("\nContinuar o programa[0 p/ sim ou 1 p/ nao]?: ");
				int resposta = entrada.nextInt();
				if(resposta == 1) {
					break;
				}
			}
			
		entrada.close();
	}
}
