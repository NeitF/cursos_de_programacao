package Java2022.oo.composicao.Enum_e_Heranca.DesafioHeranca;

public class Ferrari extends Carro{

    public Ferrari(int velocidadeMaxima){
        super(velocidadeMaxima);
        delta = 15;
    }

    public String teste(){
        return "aa";
    }

//    @Override
//    void acelerar(){
//        if(velocidadeAtual + 15 > VELOCIDADE_MAXIMA)
//            velocidadeAtual = VELOCIDADE_MAXIMA;
//        else
//            velocidadeAtual += 15;
//    }
}
