package Java2022.classe.desafioDoModulo;

public class Pessoa {
	
	//Atributos
	String nomeDaPessoa;
	double pesoDaPessoa;
	
	//Construtor sem passagem de par�metro
	Pessoa(){
		nomeDaPessoa = "";
		pesoDaPessoa = 0;
	}
	
	//Construtor com passagem de par�metro
	Pessoa(String nomeDaPessoa, double pesoDaPessoa){
		this.nomeDaPessoa = nomeDaPessoa;
		this.pesoDaPessoa = pesoDaPessoa;
	}
	
	//M�todo
	double Comer(Comida objComida) {
		return pesoDaPessoa + objComida.pesoDaComida;
	}
}
