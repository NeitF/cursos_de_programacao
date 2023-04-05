package Java2022.Streams.FuncoesMatch;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;


public class Match {

    public static void main(String[] args) {

        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        Predicate<Aluno> aprovado = a -> a.nota >= 7;
        Predicate<Aluno> reprovado = aprovado.negate();

        /*Abaixo ele vai verificar se todos os alunos foram aprovados (se todos os elementos da stream
        * retornam TRUE quando passados na função 'aprovado'. Se todos retornarem true, o resultado será true.
        * Se pelo menos um retornar false, o resultado será false*/
        System.out.println(alunos.stream().allMatch(aprovado));

        /*Abaixo ele vai verificar se pelo menos um dos alunos foi aprovado (se pelo menos um dos elementos
        * da stream retornar TRUE quando passado na função 'aprovado'. Se pelo menos um elemento retornar true,
        * o resultado será true. Do contrário, será false.*/
        System.out.println(alunos.stream().anyMatch(aprovado));

        /*Abaixo, ele retornará true apenas se nenhum aluno tiver sido reprovado*/
        System.out.println(alunos.stream().noneMatch(reprovado));
    }
}
