package Java2022.oo.composicao.desafio;

public class Produto {

    private double preco;
    private String nome;

    Produto(double preco, String nome){
        this.preco = preco;
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public String getNome() {
        return nome;
    }


}
