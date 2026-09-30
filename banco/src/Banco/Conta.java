package Banco;

public abstract class Conta {
	private String numero;
	private double saldo;
	public Conta(String numero, double saldo) {
			this.numero = numero;
			this.saldo = saldo;
}
	public String getNumero() {
		return numero;
	}
	public double getSaldo() {
		return saldo;
	}
	protected void alterarSaldo(double valor) {
		saldo += valor;
	}
	public void mostrarSaldo() {
		System.out.println("Saldo: R$ " + saldo);
	}
	public abstract void sacar(double valor);
}