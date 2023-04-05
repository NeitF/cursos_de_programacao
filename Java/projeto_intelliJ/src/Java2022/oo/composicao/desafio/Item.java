package Java2022.oo.composicao.desafio;

public class Item {

    private double qtde;
    private Produto produto;

    Item(double qtde, Produto produto){
        this.qtde = qtde;
        this.produto = produto;
    }

    public double getQtde() {
        return qtde;
    }

    public Produto getProduto() {
        return produto;
    }
}
