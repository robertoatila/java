package diagrama;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);

		Funcionario funcionario = new Funcionario();

		System.out.print("Digite o ID: ");
		funcionario.setId(Integer.parseInt(scanner.nextLine()));

		System.out.print("Digite o nome: ");
		funcionario.setNome(scanner.nextLine());

		System.out.print("Digite o endereço: ");
		funcionario.setEndereco(scanner.nextLine());

		System.out.print("Digite o CPF: ");
		funcionario.setCpf(scanner.nextLine());

		System.out.println("\nEscolha como deseja converter o nome:");
		System.out.println("1 - MAIÚSCULO");
		System.out.println("2 - minúsculo");
		System.out.print("Opção: ");

		int opcao = Integer.parseInt(scanner.nextLine());

		if (opcao == 1 || opcao == 2) {
			funcionario.converter(opcao);
		} else {
			System.out.println("Opção inválida.");
		}

		funcionario.mostrarDados();

		scanner.close();
	}
}