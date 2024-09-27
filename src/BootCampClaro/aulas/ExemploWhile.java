package BootCampClaro.aulas;

import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {
    public static void main(String[] args) {
        double mesada = 50.0;

        while (mesada > 0) {
            double valorDoce = valorAleatorio();
            if (valorDoce > mesada)
                valorDoce = mesada;

            System.out.printf("Doce de valor: R$%.2f adicionado no carrinho\n", valorDoce );
            mesada -= valorDoce;
        }
        System.out.println("\n\nMesada R$" + mesada);
        System.out.println("Joãozinho gastou toda a sua mesada em doces");

    }

    public static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 50);
    }
}