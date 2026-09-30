package Banco;

public class Principal {
	public static void main(String[] args) {
			ContaCorrente cc = new ContaCorrente("1234", 1000);
			cc.sacar(100);
			cc.mostrarSaldo();
			System.out.println();

			ContaPoupanca cp = new ContaPoupanca("4567", 1000);
			cp.sacar(100);
			cp.mostrarSaldo();
	}
}
