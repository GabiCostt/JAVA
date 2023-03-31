package fundamentos;

import java.util.Scanner;

public class ExGrupo05 {
	
	public static void main(String[] args) {
		
		/*Entrar com a idade de uma pessoa e informar: se é maior de idade,
		se é menor de idade ou se é maior de 65 anos.*/
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Sua idade: ");
		int idade = entrada.nextInt();
		
		while(true) {
			if(idade < 0 || idade > 100) {
				System.out.print("Idade Invalida! Sua idade: ");
				idade = entrada.nextInt();
			}else if(idade < 18) {
				System.out.println("Menor de Idade");
				break;
			} else if (idade <= 65) {
				System.out.println("Maior de Idade");
				break;
			} else {
				System.out.println("Maior de 65 anos.");
				break;
			}
		}
		entrada.close();
		
		

		
	} 
		
}

