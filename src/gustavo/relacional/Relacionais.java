package gustavo.relacional;

public class Relacionais {
    public static void main (java.lang.String[] args){
        //Para numeros, nós podemus utiliza os operadores normais ("==", "!="...)
        //Para objetos, nós usaremos o ".equals".

        String nomeUm = "Gustavo";
        //String nomeDois = "Gustavo"; //True
        String nomeDois = new String ("Gustavo");//False

        //System.out.println(nomeUm == nomeDois);
        System.out.println(nomeUm.equals(nomeDois));


        int numero1 = 1;
        int numero2 = 2;

        boolean sn = numero1 == numero2;
        //if(numero1 > numero2){
        if(numero1 == numero2){ //True
            System.out.println(" a nossa condição é verdadeira");
        }
        sn = numero1 == numero2;
        System.out.println("numeroUm é igual a numeroDois? " + sn);

        sn = numero1 != numero2;
        System.out.println("numeroUm é diferente de numeroDois? " + sn);

        sn = numero1 > numero2;
        System.out.println("numeroUm é maior que numeroDois? " + sn);
    }
}
