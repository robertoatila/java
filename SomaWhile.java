import java.util.Scanner;

public class SomaWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int contador = 1, numero;
        int soma = 0;
        while (contador <= 5) {
            System.out.println("Número: ");
            numero = scanner.nextInt();
            soma = soma + numero;
            contador++;
        }
        System.out.println("Soma dos 5 números é: " + soma);
        scanner.close();
    }
}