package BootCampClaro.Collections.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoa() {
        this.pessoaList = new ArrayList<>();
    }
    public void adicionarPessoa(String nome, int idade, double altura){
        pessoaList.add(new Pessoa(nome, idade, altura));
    }
    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }


    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();

        ordenacaoPessoa.adicionarPessoa("Maria", 20, 1.5);
        ordenacaoPessoa.adicionarPessoa("João", 25, 1.80);
        ordenacaoPessoa.adicionarPessoa("Pedro", 30, 1.75);
        ordenacaoPessoa.adicionarPessoa("Maria", 45, 1.90);
        ordenacaoPessoa.adicionarPessoa("Izabella",32,1.20);
        ordenacaoPessoa.adicionarPessoa("Luana", 45, 1.90);
        ordenacaoPessoa.adicionarPessoa("Rosa", 45, 1.80);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println("=================================");
        System.out.println(ordenacaoPessoa.ordenarPorAltura());

    }


}

