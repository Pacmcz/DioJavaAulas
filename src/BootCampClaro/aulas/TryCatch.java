package BootCampClaro.aulas;

import java.sql.SQLOutput;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class TryCatch {
    public static void main(String[] args) {
        try {
            Scanner entrada = new Scanner(System.in).useLocale(Locale.US);
            System.out.println("Digite o seu nome: ");
            String nome = entrada.nextLine();

            System.out.println("Digiteu seu sobrenome: ");
            String sobrenome = entrada.nextLine();

            System.out.println("Digite a sua idade: ");
            int idade = entrada.nextInt();

            System.out.println("Digite o seu tamanho: ");
            double tamanho = entrada.nextDouble();

            System.out.println("Olá, meu nome é " + nome.toUpperCase() + " " + sobrenome.toUpperCase());
            System.out.println("A minha idade é " + idade+ " anos" + " e tenho " + tamanho + "m de altura.");

        } catch (InputMismatchException e) {
            System.out.println("Os campos idade e altura precisam ser numéricos");
        }
    }
}
