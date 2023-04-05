package Java2022.Lambdas.Foreach;

import java.util.Arrays;
import java.util.List;

public class Foreach {

    public static void main(String[] args) {
        //Formas de se percorrer um Foreach

        List<String> aprovados = Arrays.asList("Ana", "Bia", "Lia", "Gui");

        System.out.println("Forma tradicional...");
        for(String nome: aprovados){
            System.out.println(nome);
        }

        System.out.println("\nLambda #01...");
        aprovados.forEach(nome -> System.out.println(nome + "!!!"));
        //Se eu tiver um único parâmetro (nesse caso 'nome'), eu não preciso colocar entre parênteses.
        //Se houver apenas uma única sentença de código (nessa caso o sout), pode retirar o par de chaves.
        //aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});

        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);
        /**
         * Nesse caso, eu quero passar cada um dos nomes da lista como parâmetro para o System.out.println.
         * Para cada elemento percorrido na lista de aprovados, esse elemento foi passado como parâmetro
         * para o println.
         * A desvantagem é que não é possível personalizar a mensagem, concatenando outros elementos, pois o
         * Method Reference é mais automatizado. Ele é menos flexível.
         **/

        //MÉTODO PERSONALIZADO DE USAR LAMBDA FOREACH
        System.out.println("\nLambda personalizada...");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference personalizado");
        aprovados.forEach(Foreach::meuImprimir);
    }
        static void meuImprimir(String nome){
            System.out.println("Oi! Meu nome é: " + nome);
        }
}
