package model;

import java.util.Objects;

public class Aluno implements Comparable<Aluno>{
    private String nome;
    private Long matricula;
    private double media;

    public Aluno(String nome, Long matricula, double media){
        this.nome = nome;
        this.matricula = matricula;
        this.media = media;
    }

    public String getNome(){
        return nome;
    }

    public Long getMatricula(){
        return matricula;
    }

    public double getMedia(){
        return media;
    }

    @Override
    public int compareTo(Aluno aluno) {
        return nome.compareTo(aluno.getNome());
    }

    @Override
    public String toString() {
        return "Matricula: "+matricula+" Nome: "+nome+"\nMedia: "+String.format("%0.2f", media);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Aluno aluno = (Aluno) o;
        return Objects.equals(matricula, aluno.matricula);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(matricula);
    }
}
