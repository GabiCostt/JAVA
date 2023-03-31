package fundamentos.desafios;

import java.util.Scanner;

public class DesafioConversao {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor do salario: R$");
		String s1 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o segundo valor do salario: R$");
		String s2 = entrada.nextLine().replace(",", ".");
		System.out.print("Digite o terceiro valor do salario: R$");
		String s3 = entrada.nextLine().replace(",", ".");
	
		double num1 = Double.parseDouble(s1);
		double num2 = Double.parseDouble(s2);
		double num3 = Double.parseDouble(s3);
		
		double media_salarial = (num1 + num2 + num3) / 3;
		
		System.out.printf("A media salarial do funcionario é R$%.2f", media_salarial);
		
		
		
		entrada.close();
	}
}
