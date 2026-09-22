package encapsulamento;

public class Barco extends Veiculo {

    private String tipo;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    void mover() {
        System.out.println(getNome() + " está navegando a "
                + getVelocidade() + " km/h.");
    }

    public void ancorar() {
        System.out.println(getNome() + " ancorou.");
    }
}