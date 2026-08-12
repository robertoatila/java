import java.util.Scanner;
public class LendoInformacoesComScanner {
	public static void main(String[] args) {
		System.out.println("====================");
		Scanner scanner = new Scanner(System.in);
		System.out.print("distância (utilize , para decimal): ");
		double distanciaPercorrida = scanner.nextDouble();
		System.out.println("A distância foi "+ distanciaPercorrida + "Km.");
		scanner.close();
		System.out.println("====================");
	}
}
