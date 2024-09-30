package BootCampClaro.aulas.AulaEnum;

public class SistemaIbge {
    public static void main(String[] args) {
        for (EstadoBrasileiro estado : EstadoBrasileiro.values()) {
            System.out.println(estado.nome() + " - " + estado.getSigla()+ " (" + estado.getIbge() +")");
        }
        EstadoBrasileiro Estado = EstadoBrasileiro.ALAGOAS;
        System.out.println( "\n " + Estado.nome() + " - " + Estado.getSigla()+ " (" + Estado.getIbge() +")");
    }
}
