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

        /*O distinct ir� remover valores repetidos.
        * IMPORTANTE: Essa stream est� preenchida por objetos, ou seja, a distin��o e remova��o de valores
        * repetido s� ir� funcionar se o equals e o hashcode estiverem aplicados. Do contr�rio, ele ir�
        * verificar se os endere�os de mem�rias s�o iguais, e n�o se os valores dos objetos s�o iguais.*/
        System.out.println("disctinc...");
        alunos.stream().distinct().forEach(System.out::println);

        /*No skip, posso pular elementos. No caso abaixo, estou pulando dois elementos*/
        /*No limit, posso definir at� qual elemento ele vai pegar. No caso abaixo, s� vou pegar 2 elementos*/
        System.out.println("\nSkip/Limit");
        alunos.stream()
                .distinct()
                .skip(2)
                .limit(2)
                .forEach(System.out::println);

        /*takeWhile = pegue elementos enquanto acontecer determinada condi��o.
        * Por exemplo: me d� os produtos enquantos eles estiverem ativos.
        * No caso abaixo, ele vai pegar os alunos aprovados, at� que ele encontre um que n�o foi aprovado.
        * Quando ele encontrar o que n�o foi aprovado, ele para.*/
        System.out.println("\ntakeWhile");
        alunos.stream()
                .distinct()
                .takeWhile(a -> a.nota >= 7)
                .forEach(System.out::println);
    }
}
