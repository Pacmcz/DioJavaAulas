package BootCampClaro.SmartTv;

public class Usuario {
    public static void main(String[] args) {

        SmartTV smartTv = new SmartTV();
        Metodos metodos = new Metodos();

        System.out.println("Tv ligada? " + smartTv.ligada);
        System.out.println("Canal atual: " + smartTv.canal);
        System.out.println("Volume atual: " + smartTv.volume);

        smartTv.ligar();

        System.out.println("1 - Tv ligada? " + smartTv.ligada);

        smartTv.desligar();

        System.out.println("2 - Tv ligada? " + smartTv.ligada);

        //Foi para testar se iria funcionar! E funcionou kk
        smartTv.aumentarVolume();smartTv.aumentarVolume();smartTv.aumentarVolume();
        smartTv.aumentarVolume();smartTv.aumentarVolume();smartTv.aumentarVolume();
        smartTv.aumentarVolume();smartTv.aumentarVolume();smartTv.aumentarVolume();

        System.out.println(metodos.somar());
        System.out.println(metodos.calcularTaxa(12.5, 2.5));

        System.out.println("O volume atual da TV é: " + smartTv.volume);

    }


}
