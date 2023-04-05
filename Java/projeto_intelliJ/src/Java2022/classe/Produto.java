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
	
	//M�todos
	//Tipo que vai retornar - nome do m�todo - Passagem de par�metro ou n�o
	double precoComDesconto() {
		return preco * (1 - desconto);
	}
	
	double precoComDesconto(double descontoDoGerente) {
		return preco * (1 - desconto + descontoDoGerente);
	}
}
