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
        //Iterator é uma interface do java que tem um método que pergunta se existe um próximo elemento na lista
        //e retornar esse elemento caso ele existir
        System.out.println("\nUsando Iterator");
        Iterator<String> it = aprovados.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }

        /*
        * Stream também é um conjunto de objetos, uma sequência de dados, com a diferença de que as interações
        * ocorrem de forma interna. Algumas funcionalidades ocorrerão de forma interna sem a necessidade de
        * explicidamente codar isso.
        * */
        //Imprimindo usando Stream
        System.out.println("\nUsando Stream");
        Stream<String> stream = aprovados.stream();
        stream.forEach(System.out::println); //Laço interno
    }
}
