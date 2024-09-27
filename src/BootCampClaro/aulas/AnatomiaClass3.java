package BootCampClaro.aulas;

public class AnatomiaClass3 {

    public static void main(String[] args) {
        //Declaração de variáveis:
        String primeiroNome = "John";
        String segundoNome = "Doe";

        String nomeCompleto1 = "Meu nome é " + primeiroNome + " " + segundoNome;

        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);

        System.out.println(nomeCompleto1);
    }
        //Método:
    public static String nomeCompleto (String primeiroNome, String segundoNome) {

        return primeiroNome.concat(" ").concat(segundoNome);

    }

}
