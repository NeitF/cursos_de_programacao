package Java2022.Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStreams {

    public static void main(String[] args) {

        /*
        * PARA QUE SERVEM STREAMS?
        * Entre as diversas funcionalidades adicionadas � linguagem Java em sua vers�o 8 est� a Streams API,
        * recurso que oferece ao desenvolvedor a possibilidade de trabalhar com conjuntos de elementos de
        * forma mais simples e com um n�mero menor de linhas de c�digo. Isso se tornou poss�vel gra�as �
        * incorpora��o do paradigma funcional, combinado com as express�es lambda, o que facilita a manuten��o
        * do c�digo e aumenta a efici�ncia no processamento devido ao uso de paralelismo.
        * A proposta em torno da Streams API � reduzir a preocupa��o do desenvolvedor com a forma de implementar
        * controle de fluxo ao lidar com cole��es, deixando isso a cargo da API. A ideia � iterar sobre essas
        * cole��es de objetos e, a cada elemento, realizar alguma a��o, seja ela de filtragem, mapeamento,
        * transforma��o, etc. Caber� ao desenvolvedor apenas definir qual a��o ser� realizada sobre o objeto.
        * */

        /*
        * Trabalhando com m�todo reference. Vamos supor que eu quero pegar o
        * System.out::print e atribuir ele � uma vari�vel, que tipo de interface funcional
        * eu conseguiria atribuir uma fun��o que recebe um par�metro e n�o retorna nada? � o Consumer
        * A vari�vel abaixo, chamada 'print', vai apontar para a refer�ncia de System.out::print.
        * Agora, ao inv�s de eu precisar toda hora escrever System.out.print, eu posso simplesmente
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

        /*Outra forma usando o Arrays.stream; Aqui existe a possibilidade de al�m de passar o Array,
        * voc� pode passar o subconjunto de arrays. Por exemplo, quero pegar o elemento de �ndice 1, indo
        * at� o elemento de �ndice 3. DETALHE IMPORTANTE: O elemento de �ndice 3 n�o ser� incluso, ou seja, ele
        * vai me retornar apenas os elementos que est�o presentes no �ndice 1 e no �ndice 2
        * */
        Arrays.stream(maisLangs, 1, 3).forEach(print);

        //Uma outra forma de criar Streams � a partir das Collections
        List<String> outrasLangs = Arrays.asList("C ", "PHP ", "Kotlin\n");
        //Ir� imprimir as linguagens na ordem em que foram definidas
        outrasLangs.stream().forEach(print);
        //Ir� imprimir as linguagens sem ser necess�riamente na ordem em que foram definidas
        outrasLangs.parallelStream().forEach(print);

        /*Outra possibilidade para criar uma stream, � utilizar o m�todo Generate, que vai gerar
        * uma stream infinita que n�o tem uma ordem. Dentro do generate voc� passa uma lambda
        * Supplier (n�o recebe par�metro e retorna alguma coisa)*/
//        Stream.generate(() -> "a").forEach(print); Esse c�digo vai imprimir a letra 'a' infinitamente

        /*Outra forma de gerar uma stream infinita � usando o Iterate. S� que nesse caso vc tem uma ordena��o
        * Ele vai come�ar no valor 0, e vai adicionar +1 a cada nova itera��o, infinitamente.
        * */
        //OBS: se eu tivesse usado o Consumer 'print', n�o teria dado certo pois eu defini que ele s� recebe tipos
        //String. Portanto criei um Consumer chamado 'println', que aceita valores int.
        Stream.iterate(0, n -> n + 1).forEach(println);
    }
}
