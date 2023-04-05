package Java2022.Streams.Min_e_Max;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class MinMax {

    public static void main(String[] args) {
        Aluno a1 = new Aluno("Ana", 7.1);
        Aluno a2 = new Aluno("Luna", 6.1);
        Aluno a3 = new Aluno("Gui", 8.1);
        Aluno a4 = new Aluno("Gabi", 10);

        List<Aluno> alunos = Arrays.asList(a1, a2, a3, a4);

        //Essa interface irá comparar duas coisas, nesse caso, dois alunos
        /*No exemplo abaixo, quando vc retorna 1, significa que o primeiro objeto passado por parâmetro
        é maior do que o segundo, se você retornar -1, quer dizer que o segundo parâmetro é maior do que o
        primeiro, e se você retornar 0, os dois critérios são iguais*/
        Comparator<Aluno> melhorNota = (aluno1, aluno2) -> {
          if(aluno1.nota > aluno2.nota) return 1;
          if(aluno1.nota < aluno2.nota) return -1;
          return 0;
        };

        //Retorna o aluno com a maior nota da turma
        System.out.println(alunos.stream().max(melhorNota).get());

        //Retorna o aluno com a menor nota
        System.out.println(alunos.stream().min(melhorNota).get());
    }
}
