package Java2022.Excecao.personalizadaB;

import Java2022.Excecao.Aluno;

public class Validar {

    //Defini um construtor privado, pra ningu�m poder instanciar essa classe
    private Validar(){}

    public static void aluno(Aluno aluno) throws StringVaziaException, NumeroForaIntervaloException{
        if(aluno == null){
            throw new IllegalArgumentException("O aluno est� nulo!");
        }

        if(aluno.nome == null || aluno.nome.trim().isEmpty()){
            throw new StringVaziaException("nome");
        }

        if(aluno.nota < 0 || aluno.nota > 10){
            throw new NumeroForaIntervaloException("nota");
        }
    }
}
