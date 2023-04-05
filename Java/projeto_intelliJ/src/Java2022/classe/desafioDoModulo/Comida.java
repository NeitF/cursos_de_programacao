package Java2022.classe.desafioDoModulo;

public class Comida {
	
	//Atributos
	String nomeDaComida;
	double pesoDaComida;
	
	//Construtor sem passagem de parâmetro
	Comida(){
		nomeDaComida = "";
		pesoDaComida = 0;
	}
	
	//Construtor com passagem de parâmetro
	Comida(String nomeDaComida, double pesoDaComida){
		this.nomeDaComida = nomeDaComida;
		this.pesoDaComida = pesoDaComida;
	}
	
	//Não há método
}
