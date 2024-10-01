package BootCampClaro.aulas.Polimorfismo;

import BootCampClaro.aulas.Polimorfismo.apps.FakeBookMessenger;
import BootCampClaro.aulas.Polimorfismo.apps.MsnMessenger;
import BootCampClaro.aulas.Polimorfismo.apps.ServicoMensagemInstantanea;
import BootCampClaro.aulas.Polimorfismo.apps.TgramMessenger;

import java.util.Scanner;

public class Dispositivo {
    public static void main(String[] args) {
        ServicoMensagemInstantanea smi = null;
        Scanner aplicativo = new Scanner(System.in);
        System.out.println("\nGostaria de enviar a mensagem por qual mensageiro?" +
                "\n\n   [1] Fakebook Messsenger" +
                "\n   [2] MSN Messsenger" +
                "\n   [3] Tgram Messsenger" +
                "\n\nPor gentileza, escolha uma das opções");

        String app = aplicativo.nextLine();


        if (app.equals("1")) {
            smi = new FakeBookMessenger();
        }

        else if (app.equals("2")) {
            smi = new MsnMessenger();
        }
        else if (app.equals("3")) {
            smi = new TgramMessenger();
        } else {
            System.out.println("Opção inválida");

        }

        smi.enviarMensagem();
        smi.receberMensagem();






    }
}
