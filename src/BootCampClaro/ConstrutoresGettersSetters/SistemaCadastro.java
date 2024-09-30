package BootCampClaro.ConstrutoresGettersSetters;

public class SistemaCadastro {
    public static void main(String[] args) {
        //Criamos uma pessoa no sistema:
        Pessoa marcos = new Pessoa("000.000.000-00", "Marcos");

        //Definimos o endereço da pessoa:
        marcos.setEndereco("Rua das Marias");


        System.out.print(marcos.getNome() + " " + marcos.getCpf());
    }
}
