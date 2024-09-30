package BootCampClaro.aulas.Mensageiro;

public class FakeBookMessenger extends ServicoMensageiro{

    @Override
    public void enviarMensagem() {
        System.out.println("Enviando mensagem pelo FakeBook");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo FakeBook");
    }
}
