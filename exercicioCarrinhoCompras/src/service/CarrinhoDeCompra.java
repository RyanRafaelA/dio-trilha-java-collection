package service;

import model.Item;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompra {
    private List<Item> listaItem;

    public CarrinhoDeCompra(){
        listaItem = new ArrayList<>();
    }

    public void adicionar(String nome, double preco, int quantidade){
        listaItem.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome){
        Item removeItem = null;

        for(Item items: listaItem){
            if(items.getNome() == nome){
                removeItem = items;
            }
        }

        listaItem.remove(removeItem);
    }

    public double calcularValorTotal(){
        double valorCarrinho = 0;

        for(Item items : listaItem){
            double preco;
            int quantidade;

            preco  = items.getPreco();
            quantidade = items.getQuantidade();

            valorCarrinho += preco * quantidade;
        }

        return valorCarrinho;
    }

    public void exibirItems(){
        for(Item items: listaItem){
            System.out.println(items);
        }
    }
}
