package gustavo.operadores;

public class Operacao {
    public static void main(String[] args){
        //(+) Operador unário de valor positivo – números são positivos sem esse operador explicitamente
        //(-) Operador unário de valor negativo – nega um número ou expressão aritmética

        int numero = 5;

        numero = - numero;
        // System.out.print(- numero);
        System.out.print(numero);

        //numero = + numero; // Não tornará ele em um numero positivo, continuara negativo
        numero = numero * -1; // Agr ele irá ficar positivo
        System.out.println(numero);
    }
}
