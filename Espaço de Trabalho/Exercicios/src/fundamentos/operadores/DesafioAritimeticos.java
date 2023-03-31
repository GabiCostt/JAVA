package fundamentos.operadores;

public class DesafioAritimeticos {
	public static void main(String[] args) {
		int a = (int) Math.pow(6 * (3 + 2), 2) / (3 * 2); // 150
		int b = (int) Math.pow((1 - 5) * (2 - 7) / 2, 2); // 100
		
		int potenciacao = (int) Math.pow(a - b, 3); // (150 - 100)^3 = 125000
		int potenciacao_final = (int) Math.pow(10, 3); // 1000
		
		int resultado_final = potenciacao / potenciacao_final; // 125000 / 1000	
		
		System.out.println(resultado_final);
 	}
}
