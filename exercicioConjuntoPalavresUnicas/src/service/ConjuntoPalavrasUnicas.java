package service;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    Set<String> setPalavras;

    public ConjuntoPalavrasUnicas(){
        setPalavras = new HashSet<>();
    }

    public void adicionarPalavra(String palavra){
        boolean testeVerificacao;

        testeVerificacao = verificarPalavra(palavra);

        if(testeVerificacao){
            System.out.printf("A palavra %s já existe", palavra);
        } else{
            System.out.printf("A palavra %s adicionada", palavra);
            setPalavras.add(palavra);
        }
    }

    public void removerPalavra(String palavra){
        boolean testeVerificacao;

        testeVerificacao = verificarPalavra(palavra);

        if(testeVerificacao){
            setPalavras.remove(palavra);
            System.out.printf("A palavra %s foi removida", palavra);
        } else{
            System.out.printf("A palavra %s não existe", palavra);
        }
    }

    public boolean verificarPalavra(String palavra){
        return setPalavras.contains(palavra);
    }
}
