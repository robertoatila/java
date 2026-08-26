package Principal;
import Modelo.Produto;
public class Main {
	public static void main(String[]args) {
		Produto produto = new Produto();
		produto.setCodigoProduto(101);
		produto.setNomeProduto("Teclado");
		produto.setPrecoProduto(150.00);
		produto.setQuantidadeEstoque(10);

		produto.exibirDados();

		produto.AdicionarEstoque(5);

		produto.RemoverEstoque(3);

		produto.RemoverEstoque(20);

		produto.calcularValorEstoque();
	}
}
