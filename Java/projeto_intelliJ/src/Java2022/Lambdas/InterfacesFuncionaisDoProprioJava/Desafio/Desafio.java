package Java2022.Lambdas.InterfacesFuncionaisDoProprioJava.Desafio;


import Java2022.Lambdas.InterfacesFuncionaisDoProprioJava.Produto;

import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {

    public static void main(String[] args) {

        Produto p = new Produto("iPad",3235.89,0.13);

        Function<Produto, Double> precoReal = prod ->
                prod.getPreco() - (prod.getPreco() * prod.getDesconto());

        UnaryOperator<Double> precoImposto = preco ->
                preco >= 2500 ? preco * 0.085 : 0.0;

        UnaryOperator<Double> precoFrete = preco ->
                preco >= 3000 ? 100.0 : 50.0;

        Function<Produto, Double> precoFinal = prod -> {
                double imposto = precoReal.andThen(precoImposto).apply(prod);
                double frete = precoReal.andThen(precoFrete).apply(prod);
                double pFinal = precoReal.apply(prod) + imposto + frete;
                //Função para ter apenas duas casas decimais
                pFinal = Math.round(pFinal*100.0)/100.0;
                return pFinal;
        };

        Function<Double, String> formatado = preco ->
                "R$" + preco.toString().replace(".", ",");

        System.out.println("Preço inicial: " + p.getPreco() + "\nPreço real: " + precoReal.apply(p) +
                "\nImposto: " + precoImposto.compose(precoReal).apply(p) + "\nFrete: " +
                precoFrete.compose(precoReal).apply(p) + "\nPreço final: " +
                formatado.compose(precoFinal).apply(p));
    }
}
