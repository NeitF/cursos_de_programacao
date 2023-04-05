package Java2022.collections;

import java.util.ArrayList;

public class Lista {
	
	public static void main(String[] args) {
		ArrayList<Usuario> lista = new ArrayList<>();
		
		Usuario u1 = new Usuario("Ana");
		
		
		lista.add(u1);
		lista.add(new Usuario("Carlos"));
		lista.add(new Usuario("Lia"));
		lista.add(new Usuario("Bia"));
		lista.add(new Usuario("Manu"));
		
		//Pega o elemento do indic inserido
        //System.out.println(lista.get(3).nome);
		//Chama o método toString implicitamente
		System.out.println(lista.get(3));
		
		System.out.println(lista.remove(1));
		
		//Como o equals e o HashCode estão corretamente implementados, essa forma de remover
		//irá funcionar
		System.out.println(lista.remove(new Usuario("Manu")));
		
		System.out.println("CONTÉM: " + lista.contains(new Usuario("Lia")));
		System.out.println(lista.contains(u1));
		
//		for(Usuario u: lista) {
//			System.out.println(u.nome);
//		}
		
	}
}
