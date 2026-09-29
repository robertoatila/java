package diagrama;

public class Funcionario extends Pessoa {

	private int id;
	private String endereco;
	private String cpf;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void converter(int opcao) {

		super.converter(opcao); //puxa da Classe pai Pessoa.java 

		if (opcao == 1) {
			endereco = endereco.toUpperCase();
		} else if (opcao == 2) {
			endereco = endereco.toLowerCase();
		}
	}

	public void mostrarDados() {
		System.out.println("\n--- DADOS DO FUNCIONÁRIO ---");
		System.out.println("ID: " + id);
		System.out.println("Nome: " + getNome());
		System.out.println("Endereço: " + endereco);
		System.out.println("CPF: " + cpf);
	}
}
