package controle.desafios;

import java.util.Scanner;

public class DiasDaSemana {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite um dia da semana: ");
		String dia = entrada.nextLine();
		
		entrada.close();
		
	
		dia = dia.toLowerCase();
		
		if(dia.equals("domingo")) {
			System.out.println("1º dia da semana.");
		} else if(dia.equals("segunda") || dia.equals("segunda-feira")) {
			System.out.println("2º dia da semana.");
		} else if(dia.equals("terça") || dia.equals("terça-feira")) {
			System.out.println("3º dia da semana.");
		} else if(dia.equals("quarta") || dia.equals("quarta-feira")) {
			System.out.println("4º dia da semana.");
		} else if(dia.equals("quinta") || dia.equals("quinta-feira")) {
			System.out.println("5º dia da semana.");
		} else if(dia.equals("sexta") || dia.equals("sexta-feira")) {
			System.out.println("6º dia da semana.");
		} else if(dia.equals("sabado") || dia.equals("sábado")) {
			System.out.println("7º dia da semana.");
		} else {
			System.out.println("Valor digitado Invalido");
		}
	}
}
