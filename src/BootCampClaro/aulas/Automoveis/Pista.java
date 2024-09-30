package BootCampClaro.aulas.Automoveis;

public class Pista {
    public static void main(String[] args) {
      Carro jeep = new Carro();
      jeep.setChassi("6512-445");
      jeep.ligar();

      Motocicleta Lander = new Motocicleta();

      Lander.setChassi("5665514-365");
      Lander.ligar();

      Veiculos coringa = Lander;
      coringa.ligar();

    }
}
