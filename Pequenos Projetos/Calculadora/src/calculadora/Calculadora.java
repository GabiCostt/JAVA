package calculadora;

import java.util.Scanner;

public class Calculadora {
	 public static void main(String[] args) {
		System.out.println("---CALCULADORA---");
		System.out.println("1 - Soma e Subtracao \n" + "2 - Multiplicacao \n" + "3 - Divisao");
		System.out.println("------------------");
		
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite o numero correspondente da operacao que deseja: ");
		int escolha = ler.nextInt();
		
		System.out.print("Quantos valores deseja informar?: ");
		int quantidade = ler.nextInt();
		
		int cont = 0;
		double resultado = 0;
		while(cont <= quantidade) {
			cont += 1;
			if(escolha == 1) {
				System.out.printf("%d Valor: ", cont);
				resultado += ler.nextDouble();
				if(cont == quantidade) {
					break;
				}
			} else if(escolha == 2) {
				System.out.printf("%d Valor: ", cont);
				if(resultado == 0) {
					resultado = 1;
				}
				resultado *= ler.nextDouble();
				System.out.println("------> " + resultado);
				if(cont == quantidade) {
					break;
				}
			} else if(escolha ==3) {
				System.out.printf("%d Valor: ", cont);
				if(resultado == 0) {
					resultado += ler.nextDouble();
				}else {
					resultado /= ler.nextDouble();
				}
				
				if(cont == quantidade) {
					break;
				}
			}
		}
		
		ler.close();
		
		System.out.printf("O resultado eh: ---> %.1f", resultado);
		
	}
}
