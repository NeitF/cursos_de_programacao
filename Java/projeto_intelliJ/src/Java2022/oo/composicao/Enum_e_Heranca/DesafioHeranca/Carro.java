package Java2022.oo.composicao.Enum_e_Heranca.DesafioHeranca;

public class Carro {

    public int velocidadeAtual = 0;
    final int VELOCIDADE_MAXIMA;
    int delta = 5;

    Carro(int velocidadeMaxima){
        VELOCIDADE_MAXIMA = velocidadeMaxima;
    }

    public void acelerar(){
        if(velocidadeAtual + delta > VELOCIDADE_MAXIMA)
            velocidadeAtual = VELOCIDADE_MAXIMA;
        else
           velocidadeAtual += delta;
    }

     public void frear(){
        if((velocidadeAtual - 5) >= 0){
            velocidadeAtual -= 5;
        }
    }
}
