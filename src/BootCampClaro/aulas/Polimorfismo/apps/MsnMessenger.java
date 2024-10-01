package BootCampClaro.aulas.Polimorfismo.apps;


public class MsnMessenger extends ServicoMensagemInstantanea {

    @Override
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Mensagem enviada com sucesso pelo MSN!");
    }

    @Override
    public void receberMensagem() {
        System.out.println("Mensagem recebida com sucesso peo MSN!");

    }
}
