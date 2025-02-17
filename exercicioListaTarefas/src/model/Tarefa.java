package model;

public class Tarefa {
    private String descricao;
    private boolean andamentoTarefa;

    public Tarefa(String descricao){
        this.descricao = descricao;
        this.andamentoTarefa = false;
    }

    public String getDescricao(){
        return descricao;
    }

    public boolean getAndamentoTarefa(){
        return andamentoTarefa;
    }

    public void setAndamentoTarefa(boolean novaAtualizacao){
        this.andamentoTarefa = novaAtualizacao;
    }

    @Override
    public String toString() {
        return getDescricao() + "  ->  " + getAndamentoTarefa();
    }
}
