package Java2022.classe;

public class Produto {
	String nome;
	double preco;
	static double desconto = 0.25;
	
	//Construtores
	Produto(){
		
	}
	
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
	}
	
	//Métodos
	//Tipo que vai retornar - nome do método - Passagem de parâmetro ou não
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
