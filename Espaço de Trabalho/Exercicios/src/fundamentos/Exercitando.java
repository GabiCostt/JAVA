package fundamentos;

public class Exercitando {
	public static void main(String[] args) {
		int idade = 15;
		double salario = 1500;
		String nome = "Gabriel Costa Santos";
		
		System.out.println("O usuario " + nome + " tem " + idade + 
				" de idade e recebe um salario de R$" + salario);
		
		System.out.println(nome);
		
		nome = nome.replace("Santos", "Silva");
		nome = nome.toUpperCase();
		nome = nome.concat("!!!");
		
		System.out.println(nome);
	}
}
