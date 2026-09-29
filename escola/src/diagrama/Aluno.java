package diagrama;

public class Aluno extends Pessoa {

	public void mostrarDados() {
		System.out.println("Nome: " + getNome());
		System.out.println("Idade: " + getIdade());
	}
}