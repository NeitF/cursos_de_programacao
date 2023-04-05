package Java2022.Streams;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class ImprimindoObjetos {

    public static void main(String[] args) {
        List<String> aprovados = Arrays.asList("Lu", "Gui", "Luca", "Ana");

        //Imprimindo da maneira convencional
        for(String nome: aprovados){
            System.out.println(nome);
        }

        //Imprimindo usando Iterator
        //Iterator � uma interface do java que tem um m�todo que pergunta se existe um pr�ximo elemento na lista
        //e retornar esse elemento caso ele existir
        System.out.println("\nUsando Iterator");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        /*
        * Stream tamb�m � um conjunto de objetos, uma sequ�ncia de dados, com a diferen�a de que as intera��es
        * ocorrem de forma interna. Algumas funcionalidades ocorrer�o de forma interna sem a necessidade de
        * explicidamente codar isso.
        * */
        //Imprimindo usando Stream
        System.out.println("\nUsando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); //La�o interno
    }
}
