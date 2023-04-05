package Java2022.collections;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

    public static void main(String[] args) {

        Deque<String> livros = new ArrayDeque<>();

        //Add retorna verdadeiro ou falso se adicionar, push retorna uma excessão
        livros.add("O pequeno príncipe");
        livros.push("Don Quixote");
        livros.push("O Hobbit");


        //Peek e Element retornam o próximo elemento da pilha, porém não o removem.
        //A diferença entre eles é que se a pilha estiver vazia, peek retornará null e
        //element retornará uma excessão
        System.out.println(livros.peek());
        System.out.println(livros.element());

        //Poll retorna o próximo elemento e remove ele da pilha. Se usa-lo em uma pilha vazia,
        //ele retornará Null. O remove faz a mesma coisa, com a diferença de que ele retornará
        //uma excessão caso a pilha esteja vazia
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.poll());
        System.out.println(livros.remove());

        //Pop também lança excessão assim como o remove
        System.out.println(livros.pop());

//        livros.size();
//        livros.clear();
//        livros.contains();
//        livros.isEmpty();


    }
}
