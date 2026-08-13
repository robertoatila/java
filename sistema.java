import java.util.Scanner;
import java.util.Locale;
public class sistema {
    public static void main(String[] args) {
        Locale.setDefault(new Locale("pt", "BR"));
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("INCIO");
        System.out.print("Velocidade em Km: ");
        int km = scanner.nextInt();

        System.out.print("zona escolar, true/false: ");
        boolean zona = scanner.nextBoolean();

        if (km > 150 || (km > 120 && zona == true)){
            System.out.println("Multa Gravíssima");
        }
        else if (km >= 100 && km <= 150){
            System.out.println("Multa Grave");
        }
        else if (km >= 80 && km < 100){
            System.out.println("Multa Leve");
        }
        else {
            System.out.println("Sem Multa");
        }
        System.out.println("Fim");

        scanner.close();
    }
}