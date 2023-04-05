package Java2022.classe.desafioDoModulo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("João", 84.5);
		Comida comida  = new Comida("Filé", 5.7);
		
		System.out.println(" Nome da pessoa: " + pessoa.nomeDaPessoa + "\n Peso da pessoa: " + pessoa.pesoDaPessoa
				+ "\n Nome da comida: " + comida.nomeDaComida + "\n Peso da comida: " + comida.pesoDaComida + 
				"\n Peso da pessoa após comer: " + pessoa.Comer(comida));
	}
}
