import service.SomaNumero;

public class Main {
    public static void main(String[] args){
        SomaNumero listaNumero = new SomaNumero();

        listaNumero.adicionarNumero(2);
        listaNumero.adicionarNumero(5);
        listaNumero.adicionarNumero(3);
        listaNumero.adicionarNumero(8);
        listaNumero.adicionarNumero(1);
        listaNumero.adicionarNumero(9);
        listaNumero.adicionarNumero(4);

        listaNumero.exibirNumeros();

        System.out.printf("\nO maior numero é %d", listaNumero.encontrarMaiorNumero());
        System.out.printf("\nO menor numero é %d", listaNumero.encontrarMenorNumero());
    }
}
