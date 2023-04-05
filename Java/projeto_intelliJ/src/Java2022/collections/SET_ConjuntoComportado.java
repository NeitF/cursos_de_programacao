package Java2022.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SET_ConjuntoComportado {
	
	public static void main(String[] args) {
	
//		Set<String> listaAprovados = new HashSet<>();
		TreeSet<String> listaAprovados = new TreeSet<>();
		listaAprovados.add("Ana");
		listaAprovados.add("Carlos");
		listaAprovados.add("Luca");
		listaAprovados.add("Pedro");
		
		for(String candidato: listaAprovados) {
			System.out.println(candidato);
		}
		
		Set<Integer> nums = new HashSet<>();
		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
	}
}
