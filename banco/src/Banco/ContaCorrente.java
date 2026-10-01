package Banco;

	public class ContaCorrente extends Conta {
		public ContaCorrente(String numero, double saldo) {
				super(numero, saldo);
		}
		@Override
		public void sacar(double valor) {
				alterarSaldo(-(valor + 5));
				System.out.println("Conta corrente: " + getNumero() + " - Saque realizado (taxa de R$ 5,00)");
		}
}