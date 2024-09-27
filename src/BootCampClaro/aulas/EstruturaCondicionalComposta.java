package BootCampClaro.aulas;

import java.util.Scanner;

public class EstruturaCondicionalComposta {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        System.out.println("Digite a nota do aluno: ");
        nota = entrada.nextDouble();

        if ( nota < 7)
            System.out.println("Reprovado");

        else
            System.out.println("Aprovado");



    }

}
