package Java2022.classe.desafioDoModulo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa pessoa = new Pessoa("Jo�o", 84.5);
		Comida comida  = new Comida("Fil�", 5.7);
		
		System.out.println(" Nome da pessoa: " + pessoa.nomeDaPessoa + "\n Peso da pessoa: " + pessoa.pesoDaPessoa
				+ "\n Nome da comida: " + comida.nomeDaComida + "\n Peso da comida: " + comida.pesoDaComida + 
				"\n Peso da pessoa ap�s comer: " + pessoa.Comer(comida));
	}
}
