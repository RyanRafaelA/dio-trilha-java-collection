import service.ContagemPalavra;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args){
        ContagemPalavra cp = new ContagemPalavra();
        Map<String, Integer> palavraFrequente = new HashMap<>();

        cp.adicionarPalavra("Estudar", 10);
        cp.adicionarPalavra("Correr", 4);
        cp.adicionarPalavra("Fraco", 2);
        cp.adicionarPalavra("Dificil", 1);
        cp.adicionarPalavra("Tela", 3);

        cp.exibirContagemPalavras();

        System.out.println("Palavra mais frequente: "+cp.encontrarPalavraMaisFrequente());
    }
}
