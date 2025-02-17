import service.ListaTarefas;

public class Main {
    public static void main(String[] args){
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Ganhar 50 quilo de musculo");
        listaTarefas.adicionarTarefa("Conseguir um emprego na área de programação");
        listaTarefas.adicionarTarefa("Ir para a igreja todo domingo");
        listaTarefas.adicionarTarefa("Me forma em ADS");
        listaTarefas.adicionarTarefa("Ler 20 livros esse ano");
        listaTarefas.adicionarTarefa("Acompanhar a premiação do oscar");
        listaTarefas.adicionarTarefa("Corre 15 quilometros");

        listaTarefas.exibirTarefas();
        System.out.printf("Total de tarefas %d\n", listaTarefas.contarTarefas());

        System.out.println("=================================================");

        listaTarefas.removerTarefa("Corre 15 quilometros");

        listaTarefas.exibirTarefas();
        System.out.printf("Total de tarefas %d\n", listaTarefas.contarTarefas());


        System.out.println("=================================================");

        listaTarefas.marcarTarefasConcluida("Me forma em ADS");
        listaTarefas.marcarTarefasConcluida("Ir para a igreja todo domingo");

        System.out.println("Tarefas concluidas");
        listaTarefas.obterTarefasConcluidas();

        System.out.println("=================================================");

        System.out.println("Tarefas pendentes");
        listaTarefas.obterTarefasPendentes();
    }
}
