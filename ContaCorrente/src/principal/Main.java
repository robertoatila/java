package principal;
import Conta.ContaCorrente;
public class Main {
public static void main(String[]args) {
		ContaCorrente conta = new ContaCorrente();
		
		conta.setNumeroConta(99999);
		conta.setTitularConta("Carlinhos no matagal");
		conta.setSaldoConta(6788.99);

		conta.ExibirConta();

		conta.DepositarConta(696.78);

		conta.SacarConta(67.69);

		conta.SacarConta(8867.69);

		conta.ConsultaSaldo();
	}
}