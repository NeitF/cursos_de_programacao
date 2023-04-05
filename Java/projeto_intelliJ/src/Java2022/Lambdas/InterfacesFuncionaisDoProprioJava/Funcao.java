package Java2022.Lambdas.InterfacesFuncionaisDoProprioJava;

import java.util.function.Function;

public class Funcao {

    public static void main(String[] args) {

        //O primeiro generics � o tipo de par�metro que ser� recebido. O segundo generics � o tipo
        //de par�metro que ser� retornado
        Function<Integer, String> parOuImpar =
                numero -> numero % 2 == 0 ? "Par" : "�mpar";

        System.out.println(parOuImpar.apply(32));

        Function<String, String> oResultadoE =
                valor -> "O resultado �: " + valor;

        Function<String, String> empolgado =
                valor -> valor + "!!!";

        //Ele vai chamar o 'parOuImpar' passando '32' como par�metro, depois de resolver vai
        // chamar 'oResultadoE' passando o retorno de 'parOuImpar' como par�metro, depos vai chamar
        // 'empolgado' passando o retorno de 'oResultadoE' como par�metro
       String resultadoFinal =
               parOuImpar.andThen(oResultadoE).andThen(empolgado).apply(32);

        System.out.println(resultadoFinal);

       //Esse c�digo � equivalente ao c�digo acima
       //String resultadoFinal2 = oResultadoE.apply(parOuImpar.apply(32));
       // System.out.println(resultadoFinal2);

    }
}
