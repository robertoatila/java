package catchExemplo;

public class Exemplo {
		public static void main(String[] args) {

			try {

			    int numero = Integer.parseInt("31");

			    int resultado = 10 / numero;

			    System.out.println(resultado);

			} catch (NumberFormatException e) {

			    System.out.println("Erro: o texto não representa um número.");

			} catch (ArithmeticException e) {

			    System.out.println("Erro: divisão por zero.");

			} catch (Exception e) {

			    System.out.println("Ocorreu outro erro.");

			}

	         }

	}