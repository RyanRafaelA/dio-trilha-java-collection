package model;

public class Tarefa {
    private String descrição;
    private boolean andamentoTarefa;

    public Tarefa(String descrição, boolean andamentoTarefa){
        this.descrição = descrição;
        this.andamentoTarefa = andamentoTarefa;
    }

    public String getDescrição(){
        return descrição;
    }

    public boolean getAndamentoTarefa(){
        return andamentoTarefa;
    }

    @Override
    public String toString() {
        return getDescrição() + "  ->  " + getAndamentoTarefa();
    }
}
