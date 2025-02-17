package service;

import model.Tarefa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas(){
        tarefaSet = new HashSet<>();
    }

    public boolean adicionarTarefa(String descricao){
        return tarefaSet.add(new Tarefa(descricao));
    }

    public boolean removerTarefa(String descricao){
        Tarefa tarefaRemover = null;

        if(!tarefaSet.isEmpty()) {
            for (Tarefa tarefas : tarefaSet) {
                if (tarefas.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefaRemover = tarefas;
                }
            }
        }

        return tarefaSet.remove(tarefaRemover);
    }

    public void exibirTarefas(){
        if(!tarefaSet.isEmpty()) {
            for (Tarefa tarefas : tarefaSet) {
                System.out.println(tarefas);
            }
        }
    }

    public int contarTarefas(){
        return tarefaSet.size();
    }

    public void obterTarefasConcluidas(){
        if(!tarefaSet.isEmpty()){
            for (Tarefa tarefas: tarefaSet){
                if(tarefas.getAndamentoTarefa() == true){
                    System.out.println(tarefas);
                }
            }
        }
    }

    public void obterTarefasPendentes(){
        if(!tarefaSet.isEmpty()){
            for(Tarefa tarefas: tarefaSet){
                if(tarefas.getAndamentoTarefa() == false){
                    System.out.println(tarefas);
                }
            }
        }
    }

    public void marcarTarefasConcluida(String descricao){
        if(!tarefaSet.isEmpty()) {
            for (Tarefa tarefas : tarefaSet) {
                if (tarefas.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefas.setAndamentoTarefa(true);
                }
            }
        }
    }

    public void marcarTarefasPendente(String descricao){
        if(!tarefaSet.isEmpty()) {
            for (Tarefa tarefas : tarefaSet) {
                if (tarefas.getDescricao().equalsIgnoreCase(descricao)) {
                    tarefas.setAndamentoTarefa(false);
                }
            }
        }
    }

    public void limparListaTarefas(){
        tarefaSet.clear();
    }
}
