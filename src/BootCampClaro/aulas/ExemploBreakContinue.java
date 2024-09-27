package BootCampClaro.aulas;

public class ExemploBreakContinue {

    public static void main(String[] args) {

        for (int numero = 1; numero < 10; numero++) {
            if (numero == 5)
                continue;
//                break;

            System.out.println(numero);
        }
    }
}
