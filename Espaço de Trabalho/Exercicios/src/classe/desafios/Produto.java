package classe.desafios;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	double ProdutoComDesconto() {
			return preco - (preco * desconto);
		}
}
