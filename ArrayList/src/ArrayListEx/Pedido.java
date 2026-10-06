package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private int numero;
    private List<Produto> produtos;
    public Pedido(int numero) {
        this.numero = numero;
        this.produtos = new ArrayList<>();
    }
    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }
    public double calcularTotal() {
        double total = 0;
        for (Produto produto : produtos) {
            total += produto.getPreco();
        }
        return total;
    }
    public void exibirPedido() {
        System.out.println("Pedido número: " + numero);
        for (Produto produto : produtos) {
            System.out.println("- " + produto);
        }
        System.out.println("Total: R$ " + calcularTotal());
    }
}