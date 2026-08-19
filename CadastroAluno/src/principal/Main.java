package principal;

import modelo.Aluno;

public class Main {

	public static void main(String[] args) {
		Aluno aluno1 = new Aluno("João", 18);
		System.out.println("Nome:"+ aluno1.getNome());
		System.out.println("Idade:"+ aluno1.getIdade());
		aluno1.setIdade(19);
		System.out.println("Nova idade: "+ aluno1.getIdade());
		aluno1.apresentar();

	}

}
