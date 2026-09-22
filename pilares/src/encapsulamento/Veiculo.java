package encapsulamento;

public abstract class Veiculo {

    private String nome;
    private int velocidade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getVelocidade() {
        return velocidade;
    }

    public void setVelocidade(int velocidade) {
        this.velocidade = velocidade;
    }

    public void exibirInfo() {
        System.out.println("Nome: " + nome);
        System.out.println("Velocidade: " + velocidade + " km/h");
    }

    abstract void mover();
}