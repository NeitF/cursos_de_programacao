package Java2022.Excecao;

public class ChecadaVsNaoChecada {

    public static void main(String[] args) {

        /*Aqui eu decidi não tratar a exceção, mas pelo fato de ela ser uma exceção não checada,
        * não houve qualquer problama*/
        geraErro1();

        //Aqui eu decidi tratar a exceção
        try{
            geraErro1();
        }catch(RuntimeException e){
            System.out.println(e.getMessage());
        }


        //Pelo fato de ser uma exceção checada, eu preciso obrigatoriamente tratar a exceção aqui
        /*No comentário abaixo, eu tentei chamar o método sem tratar a exceção. Porém isso não é possível,
        * pois ela é uma excecão checada, logo, eu preciso obrigatoriamente tratá-la*/
        //geraErro2();

        try{
            geraErro2();
        }catch (Throwable e){
            System.out.println(e.getMessage());
        }

        System.out.println("Fim :)");
    }

    /*Não basta apenas criar/instanciar um erro/exceção. A exceção é uma classe, e como classe você cria novas
    * instâncias. Como classe vc tem hierarquia de herança, como por exemplo RuntimeException que herda de
    * Exception que herda de Throwable... mas não basta criar apenas uma instância, um erro precisa ser
    * lançado. E pra lançar um erro, você tem uma palavra especial chamada 'throw'.*/

    /*A linguagem determina que eu só posso lançar (throw) algo que herda de Throwable*/

    /*Uma vez que eu lanço uma excecão do tipo RuntimeException, eu tenho a opção de tratar ou NÃO
    * o erro */

    // NÃO checada ou NÃO verificada
    static void geraErro1(){
        //TODA CLASSE QUE TERMINA COM EXCEPTION É FILHA DE EXCEPTION
        throw new RuntimeException("Ocorreu um erro bem legal #01!");
    }

    /*No caso abaixo o problema é mais sério, será um problema de compilação. Isso porque a excecão abaixo
    * é uma excecão checada. Em exceções checadas, vc é obrigado a colocar na assinatura do método que vc lança
    * esse tipo de exceção. Para isso, utilizamos a palavra 'throws'*/

    //Exceção checada ou verificada
    static void geraErro2() throws Exception{
        throw new Exception("Ocorreu um erro bem legal #02!");
    }
}
