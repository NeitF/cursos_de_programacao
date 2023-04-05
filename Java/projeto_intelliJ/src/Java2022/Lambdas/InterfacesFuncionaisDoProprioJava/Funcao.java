package Java2022.Lambdas.InterfacesFuncionaisDoProprioJava;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        //O primeiro generics é o tipo de parâmetro que será recebido. O segundo generics é o tipo
        //de parâmetro que será retornado
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "Ímpar";

        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoE =
                valor -> "O resultado é: " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!";

        //Ele vai chamar o 'parOuImpar' passando '32' como parâmetro, depois de resolver vai
        // chamar 'oResultadoE' passando o retorno de 'parOuImpar' como parâmetro, depos vai chamar
        // 'empolgado' passando o retorno de 'oResultadoE' como parâmetro
       String resultadoFinal =
               parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

        System.out.println(resultadoFinal);

       //Esse código é equivalente ao código acima
       //String resultadoFinal2 = oResultadoE.apply(parOuImpar.apply(32));
       // System.out.println(resultadoFinal2);

    }
}
