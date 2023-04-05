package Java2022.Streams.OutrosMetodos;

import java.util.Arrays;
import java.util.List;

public class Outros {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);
        Aluno a5 = new Aluno("Ana", 7.1);
        Aluno a6 = new Aluno("Pedro", 6.1);
        Aluno a7 = new Aluno("Gui", 8.1);
        Aluno a8 = new Aluno("Maria", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4, a5, a6, a7, a8);

        /*O distinct irá remover valores repetidos.
        * IMPORTANTE: Essa stream está preenchida por objetos, ou seja, a distinção e removação de valores
        * repetido só irá funcionar se o equals e o hashcode estiverem aplicados. Do contrário, ele irá
        * verificar se os endereços de memórias são iguais, e não se os valores dos objetos são iguais.*/
        System.out.println("disctinc...");
        alunos.stream().distinct().forEach(System.out::println);

        /*No skip, posso pular elementos. No caso abaixo, estou pulando dois elementos*/
        /*No limit, posso definir até qual elemento ele vai pegar. No caso abaixo, só vou pegar 2 elementos*/
        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        /*takeWhile = pegue elementos enquanto acontecer determinada condição.
        * Por exemplo: me dê os produtos enquantos eles estiverem ativos.
        * No caso abaixo, ele vai pegar os alunos aprovados, até que ele encontre um que não foi aprovado.
        * Quando ele encontrar o que não foi aprovado, ele para.*/
        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}
