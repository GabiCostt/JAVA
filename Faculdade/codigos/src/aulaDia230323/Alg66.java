package aulaDia230323;

import java.util.Scanner;

public class Alg66 {
	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		System.out.print("Tempo gasto na viagem(em minutos): ");
		int tempo_viagem = ler.nextInt();
		
		System.out.print("Velocidade media: ");
		int velocidade = ler.nextInt();
		
		int distancia = tempo_viagem * velocidade;
		
		int litrosUsados = distancia / 12;
		
		System.out.println("Litros de Gasolina usados: " +  litrosUsados);
		
		ler.close();
	}
}
