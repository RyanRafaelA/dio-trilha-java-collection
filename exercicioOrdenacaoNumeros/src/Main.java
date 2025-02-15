import service.OrdenacaoNumero;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args){
        List<Integer> ascendente;
        List<Integer> descendente;

        OrdenacaoNumero ordenacaoNumero = new OrdenacaoNumero();

        ordenacaoNumero.adicionarNumero(4);
        ordenacaoNumero.adicionarNumero(6);
        ordenacaoNumero.adicionarNumero(2);
        ordenacaoNumero.adicionarNumero(9);
        ordenacaoNumero.adicionarNumero(1);
        ordenacaoNumero.adicionarNumero(5);
        ordenacaoNumero.adicionarNumero(7);
        ordenacaoNumero.adicionarNumero(8);
        ordenacaoNumero.adicionarNumero(0);
        ordenacaoNumero.adicionarNumero(3);

        ascendente = new ArrayList<>(ordenacaoNumero.ordenarAscendente());
        descendente = new ArrayList<>(ordenacaoNumero.ordenarDescendente());

        System.out.println(ascendente);

        System.out.println("=====================================================");

        System.out.println(descendente);
    }
}
