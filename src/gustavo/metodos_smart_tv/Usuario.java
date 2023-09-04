package gustavo.metodos_smart_tv;

import gustavo.metodos_smart_tv.SmartTv;

public class Usuario {
    public static void main (String[] args){

        SmartTv smartTv = new SmartTv();

        System.out.print("Volume Atual : " + smartTv.volume);
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.diminuirVolume();
        smartTv.aumentarVolume();

        System.out.println("Canal atual :" + " " + smartTv.canal);
        smartTv.mudarCanal(13);
        System.out.println("Canal atual :" + " " + smartTv.canal);

        System.out.println("Volume Atual : " + smartTv.volume);

        System.out.println("Tv ligada ?" + " " + smartTv.ligada);
        System.out.println("Canal atual :" + " " + smartTv.canal);
        System.out.println("Volume atual :" + " " + smartTv.volume);


        smartTv.ligar ();
        System.out.println("Novo status -> Tv ligada ?" + " " + smartTv.ligada);

        smartTv.desligar ();
        System.out.println("Novo status -> Tv desligada ?" + " " + smartTv.desligar);
    }
}
