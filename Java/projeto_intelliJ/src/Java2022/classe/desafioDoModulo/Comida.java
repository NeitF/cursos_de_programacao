package Java2022.classe.desafioDoModulo;

public class Comida {
	
	//Atributos
	String nomeDaComida;
	double pesoDaComida;
	
	//Construtor sem passagem de par�metro
	Comida(){
		nomeDaComida = "";
		pesoDaComida = 0;
	}
	
	//Construtor com passagem de par�metro
	Comida(String nomeDaComida, double pesoDaComida){
		this.nomeDaComida = nomeDaComida;
		this.pesoDaComida = pesoDaComida;
	}
	
	//N�o h� m�todo
}
