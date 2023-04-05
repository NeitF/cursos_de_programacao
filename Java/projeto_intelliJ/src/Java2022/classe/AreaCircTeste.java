package Java2022.classe;

public class AreaCircTeste {
	public static void main(String[] args) {
		
		AreaCirc a1 = new AreaCirc(10);
		a1.raio = 10;
		
		//Pertence a instância
		System.out.println(a1.area());
		
		//Pertence a classe
		System.out.println(AreaCirc.area(100));
		System.out.println(AreaCirc.PI);
		System.out.println(Math.PI);
		
		//AreaCirc.PI = 2;
	}
}
