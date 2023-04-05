package Java2022.Lambdas.InterfacesFuncionaisDoProprioJava;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        /*
        Vai realizar as opera��es 'isPar' e 'isTresDigitos', passando '123' como par�metro.
        Se ambas as fun��es detrem 'true', o resultado era true. Por�m, nesse caso, o negate est� negando
        o resultado, ou seja, se for 'true' vai virar 'false', e se for 'false' vai virar 'true'
        */
        System.out.println(isPar.and(isTresDigitos).negate().test(123));

        /*
        Aqui utilizamos o 'or' ao inv�s do 'and'. Se uma das duas opera��es de 'true', ent�o o resultado
        ser� 'true';
        */
        System.out.println(isPar.or(isTresDigitos).test(123));
    }
}
