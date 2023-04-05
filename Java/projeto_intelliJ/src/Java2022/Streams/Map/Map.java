package Java2022.Streams.Map;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {

    public static void main(String[] args) {

        Consumer<String> print = System.out::print;

        List<String> marcas = Arrays.asList("BMW ", "Audi ", "Honda ");
        //Irá passar todas as letras para maiúsculo. OBS: o forEach é uma operação terminal
        marcas.stream().map(m -> m.toUpperCase()).forEach(print);

        //Usando composição com o map
        UnaryOperator<String> maiuscula = n -> n.toUpperCase();
        UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
        UnaryOperator<String> grito = n -> n + "!!!";

        System.out.println("\n\nUsando Composição...");
        // marcas.stream().map(maiuscula).map(primeiraLetra).map(grito).forEach(print); *PRIMEIRA MANEIRA DE SE FAZER

        //SEGUNDA MENIRA DE SE FAZER, UTILIZANDO OUTRA CLASSE
        marcas.stream()
                .map(Utilitarios.maiuscula)
                .map(Utilitarios.primeiraLetra)
                .map(Utilitarios::grito)
                .forEach(print);
    }
}
