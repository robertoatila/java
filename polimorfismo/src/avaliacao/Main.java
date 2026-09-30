package avaliacao;

public class Main {
	public static void main (String[] args) {
		Aluno aluno = new Aluno();
		
		System.out.println(aluno.media(6));
		System.out.println(aluno.media(6,7));
		System.out.println(aluno.media(3,7.4,10));
	}
}
