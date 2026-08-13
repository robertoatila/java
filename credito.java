import java.util.Scanner;
import java.util.Locale;
public class credito {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("INCIO");

        System.out.print("Renda: ");
        double renda = scanner.nextDouble();

        System.out.print("Score: ");
        int score = scanner.nextInt();

        System.out.print("Restrinção, true para sim, false para não: ");
        boolean restrincao = scanner.nextBoolean();

        if(renda >= 3000 && score >= 700 && restrincao == false){
            System.out.println("Crédito Aprovado");
        }
        else if((renda >= 2000 && score >= 600 && restrincao == false) || (renda >= 4000 && restrincao == true)){
            System.out.println("Crédito Aprovado com Restrinção");
        }
        else{
            System.out.println("Crédito Negado");
        }
        System.out.println("Fim");
        scanner.close();
    }
}