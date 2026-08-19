package Principal;

import Modelo.Aluno;

public class Main {

	public static void main(String[] args) {
		 Aluno aluno = new Aluno();
		 aluno.setIdade(88);
		 aluno.setNome("Adolf Henrique");
		 
		 System.out.println("nome: " +aluno.getNome());
		 System.out.println("idade: " +aluno.getIdade());
		 
		 
	}

}
