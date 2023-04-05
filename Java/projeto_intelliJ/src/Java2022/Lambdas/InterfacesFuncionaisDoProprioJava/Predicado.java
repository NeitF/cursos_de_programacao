package Java2022.Lambdas.InterfacesFuncionaisDoProprioJava;

import java.util.function.Predicate;

public class Predicado {

    public static void main(String[] args) {

        //O 'prod' é o parâmetro "do método"
        //Se o preço for maior ou igual a 750, ele irá retornar true
        Predicate<Produto> isCaro = prod -> (prod.preco * (1 - prod.desconto)) >= 750;

        Produto produto = new Produto("Notebook", 3893.89, 0.15);
        System.out.println(isCaro.test(produto));
    }
}