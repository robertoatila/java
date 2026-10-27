package catchExemplo;

import java.util.Scanner;

public class exemplo1 {
	public static void main(String[] args) {
		 Scanner teclado = new Scanner(System.in);
	        try {
	            System.out.print("número 1: ");
	            int n1 = teclado.nextInt();
	            System.out.print("número 2: ");
	            int n2 = teclado.nextInt();
	            int resultado = n1 / n2;

	            System.out.println("Resultado: " + resultado);

	        } catch (ArithmeticException e) {
	            System.out.println("Erro: não é possível dividir por zero!");
	        }
	        finally {
	            System.out.print("nigger");
	        }
	        teclado.close();
	    }
}
