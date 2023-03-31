package aulaDia300323;

import java.util.Scanner;

public class Alg111 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int x = ler.nextInt();
		
		System.out.print("Digite outro numero: ");
		int y = ler.nextInt();
		
		if(x > y) {
			System.out.println("O maior numero digitado eh " + x);
		} else {
			System.out.println("O maior numero digitado eh " + y);
		}
		
		ler.close();
	}
}
