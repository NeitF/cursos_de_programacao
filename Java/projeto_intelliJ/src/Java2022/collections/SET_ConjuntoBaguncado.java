package Java2022.collections;

import java.util.HashSet;
import java.util.Set;

public class SET_ConjuntoBaguncado {
	public static void main(String[] args) {
		
		HashSet conjunto = new HashSet();
		
		
		conjunto.add(1.2); //Não suporta tipos primitivos. Converte o valor para Wrapper
		conjunto.add(true);
		conjunto.add("Teste");
		conjunto.add(1);
		conjunto.add('x');
		
		//Tamanho do conjunto
		System.out.println(conjunto.size());
		
		//Retorna true se remover e false se não remover
		System.out.println(conjunto.remove("Teste"));
		
		//True se conter, false se não conter
		System.out.println(conjunto.contains(1));
		
		Set nums = new HashSet();
		
		nums.add(1);
		nums.add(2);
		nums.add(3);
		
		System.out.println(nums);
		System.out.println(conjunto);
		
		//União de conjuntos. Peguei tudo o que tinha em nums e joguei em conjunto
		conjunto.addAll(nums);
		
		System.out.println(conjunto);
	}
}
