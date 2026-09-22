package encapsulamento;

abstract public class Veiculo {
	public String nome;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	abstract void mover(); 
		
}