package fundamentos;

public class TipoString {
	public static void main(String[] args) {
		var nome = "Gabriel";
		var sobrenome = "Santos";
		var idade = 18;
		var salario = 12345.987;
		
		System.out.printf("O senhor %s %s tem %d de idade e seu salario eh de R$%.2f.",
				nome, sobrenome, idade, salario);

		System.out.printf("\nMeu nome eh %s e tenho %d anos de idade", nome, idade);
		
		String frase = String.format("\nMeu nome eh %s e tenho %d anos de idade.", nome, idade);
		System.out.println(frase);
	}
}
