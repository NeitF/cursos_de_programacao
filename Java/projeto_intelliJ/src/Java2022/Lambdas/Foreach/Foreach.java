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
        //Se eu tiver um �nico par�metro (nesse caso 'nome'), eu n�o preciso colocar entre par�nteses.
        //Se houver apenas uma �nica senten�a de c�digo (nessa caso o sout), pode retirar o par de chaves.
        //aprovados.forEach((nome) -> {System.out.println(nome + "!!!");});

        System.out.println("\nMethod Reference");
        aprovados.forEach(System.out::println);
        /**
         * Nesse caso, eu quero passar cada um dos nomes da lista como par�metro para o System.out.println.
         * Para cada elemento percorrido na lista de aprovados, esse elemento foi passado como par�metro
         * para o println.
         * A desvantagem � que n�o � poss�vel personalizar a mensagem, concatenando outros elementos, pois o
         * Method Reference � mais automatizado. Ele � menos flex�vel.
         **/

        //M�TODO PERSONALIZADO DE USAR LAMBDA FOREACH
        System.out.println("\nLambda personalizada...");
        aprovados.forEach(nome -> meuImprimir(nome));

        System.out.println("\nMethod Reference personalizado");
        aprovados.forEach(Foreach::meuImprimir);
    }
        static void meuImprimir(String nome){
            System.out.println("Oi! Meu nome �: " + nome);
        }
}
