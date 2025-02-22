package service;

import model.Livro;
import util.ComparatorPorAutor;
import util.ComparatorPorPreco;

import java.util.*;

public class LivrariaOnline {
    Map<String, Livro> livraria;

    public LivrariaOnline(){
        livraria = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco){
        livraria.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo){
        String linkRemover = "";

        if(!livraria.isEmpty()){
            for(String link: livraria.keySet()){
                Livro livros;

                livros = livraria.get(link);

                if(livros.getTitulo().equalsIgnoreCase(titulo)){
                    linkRemover = link;
                    break;
                }
            }
        }

        if(linkRemover == ""){
            System.out.printf("Não existe livro com esse titulo: %s\n", titulo);
        } else{
            livraria.remove(linkRemover);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco(){
        List<Map.Entry<String, Livro>> livroParaOrdenarPorPreco = new ArrayList<>(livraria.entrySet());

        Collections.sort(livroParaOrdenarPorPreco, new ComparatorPorPreco());

        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry: livroParaOrdenarPorPreco){
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor(){
        List<Map.Entry<String, Livro>> livrosParaOrdenarPorAutor = new ArrayList<>(livraria.entrySet());

        Collections.sort(livrosParaOrdenarPorAutor, new ComparatorPorAutor());

        Map<String, Livro> livrosOrdenadosPorAutor = new LinkedHashMap<>();

        for(Map.Entry<String, Livro> entry: livrosParaOrdenarPorAutor){
            livrosOrdenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorAutor;
    }

    public List<Livro> pesquisarLivrosPorAutor(String autor){
        List<Livro> listaLivrosAutor = new ArrayList<>();

        if(!livraria.isEmpty()){
            for(String links: livraria.keySet()){
                Livro livros;

                livros = livraria.get(links);

                if(autor.equalsIgnoreCase(livros.getAutor())){
                    listaLivrosAutor.add(livros);
                }
            }
        }
        return listaLivrosAutor;
    }

    public Livro obterLivroMaisCaro(){
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;

        if(!livraria.isEmpty()){
            for(String link: livraria.keySet()){
                double preco;
                Livro livros;

                livros = livraria.get(link);
                preco = livros.getPreco();

                if(preco > maiorPreco){
                    maiorPreco = preco;
                    livroMaisCaro = livros;
                }
            }
        }
        return livroMaisCaro;
    }

    public Livro obterLivroMaisBarato(){
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;

        if(!livraria.isEmpty()){
            for(String link: livraria.keySet()){
                double preco;
                Livro livros;

                livros = livraria.get(link);
                preco = livros.getPreco();

                if(preco < menorPreco){
                    menorPreco = preco;
                    livroMaisBarato = livros;
                }
            }
        }
        return livroMaisBarato;
    }
}