package catchExemplo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exemplo2 {
	    public static void main(String[] args) {
	        Scanner teclado = new Scanner(System.in);
	        try {
	            System.out.print("idade: ");
	            int idade = teclado.nextInt();
	            System.out.println("Sua idade é: " + idade);
	        } catch (InputMismatchException e) {
	            System.out.println("Erro: digite uma idade usando números inteiros.");
	        }
	        teclado.close();
	    }
	}