package Java2022.Excecao.personalizadaA;

public class StringVaziaException extends RuntimeException{

    private String nomeDoAtributo;

    public StringVaziaException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s está vazio", nomeDoAtributo);
    }
}
