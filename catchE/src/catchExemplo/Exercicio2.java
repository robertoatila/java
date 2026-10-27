package catchExemplo;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do aluno: ");
        String nome = scanner.nextLine();
        
        double nota1 = 0;
        double nota2 = 0;
        boolean notasValidas = false;

        while (!notasValidas) {
            try {
                System.out.print("Digite a primeira nota (0 a 10): ");
                nota1 = scanner.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Erro: A nota não pode ser menor que zero ou maior que dez.\n");
                    continue;
                }

                System.out.print("Digite a segunda nota (0 a 10): ");
                nota2 = scanner.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Erro: A nota não pode ser menor que zero ou maior que dez.\n");
                    continue; 
                }

                notasValidas = true;

            } catch (InputMismatchException e) {
                System.out.println("Erro: Você digitou letras no lugar de uma nota. Digite apenas números.\n");
                
                scanner.nextLine();
            }
        }

        double media = (nota1 + nota2) / 2.0;

        System.out.println("\n--- Resultado ---");
        System.out.println("Aluno: " + nome);
        System.out.printf("Média final: %.1f\n", media);

        scanner.close();
    }
}