package aulaDia230323;

import java.util.Scanner;

public class Alg64 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Digite a temperatura em Grau Celsius: ");
		int c = ler.nextInt();
		
		double f = (9*c + 160) / 5;
		
		System.out.println("fahrenheit:  " + f);
		ler.close();
	}
}
