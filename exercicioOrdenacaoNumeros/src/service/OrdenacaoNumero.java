package service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumero {
    private List<Integer> listaNumero;

    public OrdenacaoNumero(){
        listaNumero = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumero.add(numero);
    }

    public List<Integer> ordenarAscendente(){
        List<Integer> listaAscendente = new ArrayList<>(listaNumero);

        Collections.sort(listaAscendente);

        return listaAscendente;
    }

    public List<Integer> prdenarDescendente(){
        List<Integer> listaDescendente = new ArrayList<>(listaNumero);

        Collections.reverse(listaDescendente);

        return listaDescendente;
    }
}
