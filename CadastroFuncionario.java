import java.util.Scanner;
import java.util.Locale;
public class CadastroFuncionario {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);

        System.out.print("Nome: ");
        String nome = scanner.nextLine();

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        System.out.print("Anos na empresa: ");
        int anosEmpresa = scanner.nextInt();

        System.out.print("Está trabalhando atualmente? true para sim, false para não: ");
        boolean trabalhando = scanner.nextBoolean();

        if(salario < 5000){
            System.out.println("Não paga mais imposto de Renda.");
        }
        if(anosEmpresa > 10){
            salario = salario + (salario * 0.25);
            System.out.println("Você recebeu um aumento de 25%.");
        }
        System.out.println("\n INFORMAÇÕES DO FUNCIONARIO");
        System.out.println("Nome: " + nome);
        System.out.printf("Salario: R$ %,.2f%n", salario);
        System.out.println("Anos na empresa: " + anosEmpresa);
        System.out.println("Está trabalhando atualmente: " + trabalhando);
        scanner.close();
    }
}