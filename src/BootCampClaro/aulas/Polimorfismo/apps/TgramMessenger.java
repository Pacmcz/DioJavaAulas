package BootCampClaro.aulas.Polimorfismo.apps;


public class TgramMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem enviada com sucesso pelo Tgram!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida com sucesso pelo Tgram!");
    }
}
