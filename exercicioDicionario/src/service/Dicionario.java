package service;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    Map<String, String> dicionario;

    public Dicionario(){
        dicionario = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao){
        dicionario.put(palavra, definicao);
    }

    public void removerPalavra(String palavra){
        if(!dicionario.isEmpty()) {
            dicionario.remove(palavra);
        }
    }

    public void exibirPalavras(){
        if(!dicionario.isEmpty()) {
            for(String palavra: dicionario.keySet()){
                for(String definicao: dicionario.values()){
                    System.out.println(palavra+": "+definicao);
                }
            }
        }
    }

    public void pesquisarPorPalavra(String palavra){
        if(!dicionario.isEmpty()) {
            System.out.println(dicionario.get(palavra));
        }
    }
}
