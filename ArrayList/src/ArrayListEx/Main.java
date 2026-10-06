package ArrayListEx;

public class Main {
    public static void main(String[] args) {
        // Criando produtos
        Produto produto1 = new Produto("Notebook", 3500.00);
        Produto produto2 = new Produto("Mouse", 80.00);
        Produto produto3 = new Produto("Teclado", 150.00);
        Produto produto4 = new Produto("Monitor", 900.00);

        // Criando cliente
        Cliente cliente = new Cliente("João");

        // Criando primeiro pedido
        Pedido pedido1 = new Pedido(1);
        pedido1.adicionarProduto(produto1);
        pedido1.adicionarProduto(produto2);

        // Criando segundo pedido
        Pedido pedido2 = new Pedido(2);
        pedido2.adicionarProduto(produto3);
        pedido2.adicionarProduto(produto4);

        // Associando os pedidos ao cliente
        cliente.adicionarPedido(pedido1);
        cliente.adicionarPedido(pedido2);

        // Exibindo os pedidos do cliente
        cliente.exibirPedidos();
    }
}