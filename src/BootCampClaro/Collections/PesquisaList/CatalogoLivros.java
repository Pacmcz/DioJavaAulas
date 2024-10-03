package BootCampClaro.Collections.PesquisaList;

import java.util.ArrayList;
import java.util.List;

public class CatalogoLivros {

    private List<Livro> livrosList;

    public CatalogoLivros() {this.livrosList = new ArrayList<>();}

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livrosList.add(new Livro(titulo, autor, anoPublicacao));

    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosPorAutor = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosPorAutor.add(l);
                }
            }
        }
        return livrosPorAutor;
    }
    public List<Livro> pesqisarPorIntervaloAnos (int anoInicial, int anoFinal) {
        List<Livro> livrosPorIntervaloAnos = new ArrayList<>();
        if(!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if(l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosPorIntervaloAnos.add(l);
                }
            }
        }
        return livrosPorIntervaloAnos;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livrosList.isEmpty()) {
            for (Livro l : livrosList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalogoLivros c = new CatalogoLivros();
        c.adicionarLivro("Livro1", "Autor1", 1994);
        c.adicionarLivro("Livro2", "Autor2", 2024);
        c.adicionarLivro("Livro2", "Autor3", 2022);
        c.adicionarLivro("Livro3", "Autor4", 1996);
        c.adicionarLivro("Livro3", "Autor6", 1997);
        c.adicionarLivro("Livro3", "Autor6", 1998);
        c.adicionarLivro("Livro4", "Autor2", 2020);
        c.adicionarLivro("Livro5", "Autor3", 2015);
        c.adicionarLivro("Livro6", "Autor1", 2016);


        System.out.println(c.pesquisarPorAutor("Autor4"));


        System.out.println(c.pesquisarPorTitulo("Livro3"));

        System.out.println(c.pesqisarPorIntervaloAnos(1990, 2000));

    }




}

