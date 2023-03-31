package classe.desafioSeparado;

public class Pessoa {
	
	String nome_pessoa;
	double peso_pessoa;
	
	Pessoa() {
		
	}
	
	Pessoa(String nome_pessoa, double peso_pessoa) {
		this.nome_pessoa = nome_pessoa;
		this.peso_pessoa = peso_pessoa;
	}

	void comer(Comida comida) {
		if(comida != null) {
			this.peso_pessoa += comida.peso_comida;
		}
	}
	
	String apresentar() {
		return "Olá, meu nome é " + nome_pessoa + " e tenho " + peso_pessoa + "Kg.";
	}
}
