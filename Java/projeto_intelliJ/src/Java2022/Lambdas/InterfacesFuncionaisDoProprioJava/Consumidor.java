package Java2022.Lambdas.InterfacesFuncionaisDoProprioJava;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Consumidor {

    public static void main(String[] args) {
        Consumer<Produto> imprimirNome = p -> System.out.println(p.nome);

        Produto p1 = new Produto("Notebook", 3893.89, 0.15);
        Produto p2 = new Produto("Caneta", 1, 0.15);
        Produto p3 = new Produto("Caderno", 2, 0.15);
        Produto p4 = new Produto("Borracha", 2, 0.15);
        Produto p5 = new Produto("Lapis", 6, 0.15);
        imprimirNome.accept(p1);

        List<Produto> produtos = Arrays.asList(p1, p2, p3, p4, p5);

        //Como o forEach recebe um 'consumer', essa expressão é válida. Tbm não é preciso colocar
        //'imprimir.accept', pois o forEach ja entende que precisará utilizá-la
        produtos.forEach(imprimirNome);
        produtos.forEach(prod -> System.out.println(prod.preco));
        produtos.forEach(System.out::println);
    }
}
