package BootCampClaro.aulas.Automoveis;

public class Carro extends Veiculos{

    public void ligar(){
        conferindoCambio();
        confereCombustivel();
        System.out.println("Carro Ligado");
    }
    private void confereCombustivel() {
        System.out.println("Conferindo Combustivel");
    }
    private void conferindoCambio() {
        System.out.println("Conferindo Cambio em P");
    }
}
