package Exercicios;

public class PessoaJuridica extends Pessoa {
	protected String CNPJ;
	protected String socio;
	protected String dtAbertura;
	public PessoaJuridica (String nome, int idade, String CNPJ, String socio, String dtAbertura) {
		super(nome, idade);
		this.CNPJ = CNPJ;
		this.socio = socio;
		this.dtAbertura = dtAbertura;
		
	}
	
	public void exibeDados() {
		System.out.println ("Nome: "+this.nome);
		System.out.println ("Idade: "+this.idade);
		System.out.println ("CNPJ: "+this.CNPJ);
		System.out.println ("Socio: "+this.socio);
		System.out.println ("Data Abertura: "+this.dtAbertura);


	}
}
