package service;

import java.util.ArrayList;
import java.util.List;

public class SomaNumero {
    private List<Integer> listaNumeros;

    public SomaNumero(){
        this.listaNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero){
        listaNumeros.add(numero);
    }

    public int calcularSoma(){
        int somaTodosNumeros = 0;

        if(!listaNumeros.isEmpty()){
            for(int numero: listaNumeros){
                somaTodosNumeros+=numero;
            }

            return somaTodosNumeros;
        }
        return 0;
    }

    public int encontrarMaiorNumero(){
        int maiorValor = 0;
        int cont = 0;

        if(!listaNumeros.isEmpty()){
            for(int numero: listaNumeros){
                if(cont == 0){
                    maiorValor = numero;
                    cont++;
                    continue;
                }
                if(maiorValor < numero){
                    maiorValor=numero;
                }
            }
        }

        return maiorValor;
    }

    public int encontrarMenorNumero(){
        int menorValor = 0;
        int cont = 0;

        if(!listaNumeros.isEmpty()){
            for(int numero: listaNumeros){
                if(cont == 0){
                    menorValor = numero;
                    cont++;
                    continue;
                }
                if(menorValor>numero){
                    menorValor=numero;
                }
            }
        }
        return menorValor;
    }

    public void exibirNumeros(){
        if(!listaNumeros.isEmpty()){
            for(int numero: listaNumeros){
                System.out.printf("%d \t", numero);
            }
        }
    }
}