package BootCampClaro.Collections.Map;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {

    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone){
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome){
        if(!agendaContatoMap.isEmpty()){
            agendaContatoMap.remove(nome);
        }
    }

    public void exibirContatos(){
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPornome(String nome){
        Integer numeroPorNome = null;
        if(!agendaContatoMap.isEmpty()){
           numeroPorNome = agendaContatoMap.get(nome);
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Maria", 22233345 );
        agendaContatos.adicionarContato("José", 333345545 );
        agendaContatos.adicionarContato("Judas", 44545656 );
        agendaContatos.adicionarContato("Davi", 77776666 );
        agendaContatos.adicionarContato("Golias", 11113335 );
        agendaContatos.adicionarContato("Cain", 666699945 );
        agendaContatos.adicionarContato("Cain", 666699945 );
        agendaContatos.adicionarContato("Cain", 666699945 );
        agendaContatos.adicionarContato("Abel", 88889965 );
        agendaContatos.adicionarContato("Abel", 88889965 );
        agendaContatos.adicionarContato("Raquel", 32321515 );
        agendaContatos.adicionarContato("Salomão", 10190254 );
        agendaContatos.adicionarContato("John", 365455211 );
        agendaContatos.adicionarContato("Doe", 252525145 );
        agendaContatos.adicionarContato("Doe", 252525145 );
        agendaContatos.adicionarContato("Doe", 252525145 );

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Judas");

        System.out.println("\n\nO número é :" + agendaContatos.pesquisarPornome("Cain"));



    }

}
