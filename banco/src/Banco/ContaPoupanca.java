package Banco;

	public class ContaPoupanca extends Conta {
		public ContaPoupanca(String numero, double saldo) {
				super(numero, saldo);
		}
		@Override
		public void sacar(double valor) {
				alterarSaldo(-valor);
				System.out.println("Conta poupança: " + getNumero() + "  - Saque realizado sem
taxa.");
		}
}