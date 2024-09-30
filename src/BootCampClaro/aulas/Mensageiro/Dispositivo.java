package BootCampClaro.aulas.Mensageiro;

public class Dispositivo {
    public static void main(String[] args) {
        MsnMessenger msn = new MsnMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        TgramMessenger tgram = new TgramMessenger();
        tgram.enviarMensagem();
        tgram.receberMensagem();

        FakeBookMessenger fakeBook = new FakeBookMessenger();
        fakeBook.enviarMensagem();
        fakeBook.receberMensagem();

    }

}
