package gustavo.operadores.logicos;

public class logico {
    public static void main(String[] args) {

        //&& Operador Lógico "E"
        //|| Operador Lógico "OU"

        boolean condicao1 = true;
        boolean condicao2 = false;

        //if (condicao1 && condicao2) {
        if (condicao1 && (7 > 4)){
            System.out.println("As duas condições são verdadeiras");
        }
        if (condicao1 || condicao2) {
            System.out.println("Uma das condições é verdadeiras");
        }

        System.out.println("Fim");
    }
}
