package Java2022.classe.desafioDoModulo;

public class Pessoa {
	
	//Atributos
	String nomeDaPessoa;
	double pesoDaPessoa;
	
	//Construtor sem passagem de parâmetro
	Pessoa(){
		nomeDaPessoa = "";
		pesoDaPessoa = 0;
	}
	
	//Construtor com passagem de parâmetro
	Pessoa(String nomeDaPessoa, double pesoDaPessoa){
		this.nomeDaPessoa = nomeDaPessoa;
		this.pesoDaPessoa = pesoDaPessoa;
	}
	
	//Método
	double Comer(Comida objComida) {
		return pesoDaPessoa + objComida.pesoDaComida;
	}
}
