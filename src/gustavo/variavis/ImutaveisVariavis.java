package gustavo.variavis;

public class ImutaveisVariavis {
    public static void main (String[] args) throws Exception {
        // Pode ser alterado o valor da variavel
        int numero = 5;
        numero = 10;

        System.out.print(numero);

        // Não pode ser alterado o valor da variavel
        // Com o valor final no começo, a variavel precisa ser em maiuscula
        final double VALOR_DE_PI = 3.14;
        // VALOR_DE_PI = 10.75; Não permite fzr isso
        System.out.print(VALOR_DE_PI);
    }
}

