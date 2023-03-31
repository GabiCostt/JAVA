package fundamentos.desafios;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Digite o primeiro numero: ");
		double num1 = entrada.nextDouble();
		
		System.out.print("Digite o segundo numero: ");
		double num2 = entrada.nextDouble();
		
		System.out.print("\nDigite: + para soma \n- para subtracao \n* para multiplicacao \n/ para divisao" +
				"\nQual operacao voce quer fazer com os dois numeros digitados?: ");
		String s = entrada.next();
		
		double resultado = "+".equals(s) ? num1+num2 : 0;
		resultado = "-".equals(s) ? num1-num2 : resultado;
		resultado = "*".equals(s) ? num1*num2 : resultado;
		resultado = "/".equals(s) ? num1/num2 : resultado;
		
		System.out.printf("O resultado de %.2f %s %.2f = %.2f", num1, s, num2, resultado);
		
		
		entrada.close();
	}
}
