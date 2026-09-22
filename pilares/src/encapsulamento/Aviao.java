package encapsulamento;

public class Aviao extends Veiculo {

    private int altitude;

    public int getAltitude() {
        return altitude;
    }

    public void setAltitude(int altitude) {
        this.altitude = altitude;
    }

    @Override
    void mover() {
        System.out.println(getNome() + " está voando a "
                + getVelocidade() + " km/h, a "
                + altitude + " metros de altitude.");
    }

    public void decolar() {
        System.out.println(getNome() + " está decolando.");
    }
}