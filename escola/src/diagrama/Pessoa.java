package diagrama;

public class Pessoa {
	private String nome;
	protected int idade;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public void converter(int opcao) {
		if (opcao == 1) {
			nome = nome.toUpperCase();
		} else if (opcao == 2) {
			nome = nome.toLowerCase();
		}
	}
}