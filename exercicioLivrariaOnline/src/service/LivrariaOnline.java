package service;

import model.Livro;

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

    public void exibirLivrosOrdenadosPorPreco(){
        Map<String, Livro> livrosOrdenadosPorPreco = new TreeMap<>(livraria);

        livrosOrdenadosPorPreco.forEach((chave,valor) -> System.out.println(chave+": "+valor));
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
                    livroMaisBarato = livros;
                }
            }
        }
        return livroMaisBarato;
    }
}