package Java2022.Streams.DesafioFilter;

public class Carro {

    String nome;
    String marca;
    String cor;

    public Carro(String nome, String marca, String cor){
        this.nome = nome;
        this.marca = marca;
        this.cor = cor;
    }

    @Override
    public String toString() {
        return "Nome: " + this.nome + "-- Marca: " + this.marca + "-- cor: " + this.cor;
    }
}
