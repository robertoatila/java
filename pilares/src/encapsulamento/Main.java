package encapsulamento;

public class Main {

    public static void main(String[] args) {

        Carro carro = new Carro();
        carro.setNome("Civic");
        carro.setVelocidade(120);
        carro.setPortas(4);

        Aviao aviao = new Aviao();
        aviao.setNome("Boeing 737");
        aviao.setVelocidade(850);
        aviao.setAltitude(10000);

        Barco barco = new Barco();
        barco.setNome("Titanic");
        barco.setVelocidade(40);
        barco.setTipo("Navio");

        Veiculo v1 = carro;
        Veiculo v2 = aviao;
        Veiculo v3 = barco;

        v1.mover();
        v2.mover();
        v3.mover();

        System.out.println();

        carro.buzinar();
        aviao.decolar();
        barco.ancorar();
    }
}