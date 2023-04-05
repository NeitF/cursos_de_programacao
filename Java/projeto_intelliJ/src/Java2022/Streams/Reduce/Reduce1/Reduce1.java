package Java2022.Streams.Reduce.Reduce1;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce1 {

    public static void main(String[] args) {

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //O objetivo � somar todos os elementos, usando Reduce
        //No Reduce, podemos usar uma fun��o que seja um Operador Bin�rio ou um BiFunction
        BinaryOperator<Integer> soma = (ac, n) -> ac + n;

        /*IMPORTANTE: Diferente do Map e do Filter, o Reduce � uma fun��o terminadora. Ou seja, n�o �
        * poss�vel encadear nenhuma fun��o depois dele, assim como � com o forEach*/

        /*Existe mais de um tipo de assinatura para a fun��o reduce. Da forma como ela est� sendo chamada abaixo,
        * o resultado gerado ser� um Optional<Integer>, pois n�o necessariamente voc� vai ter um resultado gerado,
        * e esse Optional pode estar vazio. Portanto, para capturar o resultado gerado � necess�rio utilizar a
        * fun��o get()*/
        Integer total1 = nums.stream().reduce(soma).get();
        System.out.println(total1);

        /*No caso abaixo, diferente do anterior, eu n�o precisarei utilizar o m�todo get(), e o resultado gerado
        * n�o ser� um Optional<Integer>, mas sim um Integer proprimente dito. Isso porque antes da fun��o soma eu
        * estou passando uma valor inicial para o acumulador. Supondo que o meu List estivesse vazio, o valor
        * retornado pela fun��o seria o valor inicial que eu informei.*/

        Integer parallelTotal2 = nums.parallelStream().reduce(100, soma);
        Integer total2 = nums.stream().reduce(100, soma);
        System.out.println(parallelTotal2);
        System.out.println(total2);

        /*parallelStream vs Stream
        * No caso acima, quando eu uso um stream paralelo, ele vai executar a chamada dos elementos de forma
        * paralela, e se eu passar um valor inicial, para todas as chamadas paralelas haver� um valor inicial
        * independente. No exemplo acima, eu tenho um array composto dos n�meros 1 ao 9, ent�o para cada uma
        * das chamadas (a cada n�mero que ele chamar) ele vai passar um valor inicial, e no final ele vai somar
        * tudo. Se eu passar o valor inicial como 0, a� n�o haver� diferen�a. Abaixo est� um exemplo:
        * 1 + 100 = 101
        * 2 + 100 = 102
        * 3 + 100 = 103
        * 4 + 100 = 104
        * 5 + 100 = 105
        * 6 + 100 = 106
        * 7 + 100 = 107
        * 8 + 100 = 108
        * 9 + 100 = 109
        * 101 + 102 + 103 + 104 + 105 + 106 + 107 + 108 + 109 = 945
        * */

        nums.stream()
                .filter(n -> n > 5)
                .reduce(soma)
                .ifPresent(System.out::println);

        //Fun��o ifPresent: Se o valor estiver presente, realize a fun��o espeficificada (nesse caso, o sout)
    }
}
