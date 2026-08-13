import java.util.Scanner;
import java.util.Locale;
public class classificacao {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);

        System.out.println("INCIO");

        System.out.print("Tempo: ");
        int tempo = scanner.nextInt();
        
        System.out.print("Avaliação: ");
        int avaliacao = scanner.nextInt();

        System.out.print("Faltas: ");
        int faltas = scanner.nextInt();

        System.out.print("Salario: ");
        double salario = scanner.nextDouble();

        double bonus;

        if(tempo >= 5 && avaliacao >= 8 && faltas <= 2){
            bonus = salario * 0.20;
        }
        else if((tempo >= 3 && avaliacao >= 7 || 
                faltas == 0 && avaliacao >= 6)){
            bonus = salario * 0.10;
        }
        else {
            bonus = 0;
        } 
        System.out.printf("Bonus: R$ %,.2f%n", bonus);

        System.out.println("Fim");
        scanner.close();
    }
}