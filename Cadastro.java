import java.util.Scanner;
	public class Cadastro {
		public static void main(String[] args) {
	
		Scanner scanner = new Scanner (System.in);
		System.out.print("Nome: ");
		String nome = scanner.nextLine();
		System.out.print("Media: ");
		double media = scanner.nextDouble();
		System.out.print("Idade: ");
		int idade = scanner.nextInt();
		System.out.print("Digite true/false: ");
		boolean booleana = scanner.nextBoolean();
		System.out.println("\n--- DADOS CADASTRADOS ---");
		System.out.println("Nome: " + nome);
		System.out.println("Media: " + media);
		System.out.println("Idade: " + idade);
		System.out.println("Booleano: " + booleana);
		scanner.close();
	}
}