package atividade;

import java.awt.FlowLayout;
import javax.swing.*;

public class Programa2 {
    public static void main(String[] args) {
        JFrame janela = new JFrame("Calculadora");
        janela.setLayout(new FlowLayout());
        JLabel label1 = new JLabel("1º Número:");
        JTextField campo1 = new JTextField(10);
        JLabel label2 = new JLabel("2º Número:");
        JTextField campo2 = new JTextField(10);
        JButton botaoAdicao = new JButton("Adição");
        JButton botaoSubtracao = new JButton("Subtração");
        JButton botaoMultiplicacao = new JButton("Multiplicação");
        JButton botaoDivisao = new JButton("Divisão");
        botaoAdicao.addActionListener(e -> {
            double n1 = Double.parseDouble(campo1.getText());
            double n2 = Double.parseDouble(campo2.getText());
            double resultado = n1 + n2;
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        });
        botaoSubtracao.addActionListener(e -> {
            double n1 = Double.parseDouble(campo1.getText());
            double n2 = Double.parseDouble(campo2.getText());
            double resultado = n1 - n2;
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        });
        botaoMultiplicacao.addActionListener(e -> {
            double n1 = Double.parseDouble(campo1.getText());
            double n2 = Double.parseDouble(campo2.getText());
            double resultado = n1 * n2;
            JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
        });
        botaoDivisao.addActionListener(e -> {
            double n1 = Double.parseDouble(campo1.getText());
            double n2 = Double.parseDouble(campo2.getText());

            if (n2 == 0) {
                JOptionPane.showMessageDialog(null, "Erro: Não é permitido dividir por zero!");
            } else {
                double resultado = n1 / n2;
                JOptionPane.showMessageDialog(null, "Resultado: " + resultado);
            }
        });
        janela.add(label1);
        janela.add(campo1);
        janela.add(label2);
        janela.add(campo2);
        janela.add(botaoAdicao);
        janela.add(botaoSubtracao);
        janela.add(botaoMultiplicacao);
        janela.add(botaoDivisao);
        janela.setSize(260, 220);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setVisible(true);
    }
}