import java.util.Scanner;

public class Sala {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Quantos alunos existem na sala: ");
        int sala = scanner.nextInt();

        if (sala <= 0) {
            System.out.println("A sala deve possuir pelo menos 1 aluno.");
            scanner.close();
            return;
        }

        scanner.nextLine();

        int aprovados = 0;
        int recuperacao = 0;
        int reprovados = 0;

        double somaMedias = 0;
        double maiorMedia = -1;
        double menorMedia = 11;

        String nomeMaiorMedia = "";

        double[] medias = new double[sala];

        for (int contador = 1; contador <= sala; contador++) {

            System.out.println("\nAluno " + contador);

            System.out.print("Nome do aluno: ");
            String aluno = scanner.nextLine();

            System.out.print("Nota da primeira prova: ");
            double prova1 = scanner.nextDouble();

            System.out.print("Nota da segunda prova: ");
            double prova2 = scanner.nextDouble();

            System.out.print("Nota da terceira prova: ");
            double prova3 = scanner.nextDouble();
            scanner.nextLine(); // Consome a quebra de linha após o número

            double media = (prova1 + prova2 + prova3) / 3;

            medias[contador - 1] = media;
            somaMedias = somaMedias + media;

            System.out.println("\nNome: " + aluno);
            System.out.printf("Média do aluno: %.1f%n", media);

            if (media >= 7) {
                System.out.println("Aprovado!");
                aprovados++;
            } else if (media >= 5) {
                System.out.println("Recuperação!");
                recuperacao++;
            } else {
                System.out.println("Reprovado!");
                reprovados++;
            }

            if (media > maiorMedia) {
                maiorMedia = media;
                nomeMaiorMedia = aluno;
            }

            if (media < menorMedia) {
                menorMedia = media;
            }
        }

        double mediaGeral = somaMedias / sala;

        int acimaMediaGeral = 0;
        for (int contador = 0; contador < sala; contador++) {
            if (medias[contador] >= mediaGeral) {
                acimaMediaGeral++;
            }
        }

        System.out.println("\n===== RESULTADO DA TURMA =====");
        System.out.println("Aprovados: " + aprovados);
        System.out.println("Recuperação: " + recuperacao);
        System.out.println("Reprovados: " + reprovados);
        System.out.printf("Maior média: %.2f (Aluno: %s)%n", maiorMedia, nomeMaiorMedia);
        System.out.printf("Menor média: %.2f%n", menorMedia);
        System.out.printf("Média geral: %.2f%n", mediaGeral);
        System.out.println("Alunos com média acima ou igual à média geral: " + acimaMediaGeral);

        scanner.close();
    }
}