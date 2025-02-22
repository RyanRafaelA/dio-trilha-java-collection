import model.Livro;
import service.LivrariaOnline;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        LivrariaOnline lo = new LivrariaOnline();
        List<Livro> autor;
        Livro maisCaro, maisBarato;

        lo.adicionarLivro("link1", "Harry Potter", "J.K. Rowling", 35.90);
        lo.adicionarLivro("link2", "Dracula", "Brawn Stoker", 60.90);
        lo.adicionarLivro("link3", "Como treinar seu Dragão", "Cressida Cowell", 29.50);
        lo.adicionarLivro("link4", "E não sobrou ninguem", "Agatha Christie", 42.29);

        lo.exibirLivrosOrdenadosPorPreco().forEach((chave, valor)-> System.out.println(chave+": "+valor));
        System.out.println("======================================================");
        lo.exibirLivrosOrdenadosPorAutor().forEach((chave, valor)-> System.out.println(chave+": "+valor));
        System.out.println("======================================================");
        autor = new ArrayList<>(lo.pesquisarLivrosPorAutor("Brawn Stoker"));
        System.out.println(autor);
        maisCaro = lo.obterLivroMaisCaro();
        maisBarato = lo.obterLivroMaisBarato();
        System.out.println(maisCaro);
        System.out.println(maisBarato);
    }
}
