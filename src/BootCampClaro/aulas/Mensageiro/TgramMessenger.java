package BootCampClaro.aulas.Mensageiro;

public class TgramMessenger extends ServicoMensageiro {
    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo Tgram");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Tgram");
    }
}
