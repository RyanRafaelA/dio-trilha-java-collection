package service;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavra {
    Map<String, Integer> contagemPalavra;

    public ContagemPalavra(){
        contagemPalavra = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, int contage){
        contagemPalavra.put(palavra, contage);
    }

    public void removerPalavra(String palavra){
        if(!contagemPalavra.isEmpty()){
            contagemPalavra.remove(palavra);
        }
    }

    public void exibirCOntagemPalavras(){
        if(!contagemPalavra.isEmpty()){
            contagemPalavra.forEach((chave, valor) -> System.out.println(chave+": "+valor));
        }
    }

    public Map<String, Integer> encontrarPalavraMaisFrequente(){
        Map<String, Integer> retornoPalavraFrequente = new HashMap<>();
        int contagem = Integer.MIN_VALUE;
        String palavraMaisFrequente = "";

        if(!contagemPalavra.isEmpty()){
            for(String palavras: contagemPalavra.keySet()){
                int frequencia;
                frequencia = contagemPalavra.get(palavras);

                if(contagem < frequencia){
                    contagem = frequencia;
                    palavraMaisFrequente = palavras;
                }
            }
            retornoPalavraFrequente.put(palavraMaisFrequente, contagem);
        }
        return retornoPalavraFrequente;
    }
}
