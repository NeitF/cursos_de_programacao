package Java2022.oo.composicao.desafio;

import java.util.ArrayList;

public class Compra {

    ArrayList<Item> itens = new ArrayList<>();

    //Obtem o valor total de uma única compra
    public double obterTotalCompra(){
        double total = 0;
        for(Item item: itens){
           total += item.getProduto().getPreco() * item.getQtde();
        }
        return total;
    }
}