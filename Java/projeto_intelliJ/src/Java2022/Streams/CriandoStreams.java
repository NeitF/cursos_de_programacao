package Java2022.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        /*
        * PARA QUE SERVEM STREAMS?
        * Entre as diversas funcionalidades adicionadas à linguagem Java em sua versão 8 está a Streams API,
        * recurso que oferece ao desenvolvedor a possibilidade de trabalhar com conjuntos de elementos de
        * forma mais simples e com um número menor de linhas de código. Isso se tornou possível graças à
        * incorporação do paradigma funcional, combinado com as expressões lambda, o que facilita a manutenção
        * do código e aumenta a eficiência no processamento devido ao uso de paralelismo.
        * A proposta em torno da Streams API é reduzir a preocupação do desenvolvedor com a forma de implementar
        * controle de fluxo ao lidar com coleções, deixando isso a cargo da API. A ideia é iterar sobre essas
        * coleções de objetos e, a cada elemento, realizar alguma ação, seja ela de filtragem, mapeamento,
        * transformação, etc. Caberá ao desenvolvedor apenas definir qual ação será realizada sobre o objeto.
        * */

        /*
        * Trabalhando com método reference. Vamos supor que eu quero pegar o
        * System.out::print e atribuir ele à uma variável, que tipo de interface funcional
        * eu conseguiria atribuir uma função que recebe um parâmetro e não retorna nada? É o Consumer
        * A variável abaixo, chamada 'print', vai apontar para a referência de System.out::print.
        * Agora, ao invés de eu precisar toda hora escrever System.out.print, eu posso simplesmente
        * referenciar print.
        * */
        Consumer<String> print = System.out::print;
        Consumer<Integer> println = System.out::println;

        //Criando um Stream
        Stream<String> langs = Stream.of("Java ", "Lua ", "JS\n");
        langs.forEach(print);

        //Criando um Stream a partir de um Array
        String[] maisLangs = { "Python ", "Lisp ", "Perl ", "Go\n" };
        Stream.of(maisLangs).forEach(print);

        //Outra forma de criar a partir de um Array
        Arrays.stream(maisLangs).forEach(print);

        /*Outra forma usando o Arrays.stream; Aqui existe a possibilidade de além de passar o Array,
        * você pode passar o subconjunto de arrays. Por exemplo, quero pegar o elemento de índice 1, indo
        * até o elemento de índice 3. DETALHE IMPORTANTE: O elemento de índice 3 não será incluso, ou seja, ele
        * vai me retornar apenas os elementos que estão presentes no índice 1 e no índice 2
        * */
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        //Uma outra forma de criar Streams é a partir das Collections
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        //Irá imprimir as linguagens na ordem em que foram definidas
        outrasLangs.stream().forEach(print);
        //Irá imprimir as linguagens sem ser necessáriamente na ordem em que foram definidas
        outrasLangs.parallelStream().forEach(print);

        /*Outra possibilidade para criar uma stream, é utilizar o método Generate, que vai gerar
        * uma stream infinita que não tem uma ordem. Dentro do generate você passa uma lambda
        * Supplier (não recebe parâmetro e retorna alguma coisa)*/
//        Stream.generate(() -> "a").forEach(print); Esse código vai imprimir a letra 'a' infinitamente

        /*Outra forma de gerar uma stream infinita é usando o Iterate. Só que nesse caso vc tem uma ordenação
        * Ele vai começar no valor 0, e vai adicionar +1 a cada nova iteração, infinitamente.
        * */
        //OBS: se eu tivesse usado o Consumer 'print', não teria dado certo pois eu defini que ele só recebe tipos
        //String. Portanto criei um Consumer chamado 'println', que aceita valores int.
        Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
