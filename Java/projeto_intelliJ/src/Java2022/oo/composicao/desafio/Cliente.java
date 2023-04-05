package Java2022.oo.composicao.desafio;

import java.util.ArrayList;

public class Cliente {

    String nome;
    ArrayList<Compra> compras = new ArrayList<>();

    public Cliente(String nome){
        this.nome = nome;
    }

    //Obtem o valor total de todas as compras que o cliente fez
    public double obterTotalCliente(){
        double total = 0;
        for(Compra compra: compras){
            total += compra.obterTotalCompra();
        }
        return total;
    }

}
