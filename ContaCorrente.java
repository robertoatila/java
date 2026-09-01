public class ContaCorrente {
    // Atributos privados (Encapsulamento)
    private int numeroConta;
    private String titular;
    private double saldo;
    private double limiteChequeEspecial;

    // Construtor
    public ContaCorrente(int numeroConta, String titular, double saldoInicial, double limiteChequeEspecial) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = Math.max(saldoInicial, 0); // Garante que o saldo inicial não seja negativo
        this.limiteChequeEspecial = Math.max(limiteChequeEspecial, 0);
    }

    // Getters e Setters
    public int getNumeroConta() {
        return numeroConta;
    }

    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
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

    public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

    public void setLimiteChequeEspecial(double limiteChequeEspecial) {
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    // Método para depositar
    public void depositar(double valor) {
        if (valor <= 0) {
            System.out.println("Depósito não realizado.");
            System.out.println("O valor deve ser maior que zero.");
            return;
        }
        this.saldo += valor;
        System.out.println("Depósito realizado com sucesso.");
    }

    // Método para sacar (utiliza saldo e cheque especial)
    public void sacar(double valor) {
        if (valor <= 0) {
            System.out.println("Saque não realizado.");
            System.out.println("O valor deve ser maior que zero.");
            return;
        }

        double totalDisponivel = this.saldo + this.limiteChequeEspecial;

        if (valor <= totalDisponivel) {
            this.saldo -= valor;
            System.out.println("Saque realizado com sucesso.");
        } else {
            System.out.println("Saque não realizado.");
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método para transferir (para conta fictícia)
    public void transferir(double valor) {
        if (valor <= 0) {
            System.out.println("Transferência não realizada.");
            System.out.println("O valor deve ser maior que zero.");
            return;
        }

        double totalDisponivel = this.saldo + this.limiteChequeEspecial;

        if (valor <= totalDisponivel) {
            this.saldo -= valor;
            System.out.println("Transferência realizada com sucesso.");
        } else {
            System.out.println("Transferência não realizada.");
            System.out.println("Saldo insuficiente.");
        }
    }

    // Método para consultar saldo
    public void consultarSaldo() {
        System.out.printf("Saldo disponível: R$ %.2f%n", this.saldo);
    }

    // Método para consultar limite
    public void consultarLimite() {
        System.out.printf("Limite do Cheque Especial: R$ %.2f%n", this.limiteChequeEspecial);
    }

    // Método para exibir todos os dados da conta
    public void exibirDados() {
        System.out.println("Número da Conta: " + this.numeroConta);
        System.out.println("Titular: " + this.titular);
        System.out.printf("Saldo: R$ %.2f%n", this.saldo);
        System.out.printf("Limite Disponível: R$ %.2f%n", this.limiteChequeEspecial);
    }
}