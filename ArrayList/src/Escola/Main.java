package Escola;

public class Main {

    public static void main(String[] args) {

        // Criando disciplinas
        Disciplina matematica = new Disciplina("Matemática");
        Disciplina portugues = new Disciplina("Português");

        // Adicionando notas em Matemática
        matematica.adicionarNota(new Nota(8.0));
        matematica.adicionarNota(new Nota(7.5));
        matematica.adicionarNota(new Nota(9.0));

        // Adicionando notas em Português
        portugues.adicionarNota(new Nota(6.5));
        portugues.adicionarNota(new Nota(8.0));
        portugues.adicionarNota(new Nota(7.0));

        // Criando aluno
        Aluno aluno = new Aluno("João", 26473);

        // Adicionando disciplinas ao aluno
        aluno.adicionarDisciplina(matematica);
        aluno.adicionarDisciplina(portugues);

        // Exibindo o boletim
        aluno.exibirBoletim();
    }
}