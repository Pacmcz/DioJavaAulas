package BootCampClaro.aulas;

public class ExemploForArray {
    public static void main(String[] args) {
        String alunos[] = {"Felipe", "Jonas", "João", "Ruan", "Helder", "Juninho", "Julian", "Vanessa", "Gabriel" };

        for (int x= 0; x<alunos.length; x++){
            System.out.println("O(a) aluno(a) na mesa " + (x+1) + " é " + alunos[x]);
        }
    }
}
