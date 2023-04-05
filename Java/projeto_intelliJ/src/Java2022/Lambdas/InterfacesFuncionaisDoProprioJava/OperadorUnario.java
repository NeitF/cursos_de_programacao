package Java2022.Lambdas.InterfacesFuncionaisDoProprioJava;

import java.util.function.UnaryOperator;

public class OperadorUnario {

    public static void main(String[] args) {

        UnaryOperator<Integer> maisDois = n -> n + 2;
        UnaryOperator<Integer> vezesDois = n -> n * 2;
        UnaryOperator<Integer> aoQuadrado = n -> n * n;

        int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
        System.out.println(resultado1);

        /*
        O compose faz o que o 'andThen' faz, mas no sentido contrário. Ele aplicará o valor '0'
        no método 'maisDois', que retornára o seu valor para o 'vezesDois', que retornará seu valor para
        o 'aoQuadrado'.
        */
        int resultado2 = aoQuadrado.compose(vezesDois).compose(maisDois).apply(0);
        System.out.println(resultado2);
    }
}
