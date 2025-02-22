import service.GerenciadorAlunos;

public class Main {
    public static void main(String[] args){
        GerenciadorAlunos ga = new GerenciadorAlunos();

        ga.adicionarAluno("Jonas", 1242567, 6.5);
        ga.adicionarAluno("Fabiana", 47543678, 9.60);
        ga.adicionarAluno("Clara", 244545745, 10);
        ga.adicionarAluno("Ruan", 455752377, 8.5);
        ga.adicionarAluno("Josenilson", 978866582, 5.5);

        ga.exibirAlunos();

        System.out.println("=========================================");

        ga.removerAluno(1242567);

        ga.exibirAlunosPorNome();

        System.out.println("=========================================");

        ga.exibirAlunosPorNota();
    }
}
