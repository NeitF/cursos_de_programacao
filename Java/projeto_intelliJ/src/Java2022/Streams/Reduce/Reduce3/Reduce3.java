package Java2022.Streams.Reduce.Reduce3;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce3 {

    public static void main(String[] args) {

       Aluno a1 = new Aluno("Ana", 7.1);
       Aluno a2 = new Aluno("Luna", 6.1);
       Aluno a3 = new Aluno("Gui", 8.1);
       Aluno a4 = new Aluno("Gabi", 10);

       List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        //Filtra apenas os alunos com nota maior ou igual a 7
        Predicate<Aluno> aprovado = a -> a.nota >= 7;

        //Retorna apenas as notas dos alunos filtrados
        Function<Aluno, Double> apenasNota = a -> a.nota;

        /*
        alunos.stream()
                .filter(aprovado)
                .map(apenasNota);

        O que eu tenho nesse ponto da pipe line é uma Stream com valores do tipos Double (pois o map com a função
        'apenasNota' está retornando Double). O objetivo aqui é calcular a média dos alunos aprovados, então eu vou
        precisar aplicar um filtro que eu quero que meu acumulador seja a média e eu vou receber o Double como sendo
        o meu item atual. Para isso, usarei a interface BiFunction
         */

        /*O meu acumulador será a 'Media', o valor de cada um dos elementos será um Double, e o resultado retornado
        da operação também será uma 'Media'*/
        BiFunction<Media, Double, Media> calcularMedia =
                (media, nota) -> media.adicionar(nota);

        //Combinador
        BinaryOperator<Media> combinarMedia = (m1, m2) -> Media.combinar(m1, m2);

        /*Nos exercicios anteriores de Reduce, eu trabalhei com acumuladores do tipo Integer e Double.
        * Aqui, eu estou trabalhando com um acumulador do tipo Media*/
        Media mediaFinal =  alunos.stream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(new Media(), calcularMedia, combinarMedia);

        /*Acima, o Reduce vai precisar receber 3 parâmetros. O primeiro parâmetro é o Valor Inicial,
        * que no caso é um novo objeto do tipo Media (assim como no Reduce2 eu dei uma valor inicial de
        * 100, aqui eu dei uma valor inicial também. O segundo parâmetro é a minha função, no caso, 'calcularMedia'.
        * O terceiro parâmetro é o combinador. Mas para que ele serve? Supondo que eu calcule várias médias
        * em paralelo, como é que eu vou combinar essas médias depois? O combinador serve para isso*/

        System.out.println("A média dos aprovados é " + mediaFinal.getValor());
    }
}
