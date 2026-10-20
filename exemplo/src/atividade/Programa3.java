package atividade;

import java.awt.FlowLayout;
import javax.swing.*;

public class Programa3 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Cadastro de Produtos");
        janela.setLayout(new FlowLayout());
        JLabel labelProduto = new JLabel("Nome do produto:");
        JTextField campoProduto = new JTextField(15);
        JLabel labelPreco = new JLabel("Preço unitário:");
        JTextField campoPreco = new JTextField(10);
        JLabel labelQuantidade = new JLabel("Quantidade:");
        JTextField campoQuantidade = new JTextField(10);
        JButton botaoCalcular = new JButton("Calcular");
        JButton botaoLimpar = new JButton("Limpar");
        botaoCalcular.addActionListener(e -> {
            String nomeProduto = campoProduto.getText();
            double preco = Double.parseDouble(campoPreco.getText());
            int quantidade = Integer.parseInt(campoQuantidade.getText());
            
            double valorTotal = preco * quantidade;

            JOptionPane.showMessageDialog(null, 
                "Produto: " + nomeProduto + "\nValor total: R$ " + valorTotal);
        });
        botaoLimpar.addActionListener(e -> {
            campoProduto.setText("");
            campoPreco.setText("");
            campoQuantidade.setText("");
        });
        janela.add(labelProduto);
        janela.add(campoProduto);
        janela.add(labelPreco);
        janela.add(campoPreco);
        janela.add(labelQuantidade);
        janela.add(campoQuantidade);
        janela.add(botaoCalcular);
        janela.add(botaoLimpar);
        janela.setSize(280, 220);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}