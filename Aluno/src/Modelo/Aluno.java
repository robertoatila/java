package Modelo;

public class Aluno {
	private int matricula;
	private String nomeAluno;
	private double nota1;
	private double nota2;
	
	public void calcularMedia() {
		double media = (nota1 + nota2) / 2;
		System.out.printf("Média: %.2f\n", media);
	}
	public void verificarAprovacao() {
		double media = (nota1 + nota2) / 2;
		if (media >= 6.0) {
		System.out.println("Situação: Aprovado.");
		}
		else {
			System.out.println("Situação: Moggado.");
		}
	}
	public void exibirDados() {
		double media = (nota1 + nota2) / 2;
		System.out.println("Matrícula: "+getMatricula());
		System.out.println("Nome: "+getNomeAluno());
		System.out.println("Nota 1: " + getNota1());
		System.out.println("Nota 2: " + getNota2());
		System.out.printf("Média: %.2f\n", media);
	}
	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public String getNomeAluno() {
		return nomeAluno;
	}
	public void setNomeAluno(String nomeAluno) {
		this.nomeAluno = nomeAluno;
	}
	public double getNota1() {
		return nota1;
	}
	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}
	public double getNota2() {
		return nota2;
	}
	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}
}
