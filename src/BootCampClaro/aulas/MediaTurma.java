package BootCampClaro.aulas;

import java.util.Scanner;

public class MediaTurma {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        String [] alunos = {"Gabriel", "Luana", "Vanessa", "Lucas", "Ruan", "Rose", "John", "Doe"};

        double media = calculaMediaDaTurma(alunos, entrada);

        System.out.println("\nA média da turma foi de "+ media + " pontos");
    }
    public static double calculaMediaDaTurma(String[] alunos, Scanner entrada) {
        double soma = 0.0;
        for(String aluno : alunos) {
            System.out.println("Nota do aluno: " + aluno);
            double nota = entrada.nextDouble();
            soma += nota;
        }
        entrada.close();
        return soma / alunos.length;
    }
}
