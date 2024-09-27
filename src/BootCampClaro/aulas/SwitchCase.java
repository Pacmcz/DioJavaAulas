package BootCampClaro.aulas;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner capture = new Scanner(System.in);
        int choice;

        System.out.println("Temos disponíveis 3 planos de telefonia móvel, escolha o que melhor se enquadra no seu perfil: " +
                "\n[1] Plano A: 10Gb de internet, Whatsapp ilimitado" +
                "\n[2] Plano B: 15Gb de internet, Whatsapp e Instragram ilimitados." +
                "\n[3] Plano C: 20Gb de internet, Whatsapp, Instragram e Youtube ilimitados.");

        System.out.println("\n\nPor favor, escolha o plano de sua prefência:");
        choice = capture.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Que alegria, você escolheu o Plano A com 10Gb de internet e Whatsapp ilimitado. Meus parabéns :)");
                break;
            case 2:
                System.out.println("Que alegria, você escolheu o Plano B com 15Gb de internet Whatsapp e Instagram ilimitados. Meus parabéns :)");
                break;
            case 3:
                System.out.println("Que alegria, você escolheu o Plano B com 15Gb de internet Whatsapp, Instagram e Facebook ilimitados. Meus parabéns :)");
                break;
            default:
                System.out.println("Escolha inválida");
        } capture.close();
    }
}
