import service.LivrariaOnline;

public class Main {
    public static void main(String[] args){
        LivrariaOnline lo = new LivrariaOnline();

        lo.adicionarLivro("link1", "Harry Potter", "J.K. Rowling", 35.90);
        lo.adicionarLivro("link2", "Dracula", "Brawn Stoker", 60.90);
        lo.adicionarLivro("link3", "Como treinar seu Dragão", "Cressida Cowell", 29.50);
        lo.adicionarLivro("link4", "E não sobrou ninguem", "Agatha Christie", 42.29);

        lo.exibirLivrosOrdenadosPorPreco();
    }
}
