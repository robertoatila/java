import java.util.Scanner;

public class SomaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1, numero;
        int soma = 0;
        while (contador <= 5) {
            System.out.println("Digite um número: ");
            numero = scanner.nextInt();
            soma = soma + numero;
            contador++;
        }
        System.out.println("A soma de 5 números é: " + soma);
        scanner.close();
    }
}