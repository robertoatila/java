package Principal;
import Modelo.Aluno;
public class Main {
	public static void main(String[] args) {

		Aluno aluno1 = new Aluno();

		aluno1.setMatricula(202501);
		aluno1.setNomeAluno("Carlos");
		aluno1.setNota1(8.0);
		aluno1.setNota2(7.0);

		aluno1.exibirDados();
		aluno1.verificarAprovacao();

		System.out.println("--------------------");

		Aluno aluno2 = new Aluno();

		aluno2.setMatricula(202502);
		aluno2.setNomeAluno("Mariana");
		aluno2.setNota1(5.0);
		aluno2.setNota2(4.0);

		aluno2.exibirDados();
		aluno2.verificarAprovacao();
	}
}
