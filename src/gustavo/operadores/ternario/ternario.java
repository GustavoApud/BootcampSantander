package gustavo.operadores.ternario;

public class ternario {
    public static void main(String[] args) {
        //O operador ternário é representado pelos símbolos "?" e ":" utilizados na seguinte estrutura de sintaxe:
        //<Expressão Condicional>`` ?``<Caso condição seja true>``: ``<Caso condição seja false>
        //Sempre com operações que dão "True" ou "False" (boolean)
        int a, b;

        a = 5;
        b = 6;
        //String resultado = "";
        //String resultado = a == b ? "verdadeiro" : "false";
        int resultado = a == b ? 1 : 0;

        // EXEMPLO DE CONDICIONAL UTILIZANDO UMA ESTRUTURA IF / ELSE
        //if (a == b)
        //    resultado = "verdadeiro";
        //else
        //    resultado = "falso";

        System.out.println(resultado);
    }
}
