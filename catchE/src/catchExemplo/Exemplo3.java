package catchExemplo;

public class Exemplo3 {
		public static void main(String[] args) {
			try {
			    int numero = Integer.parseInt("0");
			    int resultado = 10 / numero;
			    System.out.println(resultado);
			} catch (NumberFormatException e) {
			    System.out.println("Erro: o texto não representa um número.");
			} catch (ArithmeticException e) {
			    System.out.println("Erro: divisão por zero.");
	     }
	  }
	}