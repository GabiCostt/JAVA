package aulaDia300323;

import java.util.Scanner;

public class Alg90 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite um numero: ");
		int num = ler.nextInt();
		
		if(num > 20) {
			System.out.println(num + " eh maior que 20.");
		} else {
			System.out.println(num + " eh menor que 20.");
		}
		
		
		ler.close();
	}
}
