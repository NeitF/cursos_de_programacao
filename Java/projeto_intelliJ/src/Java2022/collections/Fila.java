package Java2022.collections;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

    public static void main(String[] args) {

        Queue<String> fila = new LinkedList<>();

//        A diferença entre Offer e Add, é que quando você tem filas com uma restição de
//        tamanho e essa fila está cheia, o Offer retornará verdadeiro se adicionar e falso
//        se não adicionar. Ja o Add retornará uma excessão
        fila.add("Ana");
        fila.offer("Bia");
        fila.offer("Carlos");
        fila.offer("Daniel");
        fila.offer("Rafaela");
        fila.offer("Gui");

//      Peek e Element retornam o próximo elemento da fila, porém não o removem.
//      A diferença entre eles é que se a fila estiver vazia, peek retornará null e
//      element retornará uma excessão
        System.out.println(fila.peek());
        System.out.println(fila.peek());
        System.out.println(fila.element());
        System.out.println(fila.element());

//      fila.size();
//      fila.clear();
//      fila.isEmpty();

//      Poll retorna o próximo elemento e remove ele da fila. Se usa-lo em uma fila vazia,
//      ele retornará Null. O remove faz a mesma coisa, com a diferença de que ele retornará
//      uma excessão caso a fila esteja vazia
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.poll());
        System.out.println(fila.remove());
        System.out.println(fila.remove());

    }
}
