package Java2022.Streams.Reduce.Reduce2;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.function.Predicate;

public class Reduce2 {

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

        //Soma as notas de todos os alunos filtrados
        BinaryOperator<Double> somatorio = (a, b) -> a + b;

        alunos.parallelStream()
                .filter(aprovado)
                .map(apenasNota)
                .reduce(somatorio)
                .ifPresent(System.out::println);

        /*
        * 7.1 + 8.1 + 10 = 25.2
        * */
    }
}
