package Java2022.Lambdas.InterfacesFuncionaisDoProprioJava;

import java.util.function.Predicate;

public class PredicadoComposicao {

    public static void main(String[] args) {

        Predicate<Integer> isPar = num -> num % 2 == 0;
        Predicate<Integer> isTresDigitos = num -> num >= 100 && num <= 999;

        /*
        Vai realizar as operações 'isPar' e 'isTresDigitos', passando '123' como parâmetro.
        Se ambas as funções detrem 'true', o resultado era true. Porém, nesse caso, o negate está negando
        o resultado, ou seja, se for 'true' vai virar 'false', e se for 'false' vai virar 'true'
        */
        System.out.println(isPar.and(isTresDigitos).negate().test(123));

        /*
        Aqui utilizamos o 'or' ao invés do 'and'. Se uma das duas operações de 'true', então o resultado
        será 'true';
        */
        System.out.println(isPar.or(isTresDigitos).test(123));
    }
}
