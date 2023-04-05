package classe.desafios;

public class Data {
	
	 int dia, mes, ano;
	
	//Construtores
	public Data(){
		//dia = 01;
		//mes = 01;
		//ano = 1970;
		this(01, 01, 1970);
	}
	
	Data(int dia, int mes, int ano){
		this.dia = dia;
		this.mes = mes;
		this.ano = ano;
	}
	
	
	//Métodos
	String obterDataFormatada () {
		 return String.format("%d/%d/%d", this.dia, mes, ano);
	}
	
	void imprimirDataFormatada() {
		System.out.println(obterDataFormatada());
	}
	
}
