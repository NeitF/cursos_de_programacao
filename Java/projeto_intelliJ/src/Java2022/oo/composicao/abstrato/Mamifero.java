package Java2022.oo.composicao.abstrato;

public abstract class Mamifero extends Animal{

    public abstract String mamar();

    @Override
    public String mover() {
        return "Saindo do lugar";
    }
}
