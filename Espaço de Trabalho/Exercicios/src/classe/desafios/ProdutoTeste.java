package classe.desafios;

public class ProdutoTeste {
	public static void main(String[] args) {
		Produto p1 = new Produto();
		p1.nome = "Notebook";
		p1.preco = 100;
		double totalp1 = p1.ProdutoComDesconto();
		
		Produto p2 = new Produto();
		p2.nome = "Caneta";
		p2.preco = 10;
		Produto.desconto = 0.5;
		double totalp2 = p2.ProdutoComDesconto();
		
		
		System.out.println("Valor do Notebook com desconto: " + totalp1);
		System.out.println("Valor da Caneta com desconto: " + totalp2);
	}
}
