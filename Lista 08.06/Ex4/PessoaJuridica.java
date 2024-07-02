package Ex4;

public class PessoaJuridica extends Pessoa{
	private String CNPJ;
	
	public PessoaJuridica (String cidade, String nome, String CNPJ) {
		super (cidade, nome);
		this.CNPJ = CNPJ;
	}
	
	public String getCNPJ () {
		return CNPJ;
	}
	public void setCNPJ (String CNPJ) {
		this.CNPJ = CNPJ;
	}
	public void efetuarCompra() {
		System.out.println ("Pessoa Juridica {Nome: "+getNome()+", Cidade: "+getCidade()+", CNPJ: "+getCNPJ()+ "}");

	}
}
