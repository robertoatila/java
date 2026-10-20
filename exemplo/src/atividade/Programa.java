package atividade;
import javax.swing.JFrame;
import javax.swing.*;
import javax.swing.JLabel;
import java.awt.FlowLayout;
public class Programa {
	    public static void main(String[] args) {
	        JFrame janela = new JFrame("Cadastro de Aluno");
	        janela.setLayout(new FlowLayout());
	        JLabel labelNome = new JLabel("Nome do aluno:");
	        JTextField campoNome = new JTextField(20);
	        JLabel labelRa = new JLabel("RA:");
	        JTextField campoRa = new JTextField(20);
	        JButton botaoCadastrar = new JButton("Cadastrar");
	        JButton botaoLimpar = new JButton("Limpar");
	        botaoCadastrar.addActionListener(e -> {
	            String nome = campoNome.getText();
	            String ra = campoRa.getText();
	            JOptionPane.showMessageDialog(null, "Aluno cadastrado!\nNome: " + nome + "\nRA: " + ra);
	        });
	        botaoLimpar.addActionListener(e -> {
	            campoNome.setText("");
	            campoRa.setText("");
	        });
	        janela.add(labelNome);
	        janela.add(campoNome);
	        janela.add(labelRa);
	        janela.add(campoRa);
	        janela.add(botaoCadastrar);
	        janela.add(botaoLimpar);
	        janela.setSize(300, 200);
	        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        janela.setVisible(true);
	    }
	}