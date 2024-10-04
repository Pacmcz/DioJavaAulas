package BootCampClaro.Set;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }
    public void adicionarConvidado(String nome, int codigoConvidado){
        convidadoSet.add(new Convidado(nome, codigoConvidado));
    }
    public void removerConvidadoPorCodigoConvite(int codigoConvite){
        Convidado convidadoParaRemover = null;
        for(Convidado c : convidadoSet){
            if(c.getCodigoConvite() == codigoConvite){
                convidadoParaRemover = c;
                break;
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }
    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados(){
        System.out.println(convidadoSet);
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s)");

        conjuntoConvidados.adicionarConvidado("Jhon", 100);
        conjuntoConvidados.adicionarConvidado("Dope", 101);
        conjuntoConvidados.adicionarConvidado("Doe", 101);
        conjuntoConvidados.adicionarConvidado("Dope", 103);
        conjuntoConvidados.adicionarConvidado("Sakura", 104);
        conjuntoConvidados.adicionarConvidado("Loki", 105);
        conjuntoConvidados.adicionarConvidado("Luki", 105);
        conjuntoConvidados.adicionarConvidado("Laki", 105);
        conjuntoConvidados.adicionarConvidado("Spider", 106);

        conjuntoConvidados.removerConvidadoPorCodigoConvite(100);
        conjuntoConvidados.removerConvidadoPorCodigoConvite(101);


        System.out.println("Existem "+ conjuntoConvidados.contarConvidados() + " convidado(s)");

        conjuntoConvidados.exibirConvidados();

        ;

    }



}
