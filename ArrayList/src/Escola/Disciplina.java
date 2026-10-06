package Escola;

import java.util.ArrayList;
import java.util.List;

class Disciplina {
    private String nome;
    private List<Nota> notas;

    public Disciplina(String nome) {
        this.nome = nome;
        this.notas = new ArrayList<>();
    }

    public void adicionarNota(Nota nota) {
        notas.add(nota);
    }

    public double calcularMedia() {
        if (notas.isEmpty()) {
            return 0;
        }

        double soma = 0;

        for (Nota nota : notas) {
            soma += nota.getValor();
        }

        return soma / notas.size();
    }

    public void exibirDisciplina() {
        System.out.println("Disciplina: " + nome);

        System.out.println("Notas:");

        for (Nota nota : notas) {
            System.out.println("- " + nota);
        }

        System.out.printf("Média: %.2f%n" , calcularMedia());
    }
}
