package service;

import model.Aluno;
import util.ComparatorPorNota;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos(){
        alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double media){
        boolean testeAlunoExiste;

        testeAlunoExiste = alunoSet.add(new Aluno(nome, matricula, media));

        if(!testeAlunoExiste){
            System.out.println("Esse aluno já existe!");
        }
    }

    public void removerAluno(long maticula){
        Aluno alunoRemover = null;

        for(Aluno alunos: alunoSet){
            if(alunos.getMatricula() == maticula){
                alunoRemover = alunos;
                break;
            }
        }

        alunoSet.remove(alunoRemover);
    }

    public void exibirAlunos(){
        alunoSet.forEach(x -> System.out.println(x));
    }

    public void exibirAlunosPorNome(){
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);

        alunosPorNome.forEach(x -> System.out.println(x));
    }

    public void exibirAlunosPorNota(){
        Set<Aluno> alunosPorNota =  new TreeSet<>(new ComparatorPorNota());

        alunosPorNota.addAll(alunoSet);

        alunosPorNota.forEach(x -> System.out.println(x));
    }
}
