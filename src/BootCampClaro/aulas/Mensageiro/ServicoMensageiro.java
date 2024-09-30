package BootCampClaro.aulas.Mensageiro;

public class ServicoMensageiro {

    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem");
        salvaHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem");
        System.out.println("===============================================");
    }

    private void validarConectadoInternet() {
        System.out.println("Validando se está conectado com o Internet");
    }
    private void salvaHistoricoMensagem() {
        System.out.println("Salvando o histórico da mensagem");
    }
}
