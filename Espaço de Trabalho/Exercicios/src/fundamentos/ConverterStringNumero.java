package fundamentos;

import java.util.Scanner;

public class ConverterStringNumero {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		String valor1 = entrada.nextLine();
		System.out.print("Digite o segundo valor: ");
		String valor2 = entrada.nextLine();
		
		double num1 = Double.parseDouble(valor1);
		double num2 = Double.parseDouble(valor2);
		
		double soma = num1 + num2;
		double media = soma / 2;
		
		System.out.printf("A soma dos dois valores eh %.1f \nA media eh %.1f", soma, media);
		
		entrada.close();
	}
}
