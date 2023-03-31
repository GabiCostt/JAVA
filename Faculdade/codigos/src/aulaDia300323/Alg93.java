package aulaDia300323;

import java.util.Scanner;

public class Alg93 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		double num = ler.nextInt();
		
		if(num > 0) {
			double raiz = num / 2;
			System.out.printf("Raiz Quadrada de %f eh: %.1f", num, raiz);
		} else {
			double quadrado = Math.pow(num, 2);
			System.out.printf("%.1f ao QUADRADO eh: %.1f", num, quadrado);
		}
		
		ler.close();
	}
}
