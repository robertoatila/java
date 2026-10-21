package botao;
import javax.swing.*;
import java.awt.*;
public class radio {
	public static void main(String[] args) {
		JFrame janela = new JFrame("Pesquisa Desenvolvimento");
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setSize(520, 280);
		janela.setLayout(new FlowLayout());
		
		JRadioButton manha = new JRadioButton("Manhã");
		JRadioButton tarde = new JRadioButton("Tarde");
		JRadioButton noite = new JRadioButton("Noite");
		ButtonGroup grupo = new ButtonGroup();
		grupo.add(manha);
		grupo.add(tarde);
		grupo.add(noite);	
		janela.add(manha);
		janela.add(tarde); 
		janela.add(noite); 
		
		janela.add(Box.createRigidArea(new Dimension(520, 0)));
		
		JRadioButton masculino = new JRadioButton("Masculino");
		JRadioButton feminino = new JRadioButton("Feminino");
		ButtonGroup grupo1 = new ButtonGroup();
		grupo1.add(masculino);
		grupo1.add(feminino);	
		janela.add(masculino);
		janela.add(feminino); 
		
		janela.add(Box.createRigidArea(new Dimension(520, 0)));
		
		JRadioButton jacinto = new JRadioButton("Jacinto Sá");
		JRadioButton virginia = new JRadioButton("Virgínia Ramalho");
		ButtonGroup grupo2 = new ButtonGroup();
		grupo2.add(jacinto);
		grupo2.add(virginia);	
		janela.add(jacinto);
		janela.add(virginia); 
		
		janela.add(Box.createRigidArea(new Dimension(520, 0)));
		
		JCheckBox programacao = new JCheckBox("Programação");
        JCheckBox redes = new JCheckBox("Redes");
        JCheckBox banco = new JCheckBox("Banco de dados");
        JCheckBox tic = new JCheckBox("Tic");
        JCheckBox engenharia = new JCheckBox("Engenharia SW");
        janela.add(programacao);
        janela.add(redes);
        janela.add(banco);
        janela.add(tic);
        janela.add(engenharia);

        janela.add(Box.createRigidArea(new Dimension(520, 0)));
        
		JButton verificar = new JButton("Ver escolha");
		verificar.addActionListener(e -> {
			String turno = "Nenhum turno selecionado";
			if (manha.isSelected()) turno = "Manhã";
			else if (tarde.isSelected()) turno = "Tarde"; 
			else if (noite.isSelected()) turno = "Noite";
			String sexo = "Nenhum sexo selecionado";
			if (masculino.isSelected()) sexo = "Masculino";
			else if (feminino.isSelected()) sexo = "Feminino"; 
			String etec = "Nenhuma etec selecionada";
			if (jacinto.isSelected()) etec = "Jacinto Sá";
			else if (virginia.isSelected()) etec = "Virgínia Ramalho"; 
			String disciplina = "";
			if (programacao.isSelected()) disciplina += "Programação, ";
			if (redes.isSelected()) disciplina += "Redes, "; 
			if (banco.isSelected()) disciplina += "Banco de dados, ";
			if (tic.isSelected()) disciplina += "Tic, ";
			if (engenharia.isSelected()) disciplina += "Engenharia SW, ";
			if (disciplina.isEmpty()) {disciplina = "Nenhuma disciplina selecionada";
			} else {
				disciplina = disciplina.substring(0, disciplina.length() - 2);
			}
			JOptionPane.showMessageDialog(janela, "Turno: " + turno + "\nSexo: " + sexo + "\nEtec: " + etec + "\nDisciplinas: " + disciplina);
		});
		
		janela.add(verificar);
		JButton limpar = new JButton("Limpar");
		limpar.addActionListener(e -> {
			grupo.clearSelection();
			grupo1.clearSelection();
			grupo2.clearSelection();
			
			programacao.setSelected(false);
			redes.setSelected(false);
			banco.setSelected(false);
			tic.setSelected(false);
			engenharia.setSelected(false);
		});
		janela.add(limpar);
		janela.setLocationRelativeTo(null);
		janela.setVisible(true);
	}
}
