package modelo;

public class ContaCorrente {

    private int numero;
    private String titular;
    private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double valor) {
        saldo = saldo + valor;

        System.out.println("Depósito de R$ " + valor + " realizado.");
    }

    public void sacar(double valor) {

        if (valor <= saldo) {
            saldo = saldo - valor;

            System.out.println("Saque de R$ " + valor + " realizado.");
        } else {
            System.out.println("Saque de R$ " + valor
                    + " não realizado. Saldo insuficiente.");
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo final: R$ " + saldo);
    }

    public void exibirDados() {
        System.out.println("Número da conta: " + numero);
        System.out.println("Titular: " + titular);
        System.out.println("Saldo: R$ " + saldo);
    }
}