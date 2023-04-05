package Java2022.oo.composicao.desafio;

public class ClienteTeste {

    public static void main(String[] args) {

        //Criar 1 cliente, criar 2 compras, cada compra com dois itens, cada item associado a
        // produtos diferentes

        Item i1 = new Item(2, new Produto(2.30, "Caneta"));
        Item i2 = new Item(1, new Produto(25.70, "Mochila"));
        Item i3 = new Item(5, new Produto(6, "Refrigerante"));
        Item i4 = new Item(3, new Produto(3, "Lanche"));

        Compra c1 = new Compra();
        Compra c2 = new Compra();

        c1.itens.add(i1);
        c1.itens.add(i2);

        c2.itens.add(i3);
        c2.itens.add(i4);

        Cliente cli1 = new Cliente("Jonas");
        Cliente cli2 = new Cliente("Larissa");

        cli1.compras.add(c1);
        cli2.compras.add(c2);

        System.out.println("Valor total que o cliente 1 gastou: " + cli1.obterTotalCliente());
        System.out.println("Valor total que o cliente 2 gastou: " + cli2.obterTotalCliente());
    }
}
