package BootCampClaro.aulas;

public class ExemploForEach {
    public static void main(String[] args) {
        String modeloCarros[] = {"Uno", "Passat", "Monza", "Escort", "L200", "Omega", "Safira", "Meriva", "Celta", "Gol"};

        for (String modelo : modeloCarros) {
            System.out.println("O modelo do carro declarado na lista é " + modelo + modelo.length());
        }
    }
}
