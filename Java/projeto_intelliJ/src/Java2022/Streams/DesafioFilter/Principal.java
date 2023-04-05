package Java2022.Streams.DesafioFilter;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Principal {

    public static void main(String[] args) {

        List<Carro> carros = Arrays.asList(
                new Carro("KA", "Ford", "Prata"),
                new Carro("Uno", "Fiat", "Vermelho"),
                new Carro("Italia", "Ferrari", "Vermelho"),
                new Carro("Ranger", "Ford", "Prata"),
                new Carro("Maverick", "Ford", "Vermelho"),
                new Carro("Territory", "Ford", "Prata"),
                new Carro("Camaro", "Chevrolet", "Amarelo"),
                new Carro("Argo", "Fiat", "Vermelho")
        );
        Predicate<Carro> marca = c -> c.marca.equals("Ford");
        Predicate<Carro> cor = c -> c.cor.equals("Prata");

        carros.stream().filter(marca).filter(cor).forEach(System.out::println);
    }
}