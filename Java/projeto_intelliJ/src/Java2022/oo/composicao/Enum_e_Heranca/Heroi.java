package Java2022.oo.composicao.Enum_e_Heranca;

public class Heroi extends Jogador{

    @Override
    boolean atacar(Jogador oponente){
        boolean ataque1 = super.atacar(oponente);
        boolean ataque2 = super.atacar(oponente);
        return ataque1 || ataque2;
    }
}
