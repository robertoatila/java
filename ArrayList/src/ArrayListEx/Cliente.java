package ArrayListEx;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
    private String nome;
    private List<Pedido> pedidos;
    public Cliente(String nome) {
        this.nome = nome;
        this.pedidos = new ArrayList<>();
    }
    public void adicionarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }
    public void exibirPedidos() {
        System.out.println("Cliente: " + nome);
        System.out.println("Quantidade de pedidos: " + pedidos.size());
        System.out.println();

        for (Pedido pedido : pedidos) {
            pedido.exibirPedido();
            System.out.println();
        }
    }
}