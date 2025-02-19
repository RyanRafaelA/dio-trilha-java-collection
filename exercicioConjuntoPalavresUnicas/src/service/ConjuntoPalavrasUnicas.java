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
            System.out.printf("A palavra %s já existe\n", palavra);
        } else{
            setPalavras.add(palavra);
        }
    }

    public void removerPalavra(String palavra){
        boolean testeVerificacao;

        testeVerificacao = verificarPalavra(palavra);

        if(testeVerificacao){
            setPalavras.remove(palavra);
            System.out.printf("A palavra %s foi removida\n", palavra);
        } else{
            System.out.printf("A palavra %s não existe\n", palavra);
        }
    }

    public boolean verificarPalavra(String palavra){
        return setPalavras.contains(palavra);
    }

    public void exibirPalavrasUnicas(){
        setPalavras.forEach(x -> System.out.println(x));
    }
}
