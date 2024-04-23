package ExAula;

public class Aluno2304 {
	private String nome;
	private double nota;
	private double nota1;
	private double nota2;
	private double media;
	public Aluno2304 (String nome, double nota) {
		this.nome = nome;
		this.nota = nota;
	}
	public String getNome() {
		return nome;
	}
	public void setNome (String nome) {
		this.nome = nome;
	}
	public double getNota() {
		this.nota1 = nota;
		return nota;
	}
	public void setNota(double nota) {
		this.nota = nota;
		this.nota2 = nota;
	}
	
	public double media () {
		return (media) = (nota1 + nota2) / 2;
	}
}
