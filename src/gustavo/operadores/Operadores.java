package gustavo.operadores;

public class Operadores {
    public static void main(String[] args) {
       // String nomeCompleto = "Gustavo" + "Apud";
        //System.out.print(nomeCompleto);

        String concatenacao = "?";
           System.out.print(concatenacao);

        concatenacao = 1 + 1 + 1 + "1";  // 31
           System.out.print(concatenacao);


           // Após a leitura da "String", tudo se torna String

        concatenacao = 1 + "1" + 1 + 1; // 1111
           System.out.print(concatenacao);

        concatenacao = 1 + "1" + 1 + "1"; // 1111
           System.out.print(concatenacao);

        concatenacao = "1" + 1 + 1 + 1; // 1111
           System.out.print(concatenacao);

        concatenacao = "1"+(1+1+1); // 13
           System.out.print(concatenacao);
    }
}
