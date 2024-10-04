package BootCampClaro.Collections.OrdenacaoSet;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {

    private Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        produtoSet.add(new Produto(codigo, nome, preco, quantidade));

    }
    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome= new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco= new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(1L,"Banana",3.99,5);
        cadastroProdutos.adicionarProduto(2L,"Pera",5.99,8);
        cadastroProdutos.adicionarProduto(4L,"Banana",4.50,9);
        cadastroProdutos.adicionarProduto(3L,"Uva",6.99,15);
        cadastroProdutos.adicionarProduto(9L,"Goiaba",15.99,55);
        cadastroProdutos.adicionarProduto(8L,"Maracujá",65.99,25);

        System.out.println(cadastroProdutos.produtoSet);

        System.out.println(cadastroProdutos.exibirProdutosPorNome());

        System.out.println(cadastroProdutos.exibirProdutosPorPreco());

    }

}
