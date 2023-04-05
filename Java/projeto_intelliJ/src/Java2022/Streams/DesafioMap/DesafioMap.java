package Java2022.Streams.DesafioMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {

    public static void main(String[] args) {

        /*
        * 1. Número para string binária... 6 => "110"
        * 2. Inverter a string... "110" => "011"
        * 3. Converter de volta para inteiro => "011" => 3
        * */

        List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);

        //Converte o número para uma String Binária
        Function<Integer, String> stringBinaria = Integer::toBinaryString;

        //Inverte a String
        UnaryOperator<String> InverterString = s -> new StringBuilder(s).reverse().toString();
        //SEGUNDA FORMA DE FAZER A MESMA COISA ACIMA
//        UnaryOperator<String> InverterString = s -> {
//            StringBuilder sb = new StringBuilder(s);
//            sb.reverse();
//            return sb.toString();
//        };

        //Converte a String Binária para Int
        Function<String, Integer> converterInteiro = s -> Integer.parseInt(s, 2);

        //1. Mostra apenas o valor convertido para String Binária
        //nums.stream().map(stringBinaria).forEach(System.out::println);

        //2. Mostra o valor convertido para String Binária e revertido
        //nums.stream().map(stringBinaria).map(InverterString).forEach(System.out::println);

        //3. Realiza todas as operações acima e converte devolta para Int
        nums.stream().map(Integer::toBinaryString).map(InverterString).map(converterInteiro).forEach(System.out::println);

    }
}
