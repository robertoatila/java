import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;
        System.out.println("Digite um número: ");
        numero = scanner.nextInt();
        for (int contador = 1; contador <= 10; contador++) {
            System.out.println(numero + " x " + contador + " = " + (numero * contador));
        }
        System.out.println("Tabuada do " + numero + " amostrada.");
        scanner.close();
    }
}