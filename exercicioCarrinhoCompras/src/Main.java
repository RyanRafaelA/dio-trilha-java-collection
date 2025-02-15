import service.CarrinhoDeCompra;

public class Main {
    public static void main(String[] args){
        CarrinhoDeCompra carrinhoDeCompra = new CarrinhoDeCompra();

        carrinhoDeCompra.adicionar("Relogio", 150, 1);
        carrinhoDeCompra.adicionar("Camisa Adidas Original", 81, 4);
        carrinhoDeCompra.adicionar("Sapato Nike", 41.90, 1);
        carrinhoDeCompra.adicionar("Harry Poter", 39.50, 7);

        carrinhoDeCompra.exibirItems();
        System.out.printf("%.2f \n", carrinhoDeCompra.calcularValorTotal());

        System.out.println("==========================================================");
        carrinhoDeCompra.removerItem("Camisa Adidas Original");

        carrinhoDeCompra.exibirItems();
        System.out.printf("%.2f", carrinhoDeCompra.calcularValorTotal());
    }
}
