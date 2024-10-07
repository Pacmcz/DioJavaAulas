package BootCampClaro.Collections.Map.PesquisaMap;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {

    private Map<Long, Produto> estoqueProdutosMap;

    public EstoqueProdutos() {
        this.estoqueProdutosMap = new HashMap<>();
    }

    public void adicionaProduto(long cod, String nome, int quantidade, double preco) {
        estoqueProdutosMap.put(cod, new Produto(nome, preco, quantidade));
    }
    public void exibirProdutos(){
        System.out.println(estoqueProdutosMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotalEstoque = 0d;
        if(!estoqueProdutosMap.isEmpty()) {
        for(Produto p : estoqueProdutosMap.values()) {
            valorTotalEstoque += p.getPreco() * p.getQuantidade();
            }
        }
        return valorTotalEstoque;
    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisCaro;
    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Produto p : estoqueProdutosMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
        }
        return produtoMaisBarato;
    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque(){
        Produto produtoMaiorQuantidadeValorTotalNoEstoque = null;
        double maiorQuantidadeValorEstoque = 0d;
        if (!estoqueProdutosMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : estoqueProdutosMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorQuantidadeValorEstoque ) {
                    maiorQuantidadeValorEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorTotalNoEstoque = entry.getValue();
                }
            }
        }
        return produtoMaiorQuantidadeValorTotalNoEstoque;
    }

    public static void main(String[] args) {
        EstoqueProdutos estoqueProdutos = new EstoqueProdutos();
        estoqueProdutos.adicionaProduto(10000, "Banana",100, 3.99);
        estoqueProdutos.adicionaProduto(10001, "Maçã",150, 17.99);
        estoqueProdutos.adicionaProduto(10002, "Maracuja",95, 8.99);
        estoqueProdutos.adicionaProduto(10003, "Morango",500, 12.99);
        estoqueProdutos.adicionaProduto(10004, "Manga",250, 6.99);
        estoqueProdutos.adicionaProduto(10005, "Laranja",1000, 5.99);
        estoqueProdutos.adicionaProduto(10006, "Pera",346, 4.99);
        estoqueProdutos.adicionaProduto(10007, "Macaxeira",100, 1.99);
        estoqueProdutos.adicionaProduto(10008, "Uva",100, 5.99);
        estoqueProdutos.adicionaProduto(10009, "Limão",500, 2.99);
        estoqueProdutos.adicionaProduto(10010, "Tomate",50, 1.99);


        estoqueProdutos.exibirProdutos();

        System.out.println("=============");

        System.out.println("valor total de produtos em estoque → " + estoqueProdutos.calcularValorTotalEstoque());
        System.out.println("=============");

        System.out.println("O produto mais barato é: " + estoqueProdutos.obterProdutoMaisBarato());
        System.out.println("=============");

        System.out.println("O produto mais caro é: " + estoqueProdutos.obterProdutoMaisCaro());
        System.out.println("=============");

        System.out.println("O produto com maior quantidade em estoque é: " + estoqueProdutos.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println("=============");

    }
}


