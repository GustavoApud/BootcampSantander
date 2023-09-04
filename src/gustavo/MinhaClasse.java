package gustavo;

public class MinhaClasse {
    public static void main (String [] args) {
        String primeiroNome = "Gustavo";
        String segundoNome = "Apud";
        String terceiroNome = "Yamashita";


        String nomeCompleto = nomeCompleto (primeiroNome,segundoNome,terceiroNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome, String terceiroNome){
        return " O nome é:" + (" ") + primeiroNome + (" ").concat(segundoNome).concat(" ").concat(terceiroNome);
    }
}
