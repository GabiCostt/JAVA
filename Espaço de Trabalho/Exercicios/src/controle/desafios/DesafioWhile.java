package controle.desafios;

import java.util.Scanner;

public class DesafioWhile {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);

		double nota_total = 0;
		int nums_validos = 0;
		int nums_invalidos = 0;
		String sair = "";
		
		while(!sair.equals("00")) {
			System.out.print("[00 para sair] Informe sua nota: ");
			double nota_digitada = entrada.nextDouble();
			
			if(nota_digitada == 00) {
				sair = "00";
			}else if(nota_digitada >= 0 && nota_digitada <= 10) {
				nota_total += nota_digitada;
				nums_validos++;
			}else {
				nums_invalidos++;
			}
			
		}

		entrada.close();
		
		double nota_media = nota_total / nums_validos;
		
		System.out.println("Nota total = " + nota_total);
		System.out.println("Media = " + nota_media);
		System.out.println("Notas validas digitadas: " + nums_validos);
		System.out.println("Notas invalidas digitadas: " + nums_invalidos);
	}
}
