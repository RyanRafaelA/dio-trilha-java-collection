package model;

import java.util.Objects;

public class Livro{
    private String titulo;
    private String autor;
    private double preco;

    public Livro(String titulo, String autor, double preco){
        this.titulo = titulo;
        this.autor = autor;
        this.preco = preco;
    }

    public String getTitulo(){ return titulo; }
    public String getAutor(){ return autor; }
    public double getPreco(){ return preco; }

    @Override
    public String toString() {
        return titulo+" - "+autor+"\n"+String.format("%.2f", preco);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return Objects.equals(titulo, livro.titulo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(titulo);
    }
}
