package Escola;

import java.util.ArrayList;
import java.util.List;

class Aluno {
    private String nome;
    private int RA;
    private List<Disciplina> disciplinas;
    
    public Aluno(String nome, int RA) {
        this.nome = nome;
        this.RA = RA;
        this.disciplinas = new ArrayList<>();
    }
    
    public void adicionarDisciplina(Disciplina disciplina) {
        disciplinas.add(disciplina);
    }
    public double calcularMediaGeral() {
        if (disciplinas.isEmpty()) {
            return 0;
        }
        double somaMedias = 0;
        for (Disciplina disciplina : disciplinas) {
            somaMedias += disciplina.calcularMedia();
        }
        return somaMedias / disciplinas.size();
    }
    public void exibirBoletim() {
        System.out.println("Aluno: " + nome);
        System.out.println("RA: " + RA);
        System.out.println("Quantidade de disciplinas: "
                + disciplinas.size());

        System.out.println();

        for (Disciplina disciplina : disciplinas) {
            disciplina.exibirDisciplina();
            System.out.printf("Média Geral: %.2f%n", calcularMediaGeral());
            System.out.println();
        }
    }
}
