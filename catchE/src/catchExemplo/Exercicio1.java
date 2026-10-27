package catchExemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exercicio1 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean calculoRealizado = false;

        System.out.println("--- Sistema de Cálculo de Média ---");

        while (!calculoRealizado) {
            try {
                System.out.print("Digite a primeira nota: ");
                double nota1 = scanner.nextDouble();

                if (nota1 < 0 || nota1 > 10) {
                    System.out.println("Erro: A nota deve estar entre 0 e 10.\n");
                    continue; 
                }

                System.out.print("Digite a segunda nota: ");
                double nota2 = scanner.nextDouble();

                if (nota2 < 0 || nota2 > 10) {
                    System.out.println("Erro: A nota deve estar entre 0 e 10.\n");
                    continue; 
                }

                double media = (nota1 + nota2) / 2.0;
                System.out.printf("\nMédia final: %.1f\n", media);

                if (media >= 6.0) {
                    System.out.println("Situação: APROVADO\n");
                } else {
                    System.out.println("Situação: REPROVADO\n");
                }

                calculoRealizado = true;

            } catch (InputMismatchException e) {
                System.out.println("\nErro: digite somente valores numéricos!\n");
                scanner.nextLine();
            }
        }
        
        scanner.close();
    }
}
