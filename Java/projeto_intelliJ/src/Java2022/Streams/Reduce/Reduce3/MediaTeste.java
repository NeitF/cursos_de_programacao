package Java2022.Streams.Reduce.Reduce3;

public class MediaTeste {

    public static void main(String[] args) {

        /*O fato do método 'adicionar' retornar uma 'Media', permite que eu faça esse encadeamento,
        * como está abaixo, pois a variável 'm1' é do tipo 'Media', e o método 'adicionar' retorna
        * uma 'Media'*/
        Media m1 = new Media().adicionar(8.3).adicionar(6.7);
        Media m2 = new Media().adicionar(7.9).adicionar(6.6);

        System.out.println(m1.getValor());
        System.out.println(m2.getValor());

        System.out.println(Media.combinar(m1, m2).getValor());
    }
}
