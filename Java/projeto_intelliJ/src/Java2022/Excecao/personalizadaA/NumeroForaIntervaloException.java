package Java2022.Excecao.personalizadaA;

public class NumeroForaIntervaloException extends RuntimeException{

    private String nomeDoAtributo;

    public NumeroForaIntervaloException(String nomeDoAtributo){
        this.nomeDoAtributo = nomeDoAtributo;
    }

    @Override
    public String getMessage() {
        return String.format("O atributo %s est� fora do intervalo", nomeDoAtributo);
    }
}
