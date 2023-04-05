package Java2022.Lambdas.InterfaceFuncional;

public class CalculoTeste2 {

    //FAZENDO USO DE FUNÇÕES LAMBDA
    public static void main(String[] args) {

        //Farei a mesma coisa que fiz em CalculoTeste1.java, mas ao invés de usar classe, eu vou usar
        //apenas a interface junto com funções lambda

        //A gente pode criar funções anônimas, funções que não tem nome, e associar o resultado
        //dessa função a uma variável

        /**
            Eu vou definir uma função que vai se adequar ao padrão da interface cálculo.
            O Java vai olhar para essa interface para entender qual é o seu padrão. Na interface, sabemos
            que o método esperado é um método que vai receber dois parâmetros do tipo double, e vai retornar
            um valor do tipo double.
        **/

        //Vou definir dois parâmetros, nesse caso x e y (não precisam ser do mesmo nome definido no método da
        //interface, só precisam receber valores do mesmo tipo).
        Calculo calc = (x, y) ->{
            return x + y;
        };
        /**
            A variável 'calc' é do tipo 'Calculo', que é um interface. Como a interface tem apenas um único
            método, o Java sabe que se você atribuir uma lambda, essa lambda vai ter que bater com a quantidade
            de parâmetros e o tipo de retorno.
        **/
        System.out.println(calc.executar(2, 3));

        //Posso pegar a mesma variável, e fazer ela receber uma nova lambda expression
        //Quando você não coloca as chaves '{}', automaticamente aquilo que você colocou será retornado
        calc = (x, y) -> x * y;
        System.out.println(calc.executar(2, 3));

        /**
         * OTIMIAZAÇÃO
         * Com uma única linha de código, eu evitei a necessidade de criar uma classe, implementar a interface...
         * **/
    }
}
