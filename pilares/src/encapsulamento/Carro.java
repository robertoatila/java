package encapsulamento;

public class Carro extends Veiculo {

    private int portas;

    public int getPortas() {
        return portas;
    }

    public void setPortas(int portas) {
        this.portas = portas;
    }

    @Override
    void mover() {
        System.out.println(getNome() + " está andando pela estrada a "
                + getVelocidade() + " km/h.");
    }

    public void buzinar() {
        System.out.println("Bii bii!");
    }
}