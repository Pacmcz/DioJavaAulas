package BootCampClaro.aulas;

public class TesteOperadores {
    public static void main(String[] args) {


        int numero = 5;
        System.out.println(numero++);
        System.out.println(++numero);
        System.out.println(numero);

        boolean variavel = true;

        System.out.println(!variavel);
        System.out.println(variavel);
        System.out.println(variavel && variavel);

        int a, b;
        a = 6;
        b = 6;
        System.out.println(a);
        String resultado = "";

        if(a!=b)
            resultado = "verdadeiro";
        else
            resultado = "falso";

        System.out.println( "\n" + resultado);
        System.out.println(a);

        System.out.println(resultado);


        String situacao = a==b ? "\nsim" : "\nnão";
        System.out.println(a);
        System.out.println(situacao);


    }
}
