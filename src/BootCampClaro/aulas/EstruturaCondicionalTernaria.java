package BootCampClaro.aulas;

import java.util.Scanner;

public class EstruturaCondicionalTernaria {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double nota;
        System.out.println("Digite uma nota: ");
        nota = entrada.nextDouble();

        String resultado = nota >= 7 ? "Aprovado" : nota >= 5 && nota <7 ? "Recuperação" : "Reprovado";

        System.out.println(resultado);

        entrada.close();
    }
}
