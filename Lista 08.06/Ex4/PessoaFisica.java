package Ex4;

public class PessoaFisica extends Pessoa{
	private String CPF;
	public PessoaFisica (String nome, String cidade, String CPF) {
		super (cidade, nome);
		this.CPF = CPF;
	}
	public String getCPF () {
		return CPF;
	}
	public void setCPF (String CPF) {
		this.CPF = CPF;
	}
	public void efetuarCompra() {
		System.out.println ("Pessoa Fisica {Nome: "+getNome()+", Cidade: "+getCidade()+", CPF: "+getCPF()+ "}");
	}
}
