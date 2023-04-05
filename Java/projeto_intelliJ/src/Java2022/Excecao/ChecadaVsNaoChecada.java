package Java2022.Excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        /*Aqui eu decidi n�o tratar a exce��o, mas pelo fato de ela ser uma exce��o n�o checada,
        * n�o houve qualquer problama*/
        geraErro1();

        //Aqui eu decidi tratar a exce��o
        try{
            geraErro1();
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }


        //Pelo fato de ser uma exce��o checada, eu preciso obrigatoriamente tratar a exce��o aqui
        /*No coment�rio abaixo, eu tentei chamar o m�todo sem tratar a exce��o. Por�m isso n�o � poss�vel,
        * pois ela � uma excec�o checada, logo, eu preciso obrigatoriamente trat�-la*/
        //geraErro2();

        try{
            geraErro2();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    /*N�o basta apenas criar/instanciar um erro/exce��o. A exce��o � uma classe, e como classe voc� cria novas
    * inst�ncias. Como classe vc tem hierarquia de heran�a, como por exemplo RuntimeException que herda de
    * Exception que herda de Throwable... mas n�o basta criar apenas uma inst�ncia, um erro precisa ser
    * lan�ado. E pra lan�ar um erro, voc� tem uma palavra especial chamada 'throw'.*/

    /*A linguagem determina que eu s� posso lan�ar (throw) algo que herda de Throwable*/

    /*Uma vez que eu lan�o uma excec�o do tipo RuntimeException, eu tenho a op��o de tratar ou N�O
    * o erro */

    // N�O checada ou N�O verificada
    static void geraErro1(){
        //TODA CLASSE QUE TERMINA COM EXCEPTION � FILHA DE EXCEPTION
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    /*No caso abaixo o problema � mais s�rio, ser� um problema de compila��o. Isso porque a excec�o abaixo
    * � uma excec�o checada. Em exce��es checadas, vc � obrigado a colocar na assinatura do m�todo que vc lan�a
    * esse tipo de exce��o. Para isso, utilizamos a palavra 'throws'*/

    //Exce��o checada ou verificada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro bem legal #02!");
    }
}
