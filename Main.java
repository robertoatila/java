import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Configura o Locale para aceitar ponto ou vírgula conforme padrão do sistema
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o número da conta: ");
        int numeroConta = scanner.nextInt();
        scanner.nextLine(); // Limpeza de buffer do teclado

        System.out.print("Informe o titular: ");
        String titular = scanner.nextLine();

        System.out.print("Informe o saldo inicial: ");
        double saldoInicial = scanner.nextDouble();

        System.out.print("Informe o limite do cheque especial: ");
        double limiteChequeEspecial = scanner.nextDouble();

        // Instanciação do objeto ContaCorrente
        ContaCorrente conta = new ContaCorrente(numeroConta, titular, saldoInicial, limiteChequeEspecial);

        int opcao;
        do {
            System.out.println("\n========= MENU =========");
            System.out.println("1 - Exibir dados da conta");
            System.out.println("2 - Depositar");
            System.out.println("3 - Sacar");
            System.out.println("4 - Transferir");
            System.out.println("5 - Consultar saldo");
            System.out.println("6 - Consultar limite");
            System.out.println("7 - Encerrar programa");
            System.out.println("========================");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    conta.exibirDados();
                    break;
                case 2:
                    System.out.print("Valor do depósito: ");
                    double valorDeposito = scanner.nextDouble();
                    conta.depositar(valorDeposito);
                    break;
                case 3:
                    System.out.print("Valor do saque: ");
                    double valorSaque = scanner.nextDouble();
                    conta.sacar(valorSaque);
                    break;
                case 4:
                    System.out.print("Valor da transferência: ");
                    double valorTransferencia = scanner.nextDouble();
                    conta.transferir(valorTransferencia);
                    break;
                case 5:
                    conta.consultarSaldo();
                    break;
                case 6:
                    conta.consultarLimite();
                    break;
                case 7:
                    System.out.println("Programa encerrado.");
                    break;
                default:
                    System.out.println("Opção inválida! Escolha uma opção de 1 a 7.");
                    break;
            }
        } while (opcao != 7);

        scanner.close();
    }
}