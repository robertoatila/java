import java.util.Scanner;

public class SomaFor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int soma = 0, numero;
        for(int contador = 1; contador <=5; contador++) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            soma = soma + numero;
        }
        System.out.println("A soma de 5 números é: " + soma);
        scanner.close();
    }
}