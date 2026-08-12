import java.util.Scanner;
import java.util.Locale;
public class CadastroVeiculo {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Modelo do Veiculo: ");
        String modeloVeiculo = scanner.nextLine();

        System.out.print("Ano de Fabricacao: ");
        int anoFabricacao = scanner.nextInt();

        System.out.print("Valor do Veiculo: ");
        double valorCarro = scanner.nextDouble();

        System.out.print("Possui seguro? Digite true para sim, false para nao: ");
        boolean possuiSeguro = scanner.nextBoolean();

        if (2026 - anoFabricacao > 10) {
            System.out.println("O veiculo possui mais de 10 anos e nao paga IPVA.");
        }
        if (possuiSeguro == false) {
            System.out.println("O veiculo nao possui seguro. Recomenda-se realizar o seguro.");
        }
        System.out.println("\n--- Informacoes do Veiculo ---");
        System.out.println("Modelo: " + modeloVeiculo);
        System.out.println("Ano de Fabricacao: " + anoFabricacao);
        System.out.println("Valor do Veiculo: R$ %,.2f%n" + valorCarro);
        System.out.println("Possui seguro: " + possuiSeguro);
        scanner.close();
    }
}