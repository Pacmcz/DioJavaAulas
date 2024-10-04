package BootCampClaro.Collections.PesquisaSet;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {

    private Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void addContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        System.out.println(contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();
       for (Contato c : contatoSet) {
           if (c.getNome().startsWith(nome)) {
               contatosPorNome.add(c);
           }
       }
    return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agenda = new AgendaContatos();

        agenda.addContato("Pessoa1", 251166541);
        agenda.addContato("John", 251154125);
        agenda.addContato("Jake", 251167454);
        agenda.addContato("Flutter", 654166541);
        agenda.addContato("Harry", 251166654);
        agenda.addContato("Pessoa", 251166542);
        agenda.addContato("Pessoa", 251166543);
        agenda.addContato("Coke", 52116541);

        agenda.exibirContatos();

        agenda.atualizarNumeroContato("Harry", 255115554);

        agenda.exibirContatos();
    }
}
