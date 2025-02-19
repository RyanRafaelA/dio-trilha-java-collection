import service.ConjuntoPalavrasUnicas;

public class Main {
    public static void main(String[] args){
        ConjuntoPalavrasUnicas cpu = new ConjuntoPalavrasUnicas();

        cpu.adicionarPalavra("Televisão");
        cpu.adicionarPalavra("Computador");
        cpu.adicionarPalavra("Telefone");
        cpu.adicionarPalavra("Mouse");

        cpu.exibirPalavrasUnicas();

        cpu.adicionarPalavra("Computador");

        cpu.removerPalavra("Mouse");
        cpu.removerPalavra("Ventilador");
    }
}
