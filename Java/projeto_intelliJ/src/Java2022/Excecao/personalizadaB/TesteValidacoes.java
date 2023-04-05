package Java2022.Excecao.personalizadaB;

import Java2022.Excecao.Aluno;

public class TesteValidacoes {

    public static void main(String[] args) {

        try{
            Aluno aluno = new Aluno("Ana", 7);
            Validar.aluno(aluno);
            Validar.aluno(null);
        }catch(StringVaziaException e){
            System.out.println(e.getMessage());
        }catch(NumeroForaIntervaloException | IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        //Acima o s�mbolo pipe ( | ) indica que se uma OU outra exce��o ocorrer, vai cair no catch


    }
}
