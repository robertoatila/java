package ArrayList01;

import java.util.ArrayList;
import java.util.List;

public class Main {
	public static void main(String[]args) {
	List<String> nomes = new ArrayList<>();
	nomes.add("João");
	nomes.add("Maria");
	nomes.add("Pedro");
	System.out.println(nomes);
	System.out.println("Primeiro nome: " + nomes.get(0));
	nomes.remove(1);
	System.out.println(nomes);
	}
}