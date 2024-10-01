package BootCampClaro.aulas.Polimorfismo.apps;


public class FakeBookMessenger extends ServicoMensagemInstantanea {


    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem enviada com sucesso pelo Fakebook!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida com sucesso pelo FakeBook!");
    }
}
