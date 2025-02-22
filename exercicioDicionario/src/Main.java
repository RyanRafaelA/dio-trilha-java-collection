import service.Dicionario;

public class Main {
    public static void main(String[] args){
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Adomingaram", "Tornar-se elegante");
        dicionario.adicionarPalavra("Cravejador", "Indivíduo que faz cravos para ferradura");
        dicionario.adicionarPalavra("Difusão", "Ação de tornar público, conhecido pela maioria");
        dicionario.adicionarPalavra("Genuino", "Que não sofre alterações nem falsificações");

        dicionario.exibirPalavras();

        System.out.println("==========================================");

        dicionario.removerPalavra("Genuino");
        dicionario.exibirPalavras();

        System.out.println("==========================================");

        dicionario.pesquisarPorPalavra("Difusão");
    }
}
