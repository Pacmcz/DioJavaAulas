package BootCampClaro.Collections.ListaTarefas;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefas {

    private List<Tarefas> tarefasList;

    public ListaTarefas() {
        this.tarefasList = new ArrayList<>();
    }

    public void adicionarTarefas(String descricao) {
        tarefasList.add(new Tarefas(descricao));

    }

    public void removerTarefas(String descricao) {
        List<Tarefas> tarefasParaRemover = new ArrayList<>();
        for (Tarefas tar : tarefasList) {
            if (tar.getDescricao().equals(descricao)) {
                tarefasParaRemover.add(tar);

            }
        }
        tarefasList.removeAll(tarefasParaRemover);
    }
    public int obterNumeroTotalTarefas() {
        return tarefasList.size();
    }
    public void obterDescricaoTarefas() {
        System.out.println(tarefasList);

    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefas("Tarefa 1");
        listaTarefas.adicionarTarefas("Tarefa 1");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.adicionarTarefas("Tarefa 2");
        System.out.println(listaTarefas.obterNumeroTotalTarefas());

        listaTarefas.obterDescricaoTarefas();
    }

}
