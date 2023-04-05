package Java2022.oo.composicao.Enum_e_Heranca.teste;

import Java2022.oo.composicao.Enum_e_Heranca.DesafioHeranca.Carro;
import Java2022.oo.composicao.Enum_e_Heranca.DesafioHeranca.Civic;
import Java2022.oo.composicao.Enum_e_Heranca.DesafioHeranca.Ferrari;

public class Principal {

    public static void main(String[] args) {
        Carro c1 = new Civic();
        Carro c2 = new Ferrari(500);

        c1.acelerar();
        c1.acelerar();
        c1.acelerar();
        c1.acelerar();

        c2.acelerar();
        c2.acelerar();
        c2.acelerar();
        c2.acelerar();

        System.out.println(c1.velocidadeAtual);
        System.out.println(c2.velocidadeAtual);

        c1.frear();
        c1.frear();
        c1.frear();

        c2.frear();
        c2.frear();
        c2.frear();

        System.out.println(c1.velocidadeAtual);
        System.out.println(c2.velocidadeAtual);
    }
}
