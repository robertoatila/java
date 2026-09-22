package encapsulamento;

public class Main {
	public static void main(String[]args) {
		Veiculo v1 = new Carro();
		Veiculo v2 = new Aviao();
		Veiculo v3 = new Barco();
		
		v1.setNome("Civic");
		System.out.println(v1.getNome());
		v1.mover();
		v2.mover();
		v3.mover();
	}
}
