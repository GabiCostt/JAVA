package aulaDia230323;

import java.util.Scanner;

public class AulaPratica2 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um número: ");
		int x = ler.nextInt();
		System.out.print("Digite outro número: ");
		int y = ler.nextInt();
		int soma = x + y;
		
		System.out.println("A soma eh " + soma);
		
		ler.close();
	}
}
