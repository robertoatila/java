package Conta;

public class ContaCorrente {

	private int NumeroConta;
	private String TitularConta;
	private double SaldoConta;

	public void SacarConta(double saque) {
		if (saque > SaldoConta) {
			System.out.printf(
				"Saque de R$%.2f não realizado. Saldo Insuficiente\n",saque);
		}
		else {
			System.out.printf(
				"Saque de R$%.2f realizado\n",saque);
				SaldoConta -= saque;
		}
	}
	public void ConsultaSaldo() {
		System.out.printf("Saldo: R$%.2f\n", SaldoConta);
	}
	public void ExibirConta() {
		System.out.println("Numero conta: " + getNumeroConta());
		System.out.println("Nome cliente: " + getTitularConta());
		System.out.printf("Saldo cliente: R$%.2f\n", getSaldoConta());
	}
	public void DepositarConta(double deposito) {
		this.SaldoConta += deposito;
		System.out.printf("Depósito de R$%.2f realizado.\n", deposito);
	}
	public int getNumeroConta() {
		return NumeroConta;
	}
	public void setNumeroConta(int numeroConta) {
		NumeroConta = numeroConta;
	}
	public String getTitularConta() {
		return TitularConta;
	}
	public void setTitularConta(String titularConta) {
		TitularConta = titularConta;
	}
	public double getSaldoConta() {
		return SaldoConta;
	}
	public void setSaldoConta(double saldoConta) {
		SaldoConta = saldoConta;
	}
}