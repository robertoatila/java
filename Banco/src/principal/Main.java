package principal;

import modelo.ContaCorrente;

public class Main {

    public static void main(String[] args) {

        ContaCorrente conta = new ContaCorrente();

        conta.setNumero(12345);
        conta.setTitular("João");
        conta.setSaldo(1000.00);

        conta.exibirDados();

        conta.depositar(500.00);

        conta.sacar(200.00);

        conta.sacar(2000.00);

        conta.consultarSaldo();
    }
}