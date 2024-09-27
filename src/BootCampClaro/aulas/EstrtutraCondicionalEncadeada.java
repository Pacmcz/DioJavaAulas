package BootCampClaro.aulas;

import java.util.Scanner;

public class EstrtutraCondicionalEncadeada {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;

        System.out.println("Digite uma nota: ");
        nota = entrada.nextDouble();

        if (nota >= 6 && nota <= 10)
            System.out.println("Aprovado!");
         else if (nota >= 5 && nota < 6)
            System.out.println("Recuperação");
         else
            System.out.println("Reprovado!");

         entrada.close();
    }
}
