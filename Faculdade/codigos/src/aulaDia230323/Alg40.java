package aulaDia230323;

import java.util.Scanner;

public class Alg40 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Dividendo: ");
		int dividendo = ler.nextInt();
		
		System.out.print("Divisor: ");
		int divisor = ler.nextInt();
		
		
		int resto = dividendo % divisor;
		int quociente = dividendo / divisor;
		
		System.out.println("---------------------");
		System.out.printf("Dividendo: %d \n"
				+ "Divisor: %d \n"
				+ "Resto: %d \n"
				+ "Quociente: %d", dividendo, divisor, resto, quociente);
		
		ler.close();
	}
}
