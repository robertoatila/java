package Modelo;

public class Produto {
	private int CodigoProduto;
	private String NomeProduto;
	private double PrecoProduto;
	private int QuantidadeEstoque;
	
	public void AdicionarEstoque(int quantidade) {
		System.out.println("Foram adicionadas " + quantidade + " unidades ao estoque.");
		QuantidadeEstoque += quantidade;
	}
	public void RemoverEstoque(int quantidade) {
		if (quantidade > QuantidadeEstoque) {
			System.out.println("Não foi possível remover " + quantidade+ " unidades. Estoque insuficiente.");
		} 
		else {
			System.out.println("Foram removidas " + quantidade+ " unidades do estoque.");
			QuantidadeEstoque -= quantidade;	
		}
	}
	public void calcularValorEstoque() {
		double valorTotal = PrecoProduto * QuantidadeEstoque;
		System.out.printf("Valor total em estoque: R$ %.2f\n",valorTotal);
	}
	public void exibirDados() {
		System.out.println("Código: " + getCodigoProduto());
		System.out.println("Nome: " + getNomeProduto());
		System.out.printf("Preço: R$ %.2f\n", getPrecoProduto());
		System.out.println("Quantidade em estoque: " + getQuantidadeEstoque());
	}
	public int getCodigoProduto() {
		return CodigoProduto;
	}
	public void setCodigoProduto(int codigoProduto) {
		CodigoProduto = codigoProduto;
	}
	public String getNomeProduto() {
		return NomeProduto;
	}
	public void setNomeProduto(String nomeProduto) {
		NomeProduto = nomeProduto;
	}
	public double getPrecoProduto() {
		return PrecoProduto;
	}
	public void setPrecoProduto(double precoProduto) {
		PrecoProduto = precoProduto;
	}
	public int getQuantidadeEstoque() {
		return QuantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		QuantidadeEstoque = quantidadeEstoque;
	}
}
